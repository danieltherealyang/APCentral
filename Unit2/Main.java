package Unit2;

public class Main {
    public static void printSomething (int num, boolean val)
    {
        num--;
        System.out.print(val);
        System.out.print(num);
    }
    
    public static void main(String[] args) {
        System.out.print('\u000C');
        //2.2
        Thing someThing = null;
        if (someThing == null) {
            System.out.println("Thing someThing is null");
        }
        System.out.println("Q4 answer: (D)");
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
