public class Command_line_argument {
	public static void main (String[]args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Total = " + (x+y));
	}
}

//---------------In command prompt-----------------
//javac test.java
//java test 100 200

######
Output:
Total = 300

