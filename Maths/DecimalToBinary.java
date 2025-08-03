import java.lang.Math;
import java.util.Scanner;
class DecimalToBinary{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the decimal no");
        int a=sc.nextInt();
        DecToBin(a);
    }

    static void DecToBin(int decNo){
        int resNum=0;
        int power=0;
        while(decNo>0){
            int rem=decNo%2;
            decNo=decNo/2;
            resNum=resNum+ rem* (int)Math.pow(10,power);
            power++;
        }
       System.out.println(resNum);
    }
}