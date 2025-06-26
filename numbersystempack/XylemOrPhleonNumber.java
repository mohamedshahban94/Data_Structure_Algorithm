package numbersystempack;
import java.util.*;

class XylemOrPhleonNumber{

	
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
		int len =count;
		System.out.println("Count : "+ count);

		
		int sum =0;
		int extreme = 0;
		int mean =0;
		while(num!=0){
			int value = 1;
			
			
			int digit = num%10;
			if((len == count) || (count==1)){
				extreme += digit;
			}
			else{
				mean += digit;
			}
			count--;
			
			sum += value;
			num = num/10;
		}
		if(extreme == mean){
			System.out.println("xylem..");
		}
		else{
			System.out.println("phleon..");
		}
		

	}
}