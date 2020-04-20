package Unit1;

public class Main {
    public static void main(String[] args) {
        System.out.print('\u000C');
        //Q14
        boolean I = 1 == 2 / 5 % 3; 
        boolean II = 1 == 2 / (5 % 3);
        boolean III = 1 == 2 / 5 + 1;
        System.out.println("I evaluates to: " + I);
        System.out.println("II evaluates to: " + II);
        System.out.println("III evaluates to: " + III);
        System.out.println("Q14 answer: II and III only (D)");
        //Q15
        int x = 10;
        int y = 20;
        System.out.println();
        System.out.println("Q15 answer: " + (y + x / y));
        
        //Q6
        x = 4;
        y = 6;
        x -= y; System.out.print("x = -2");
        y += x; System.out.println("y = 4");
        System.out.println("Q6 answer: both x and y decreased");
        //Q7
        double d = 0.25;
        int i = 3;
        double diff = d - i;
        System.out.print("Q7 answer: " + ((int)diff - 0.5));
        //Q10
        int num1 = 5;
        int num2 = 10;
        double ans = (double) num1 / num2;
        System.out.print(ans);
        System.out.println("Q10 answer: The code should have cast either num1 or num2 in the expression num1 / num2 to double.");
        //Q12
        double fact1 = 1 / 2;
        double fact2 = 3 * 4;
        double product = fact1 * fact2;
        System.out.println("Q12: wrong output: " + product);
        fact1 = (double) 1 / 2;
        product = fact1 * fact2;
        System.out.println("Q12 (B) right output with 1/2 cast as double: " + product);
    }
}