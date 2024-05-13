

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SchoolManagerTest {
	
	/* 
	 * Note for students: these test cases are not comprehensive; 
	 * you must add your test cases to test your solution for this lab thoroughly. 
	 * For example, the method named <code>contain, countOccurrences</code> are not tested.  
	 */
	
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test_01_01_() {
		String expectedEmpName = "John";
		int expectedEmpAge = 30;
		String expectedEmpID = "T123";
		Employee e1 = new Employee(expectedEmpName, expectedEmpAge, expectedEmpID);
			
		String actualEmpName = e1.getName();
		int actualEmpAge= e1.getAge();
		String actualEmpID = e1.getEmployeeId();
		
		String errorMsg1 = String.format(
				"\n Test Employee arg constructor failed. Returned employee name (%s) " + "but correct name is (%s)",
				actualEmpName, expectedEmpName);
		assertEquals(errorMsg1,expectedEmpName, actualEmpName);
		
		String errorMsg2 = String.format(
				"\n Test Employee arg constructor failed. Returned employee ID (%s) " + "but correct ID is (%s)",
				actualEmpID, expectedEmpID);
		assertEquals(errorMsg2,expectedEmpID, actualEmpID);
		
		
		String errorMsg3 = String.format(
				"\n Test Employee arg constructor failed. Returned employee Age (%d) " + "but correct ID is (%d)",
				actualEmpAge, expectedEmpAge);
		assertEquals(errorMsg3,expectedEmpAge, actualEmpAge);		
	}
	
	@Test
	public void test_01_02_() {
		String expectedEmpName = "Alice";
		int expectedEmpAge = 28;
		String expectedEmpID = "T124";
		Employee e1 = new Employee(expectedEmpName, expectedEmpAge, expectedEmpID);
		
		expectedEmpName = "Mike";
		expectedEmpAge = 40;
		expectedEmpID = "T152";
		e1.setAge(expectedEmpAge);
		e1.setEmployeeId(expectedEmpID);
		e1.setName(expectedEmpName);
		
		
		String actualEmpName = e1.getName();
		int actualEmpAge= e1.getAge();
		String actualEmpID = e1.getEmployeeId();
		
		String errorMsg1 = String.format(
				"\n Test Employee setName failed. Returned employee name (%s) " + "but correct name is (%s)",
				actualEmpName, expectedEmpName);
		assertEquals(errorMsg1,expectedEmpName, actualEmpName);
		
		String errorMsg2 = String.format(
				"\n Test Employee setEmployeeId failed. Returned employee ID (%s) " + "but correct ID is (%s)",
				actualEmpID, expectedEmpID);
		assertEquals(errorMsg2,expectedEmpID, actualEmpID);
		
		
		String errorMsg3 = String.format(
				"\n Test Employee setAge failed. Returned employee Age (%d) " + "but correct ID is (%d)",
				actualEmpAge, expectedEmpAge);
		assertEquals(errorMsg3,expectedEmpAge, actualEmpAge);		
	}
	
	
	@Test
	public void test_01_03_() {
		String expectedEmpName = "Alice";
		int expectedEmpAge = 28;
		String expectedEmpID = "T124";
		Employee e1 = new Employee(expectedEmpName, expectedEmpAge, expectedEmpID);

		
		String expectedEmpStr = "{Alice (ID: T124)}";
		String actualEmpStr = e1.toString();
		
		
		
		String errorMsg1 = String.format(
				"\n Test Employee toString failed. Returned (%s) " + "but correct is (%s)",
				actualEmpStr, expectedEmpStr);
		assertEquals(errorMsg1,expectedEmpStr, actualEmpStr);
	
	}
	
	
	
	@Test
	public void test_01_04_() {
		String expectedEmpName = "Mike";
		int expectedEmpAge = 40;
		String expectedEmpID = "T104";
		Employee e1 = new Employee(expectedEmpName, expectedEmpAge, expectedEmpID);

		
		String expectedEmpStr = "{Mike (ID: T104)}";
		String actualEmpStr = e1.toString();
		
		
		
		String errorMsg1 = String.format(
				"\n Test Employee toString failed. Returned (%s) " + "but correct is (%s)",
				actualEmpStr, expectedEmpStr);
		assertEquals(errorMsg1,expectedEmpStr, actualEmpStr);
	
	}
	
	@Test
	public void test_01_05_() {

		Employee e1 = new Employee("John", 30, "T123");
		Employee e4 = e1;
		Employee e2 = new Employee("John", 30, "T123");			
		Employee e3 = new Employee("John", 35, "T103");			
		
		String errorMsg1 = String.format(
				"\n Test Employee equals failed. Returned false " + "but correct is True");
		String errorMsg2 = String.format(
				"\n Test Employee equals failed. Returned true " + "but correct is false");
		assertTrue(errorMsg1,e1.equals(e2));
		assertTrue(errorMsg1,e1.equals(e4));
		assertFalse(errorMsg2,e1.equals(e3));
	
	}
	
	
	
	@Test
	public void test_02_01_() {
		
		MyList myarray = new MyList(); 
		myarray.add("a");
		int expected = 1; 
		int actual = myarray.getSize();
		assertEquals("MyList: The add() method does not correctly add to the array and/or getSize() is not correct.",  expected,actual);
	}
	
	@Test
	public void test_02_02_() {
		MyList myarray = new MyList(); 
		boolean expected = true; 
		boolean actual = myarray.isEmpty();
		assertEquals( "MyList: isEmpty() is not correct.",expected,actual);
	}
	@Test
	public void test_02_03_() {
		MyList myarray = new MyList(); 
		myarray.add("a");
		boolean expected = false; 
		boolean actual = myarray.isEmpty();
		
		assertEquals( "MyList: isEmpty() is not correct.",expected,actual);
	}
	
	@Test
	public void test_02_04_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 11; i++)
			myarray.add("a"+i);
		int expected = 11; 
		int actual = myarray.getSize();
		
		assertEquals( "MyList: The add method does not grow the size of the list, when it is needed.",expected,actual);
	}
	
	
	@Test
	public void test_02_05_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 22; i++)
			myarray.add(i+"a");
		int expected = 22; 
		int actual = myarray.getSize();
		
		assertEquals( "MyList: The add method does not grow the size of the list, when it is needed.",expected,actual);
	}
	
	
	@Test
	public void test_02_06_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 10; i++)
			myarray.add("Element"+i);
		String  expected = "[Element0, Element1, Element2, Element3, Element4, Element5, Element6, Element7, Element8, Element9]"; 
		String  actual = myarray.toString();
		
		assertEquals("MyList: toString() for MyList is not properly implemented.", expected,actual);
	}

	
	@Test
	public void test_02_07_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 10; i++)
			myarray.add("ElementA");
		String  expected = "[ElementA, ElementA, ElementA, ElementA, ElementA, ElementA, ElementA, ElementA, ElementA, ElementA]"; 
		String  actual = myarray.toString();
		
		assertEquals("MyList: toString() for MyList is not properly implemented.", expected,actual);
	}
	
	
	
	@Test
	public void test_02_08_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 10; i++)
			myarray.add("Element"+i);
		myarray.remove("Element3");
		String  expected = "[Element0, Element1, Element2, Element4, Element5, Element6, Element7, Element8, Element9]"; 
		String  actual = myarray.toString();
		
		assertEquals("MyList: remove() for MyList does not remove the last element correctly.", expected,actual);
	}

	
	@Test
	public void test_02_09_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementB");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		
		myarray.remove("ElementA");
		myarray.remove("ElementC");
		
		String  expected = "[ElementA, ElementB, ElementB, ElementC, ElementA, ElementA]"; 
		String  actual = myarray.toString();
		
		assertEquals("MyList: remove() for MyList does not remove the last element correctly.", expected,actual);
		
		int expectedSize = 6; 
		int actualSize = myarray.getSize();
		assertEquals( "MyList: The remove method does not reduce the size of the list, when it is needed.",expectedSize,actualSize);
		
	}
	
	@Test
	public void test_02_10_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementB");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		
		myarray.remove("ElementA");
		myarray.remove("ElementC");
		
		Object  expected = "ElementA"; 
		Object  actual = myarray.get(0);
		
		assertEquals("MyList: get(0) does not return the correct element.",expected, actual);
		
		
	}
	
	@Test
	public void test_02_11_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementB");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementE");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementD");
		
		myarray.remove("ElementA");myarray.remove("ElementA");
		myarray.remove("ElementC");
		
		Object  expected = "ElementE"; 
		Object  actual = myarray.get(4);
		
		assertEquals("MyList: get(4) does not return the correct element.",expected, actual);
		expected = "ElementD"; 
		actual = myarray.get(6);
		
		assertEquals("MyList: get(4) does not return the correct element.",expected, actual);
		
		
	}
	
	@Test
	public void test_02_12_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementB");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementE");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementD");
		
		myarray.remove("ElementA");myarray.remove("ElementA");
		myarray.remove("ElementC");
				
		try {
		myarray.get(18);
		fail();
		}catch (IndexOutOfBoundsException e) {
			// exception is expected and we catch it
		}	
		
	}
	
	 
	/////////////////*************************************************/////////////////
	@Test
	public void test_02_13_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 2; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementB");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementE");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementD");
		
		myarray.remove("ElementA");myarray.remove("ElementA");
		myarray.remove("ElementC");
		
		assertFalse("MyList contains method fail ", myarray.contains("ElementA"));
		
		assertTrue("MyList contains method fail ", myarray.contains("ElementC"));
		
		
	}
	
	
	@Test
	public void test_02_14_() {
		MyList myarray = new MyList(); 
		for( int i = 0; i < 4; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementE");		
		
		
		int  expected = 4; 
		int  actual = myarray.countOccurrences("ElementA");
		assertEquals("MyList: The countOccurrences() method does not correctly count ", expected,actual);
		
	}
	/////////////////*************************************************/////////////////
	
	@Test
	public void test_03_01_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 11; i++)
			myarray.add("ElementA");
		int expected = 1; 
		int actual = myarray.getSize();
		assertEquals( "MySet: The add() method does not correctly add to the set and/or getSize() is not correct.", expected,actual);
		
	}
	
	@Test
	public void test_03_02_() {
		MySet myarray = new MySet(); 
		boolean expected = true; 
		boolean actual = myarray.isEmpty();
		assertEquals( "MySet: isEmpty() is not correct.", expected,actual);
		
	}
	
	@Test
	public void test_03_03_() {
		MySet myarray = new MySet(); 
		myarray.add("a");
		boolean expected = false; 
		boolean actual = myarray.isEmpty();
		assertEquals( "MySet: isEmpty() is not correct.", expected,actual);
		
	}
	
	
	@Test
	public void test_03_04_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 11; i++)
			myarray.add("ElementA"+i);
		int expected = 11; 
		int actual = myarray.getSize();
		assertEquals( "MySet: The add method does not grow the size of the set, when it is needed.", expected,actual);
		
	}
	
	@Test
	public void test_03_05_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 11; i++)
			myarray.add("ElementA"+i);
		for( int i = 0; i < 11; i++)
			myarray.add("ElementC"+i);
		int expected = 22; 
		int actual = myarray.getSize();
		assertEquals( "MySet: The add method does not grow the size of the set, when it is needed.", expected,actual);
		
	}
	
	@Test
	public void test_03_06_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 3; i++)
			myarray.add("ElementA"+i);
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC"+i);
		String  expected = "[ElementA0, ElementA1, ElementA2, ElementC0, ElementC1]"; 
		String  actual = myarray.toString();
		assertEquals("MySet: toString() for MySet is not properly implemented.", expected,actual);
		
	}
	
	@Test
	public void test_03_07_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 3; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC");
		String  expected = "[ElementA, ElementC]"; 
		String  actual = myarray.toString();
		assertEquals("MySet: toString() for MySet is not properly implemented.", expected,actual);
		
	}
	
	@Test
	public void test_03_08_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 3; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC"+i);
		myarray.remove("ElementA");
		
		String  expected = "[ElementC0, ElementC1]"; 
		String  actual = myarray.toString();
		assertEquals("MySet: remove() for MySet does not remove the first element correctly.", expected,actual);
		
	}
	
	@Test
	public void test_03_09_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 3; i++)
			myarray.add("ElementA"+i);
		for( int i = 0; i < 2; i++)
			myarray.add("ElementC"+i);
		for( int i = 0; i < 3; i++)
			myarray.add("ElementA"+i);
		myarray.remove("ElementA"+2);
		myarray.remove("ElementA"+3);
		
		String  expected = "[ElementA0, ElementA1, ElementC0, ElementC1]"; 
		String  actual = myarray.toString();
		assertEquals("MySet: remove() for MySet does not remove the last element correctly.", expected,actual);
		
	}
	
	
	
	@Test
	public void test_03_10_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 4; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementE");		
		int expected = 3; 
		int actual = myarray.getSize();
		assertEquals("MySet: The add() method does not correctly add to the set and/or getSize() is not correct.", expected,actual);
		
	}
	
