import java.text.DecimalFormat;

public class IntToStringAndStringToInt{
    public static void main(String[] args){
        /*from int to string*/
        int num = 25;
        String numAsString;
        
        //This method uses the DecimalFormat class
        DecimalFormat toString = new DecimalFormat("#");
        numAsString = toString.format(num);
        System.out.println(numAsString);
        
        //This method uses Integer.toString
        numAsString = Integer.toString(num);
        System.out.println(numAsString);
        
        //This method uses String.valueOf
        numAsString = String.valueOf(num);
        System.out.println(numAsString);
        
        //This method uses Integer(int).toString()
        numAsString = new Integer(num).toString();
        System.out.println(numAsString);
        
        //This method uses String.format
        numAsString = String.format("%d", num);
        System.out.println(numAsString);
        
        //This method is the quick solution
        numAsString = "" + num;
        System.out.println(numAsString);
        
        /*From string to int*/
        
        //This method uses Integer.parseInt
        num = Integer.parseInt(numAsString);
        System.out.println(num);
        
        //This method uses Integer.valueOf
        num = Integer.valueOf(numAsString);
        System.out.println(num);
        
        //This method uses Integer(String).intValue()
        num = new Integer(numAsString).intValue();
        System.out.println(num);
    }
}