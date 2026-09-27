import java.util.Scanner;
public class largerOfTwoNum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first Number:");   
     int a=sc.nextInt();
     System.out.print("Enter second Number:");   
     int b=sc.nextInt();
     if(a>b){
        System.out.println("Largest:"+a);
     }else{
        System.out.println("largest:"+b);
     }
        sc.close(); 
    }
}
