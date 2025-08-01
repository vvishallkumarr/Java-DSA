import java.util.Scanner;

public class Inputoutput{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("what is your name");
    String a=sc.nextLine();
    System.out.println("hi "+a);
    sc.close();
 }
}