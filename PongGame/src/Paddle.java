import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Paddle implements MouseMotionListener{
	
	private Ball ball;
	private double X;

	private double currentMouse;
	private double startingPosition;
	
	public Paddle(Ball b,int startingPosition)
	
	{
		ball = b;
		this.startingPosition = startingPosition;
	}
	public void update(Graphics s)	
	{	
		s.setColor(Color.white);
		
		s.fillRect((int) X, (int) startingPosition, 70,10);
		
		
		
		if(startingPosition == 750 && ball.getcurrentY() >= 750 && ball.getcurrentX() >= X && ball.getcurrentX() <= PaddleBounds())
			
		{
			
			ball.ReverseBallY();
			
			
			
		}

		if(startingPosition == 0 && ball.getcurrentY() <= 10 && ball.getcurrentX() >= X && ball.getcurrentX() <= PaddleBounds())
			
		{
			
			ball.ReverseBallY();
		
			
			
		}
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		if(arg0.getX() <720 && arg0.getX() > 0)
		X = arg0.getX();
		
		currentMouse = arg0.getX();
		
	}
	
	private int PaddleBounds()
	{
		return (int) (currentMouse+70);
		
	}
	@Override
	public String toString()
	{
		return startingPosition+"";
	}
	
}
