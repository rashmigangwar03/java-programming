import java.util.Scanner;
public class numLiesBtw10to50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numbers:");
        int n=sc.nextInt();
        if(n>=10 && n<=50){
          System.out.println("lies btw 10 and 50");
        }else{
            System.out.println("not lies btw 10 and 15");
        }
        sc.close();
    }
}
