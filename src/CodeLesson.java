import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;

public class CodeLesson extends JFrame	
{
	int width, height; 
	JPanel panel;
    JLabel label;
	JButton next, back, menu;
	int lessonNow; 
	Lesson lessonContent[] = {}; // more like for storage, like struct
	
	public CodeLesson(int x, int y, String str)
	{
		super(str); 
		width = x; 
		height = y;
		setSize(width, height); 
		flow = new FlowLayout(FlowLayout.CENTER);
		setLayout(flow); 
		next = new JButton("Next"); 
		back = new JButton("Back"); 
		menu = new JButton("Menu");
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public static void main(String[] args) 
	{  
		
		CodeLesson c = new CodeLesson(500, 300, "Hello World");
		
		
		
    }  
}

