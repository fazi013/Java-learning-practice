//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
      

        //using scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number : ");
      int num = sc.nextInt();
      System.out.println(num);
      sc.close();
      
      //using buffer reader
        /*  System.out.print("Enter a number : ");
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num =Integer.parseInt(bf.readLine());
        System.out.println();
        System.out.println(num);
        bf.close();
        
        */
    }
    
}
