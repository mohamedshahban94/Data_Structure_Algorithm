package numbersystempack;
import java.util.*;

class DesiriumNumber{

	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = scan.nextInt();//89
		int temp1 = num;
		int temp2 = num;
		
		//count total digits 
		int count = 0;
		while(temp1 !=0){
			count++;
			temp1 = temp1/10;
		}
		
				System.out.println("Count : "+ count);

		
		int sum =0;
		while(num!=0){
			int value = 1;
			
			
			int digit = num%10;
			for(int i=1;i<=count;i++){
				value = value * digit;		
			}
			count--;
			sum += value;
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