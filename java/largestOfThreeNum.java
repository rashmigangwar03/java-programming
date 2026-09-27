import java.util.Scanner;
public class largestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Three Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("largest number is "+a);
        }else if(b>=a && b>=c){
            System.out.println("Largest number is "+b);
        }else{
            System.out.println("largest number is "+c);
        }
        sc.close();
    }
}
