package test;

public class FirstProgram {
    public static void main(String[] args) {
        calc(5, 5, "add");
        calc(5, 5, "sub");
        calc(5, 5, "mul");
        calc(5, 5, "div");
        ;

    }
    public static void calc(double arg1, double arg2, String operation) {
        double result;
        switch (operation) {
            case "add":
                result = arg1 + arg2;
                System.out.println(arg1 + " + " + arg2 + " = " + result);
                break;
            case "sub":
                result = arg1 - arg2;
                System.out.println(arg1 + " - " + arg2 + " = " + result);
                break;
            case "mul":
                result = arg1 * arg2;
                System.out.println(arg1 + " * " + arg2 + " = " + result);
                break;
            case "div":
                result = arg1 / arg2;
                System.out.println(arg1 + " / " + arg2 + " = " + result);
                break;
            default:
                System.out.println("result");

        }
    }
}





















