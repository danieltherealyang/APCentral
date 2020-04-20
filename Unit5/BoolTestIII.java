package Unit5;
public class BoolTestIII

{
    
    private int one;
    
    public BoolTestIII(int newOne)
    
    {
    
    one = newOne;
    
    }
    
    public int getOne()
    
    {
    
    return one;
    
    }
    
    public boolean isGreater(BoolTestIII other)
    
    {
        return getOne() > other.one;
    }

}