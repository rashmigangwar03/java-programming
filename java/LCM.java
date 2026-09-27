public class LCM {
    public static void main(String[] args) {
        int a=2, b=3, temp=3;
        while( temp % a !=0 || temp % b !=0){
            temp++;
        }
        System.out.println(temp);
    }
}
