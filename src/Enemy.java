import java.awt.*;
public class Enemy {
    private CustomRectangle topHalf;
    private CustomRectangle bottomHalf;
    private Traingle[] TraingleArr = new Traingle[20];
    public Enemy(int x, int y, int width,int random, int height){
        this.topHalf = new CustomRectangle(x, y,width,random);
        this.bottomHalf = new CustomRectangle(x, 100+random,width,height);
        int nom = 0;
        if (nom < height){
            for (int i = 0; i < TraingleArr.length; i++) {
                if (nom < random-30 || nom > 100+random ){
                    TraingleArr[i] = new Traingle(x, nom);
                }
                nom+=40;
            }
        }
    }
    public void paint(Graphics graphics){
        this.topHalf.paint(graphics);
        this.bottomHalf.paint(graphics);
        for (int i = 0; i < TraingleArr.length; i++) {
            if (TraingleArr[i]!= null){
                TraingleArr[i].paint(graphics);
            }
        }
    }
    public void moveLeft(){
        this.topHalf.moveLeft();
        this.bottomHalf.moveLeft();
        for (int i = 0; i < TraingleArr.length; i++) {
            if (TraingleArr[i]!= null){
                TraingleArr[i].moveLeft();
            }
        }
    }
   public Rectangle getRectangleSize(){
       Rectangle rectangle = new Rectangle(
               this.topHalf.getX()-35,
               this.topHalf.getY(),
               this.topHalf.getWidth(),
               this.topHalf.getHeight());
       return rectangle;
   }
   public Rectangle getRectangles2Size(){
       Rectangle rectangle2 = new Rectangle(
               this.bottomHalf.getX()-35,
               this.bottomHalf.getY(),
               this.bottomHalf.getWidth(),
               this.bottomHalf.getHeight());
       return rectangle2;
   }
}
