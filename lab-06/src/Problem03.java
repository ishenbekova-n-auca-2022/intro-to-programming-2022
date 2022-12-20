import processing.core.PApplet;

public class Problem03 extends PApplet {

    public void star(int rays, float x, float y, float outerR, float innerR, int color, float angle) {
        float angleDelta = TWO_PI / rays;
        stroke(color);
        for (int i = 0; i < rays; i++) {
            float radius;

            radius = i % 2 == 0 ? outerR : innerR;
            float endX1 = x + cos(angle) * radius;
            float endY1 = y + sin(angle) * radius;
            line(x, y, endX1, endY1);

            radius = i % 2 != 0 ? outerR : innerR;
            float endX2 = x + cos(angle + angleDelta) * radius;
            float endY2 = y + sin(angle + angleDelta) * radius;
            line(endX1, endY1, endX2, endY2);

            angle += angleDelta;


        }
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        background(0);
        strokeWeight(2);


        float cx = width * 0.5f;
        float cy = height * 0.5f;
        star(8, cx, cy, 100.0f, 30.0f, 0xFFFF0000, 0.0f);

        float shift1 = 130;

        star(8, cx - shift1, cy - shift1, 50.0f, 15.0f, 0xFFFFFF00, 0.0f);
        star(8, cx + shift1, cy + shift1, 50.0f, 15.0f, 0xFFFFFF00, 0.0f);
        star(8, cx + shift1, cy - shift1, 50.0f, 15.0f, 0xFFFFFF00, 0.0f);
        star(8, cx - shift1, cy + shift1, 50.0f, 15.0f, 0xFFFFFF00, 0.0f);

    }

    public void draw() {
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}