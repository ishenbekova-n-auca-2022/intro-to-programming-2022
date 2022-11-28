import processing.core.PApplet;

public class Problem04 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 100;

    float minRadius;
    float maxRadius;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        minRadius = min(width, height) / 60f;
        maxRadius = min(width, height) / 20f;
        frameRate(2);
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < NUMBER_OF_CIRCLES; i++) {
            float x = random(0, width);
            float y = random(0, height);
            float r = random(minRadius, maxRadius);

            float redComp = random(10,255);
            float greenComp = random(10,255);
            float blueComp = random(10,255);

            fill(redComp, greenComp, blueComp);

            circle(x, y, 2 * r);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
