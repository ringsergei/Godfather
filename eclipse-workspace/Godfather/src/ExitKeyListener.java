import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ExitKeyListener implements KeyListener{
	public void keyPressed(KeyEvent e) {
		if( e.getKeyCode() == 27 ) {
			System.exit(0);
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
