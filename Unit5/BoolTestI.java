package Unit5;
public class BoolTestI

{
    
    private int one;
    
    public BoolTestI(int newOne)
    
    {
    
    one = newOne;
    
    }
    
    public int getOne()
    
    {
    
    return one;
    
    }
    
    public boolean isGreater(BoolTestI other)
    
    {
        return one > other.one;
        //return one > other.getOne();
        //return getOne() > other.one;
    }

}