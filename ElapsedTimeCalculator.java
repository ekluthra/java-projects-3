import java.util.Scanner;;

public class ElapsedTimeCalculator   {
    public static void main (String args []){
        Scanner scan = new Scanner (System.in);
       
        System.out.print ("Enter am or pm: ");
        String timeOfDay = scan.nextLine();
        
        System.out.print ("Enter the starting hour: ");
        int time = scan.nextInt ();
        
        System.out.print ("Enter the number of elapsed hours: ");
        time += scan.nextInt ();
        
        if(timeOfDay.equals("pm")){
            
            time += 12;
            
        }
        
        String result = ((time/12)%2)==0? "am" : "pm";
        time %= 12;
        
        if(time==0){ //to make 0 AM and 0 PM change to 12 AM and 12 PM.
            time+=12;
        }
        
        System.out.println("The time is: " + time + ":00 " + result);
        
    }
}