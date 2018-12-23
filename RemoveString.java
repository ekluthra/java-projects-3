import java.util.Scanner;

public class RemoveString{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence");
        String sentence = scan.nextLine();
        System.out.print("Enter a word you want to remove");
        String word = scan.nextLine().trim();
        System.out.println(sentence.replaceAll(word,"".trim()));
    }
}