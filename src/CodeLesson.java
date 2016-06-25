import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;

public class CodeLesson extends JFrame	
{
	int width, height; 
	JPanel mainContent = new JPanel();
    JLabel Lesson;
	JButton next, back, menu;
	int lessonNow; 
	Lesson lessonContent[]; // more like for storage, like struct
	Color brightPink = new Color(233,78,119);
	Color dustyPink = new Color(214,129,137);
	Color warmBrown = new Color(198,164,154);
	Color lightAquaBlue = new Color(198,229,217);
	Color lightPink = new Color(244,234,213);
	
	public CodeLesson(int x, int y, String str, int lessonTotal)
	{
		super(str); 
		lessonContent = new Lesson[lessonTotal];
		width = x; 
		height = y;
		setSize(width, height); 
		setLayout(new FlowLayout(FlowLayout.CENTER)); 
		next = new JButton("Next"); 
		back = new JButton("Back"); 
		menu = new JButton("Menu");
		getContentPane().setBackground(lightPink);
		mainContent.add(new JLabel("TESTING\n"));
		add(mainContent);
		add(next); 
		add(menu); 
		add(back);
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	void addLessonContent(Lesson lesssonToBeAdded, int lessonNum){
		lessonContent[lessonNum] = new Lesson(lesssonToBeAdded);
	}
	
	public static void main(String[] args) 
	{  
		CodeLesson c = new CodeLesson(500, 300, "Hello World", 20);
		
    }  
}

