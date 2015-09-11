package org.bildit.hms.test;

/**
 * @author Ognjen Mišiæ - Example of class documentation and description
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Example of documenting a method. Alt-shift-j while the coursor is in the
	 * method body to get this
	 * 
	 * @author Ognjen Mišiæ
	 * @param test
	 *            that tests
	 * @return a null string
	 */
	static String testMethod(Integer test) {
		// example of in-body comments, put them above the code, not on the side
		if (test.equals("1")) {
			// do this
			return "1";
		} else {
			// we do this
			return null;
		}
	}

}
