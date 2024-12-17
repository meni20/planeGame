import javax.swing.*;
import java.awt.*;
public class Traingle extends JPanel {
    private int x;
    private int y;
    Traingle(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int[] xPoints = {x-20, x, x};
        int[] yPoints = {y+15, y, y+30};
        g2d.setColor(new Color(80,2,2));
        g2d.fillPolygon(xPoints, yPoints, 3);
    }
    public void moveLeft(){
        this.x-=3;
    }

    public void setX(int x) {
        this.x = x;
    }
}
