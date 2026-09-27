public class calculatorByMethodsUsingRetrun {
    public static void main(String[] args) {
        System.out.println("Addition:"+add(4,6));
        System.out.println("Subtraction:"+sub(4,6));
        System.out.println("multiplication:"+multi(4,6));
        System.out.println("division:"+div(4,6));
    }
    public static  int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int multi(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        return a/b;
  }
}
