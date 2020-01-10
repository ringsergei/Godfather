import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class ScreenManager {
	Frame frame  = new Frame();
	ContentPane contentPane = new ContentPane();
	HomePage home = new HomePage(this);
	AdminPanelPage admin = new AdminPanelPage(this);
	VariantStorePage store = new VariantStorePage(this);
	
	public ScreenManager() {
	
		frame.setContentPane(contentPane);
		
		contentPane.addPage(home, "home");
		contentPane.addPage(admin, "admin");
		contentPane.addPage(store, "store");
	}
	
	public void showPage(String pageName) {
		contentPane.showPage(pageName);
	}
}
