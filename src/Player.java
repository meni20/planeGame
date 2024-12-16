import javax.swing.*;
import java.awt.*;
public class Player {
    private CustomRectangle size;
    private Image playerImage;
    Player(int x, int y, int size1, int size2){
        this.size = new CustomRectangle(x,y,size1,size2);
        this.playerImage = new ImageIcon("Images/plain for project9.png").getImage().getScaledInstance(55,55,Image.SCALE_DEFAULT);
    }
    public void paint(Graphics graphics){
        graphics.drawImage(playerImage, this.size.getX(), this.size.getY(), null);
    }
    public void moveUp(){
        this.size.moveUp();
    }
    public void moveDown(){
        this.size.moveDown();
    }
    public Rectangle getRectangleSize(){
        Rectangle rectangle = new Rectangle(
                this.size.getX(),
                this.size.getY(),
                this.size.getWidth(),
                this.size.getHeight());
        return rectangle;
    }
}


