public class rightDiamondPattern {
    public static void main(String[] args) {
        int n=15;
    for(int i=1; i<=n; i++){
        for(int j=n/2+1; j<=n; j++){
            if( j==n || i==j || i+j==n+1){
               System.out.print("* ");
            }else{
               System.out.print("  ");
            }
          }
            System.out.println("");
        }
    
   } 
}

