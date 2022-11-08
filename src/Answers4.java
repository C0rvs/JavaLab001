import java.util.*;
public class Answers4 {
/*4. Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "dayNumber" is 0, 1, ..., 6, respectively.  Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.

*/
	public static void main(System [] args) {
		Scanner scan = new Scanner (System.in);
		int dayNumber = scan.nextInt();
			  if (dayNumber == 0 ) {
				  System.out.println("SUNDAY");
			  }
			  else if (dayNumber == 1) {   // Use == for comparison
		   		 System.out.println("MONDAY");
		   	  }
		   	  else if (dayNumber == 2) {   // Use == for comparison
		         System.out.println("TUESDAY");
		      }
		   	  else if (dayNumber == 3) {   // Use == for comparison
			         System.out.println("WEDNESDAY");
		      }
		   	  else if (dayNumber == 4) {   // Use == for comparison
			         System.out.println("THURSDAY");
		      } 
		      else if (dayNumber == 5) {   // Use == for comparison
			         System.out.println("FRIDAY");
		      } 
		      else if (dayNumber == 6) {   // Use == for comparison
			         System.out.println("SATURDAY");
		      } 
		      else {
		    	  System.out.println("NOT A VALID DAY");
		      }
			  
			  switch(dayNumber) {
			  case 0:
		   		  System.out.println("SUNDAY");
		   		  break;
			  
		   	  case 1:
		   		  System.out.println("MONDAY");
		   		  break;
		   	case 2:
		   		  System.out.println("TUESDAY");
		   		  break;
		   	case 3:
		   		  System.out.println("WEDNESDAY");
		   		  break;
		   	case 4:
		   		  System.out.println("THURSDAY");
		   		  break;
		   	case 5:
		   		  System.out.println("FRIDAY");
		   		  break;
		   	case 6:
		   		  System.out.println("SATURDAY");
		   		  break;
		   	default:
		   		System.out.println("NOT A VALID DAY");
			  }
	
}
	}