/////////////////*************************************************/////////////////

	
	@Test
	public void test_03_11_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 4; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementE");		
		
		
		assertTrue("MySet contains method fail ", myarray.contains("ElementA"));
		myarray.remove("ElementA");
		assertFalse("MySet contains method fail ", myarray.contains("ElementA"));
		
	}
	
	
	@Test
	public void test_03_12_() {
		MySet myarray = new MySet(); 
		for( int i = 0; i < 4; i++)
			myarray.add("ElementA");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementC");
		for( int i = 0; i < 4; i++)
			myarray.add("ElementE");		
		
		
		int  expected = 1; 
		int  actual = myarray.countOccurrences("ElementA");
		assertEquals("MySet: The countOccurrences() method does not correctly count ", expected,actual);
		
	}
	
/////////////////*************************************************/////////////////
	
	
	@Test
    public void test_04_01_(){
        SchoolManager schoolManager = new SchoolManager();
        Employee employee1 = new Employee("John",30, "T123");
        Employee employee2 = new Employee("Alice",25, "E125");

        schoolManager.addToOvertimeList(employee1);
        schoolManager.addToOvertimeList(employee2);
        int expected = 2; 
		int actual = schoolManager.getOvertimeEmployeeCount();

        assertEquals("SchoolManager: getOvertimeEmployeeCount fail", expected,actual);
    }
	
	@Test
    public void test_04_02_(){
        SchoolManager schoolManager = new SchoolManager();
        Employee employee1 = new Employee("John",30, "T123");
        Employee employee2 = new Employee("Alice",25, "E125");

        schoolManager.addToOvertimeList(employee1);
        schoolManager.addToOvertimeList(employee2);
        schoolManager.addToOvertimeList(employee1);
        schoolManager.addToOvertimeList(employee2);

        int expected = 4; 
		int actual = schoolManager.getOvertimeEmployeeCount();

        assertEquals("SchoolManager: getOvertimeEmployeeCount fail", expected,actual);
    }
	
	@Test
    public void test_04_03_(){
        SchoolManager schoolManager = new SchoolManager();
        Employee employee1 = new Employee("John",30, "T123");
        Employee employee2 = new Employee("Alice",25, "E125");

        schoolManager.addToSeminarRegistrationList(employee1);
        schoolManager.addToSeminarRegistrationList(employee2);
        schoolManager.addToSeminarRegistrationList(employee1);
        schoolManager.addToSeminarRegistrationList(employee2);

        int expected = 2; 
		int actual = schoolManager.getSeminarRegistrationsCount();

        assertEquals("SchoolManager: addToSeminarRegistrationList fail", expected,actual);
    }
	
	@Test
    public void test_04_04_(){
        SchoolManager schoolManager = new SchoolManager();
        assertEquals("Overtime List: No employees in the overtime list.", schoolManager.displayOvertimeList());
    }
	
	
	@Test
    public void test_04_05_(){
        SchoolManager schoolManager = new SchoolManager();
        assertEquals("Registration List: No employees in the registration list.", schoolManager.displaySeminarRegistrationList());
    }
	
	@Test
    public void test_04_06_(){
        SchoolManager schoolManager = new SchoolManager();
        Employee employee1 = new Employee("John",30, "T123");
        Employee employee2 = new Employee("Alice",25, "E125");
        schoolManager.addToOvertimeList(employee1);
        schoolManager.addToOvertimeList(employee2);
        schoolManager.addToOvertimeList(employee2);
        String expected = "Overtime List: [{John (ID: T123)}, {Alice (ID: E125)}, {Alice (ID: E125)}]";
        assertEquals(expected, schoolManager.displayOvertimeList());
    }
	
	@Test
    public void test_04_07_(){
        SchoolManager schoolManager = new SchoolManager();
        Employee employee1 = new Employee("John",30, "T123");
        Employee employee2 = new Employee("Alice",25, "E125");
        schoolManager.addToSeminarRegistrationList(employee1);
        schoolManager.addToSeminarRegistrationList(employee2);
        schoolManager.addToSeminarRegistrationList(employee2);
        String expected = "Registration List: [{John (ID: T123)}, {Alice (ID: E125)}]";
        assertEquals(expected, schoolManager.displaySeminarRegistrationList());
    }
	
}
