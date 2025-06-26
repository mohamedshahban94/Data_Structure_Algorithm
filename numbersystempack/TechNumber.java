package numbersystempack;
import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = scan.nextInt();
        int orgNum = num;

        // find count of digits
        int temp1 = num;
        int digits = 0;
        while (temp1 > 0) {
            temp1 = temp1 / 10;
            digits++;
        }
        // find out divisor value
        if (digits % 2 == 0) {
            int div = 1;
            for (int i = 1; i <= (digits / 2); i++) {
                div = div * 10;
            }

            int sechalf = num % div;
            num = num / div;
            int firhalf = num % div;
            // formula to an tech number
            int techNumber = (firhalf + sechalf) * (firhalf + sechalf);
            if (techNumber == orgNum) {
                System.out.println("Tech Number: " + techNumber);
            } else {
                System.out.println("Not a Tech number...");
            }

        }
    }
}
