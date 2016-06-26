import java.awt.Font; 
import javax.swing.ImageIcon;
 
public class Lesson{
	
	String lessonText, codeSignal, header; 
	ImageIcon imageList[]; // if we add images, we can insert a special code to show where to add it & add the images in order
	Lesson(String h, String main, String code, ImageIcon img[], int len){
		lessonText = main;
		codeSignal = code; 
		header = h;
		for(int i = 0; i < len; i++){
			imageList[i] = img[i];
		}		
	}
	Lesson(Lesson les){
		lessonText = les.lessonText; 
		for(int i = 0; i < les.imageList.length; i++){
			this.imageList[i] = les.imageList[i];
		}		
	}
}