import java.util.Scanner;
public class DigitsDisplay{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive int: ");
        String num = scan.nextLine();
        //the for loop takes the value of every index, starting at 0, and outputs it to the next line
        //the loop stops at the length of the number
        for(int i = 0; i < num.length(); i++){
            System.out.println(num.substring(i,i+1));
        }
    }
}