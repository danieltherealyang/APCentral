package Unit3;
public class Main {
    public static void weatherCheck(int temp) {
        String weather;
        if (temp <= 31)
        {
        weather = "cold";
        }
        else
        {
        weather = "cool";
        }
        if (temp >= 51)
        {
        weather = "moderate";
        }
        else
        {
        weather = "warm";
        }
        System.out.println(weather);
    }
    
    public static void main(String[] args) { 
        System.out.print('\u000C');
        //Q7
        weatherCheck(30);
        weatherCheck(51);
        weatherCheck(60);
        System.out.println("Q7 ans: I only does not work as intended");
        
        //3.4
        int x = 3;
        int y = 5;
        int result = 0;
        if (x > y)
        {
            result = x - y;
            System.out.print(result);
        }
        else if (x < y)
        {
            result = y - x;
            System.out.print(result);
        }
        else
        {
            System.out.print(result);
        }
        
        if (x < y)
        {
            System.out.print(y - x);
        }
        else
        {
            System.out.print(x - y);
        }
        System.out.println("Code segment I and code segment II produce the same output for all values of x and y.");
        
        //Q16
        int j = 1;
        int k = 2;
        int m = 3;
        boolean init = !((j == k) && (k > m));
        boolean DeMorgans = (j != k) || (k <= m);

        if (init == DeMorgans) {
            System.out.println("true");
            System.out.println("Q16 ans: (B) (j != k) || (k <= m)");
        }
        
        //Q21
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
        System.out.println('\n' + "Q21 output: (C)");
    }
}