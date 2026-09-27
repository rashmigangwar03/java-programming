public class calulatorByMethods {
    public static void main(String[] args) {
        add(4,5);
        sub(7,6);
        multi(8,5);
        div(24,9);    
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