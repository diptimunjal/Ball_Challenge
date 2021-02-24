import processing.core.PApplet;

public class Roll_Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int b1_width=0,b2_width=0,b3_width=0,b4_width=0;

    public static void main(String args[])
    {
        PApplet.main("Roll_Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
        for (int ball_number = 1; ball_number<=4 ; ball_number++)
        {
            int ball_height = ball_number * HEIGHT / 5;
            ellipse(0, ball_height, DIAMETER, DIAMETER);
        }

    }

    @Override
    public void draw() {
        Move_Balls();
    }

    private void Move_Balls() {
        ellipse(b1_width, 1 * HEIGHT / 5, DIAMETER, DIAMETER);
        b1_width++;

        ellipse(b2_width, 2* HEIGHT / 5, DIAMETER, DIAMETER);
        b2_width=b2_width+2;

        ellipse(b3_width, 3* HEIGHT / 5, DIAMETER, DIAMETER);
        b3_width=b3_width+3;

        ellipse(b4_width, 4* HEIGHT / 5, DIAMETER, DIAMETER);
        b4_width=b4_width+4;
    }
}
