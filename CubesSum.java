import java.util.Scanner;
import java.lang.Math;

public class CubesSum{
    public static void main(String[] args){
        //getting int from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive int: ");
        //num has to be a string in order for me to use substring with it
        String num = scan.nextLine();
        //this holds the digit to the exponent of 3
        int digitCubed;
        //sub is initialized to 0
        int sum = 0;
        //for loop that runs as many times as the number of digits in the string
        for(int i = 0; i < num.length(); i++){
            //substring is to get the digit at one point, starting from left to right, increasing with every increment of the loop
            //integer.parseint is to convert that value to an int from a string
            //math.pow is to take the digit and cube it
            //must be typecasted to an int because digitCubed is an int and math.pow automatically typecastes to double
            digitCubed = (int)Math.pow(Integer.parseInt(num.substring(i,i+1)), 3);
            //sum adds up every digit cubed
            sum += digitCubed;
        }
        System.out.format("The sum of cubes of the digits is %d\n", sum);
    }
}