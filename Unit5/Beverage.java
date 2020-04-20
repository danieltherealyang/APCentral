package Unit5;

public class Beverage

{

private int numOunces;

private static int numSold = 0;

public Beverage(int numOz)

{

numOunces = numOz;

}

public static void sell(int n)

{

    //ex implemenation
    numSold = n;
    //numOunces = n; will give an error

}

}
