package SecondRound;
import java.util.*;
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  while(true)
	  {
		  System.out.println("Test case ");
		 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int number=sc.nextInt();
		  int printnum=number;
		  for(int i=1;i<number;i++)
		  {
			  for(int j=1;j<number;j++)
			  {
				  System.out.print(printnum);
				  if(i==j && printnum!=0) {
					    printnum --;	 
					  }
			  }
			  
			      System.out.println(printnum);
				 // System.out.println(" ");
		  }
		  
	  }

	}

}
