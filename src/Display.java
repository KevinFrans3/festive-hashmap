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
		this.setSize(700, 400);
        this.setTitle("An Empty Frame");
        
        
        
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
        System.out.println(hm.values());
	}
	
	public void paint(Graphics g) 
    {
		int xmargin = 100;
		int ymargin = 50;
		int every = 100;
		int height = 300;
		
		
    }
}
