package Unit5;
public class Main
{  
    public static void main(String[] args) {
        //Q2
        Thing thing = new Thing("string");
        System.out.println("Q2 answer: Thing object can be created in outside classes");
        //Q3
        BoolTestI test1 = new BoolTestI(5);
        BoolTestI test1Other = new BoolTestI(7);
        BoolTestII test2 = new BoolTestII(5);
        BoolTestII test2Other = new BoolTestII(7);
        BoolTestIII test3 = new BoolTestIII(5);
        BoolTestIII test3Other = new BoolTestIII(7);
        System.out.println("test1: " + test1.isGreater(test1Other));
        System.out.println("test2: " + test2.isGreater(test2Other));
        System.out.println("test3: " + test3.isGreater(test3Other));
        System.out.println("All Bool classes same output");
        //Q4
        Gadget a = new Gadget();
        Gadget.setStatus(3);
        Gadget b = new Gadget();
        System.out.println("Q4 answer: The code segment creates two Gadget objects a and b. The class Gadget’s static variable status is set to 10, then to 3, and then back to 10.");
        //Q5
        Beverage bev = new Beverage(3);
        bev.sell(5);
        System.out.println("Q5 answer: numSold can be accessed and updated; numOunces cannot be accessed or updated.");
        //Q6
        UnitsHandler large = new UnitsHandler(100);
        UnitsHandler.update(8);
        System.out.println("Q6 answer: The code segment creates a UnitsHandler object called large and sets the static variables unitsPerContainer, containers, and totalUnits to 100, 8, and 800, respectively." );
        //Q8
        Student s = new Student("Priya", "Banerjee", -1);
        System.out.println(s);
        System.out.println("Q8 answer: The code segment will compile, but the instance variables will not be initialized correctly because the variable names firstName, lastName, and age refer to the local variables inside the constructor." );
        //Q11
        Person andy = new Person("Andrew", 5, 6);
        Person ben = new Person("Benjamin", 6, 5);
        System.out.println(andy.compareHeights(ben));
        System.out.println("Q11 answer: Andrew");
    }
}