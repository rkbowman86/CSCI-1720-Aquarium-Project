import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {

    /**
     * Draws a single shark starting at a coordinate
     * with a designated y value and a randomized x value.
     * The shark's head is a circle, the body is a
     * quadrilateral, and the fins are triangles.
     * The shark also has an eye and a mouth.
     *
     * @param sharkSize the size of the shark
     * @param bodyColor the color of the shark's body
     * @param headColor the color of the shark's head
     * @param finColor the color of the shark's fins
     * @param xPosition the X coordinate of the top of
     * the shark's tail fin (using Math.random())
     * @param yPosition the Y coordinate of the top of
     * the shark's tail fin
     */
    public void drawShark(int sharkSize, Color bodyColor, Color headColor, Color finColor, int xPosition, int yPosition) {

        // Draw the shark's body using a quadrilateral
        // Draw the shark's head using a circle
        // Draw the shark's fins and tail using triangles
        // Draw the shark's eye
        // Draw the shark's mouth
        // Position the shark using xPosition and yPosition

    }


    /**
     * Draws a single blue fish at a specified position.
     * The fish has a circular body, a triangular tail, and a small eye. 
     * Multiple fish will be drawn throughout the aquarium.
     *
     * @param fishSize the size of the fish
     * @param bodyColor the color of the fish's body
     * @param tailColor the color of the fish's tail
     * @param xPosition the X coordinate of the fish
     * @param yPosition the Y coordinate of the fish
     */
    public void drawFish(int fishSize, Color bodyColor, Color tailColor, int xPosition, int yPosition) {

        // Draw the fish's circular body
        // Draw the triangular tail
        // Draw the fish's eye
        // Position the fish using xPosition and yPosition

    }


    /**
     * Draws a single green blade of sea grass growing upward from the ocean floor.
     * Multiple blades of grass will be placed along the ocean floor.
     *
     * @param grassHeight the height of the grass
     * @param grassColor the color of the grass
     * @param xPosition the X coordinate of the grass
     * @param yPosition the Y coordinate of the bottom of the grass
     */
    public void drawSeaGrass(int grassHeight, Color grassColor, int xPosition, int yPosition) {

        // Draw a long triangular blade of grass
        // Position the base of the grass on the sea floor
        // Use grassHeight to determine its height

    }


    /**
     * Draws a single pink starfish resting on the ocean floor.
     * The starfish has multiple pointed arms
     * extending outward from its center.
     *
     * @param starfishSize the size of the starfish
     * @param starfishColor the color of the starfish
     * @param xPosition the X coordinate of the starfish
     * @param yPosition the Y coordinate of the starfish
     */
    public void drawStarfish(int starfishSize, Color starfishColor, int xPosition, int yPosition) {

        // Draw the starfish using connected points
        // Create the pointed arms of the starfish
        // Fill the starfish with starfishColor
        // Position the starfish on the sand

    }


    /**
     * Draws a single small white seashell resting on the ocean floor.
     * The seashell has a rounded top, a flat bottom,
     * and several lines extending upward from its base.
     *
     * @param shellSize the size of the seashell
     * @param shellColor the color of the seashell
     * @param xPosition the X coordinate of the seashell
     * @param yPosition the Y coordinate of the seashell
     */
    public void drawSeashell(int shellSize, Color shellColor, int xPosition, int yPosition) {

        // Draw the circular shape of the seashell
        // Draw the flat bottom of the shell with a triangle
        // Draw lines extending from the base outward towards the edge of the circle
        // Fill the seashell with shellColor
        // Position the seashell on the sand

    }

}
