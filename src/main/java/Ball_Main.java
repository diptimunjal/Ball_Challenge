import processing.core.PApplet;

public class Ball_Main extends PApplet {

    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 480;
    public int TOTAL_BALLS=4;
    public int DIAMETER=10;
    Ball ball[];

    public static void main(String args[])
    {
        PApplet.main("Ball_Main",args);
    }

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {
        ball=new Ball[TOTAL_BALLS];
        initializeBalls();      //initializing balls
    }

    @Override
    public void draw() {
        displayBalls();
        moveBalls();            //update position
    }


    private void initializeBalls() {
        for (int ball_number = 0; ball_number <TOTAL_BALLS ; ball_number++)
        {
            ball[ball_number]=new Ball(0, getOrientationY(ball_number+1),DIAMETER,ball_number+1);
        }
    }

    private void displayBalls() {

        for (int ball_number = 0; ball_number <TOTAL_BALLS; ball_number++)
        {
            //ball[ball_number].dispaly();
            ellipse(ball[ball_number].x,ball[ball_number].y,ball[ball_number].diameter,ball[ball_number].diameter);
        }

        /*ellipse(ball1.x,ball1.y,ball1.diameter,ball1.diameter);
        ellipse(ball2.x,ball2.y,ball2.diameter,ball2.diameter);
       */
    }

    public void moveBalls()
    {
        for (int ball_number = 0; ball_number < TOTAL_BALLS; ball_number++)
        {
          ball[ball_number].move();
        }
    }

    private int getOrientationY(int ball_number) {
        return ball_number * SCREEN_HEIGHT / 5;
    }

}
