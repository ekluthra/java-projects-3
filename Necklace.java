import java.util.Scanner;
import java.text.DecimalFormat;
public class Necklace{
    public static void main(String[] args){
        int num1, num2 = 0;
        String sum;
        Scanner scan = new Scanner(System.in);
        DecimalFormat toString = new DecimalFormat("#");
        
        System.out.print("Enter a number between 1 and 9: ");
        num1 = scan.nextInt();
        System.out.print("Enter another number: ");
        num2 = scan.nextInt();
        
        System.out.format("%d %d", num1, num2);
        for(int i = 0; i < 12; i++){
            sum = toString.format(num1+num2);
            sum = sum.substring(sum.length()-1);
            System.out.format(" %s ", sum);  
            num1 = num2;
            num2 = Integer.parseInt(sum);
        }
        System.out.format("\n");
    }
}