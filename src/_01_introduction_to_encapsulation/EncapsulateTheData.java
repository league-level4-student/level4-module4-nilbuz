package _01_introduction_to_encapsulation;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private static int itemsRecieved; // must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature; // must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	
	public static void main(String[] args) {

		


		
	}
	@Test
	void test() {
		EncapsulateTheData.setInt(-3);
		EncapsulateTheData.setFloat(365);
		EncapsulateTheData.setString("");
		EncapsulateTheData.setObject("aaaaa");
		
		assertEquals(0, itemsRecieved);
		assertEquals(360, degreesTurned);
		assertEquals(" ", nomenclature);
		
		
	}

	public static Object get(Object a) {

		return a;

	}

	public static void setInt(int a) {
		if (a < 0) {
			a = 0;
		}

		itemsRecieved = a;

	}

	public static void setFloat(float a) {
		
		if (a < 0) {
			degreesTurned = 0;
		} else if (a > 360) {
			degreesTurned = 360;
		} else {
			degreesTurned = a;
		}
	}

	public static void setString(String a) {

		if (a == "") {
			a = " ";
		}
		
		nomenclature = a;
	}

	public static void setObject(Object a) {

		
		
		memberObj = a;

	}

}
