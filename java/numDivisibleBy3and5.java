import java.util.Scanner;
public class numDivisibleBy3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numbber:");
        int n=sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("Dvisivible by 3 or 5");
        }else{
            System.out.println("not divisible by 3 or 5");
        }
        sc.close();
    }
}
