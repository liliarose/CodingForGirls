import javax.swing.*;  
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.JFrame;

public class CodeLesson extends JFrame	
{
	int width, height, lessonMAX, hasLessonNum = 0; 
	
	//font & colors
	Color brightPink = new Color(233,78,119);
	Color dustyPink = new Color(214,129,137);
	Color warmBrown = new Color(198,164,154);
	Color lightAquaBlue = new Color(198,229,217);
	Color lightPink = new Color(244,234,213);
	Font headFont = new Font("Courier", Font.BOLD, 30);
	Font mainFont = new Font("Courier", Font.PLAIN, 14);
	Font footFont = new Font("Courier", Font.ITALIC, 10);
	
	//panels
	JPanel header = new JPanel();
	JPanel mainContent = new JPanel();
	JPanel footer = new JPanel(); 
    JLabel Lesson;
	
	//buttons
	JButton next = new JButton("Next"); 
	JButton back = new JButton("Back"); 
	JButton menu = new JButton("Menu");

	//current page 
	int lessonNow; 
	
	//lesson & Home Page
	Lesson HomePage; 
	Lesson lessonContent[]; // more like for storage, like struct
	
	//constructor 
	public CodeLesson(int x, int y, String str, int lessonTotal, Lesson h)
	{
		super(str); 
		HomePage = h;
		lessonContent = new Lesson[lessonTotal]; 
		setLayout(new BorderLayout()); 
		width = x; 
		height = y;
		setSize(width, height);		
		setResizable(true);
		//getContentPane().setBackground(lightPink);
		
		//header 
		JLabel temp = new JLabel("Chapter X\n");
		temp.setFont(headFont);
		header.add(temp);
		header.setOpaque(true); 
		header.setBackground(lightAquaBlue);
		header.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		//main
		mainContent.setOpaque(true); 
		mainContent.setBackground(lightPink);
		mainContent.setLayout(new BoxLayout(mainContent, BoxLayout.X_AXIS));
		
		//footer
		footer.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
			//buttons 
			next.setBackground(lightPink);
			back.setBackground(lightPink);
			menu.setBackground(lightPink);
		footer.setOpaque(true); 
		footer.setBackground(lightAquaBlue);
		footer.add(back);
		footer.add(menu); 
		footer.add(next);
		
		//add to JFrame
		add(header, BorderLayout.NORTH); 
		add(mainContent, BorderLayout.CENTER);
		add(footer, BorderLayout.SOUTH);
		
		//set Homepage 
		//setHome(); 
		
		//show
		setVisible(true);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	//add lessons 
	boolean addLessonContent(Lesson lesssonToBeAdded, int lessonNum){
		if(lessonNum < lessonContent.length){
			lessonContent[lessonNum] = new Lesson(lesssonToBeAdded);
			hasLessonNum++;
			return true; 
		}
		return false; 
	}

	/*void setHome(){
		
	}*/
	public static void main(String[] args) 
	{  
		// Lesson(String h, String main, String code, ImageIcon img[]); 
		ImageIcon homeImag[] = new ImageIcon[1];
		BufferedImage myPic = new ImageIO.read(new File("zmascot.png"));
		homeImag[0] = new ImageIcon(myPicture);
		Lesson homeview = new Lesson("Coding for Girls (CG)", "Let's start a new adventure", "", homeImag, homeImag.length); 
		CodeLesson c = new CodeLesson(500, 500, "Hello World", 20, homeview);
		
    }  
}

