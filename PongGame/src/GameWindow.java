import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends Canvas {
	
	private Ball ball =  new Ball();
	private Paddle p1 = new Paddle(ball,750);
	private Paddle p2 = new Paddle(ball,0);
	private JFrame frame = new JFrame();
	private int width = 800;
	private int height = 800;
	
	public GameWindow() {
		
		
		frame.add(this);
		frame.setSize(width, height);
		frame.setVisible(true);
		this.setBackground(Color.BLACK);
		this.addMouseMotionListener(p1);
		this.addMouseMotionListener(p2);
		
		
		
		
	
	}
	
	@Override
	public void paint(Graphics s)
	{
		ball.update(s);
		p1.update(s);
		p2.update(s);
	}
	
	

}
