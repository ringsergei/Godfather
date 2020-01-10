import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public abstract class Page extends JPanel{
	
	int width, height;
	String absolute_path;
	ScreenManager screenManager;

	public Page(ScreenManager screenManager) {
		this.screenManager = screenManager;
		this.width = screenManager.frame.width;
		this.height = screenManager.frame.height;
		this.absolute_path = screenManager.frame.absolute_path;
		this.setBackground(new Color(255,204,96));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(new BorderLayout(0, 0));
	}
	
	public void setup() {};
	
	class HomeButton extends JButton{
		
		public HomeButton() {
			setText("home");
			setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(26,49,68)));
			setVerticalAlignment(SwingConstants.TOP);
			setHorizontalAlignment(SwingConstants.LEFT);
			setForeground(new Color(26,49,68));
			setFont(new Font("Hollywood Hills", Font.PLAIN, 46));
			setContentAreaFilled(false);
			setRolloverEnabled(false);
			setRequestFocusEnabled(false);
			setBorderPainted(true);
			setEnabled(true);
			setFocusable(false);
			setFocusTraversalKeysEnabled(false);
			setFocusPainted(false);
		}	
	}
	
	class Card extends JButton{
		public Card() {
			setContentAreaFilled(false);
			setRolloverEnabled(false);
			setRequestFocusEnabled(false);
			setEnabled(true);
			setFocusable(false);
			setFocusTraversalKeysEnabled(false);
			setFocusPainted(true);
			setBorderPainted(false);
			setFont(new Font("Brandish", Font.PLAIN, 30));
			setForeground(new Color(255,204,96));
			setVerticalTextPosition(SwingConstants.CENTER);
			setHorizontalTextPosition(SwingConstants.CENTER);		
		    setIcon(new ImageIcon(absolute_path + "/images/variantCard.png"));		    
			addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int number = Integer.parseInt((((JButton) e.getSource()).getText()).replaceAll("numb.", ""));
					System.out.println(number);
				}
			});
		}
	}
	
}
