public class secLargestNum {
    public static void main(String[] args) {
        int n=7896;
        int current=0;
        int largest=-1;
        int secLargest=-1;
        while(n>0){
            current=n%10;
            if(current>largest){
                secLargest=largest;
                largest=current;
            }
            else if(current>secLargest){
                secLargest=current;
            }
            n/=10;
        }
        System.out.println(secLargest);
    }
}
