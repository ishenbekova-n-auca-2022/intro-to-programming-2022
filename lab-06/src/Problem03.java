import processing.core.PApplet;

public class Problem03 extends PApplet {

    public void star(int rays, float x, float y, float innerR, float outerR, int color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++) {
            float radius;

            radius = i % 2 == 0 ? outerR : innerR;
            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;
            line(x, y, endX, endY);

            radius = i % 2 != 0 ? outerR : innerR;
            float endX2 = x + cos(angle + angleDelta) * radius;
            float endY2 = y + sin(angle) * radius;
            line(x, y, endX, endY);

            angle += angleDelta;

        }
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        float cx = width * 0.5f;
        float cy = height * 0.5f;
        star(8, width * 0.5f, height * 0.5f, 100.0f, 20.0f, 0xFFFF0000, 0.0f);
    }


    public void draw() {
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}