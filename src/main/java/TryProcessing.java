import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int NUMBEROFBALLS = 4;
    int[] xPositions = new int[NUMBEROFBALLS];
    int[] heights = new int[NUMBEROFBALLS];

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initialiseHeights();
    }

    private void initialiseHeights() {
        for (int i = 1; i <= NUMBEROFBALLS; i++) {
            heights[i - 1] = i * HEIGHT / 5;
        }
    }

    @Override
    public void draw() {
        moveBalls();
        incrementXPositions();
    }

    public void incrementXPositions() {
        for (int i = 1; i <= NUMBEROFBALLS; i++) {
            xPositions[i - 1] += i;
        }
    }

    private void moveBalls() {
        for (int i = 0; i < NUMBEROFBALLS; i++) {
            ellipse(xPositions[i], heights[i], DIAMETER, DIAMETER);
        }
    }
}
