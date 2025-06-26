package numbersystempack;

import java.util.Scanner;

class AutomorphicNumber{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = scan.nextInt();
		int temp1 = num;
		int temp2 = num;
		
		//count total digits 
		int count = 0;
		while(temp1 !=0){
			count++;
			temp1 = temp1/10;
		}
		
		System.out.println("Count : "+ count);

		
		//n=25
		//625
		int sum=0;
		while(num!=0){
			
			int product = temp1 * temp1;
			
			
			int numdigit = num%10;
			
			count--;
			// sum += value;
			num = num/10;
		}
		if(sum == temp2){
			System.out.println("Desirium..");
		}
		else{
			System.out.println("Not Desirium..");
		}
	
	}
}