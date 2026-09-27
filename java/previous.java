class previous {
    public static void main(String[] args) {
        int n=1234;
        int prev=n%10;
        int digit=0;
        boolean is_safe=true;
        n/=10;
        while(n>0){
            digit=n%10;
            if(digit%2==prev%2){
                is_safe=false;
                break;
            }
            else{
                prev=digit;
            }
            n/=10;
        }
        if(is_safe){
            System.out.println("alternating h");
        }
        else{
            System.out.println("alternating nh h");
        }
    }
    
}
