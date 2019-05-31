
public class AppRun {
	public static void main(String[] args)
	{
		GameWindow s = new GameWindow();
		s.setVisible(true);
	
		long currTime = System.currentTimeMillis();
		while(true)
		{	
			
			if(System.currentTimeMillis() - currTime >= 30)
			{
			
			s.update(s.getGraphics());
			currTime =System.currentTimeMillis();
			}
			
		
		}

	}
}