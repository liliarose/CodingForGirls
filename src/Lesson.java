import java.awt.Font; 
import javax.swing.ImageIcon;
 
public class Lesson{
	
	String lessonText;
	String codeSignal; 
	ImageIcon imageList[]; // if we add images, we can insert a special code to show where to add it & add the images in order
	Lesson(String str, ImageIcon img[]){
		lessonText = str; 
		for(int i = 0; i < img.length; i++){
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