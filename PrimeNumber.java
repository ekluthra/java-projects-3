import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input1, input2;
        boolean flag1 = false;
        boolean flag2 = false;
        
        System.out.print("Enter a number: ");
        input1 = scan.nextInt();
        System.out.print("Enter another number: ");
        input2 = scan.nextInt();
        
        for(int i = 2; i <= input1/2; i++){
            if(input1%i==0){
                flag1 = true;
                break;
            }
        }
        
        for(int i = 2; i <= input2/2; i++){
            if(input2%i==0){
                flag2 = true;
                break;
            }
        }
        
        if((flag1) && (flag2)){
            System.out.format("%d and %d are not prime numbers\n", input1, input2);
        }
        else if ((!flag1) && (!flag2)){
            System.out.format("%d and %d are both prime numbers\n", input1, input2);
        }
        else if (!flag1){
            System.out.format("%d is a prime number but %d is not\n", input1, input2);
        }
        else{
            System.out.format("%d is a prime number but %d is not\n", input2, input1);
        }
    }
}