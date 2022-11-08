import java.util.*;
public class Answers1 {

   public static void main(String[] args) {  // Program entry point
	   Scanner mark = new Scanner (System.in);
	   int newMark = mark.nextInt();
      if (newMark >= 50 ) {
         System.out.println( "PASS");
      } else {
         System.out.println("FAIL" );
      }
      System.out.println("DONE");
   }
		

}
