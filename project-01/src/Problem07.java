import processing.core.PApplet;

public class Problem07 extends PApplet {
    static final float SUN_DIAM = 200.0F;
//    static final int SUN_COLOR =
    public void settings(){
        fullScreen();
    }

    public void setup(){

    }

    public void draw(){
        background(0,0,0);

        float sunX = width * 0.5f;
        float sunY = height * 0.5f;
        noStroke();
        circle(sunX, sunY, SUN_DIAM);
    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }
}
