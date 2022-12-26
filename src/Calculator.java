public class Calculator {
    public static void main(String[] args){
        int a = 5, b = 5;
        System.out.println(add(a,b));
        System.out.println(multiplication(a,b));

    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }
}
