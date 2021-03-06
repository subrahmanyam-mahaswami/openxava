package org.openxava.test.tests;

import javax.json.bind.annotation.*;
import javax.ws.rs.client.*;

import org.openxava.test.actions.BookTitleFromWebServiceAction.*;
import org.openxava.test.model.*;
import org.openxava.test.services.*;
import org.openxava.tests.*;

/**
 * 
 * @author Javier Paniza
 */

public class BookTest extends ModuleTestBase {
	
	public BookTest(String testName) {
		super(testName, "Book");		
	}
	
	public void testValidatorAnnotationMessage() throws Exception { 
		execute("CRUD.new");
		execute("CRUD.save");
		assertError("Sorry, but you need to enter the book title"); 
		assertError("Please, enter a synopsis for the book");
		
		setValue("title", "EL QUIJOTE");
		setValue("synopsis", "JAVA PROGRAMMING GUIDE");
		execute("CRUD.save");
		assertError("The synopsis does not match with the title");
		
		setValue("title", "RPG: THE MOST INNOVATIVE IBM LANGUAGE");
		execute("CRUD.save");
		assertError("Books about RPG are not allowed");
	}
	
	public void testReferenceNameMatchesIdOfReferencedEntityName_callRESTService() throws Exception { 
		execute("CRUD.new");
		execute("Reference.search", "keyProperty=author.author");	
		assertListNotEmpty();
		String author = getValueInList(0, 0);		
		execute("ReferenceSearch.choose", "row=0");
		assertNoErrors(); 				
		assertValue("author.author", author); 
		
		assertValue("title", "");
		execute("Book.fillTitle");
		assertValue("title", "THE MYTHICAL MAN-MONTH"); // Jersey fails with Tomcat 7. Test it with a Tomcat 8 + Java 8 at least.
		assertEquals("The Mythical Man-Month", BookService.get().getTitle()); // To verify you can use REST from JUnit tests
	}
	
	// This test fails in PostgreSQL, but not in Hypersonic
	public void testListFilterByBooleanColumnInDB() throws Exception {
		assertListRowCount(2); 
		setConditionComparators ("=", "=", "=", "=");
		setConditionValues ("", "", "", "true");
		execute("List.filter");
		assertListRowCount(1);
	}
		
}
