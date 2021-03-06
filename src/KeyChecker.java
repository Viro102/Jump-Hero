import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Some bits are mine but most of this class's logic is from
 * the internet
 */
public class KeyChecker implements KeyListener {

    private boolean rightKey;
    private boolean leftKey;
    private boolean upKey;
    private boolean resetKey;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_D) {
            this.rightKey = true;
            // System.out.println("moving right"); used for debug
        }
        if (code == KeyEvent.VK_A) {
            this.leftKey = true;
            // System.out.println("moving left");
        }
        if (code == KeyEvent.VK_W) {
            this.upKey = true;
            // System.out.println("moving up");
        }
        if (code == KeyEvent.VK_R) {
            this.resetKey = true;
            // System.out.println("resetting to start...");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_D) {
            this.rightKey = false;
        }
        if (code == KeyEvent.VK_A) {
            this.leftKey = false;
        }
        if (code == KeyEvent.VK_W) {
            this.upKey = false;
        }
        if (code == KeyEvent.VK_R) {
            this.resetKey = false;
        }

    }

    /**
     * Allocates the corresponding variable to a char for easier usage
     * 
     * @return the pressed key in form of char
     */
    public char getInput() {
        if (this.rightKey) {
            return 'd';
        } else if (this.leftKey) {
            return 'a';
        } else if (this.upKey) {
            return 'w';
        } else if (this.resetKey) {
            return 'r';
        } else {
            return 'x';
        }
    }
}