import java.util.Scanner;

public class PrimeFactors{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer");
        int num = scan.nextInt();
        int counter = 2;
        while(counter <= num){
            if(num%counter==0){
                System.out.println(counter);
                num = num/counter;
            }
            else{
                counter++;
            }
        }
    }
}