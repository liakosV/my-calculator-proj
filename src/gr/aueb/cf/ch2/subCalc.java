package gr.aueb.cf.ch2;

public class subCalc {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        result = sub(num1, num2);

        System.out.println("Sub: " + result);
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
