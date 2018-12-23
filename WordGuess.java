import java.util.Scanner;

public class WordGuess{
    public static void main(String[] args){
        int guesses = 0;
        final String SECRET_WORD = "BRAIN";
        Scanner scan = new Scanner(System.in);
        String letterGuess;
        String wordGuess = "";
        String wordSoFar = "";
        String updatedWord = "";
        
        System.out.println("WordGuess game");
        for(int i = 0; i <= (SECRET_WORD.length() - 1); i++){
            wordSoFar += "-";
        }
        System.out.println(wordSoFar);
        
        do{
            System.out.println("Enter a letter (! to guess entire word)");
            letterGuess = scan.nextLine();
            letterGuess = letterGuess.toUpperCase();
            
            guesses++;
            
            if (SECRET_WORD.indexOf(letterGuess) >= 0) {
                updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess)); 
                updatedWord += letterGuess;            
                updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1, wordSoFar.length());
                wordSoFar = updatedWord;
            }
            
            System.out.println(wordSoFar);
            
        }while((!letterGuess.equals("!")) && (!wordSoFar.equals(SECRET_WORD)));
        
        if (letterGuess.equals("!")){
            System.out.print("What word do you think it is?");
            wordGuess = scan.nextLine();
            wordGuess = wordGuess.toUpperCase();
        }
        if ((wordGuess.equals(SECRET_WORD)) || (wordSoFar.equals(SECRET_WORD))){
            System.out.println("You won");
        }
        else{
            System.out.println("You lose");
        }
        System.out.format("The secret word was %s\nYou took %d tries\n", SECRET_WORD, guesses);
    }
}