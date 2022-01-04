public class Main {

    public static void main(String[] args) {
        Bisection doBisection = new Bisection(-7, 7, 0.00001);
        System.out.println();
        falsePosition falseP = new falsePosition(-7, 7, 0.00001);
        System.out.println();
        newtonRaphson newton = new newtonRaphson(-20.0, 0.00001);
        System.out.println();
        Secant sec = new Secant(-2, 2, 0.00001);
    }
}
