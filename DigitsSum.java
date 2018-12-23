import java.util.Scanner;

public class DigitsSum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive int");
        String num = scan.nextLine();
        //the current sum of digits is 0
        int sum = 0;
        //this is where the value of the digits will be stored, each temporarily until the next digit overwrites it
        int digit;
        //for loop that runs until the number of digits in the number matched
        for(int i = 0; i < num.length(); i++){
            //"Integer.parseInt" converts from string to int
            //"num.substring(i,i+1)" is so that it goes through every index of the string, starting from the left, every iteration of the for loop is the next digit
            digit = Integer.parseInt(num.substring(i,i+1));
            //sum is sum + digit. This is where the digits get added
            sum += digit;
        }
        System.out.format("The sum of the digits is %d\n", sum);
    }
}