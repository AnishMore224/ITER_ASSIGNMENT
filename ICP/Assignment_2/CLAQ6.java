/*Write a java program to input a character from command line and display 
 * the ASCII value of the entered character.*/
public class CLAQ6 {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		System.out.println("ASCII value="+(int)ch);
	}

}
/*OUTPUT-
javac CLAQ6.java
java CLAQ6  a
ASCII value=97
*/