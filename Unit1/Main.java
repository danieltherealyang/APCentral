package Unit1;

public class Main {
    public static void main(String[] args) {
        System.out.print('\u000C');
        //1.3
        boolean I = 1 == 2 / 5 % 3; 
        boolean II = 1 == 2 / (5 % 3);
        boolean III = 1 == 2 / 5 + 1;
        System.out.println("I evaluates to: " + I);
        System.out.println("II evaluates to: " + II);
        System.out.println("III evaluates to: " + III);
        System.out.println("Q14 answer: II and III only (D)");
        //1.5
        double d = 0.25;
        int i = 3;
        double diff = d - i;
        System.out.print("Q7 answer: " + ((int)diff - 0.5));
        
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = fact1 * fact2;
        System.out.println("Q12: wrong output: " + product);
        fact1 = (double) 1 / 2;
        product = fact1 * fact2;
        System.out.println("Q12 (B) right output with 1/2 cast as double: " + product);
    }
}