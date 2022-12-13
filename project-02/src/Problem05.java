import processing.core.PApplet;

public class Problem05 extends PApplet {

    public void settings(){
        fullScreen();
    }

    public void setup(){

    }

    public void draw(){
        background(0);
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        PApplet.main("Problem05");
    }
}