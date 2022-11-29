import processing.core.PApplet;

public class Problem03 extends PApplet {

    float rectX;
    float rectY;
    float rectWidth;
    float rectHeight;
    float circleX;
    float circleY;
    float circleRadius;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        rectWidth = width / 5f;
        rectHeight = height / 5f;
        rectX = width / 2f - rectWidth / 2f;
        rectY = height / 2f - rectHeight / 2f;

        circleX = width / 6f;
        circleY = height / 2f;
        circleRadius = min(width, height) / 7f;

        stroke(255, 255, 0);
        rect(30, 20, 55, 55);
    }

    public void draw() {
        background(0, 0, 0);

        fill(0, 40);
        rect(0, 0, width, height);
        fill(0,100, 100);
        rect(rectX, rectY, rectWidth, rectHeight);
        fill(0, 0, 255);
        circle(mouseX, mouseY, 50);

        fill(255, 0, 0);
        circle(circleX, circleY, 2 * circleRadius);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}
