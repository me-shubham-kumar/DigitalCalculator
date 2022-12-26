public class Calculator {
    public static void main(String[] args){
        int a = 5, b = 5;
        System.out.println(add(a,b));
        System.out.println(div(a,b));
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static float div(int a, int b){
        if(b != 0){
            return a/b;
        }else{
            return 0;
        }
    }
}
