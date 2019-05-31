import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Ball  {
	private float ballSpeed = 1f;
	private double currentX = 5;
	private double currentY = 5;
	private double velocityX = 0;
	private double velocityY = 0;
	
	
	public Ball()
	{
		velocityX = Math.random() * 5+1;
		velocityY = Math.random() * 5+1;
		
	}
	
	public void update(Graphics s)
	
	{	
		
		if(currentX <= 0)
		{
			
			ReverseBallX();
			
		}
		if( currentY <= 0)
		{
			
			 
			currentX = 300;
			currentY = 300;
			velocityX = Math.random() * 5+1;
			velocityY = Math.random() * 5+1;
		}
		
		if(currentX >= 750)
		{
			
			ReverseBallX();
		}
		
		if(currentY >= 800 )
		{
			
			currentX = 400;
			currentY = 400;
			velocityX = Math.random() * 5+1;
			velocityY = Math.random() * 5+1;
			
		}
		s.setColor(Color.WHITE);
		s.drawOval((int) (currentX-ballSpeed), (int) (currentY-ballSpeed),8,8 );
		s.fillOval((int) (currentX-ballSpeed), (int) (currentY-ballSpeed),8, 8);
		
		
	
		currentX += ballSpeed + velocityX;
		currentY += ballSpeed + velocityY;
		
		
	}
	
	public double getcurrentY()
	{
		return currentY;
	}
	public double getcurrentX()
	{
		return currentX;
	}
	public void ReverseBallX()
	{
		velocityX *= -1; 
		ballSpeed *= -1;
	}
	public void ReverseBallY()
	{
		
		
		velocityY *= -1; 
		ballSpeed *= -1;
		
	}
	public void setX() {};
	public void setY() {};

	

}
