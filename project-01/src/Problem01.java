import processing.core.PApplet;

public class Problem01 extends PApplet {
    int x = 0, y = 0;
    int dx = 15, dy = 15;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        noStroke();

        fill(0, 0, 0, 50);

        rect(0, 0, width, height);

        fill(57, 130, 238);
        circle(width / 2f + x, height / 2f + y, 60);

        fill(198, 45, 255);
        circle(width / 4f + x, height / 4f + y, 60);

        fill(135, 105, 63);
        circle(width / 4f + x, height / 2f + height / 4f + y, 60);

        fill(72, 255, 90);
        circle(width / 4f + width / 2f + x, height / 4f + y, 60);

        fill(146, 200, 20);
        circle(width / 4f + width / 2f + x, height / 4f + height / 2f + y, 60);

        if (x >= width / 4 - 30 || x <= -width / 4 + 30) {
            dx = -dx;
        }
        if (y >= height / 4 - 30 || y <= -height / 4 + 30) {
            dy = -dy;
        }

        x += dx;
        y += dy;
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
}