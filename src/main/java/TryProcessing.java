import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int circle1Rate = 0;
    int circle2Rate = 0;
    int circle3Rate = 0;
    int circle4Rate = 0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }

    private void drawCircle1() {
        ellipse(circle1Rate, HEIGHT/5, DIAMETER, DIAMETER);
        circle1Rate++;
    }

    private void drawCircle2() {
        ellipse(circle2Rate, 2*HEIGHT/5, DIAMETER, DIAMETER);
        circle2Rate+=2;
    }

    private void drawCircle3() {
        ellipse(circle3Rate, 3 * HEIGHT/5, DIAMETER, DIAMETER);
        circle3Rate+=3;
    }

    private void drawCircle4() {
        ellipse(circle4Rate, 4*HEIGHT/5, DIAMETER, DIAMETER);
        circle4Rate+=4;    }


}
