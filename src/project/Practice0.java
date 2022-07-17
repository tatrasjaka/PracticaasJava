package project;

public class Practice0 {
	public static void main(String[] args) {
		String name = "John", name2 = "alva";
		// Se pueden declarar dos variables tal que así:
		// IMPORTANT TO DECLARE NUMBERS USE INT AND FOR TEXT, STRING
		System.out.println(name2);
		System.out.println(name);
		int myNum = 15;
		System.out.println(myNum);
		/*
		 * Para declarar una variable númerica, ponemos int en vez de string.
		 */
		int myNum0;
		myNum0 = 1800;
		System.out.println(myNum0);
		// También existe la posibilidad de usar final int, en caso de ser un número
		// absoluto
		System.out.println("Hello " + name);
		String firstName = "Miguel";
		String lastName = " Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		int x = 8;
		int y = 5;
		System.out.println(x + y);
		// Declarar el mismo valor a muchas variables
		int x0, y0, z;
		x0 = y0 = z = 50;
		System.out.println(x0 + y0 + z);
		// Byte es una variable númerica para números entre -128 y 127
		byte myByteNum = 127;
		System.out.println(myByteNum);
		// Short is for numbers between -32768 to 32767
		short myShortNum = 8500;
		System.out.println(myShortNum);
		// Int is for numbers between -2147483648 to 2147483647
		int myIntNum = 100000;
		System.out.println(myIntNum);
		// Long is for numbers between -9223372036854775808 to 9223372036854775807
		long myLongNum = 150000000L;
		System.out.println(myLongNum);
		// Float and double variables are for decimals
		float myFloatNum = 5.75f;
		System.out.println(myFloatNum);
		double myDoubleNum = 19.99d;
		System.out.println(myDoubleNum);
		// For scientist numbers
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		// Boolean values are used for conditional testing, what I don't know right now
		// but well
		// The char data type is used to store a single character. The character must be
		// surrounded by single quotes, like 'A' or 'c':
		char myGrade = 'B';
		System.out.println(myGrade);
		// A simple math methods
		int sum1 = 100 + 50; // 150 (100 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 (400 + 400)
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		// For calculating the lenght of the text
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		String txt0 = "Hello World";
		System.out.println(txt0.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt0.toLowerCase()); // Outputs "hello world"
		// indexOf() returns the position of the first case of a specified text in a
		// string, including whitespaces
		// Also, Java start counting positions from zero, I mean, 0 is the first
		// position in a string
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); // Outputs 7
		// You can put just a whitespace in the string
		String firstName0 = "John";
		String lastName0 = "Doe";
		System.out.println(firstName0 + " " + lastName0);
		// Also, you can concatenate two stringsee
		System.out.println(firstName0.concat(lastName0));
	}
}
/*
 * Otros ejemplos de variables son int myNum = 5; float myFloatNum = 5.99f; char
 * myLetter = 'D'; boolean myBool = true; String myText = "Hello"; Los cuales ya
 * veré como se hacen
 */