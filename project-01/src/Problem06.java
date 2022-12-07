import processing.core.PApplet;

public class Problem06 extends PApplet {
    static final float SUM_DEAL = 200.0f;
    static final int SUM_COLOR = 0xFF000000;

    public void celestialBody(float x, float y, float diam, int color){

    }

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0, 0, 0);

        float sunX = width * 0.5f;
        float sunY = height * 0.5f;
        noStroke();

        circle(sunX, sunY, SUM_DEAL );
    }

}
