
import javax.swing.JOptionPane;

/* _____                    ______      ____            __             
  / ___/____ _____ ___     / ____/___ _/ / /___ _____ _/ /_  ___  _____
  \__ \/ __ `/ __ `__ \   / / __/ __ `/ / / __ `/ __ `/ __ \/ _ \/ ___/
 ___/ / /_/ / / / / / /  / /_/ / /_/ / / / /_/ / /_/ / / / /  __/ /    
/____/\__,_/_/ /_/ /_/   \____/\__,_/_/_/\__,_/\__, /_/ /_/\___/_/     
                                              /____/                   
*/

/**
 *
 * @author Sam Gallagher 
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        try {
        TheGame GG = new TheGame();
        GG.setVisible(true);
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong sorry",
                    "My Bad!", JOptionPane.INFORMATION_MESSAGE);             
        }
    }
 
    
}
