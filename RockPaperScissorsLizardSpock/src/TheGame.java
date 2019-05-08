/* _____                    ______      ____            __             
  / ___/____ _____ ___     / ____/___ _/ / /___ _____ _/ /_  ___  _____
  \__ \/ __ `/ __ `__ \   / / __/ __ `/ / / __ `/ __ `/ __ \/ _ \/ ___/
 ___/ / /_/ / / / / / /  / /_/ / /_/ / / / /_/ / /_/ / / / /  __/ /    
/____/\__,_/_/ /_/ /_/   \____/\__,_/_/_/\__,_/\__, /_/ /_/\___/_/     
                                              /____/                   
*/
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Sam Gallagher
 */
public class TheGame extends javax.swing.JFrame {

    /**
     * Creates new form TheGame
     */
    
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int lizard = 4;
    int spock = 5;
    int playerChoice;
    int sheldonChoice;
    int playerScore = 0;
    int sheldonScore = 0;
    Random rnd = new Random();
    
    public TheGame() {
        initComponents();
    }
    
    public void displayResults(){
        lblSheldonScore.setText(Integer.toString(sheldonScore));
        lblPlayerScore.setText(Integer.toString(playerScore));
    }
    
    public void playerSelection(){
        int selection = comboSelection.getSelectedIndex() + 1;
      try {  
            switch (selection){
                case 1:
                    playerChoice = rock;
                    break;

                case 2: 
                    playerChoice = paper;
                    break;

                case 3: 
                    playerChoice = scissors;
                    break;

                case 4: 
                    playerChoice = lizard;
                    break;

                case 5: 
                    playerChoice = spock;
                    break;
            }
      }
      
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You made an invalid selection choose again",
                    "Try Again", JOptionPane.INFORMATION_MESSAGE);
      }
    }
    
    public void sheldonSelection(){
        int selection = rnd.nextInt(4) + 1;
      try {  
            switch (selection){
                case 1:
                    sheldonChoice = rock;
                    break;

                case 2: 
                    sheldonChoice = paper;
                    break;

                case 3: 
                    sheldonChoice = scissors;
                    break;

                case 4: 
                    sheldonChoice = lizard;
                    break;

                case 5: 
                    sheldonChoice = spock;
                    break;
            }
      }
      
      catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sheldon made an invalid selection choose again",
                    "Try Again", JOptionPane.INFORMATION_MESSAGE);
      }
    }   
    
    public void theGame() {
        
        try{
            
            if ((playerChoice == scissors && sheldonChoice == paper) ||
                    (playerChoice == paper && sheldonChoice == rock) ||
                    (playerChoice == rock && sheldonChoice == lizard) ||
                    (playerChoice == lizard && sheldonChoice == spock) ||
                    (playerChoice == spock && sheldonChoice == scissors) ||
                    (playerChoice == scissors && sheldonChoice == lizard) ||
                    (playerChoice == lizard && sheldonChoice == paper) ||
                    (playerChoice == paper && sheldonChoice == spock) ||
                    (playerChoice == spock && sheldonChoice == rock) ||
                    (playerChoice == rock && sheldonChoice == scissors)){
            JOptionPane.showMessageDialog(null, "You Won",
                    "Weldone!", JOptionPane.INFORMATION_MESSAGE); 
                    playerScore ++;
                    displayResults();
            }
            else if ((sheldonChoice == scissors && playerChoice == paper) ||
                    (sheldonChoice == paper && playerChoice == rock) ||
                    (sheldonChoice == rock && playerChoice == lizard) ||
                    (sheldonChoice == lizard && playerChoice == spock) ||
                    (sheldonChoice == spock && playerChoice == scissors) ||
                    (sheldonChoice == scissors && playerChoice == lizard) ||
                    (sheldonChoice == lizard && playerChoice == paper) ||
                    (sheldonChoice == paper && playerChoice == spock) ||
                    (sheldonChoice == spock && playerChoice == rock) ||
                    (sheldonChoice == rock && playerChoice == scissors)){
            JOptionPane.showMessageDialog(null, "Sheldon Won .. BAZINGA!!!!",
                    "BAZINGA!", JOptionPane.INFORMATION_MESSAGE); 
                    sheldonScore ++;
                    displayResults();                
            }
            else {
            JOptionPane.showMessageDialog(null, "You powers were equally matched",
                    "A Draw!", JOptionPane.INFORMATION_MESSAGE); 
                    displayResults();                
            }
            
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong, Please play again",
                    "Play Again", JOptionPane.INFORMATION_MESSAGE);            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSelection = new javax.swing.JComboBox<>();
        btnPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSheldonScore = new javax.swing.JLabel();
        lblPlayerScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Can You Beat Me");

        comboSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "rock", "paper", "scissors", "lizard", "spock" }));

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jLabel1.setText("Sheldon Score:");

        jLabel2.setText("Your Score:");

        lblSheldonScore.setText("...");

        lblPlayerScore.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(comboSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPlayerScore))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSheldonScore)))))
                .addGap(35, 35, 35)
                .addComponent(btnPlay)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSheldonScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPlayerScore))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
       try {
           playerSelection();
           sheldonSelection();
           theGame();
       }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong, Please play again",
                    "Sorry", JOptionPane.INFORMATION_MESSAGE);            
       }
    }//GEN-LAST:event_btnPlayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JComboBox<String> comboSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPlayerScore;
    private javax.swing.JLabel lblSheldonScore;
    // End of variables declaration//GEN-END:variables
}
