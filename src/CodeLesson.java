import javax.swing.*;  
import java.awt.event.*;  


public class CodeLesson
{
	public CodeLesson()
	{
		int X = 1000;
		int Y = 800;
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("Start");//creating instance of JButton  
		b.setBounds(X/2,(int)(Y/1.5),100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(X,Y);//800 width and 1000 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

	}
	public static void main(String[] args) 
	{  
		
		CodeLesson c = new CodeLesson();
		
		
		
    }  

	

}

