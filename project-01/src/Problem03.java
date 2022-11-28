import processing.core.PApplet;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);

        fill(0, 40);
        rect(0, 0, width, height);
        fill(0, 0, 255);
        circle(mouseX, mouseY, 30);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
