
public class Die {
	
	int sides;
	int rolled = 0;
	
	public Die(int s)
	{
		sides = s;
	}
	
	public void roll()
	{
		rolled = (int) (Math.random() * sides + 1);
	}
	
	public int getValue()
	{
		return rolled;
	}

}
