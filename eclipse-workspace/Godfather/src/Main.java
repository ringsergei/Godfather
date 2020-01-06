import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	static String ABSOLUTE_PATH;

	public static void main(String[] args) {

		try {
		     GraphicsEnvironment ge = 
		         GraphicsEnvironment.getLocalGraphicsEnvironment();
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(ABSOLUTE_PATH + "/fonts/HollyWoodHills.ttf")));
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(ABSOLUTE_PATH + "/fonts/OCR.TTF")));
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(ABSOLUTE_PATH + "/fonts/consolas.ttf")));
		} catch (IOException|FontFormatException e) {
		     System.out.println(e);
		}

	}
	
	public void exit() {
		
	}
	
	public void goToAdminPanel() {
		
	}
	
	public void getGrade() {
		
	}

}
