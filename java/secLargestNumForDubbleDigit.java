public class secLargestNumForDubbleDigit {
    public static void main(String[] args) {
        int n=98797;
        int current=0;
        int largest=-1;
        int secLargest=-1;
        while(n>0){
            current=n%10;
            if(current>largest){
                secLargest=largest;
                largest=current;
            }
            else if(current>secLargest && current!=largest){
                    secLargest=current;
            }
            n/=10;
        }
        System.out.println(secLargest);
    }
}
