import java.awt.*;
public class CustomRectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public CustomRectangle(int x,int y, int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void paint(Graphics graphics){
        graphics.fillRect(this.x, this.y, this.width, this.height);
    }
    public void moveLeft(){
        this.x-=3;
    }
    public void moveUp(){
        this.y-=7;
    }
    public void moveDown(){
        this.y+=7;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }
}

