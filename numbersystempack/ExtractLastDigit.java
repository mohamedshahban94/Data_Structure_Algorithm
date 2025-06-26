package numbersystempack;
import java.util.*;

class ExtractLastDigit{

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt()	;
	
		int lstDigit= 4359%10;
		System.out.println(lstDigit);

	}

}