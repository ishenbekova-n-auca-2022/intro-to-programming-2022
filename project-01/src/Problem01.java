import processing.core.PApplet;

public class Problem01 extends PApplet {
    int x = 0, y = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        noStroke();

        fill(0, 0, 0, 50);

        rect(0, 0, width, height);

        fill(0, 130, 238);
        circle(width / 2f + x, height / 2f + y, 60);

        fill(0, 0, 255);
        circle(width / 4f + x, height / 4f + y, 60);

        fill(135, 105, 63);
        circle(width / 4f + x, height / 2f + height / 4f + y, 60);

        fill(0, 255, 0);
        circle(width / 4f + width / 2f + x, height / 4f + y, 60);

        fill(255, 0, 0);
        circle(width / 4f + width / 2f + x, height / 4f + height / 2f + y, 60);
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}