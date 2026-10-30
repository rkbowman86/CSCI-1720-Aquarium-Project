import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My Aquarium");
        PainterAPI painter = canvas.getPainter();

        painter.setSpeed(10);
        painter.forward(100);
        painter.turnRight(90);
        painter.circle(20);

        // Methods for the final aquarium
        drawFish();
        drawPlants();
        drawBubbles();
    }

    /** Draws a fish in the aquarium. */
    public static void drawFish() {
        // Fish will be drawn here later.
    }

    /** Draws plants in the aquarium. */
    public static void drawPlants() {
        // Plants will be drawn here later.
    }

    /** Draws bubbles in the aquarium. */
    public static void drawBubbles() {
        // Bubbles will be drawn here later.
    }
}