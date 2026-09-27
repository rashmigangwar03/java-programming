public class digitSumDivsibleBy3 {
     public static void main(String[] args) {
        int n=345;
        int sum=0;
        int digit=0;
        while(n>0){
            digit=n%10;
            sum+=digit;
            n/=10;
        }
        if(sum%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 3");
        }
     }
}
