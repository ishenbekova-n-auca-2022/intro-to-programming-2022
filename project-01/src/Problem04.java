import processing.core.PApplet;

public class Problem04 extends PApplet {
    static final int ROWS = 15;
    static final int COLUMNS = 12;
    static final int CELL_BORDER_COLOR = 0xFF0000FF;
    static final int CELL_BORDER_WEIGHT = 2;
    static final float CELL_PADDING = (float) 0.2;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        noStroke();
        fill(0, 0, 0, 4);
        rect(0, 0, width, height);

        stroke(CELL_BORDER_WEIGHT);
        stroke(CELL_BORDER_COLOR);
        noFill();

        float cellSize = Math.min(width / ROWS, height / COLUMNS) * (1 - CELL_PADDING);


        float gridWidth = (ROWS * cellSize);
        float cx = (width - gridWidth) * 0.5f;

        float gridHeight = (COLUMNS * cellSize);
        float cy = (height - gridHeight) * 0.5f;

        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                float x = cx + j * cellSize;
                float y = cy + i * cellSize;
                square(x, y, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
