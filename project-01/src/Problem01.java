import processing.core.*;

public class Problem01 extends PApplet {
    float x;
    float y;
    float dx;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        y = height / 2f;
        dx = random(10, 15);
    }

    public void draw() {
        background(0, 0, 0);
        fill(0, 0, 255);
        circle(x, y, 50);
        x += dx;
        if (x >= width) {
            x = width - 1;
            dx = -dx;
        }
        if (x < 0) {
            x = 0;
            dx = -dx;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}