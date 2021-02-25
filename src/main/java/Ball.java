public class Ball {

    int x;
    int y;
    int diameter;
    int speedX;
    //int speedY;

    public Ball(int x, int y,int diameter, int speedX) {        //initializing ball properties
        this.x = x;
        this.y = y;
        this.diameter=diameter;
        this.speedX = speedX;
    }

   /* public  void display()
    {
    ellipse(x,y,diameter,diameter);
    }
    */

    public  void move()
    {
        x=x+speedX;
    }
}

