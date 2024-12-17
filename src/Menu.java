import javax.swing.*;
import java.awt.*;
public class Menu extends JPanel {
    JButton instructionsButton = new JButton("Instructions");
    JButton highScoreButton = new JButton("High Score");
    JButton shopButton = new JButton("Shop");

     Menu(int x, int y, int width, int height){
        this.setBounds(x, y, width,height);
        this.setBackground(Color.DARK_GRAY);

         this.setLayout(null);
        this.setVisible(false);

        instructionsButton.setBounds(5,50,180,50);
        highScoreButton.setBounds(0,150,180,50);
        shopButton.setBounds(0,250,180,50);

         instructionsButton.setFocusable(false);
         highScoreButton.setFocusable(false);
         shopButton.setFocusable(false);

         this.add(instructionsButton);
         this.add(highScoreButton);
         this.add(shopButton);

         instructionsButton.addActionListener(e -> showInstructions());
         highScoreButton.addActionListener(e -> showHighScores());
         shopButton.addActionListener(e -> openShop());
    }
    private void showInstructions() {
        JOptionPane.showMessageDialog(this, "Instructions go here.");
    }
    private void showHighScores() {
        JOptionPane.showMessageDialog(this, "High Scores go here.");
    }
    private void openShop() {
        JOptionPane.showMessageDialog(this, "Shop functionality goes here.");
    }
}
