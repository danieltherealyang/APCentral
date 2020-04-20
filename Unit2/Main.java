package Unit2;

public class Main {
    public static void printSomething (int num, boolean val)
    {
        num--;
        System.out.print(val);
        System.out.print(num);
    }
    
    public static double calculate(double x)

    {
    
        return x + 1.5;
    
    }
    public static void main(String[] args) {
        System.out.print('\u000C');
        //Q4
        Thing someThing = null;
        if (someThing == null) {
            System.out.println("Thing someThing is null");
        }
        System.out.println("Q4 answer: (D)");
        //Q12
        printSomething(1, true);
        printSomething(2, true);
        System.out.println("Q12 answer: true0true1");
        //Q6
        String s1 = "ABCDEFGHI";
        String s2 = s1.substring(6, 7);
        String s3 = new String("abcdefghi");
        String s4 = s3.substring(4, 5);
        String s5 = s3.substring(2, 3);
        System.out.print(s2 + s4 + s5);
        System.out.println("Q6 answer: Gec");
        //Q7
        Double d1 = new Double(7.5);
        System.out.println(calculate(d1));
        System.out.println("Q7 answer: 9.0");
        //2.9
        int val = (int) (Math.random() * 4 + 1);
        val *= 2;
        System.out.println(val);
        val = (int) (Math.random() * 4 + 1);
        val *= 2;
        System.out.println(val);
        val = (int) (Math.random() * 4 + 1);
        val *= 2;
        System.out.println(val);
        System.out.println("Random");
    }
    
    
}
