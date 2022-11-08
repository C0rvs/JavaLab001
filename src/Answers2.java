import java.util.Scanner;

public class Answers2 {
	  // Save as "CheckOddEven.java"
		   public static void main(String[] args) {  // Program entry point
			   Scanner mark = new Scanner (System.in);
			   int newMark = mark.nextInt();
		      if ( newMark % 2 == 0 ) {
		         System.out.println( "EVEN");   // even number
		      } else {
		         System.out.println("ODD");   // odd number
		      }
		      System.out.println("BYE");
		   }
		/*Try number = 0, 1, 88, 99, -1, -2 and verify your results.*/

}

