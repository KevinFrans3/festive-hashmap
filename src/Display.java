import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JFrame;


public class Display extends JFrame{
	
	static HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	public Display()
	{
		histogram();
	}
	
	public void histogram()
	{
		this.setSize(1000, 420);
        this.setTitle("Histogram of Legends");
        
        
        
        Die da[] = new Die[4];
        for(int i = 0; i < 4; i++)
        {
        	da[i] = new Die(6);
        }
        
        for(int i = 0; i < 1000; i++)
        {
        	int total = 0;
        	for(Die d: da)
        	{
        		d.roll();
        		total += d.getValue();
        	}
        	String key = Integer.toString(total);
        	if(hm.get(key) == null)
        	{
        		hm.put(key, 1);
        	}
        	else
        	{
        		hm.put(key,hm.get(key) + 1);
        	}
        }
	}
	
	public void paint(Graphics g) 
    {
		int counts[] = new int[25];
		
		for(int i = 0; i < hm.values().size(); i++)
		{
			counts[i] = 0;
			if(hm.keySet().contains(Integer.toString(i)))
			{
				counts[i] = hm.get(Integer.toString(i));
			}
		}
		
		int xmargin = 100;
		int ymargin = 50;
		int every = 20;
		int between = 10;
		int height = 300;
		
		
		for(int i = 4; i < 25; i++)
		{
			g.drawString(Integer.toString(i), xmargin + i*every + i*between, 400);
			g.drawString(Integer.toString(counts[i]), xmargin + i*every + i*between, 200);
			g.drawRect(xmargin + i*every + i*between, ymargin + 300 - counts[i], every,counts[i]);
			
			
		}
		
		
		
		
		
    }
}
