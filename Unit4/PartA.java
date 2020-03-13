package Unit4;

public class PartA
{
    public static void main(String[] args) {
        //Q4
        int count = 0;
        int number = 20;
        while (number > 0)
        {
            number = number / 2;
            count++;
        }
        System.out.println("Q4 ans: (B) " + count);
        //Q17
        int k = 35;
        int Q17count = 0;
        while (k >= 0)
        {
            System.out.print("X");
            k -= 5;
            Q17count++;
        }   
        System.out.println('\n' + "Q17 ans: (C) " + Q17count);
    }
}
