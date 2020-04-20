package Unit5;
public class BoolTestII

{
    
    private int one;
    
    public BoolTestII(int newOne)
    
    {
    
    one = newOne;
    
    }
    
    public int getOne()
    
    {
    
    return one;
    
    }
    
    public boolean isGreater(BoolTestII other)
    
    {
        return one > other.getOne();
        //return getOne() > other.one;
    }

}