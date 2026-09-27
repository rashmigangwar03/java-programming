import java.util.Scanner;

public class calculatorUserinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();

        add(a,b);
        sub(a,b);
        multi(a,b);
        div(a,b);
        
        sc.close();
    }
    public static void add(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }
    public static void sub(int a, int b) {
        System.out.println("subraction:"+(a-b));
   }
    public static void multi(int a, int b) {
        System.out.println("multplicaition:"+(a*b));  
   }
    public static void div(int a, int b) {
        System.out.println("division:"+(a/b));
   }
}
