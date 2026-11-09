import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My Aquarium");
        PainterAPI p = canvas.getPainter();

        // Draws background sand and water
        drawWater(p, (new Color(135, 206, 235)), -400,-300);
        drawSand(p, (new Color(230, 199, 139)), -400, -300);

        // Draws seagrass and resets pen
        for (int i = 0; i < 20; i++) {
            drawSeaGrass(p, (int) (Math.random() * 60) + 50, Color.GREEN, (int)(Math.random() * 800) -400, -185);
        }

        // Draws seashells and resets pen
        for (int i = 0; i < 6; i++) {
            drawSeashell(p, (int) (Math.random() * 10) + 20, Color.WHITE, (int)(Math.random() * 800) -400, -230);
        }

        // Draws starfish
        for (int i = 0; i < 6; i++) {
            drawStarfish(p, (int) (Math.random() * 30) + 50, (new Color(198, 90, 203)), (int)(Math.random() * 800) -400, -200);
        }

        // Draws blue fish
        for (int i = 0; i < 8; i++) {
            if (Math.random() < 0.5) {
                drawRightFish(p, (int) (Math.random() * 20) + 30, Color.BLUE, (int) (Math.random() * 800) -400,(int) (Math.random() * 350) -150);
            } else {
                drawLeftFish(p, (int) (Math.random() * 20) + 30, Color.BLUE, (int) (Math.random() * 800) -400,(int) (Math.random() * 350) -150);
            }
        }

        // Draws red fish
        for (int i = 0; i < 8; i++) {
            if (Math.random() < 0.5) {
                drawRightFish(p, (int) (Math.random() * 20) + 30, Color.RED, (int) (Math.random() * 800) -400,(int) (Math.random() * 350) -150);
            } else {
                drawLeftFish(p, (int) (Math.random() * 20) + 30, Color.RED, (int) (Math.random() * 800) -400,(int) (Math.random() * 350) -150);
            }
        }
        
        // Draws shark
        for (int i = 0; i < 2; i++) {
            drawShark(p, (int) (Math.random() * 100) + 150, (new Color(128, 128, 128)), (int) (Math.random() * 500) -350,(int) (Math.random() * 350) -150);
        }
    }
    
    /**
     * Draws a single tan rectangle to represent sand at the bottom of the aquarium
     *
     * @param p the painter used for this project
     * @param sandColor the color of the sand
     * @param xPosition the X coordinate of the bottom left
     * corner of the rectangle
     * @param yPosition the Y coordinate of bottom left
     * corner of the rectangle
     */
    public static void drawSand(PainterAPI p, Color sandColor, int xPosition, int yPosition) {

        // Draw the background sand
        p.setPenColor(sandColor);
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.lowerPen();
        p.startFill(sandColor);
        p.forward(800);
        p.turnLeft(90);
        p.forward(120);
        p.turnLeft(90);
        p.forward(800);
        p.turnLeft(90);
        p.forward(120);
        p.finishFill();
        p.turnLeft(90);
        p.liftPen();
    }
    
    /**
     * Draws a single light blue rectangle to represent the water in the aquarium
     *
     * @param p the painter used for this project
     * @param waterColor the color of the water
     * @param xPosition the X coordinate of the bottom left
     * corner of the rectangle
     * @param yPosition the Y coordinate of bottom left
     * corner of the rectangle
     */
    public static void drawWater(PainterAPI p, Color waterColor, int xPosition, int yPosition) {

        // Draw the background water
        p.setPenColor(waterColor);
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.lowerPen();
        p.startFill(waterColor);
        p.forward(800);
        p.turnLeft(90);
        p.forward(600);
        p.turnLeft(90);
        p.forward(800);
        p.turnLeft(90);
        p.forward(600);
        p.finishFill();
        p.turnLeft(90);
        p.liftPen();
    }
    
    /**
     * Draws a single shark starting at a coordinate
     * with a randomized y value and a randomized x value.
     * The shark's head is a circle, the body is a
     * rectangle, and the fins are triangles.
     * The shark also has an eye and a mouth.
     *
     * @param p the painter used for this project
     * @param sharkSize the size of the shark
     * @param sharkColor the color of the shark's body
     * @param xPosition the X coordinate of the top of
     * the shark's tail fin (using Math.random())
     * @param yPosition the Y coordinate of the top of
     * the shark's tail fin (using Math.random())
     */
    public static void drawShark(PainterAPI p, int sharkSize, Color sharkColor, int xPosition, int yPosition) {
   
        // Draws shark body
        p.setPenColor(sharkColor);
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.lowerPen();
        p.startFill(sharkColor);
        p.forward(sharkSize);
        p.turnLeft(90);
        p.forward(sharkSize/4);
        p.turnLeft(90);
        p.forward(sharkSize);
        p.turnLeft(90);
        p.forward(sharkSize/4);
        p.finishFill();
        p.turnLeft(90);
        // Draws shark head
        p.forward(sharkSize);
        p.startFill(sharkColor);
        p.circle(sharkSize/8);
        p.finishFill();
        // Draws shark tail
        p.turnRight(180);
        p.forward(sharkSize);
        p.turnRight(90);
        p.startFill(sharkColor);
        p.forward(sharkSize/4);
        p.turnLeft(40);
        p.forward(sharkSize/5);
        p.turnLeft(150);
        p.forward(sharkSize/4);
        p.turnRight(20);
        p.forward(sharkSize/4);
        p.moveTo(xPosition, yPosition);
        p.finishFill();
        // Draws shark side fin
        p.turnRight(260);
        p.forward(sharkSize/1.5);
        p.turnLeft(90);
        p.forward(sharkSize/7);
        p.setPenColor(Color.BLACK);
        p.turnRight(150);
        p.forward(sharkSize/7);
        p.turnLeft(120);
        p.forward(sharkSize/7);
        // Draws shark top fin
        p.turnLeft(30);
        p.setPenColor(sharkColor);
        p.forward(sharkSize/9);
        p.turnLeft(90);
        p.startFill(sharkColor);
        p.forward(sharkSize/3);
        p.turnRight(120);
        p.forward(sharkSize/7);
        p.turnRight(120);
        p.forward(sharkSize/7);
        p.finishFill();
        // Draws shark eye
        p.turnLeft(60);
        p.forward(sharkSize/2.5);
        p.turnRight(90);
        p.forward(sharkSize/12);
        p.turnLeft(90);
        p.setPenColor(Color.BLACK);
        p.startFill(Color.BLACK);
        p.circle(sharkSize/40);
        p.finishFill();
        // Draws shark mouth
        p.liftPen();
        p.turnRight(90);
        p.forward(sharkSize/12);
        p.turnLeft(90);
        p.lowerPen();
        p.forward(sharkSize/10); 
    }

    /**
     * Draws a single right facing fish at a random position.
     * The fish has a circular body, a triangular tail, and a small eye. 
     * Multiple fish will be drawn throughout the aquarium.
     *
     * @param p the painter used for this project
     * @param fishSize the size of the fish
     * @param fishColor the color of the fish's body
     * @param xPosition the X coordinate of the fish (using Math.random())
     * @param yPosition the Y coordinate of the fish (using Math.random())
     */
    public static void drawRightFish(PainterAPI p, int fishSize, Color fishColor, int xPosition, int yPosition) {

        // Draws tail of fish
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.lowerPen();
        p.setPenColor(fishColor);
        p.startFill(fishColor);
        p.turnLeft(30);
        p.forward(fishSize);
        p.turnLeft(120);
        p.forward(fishSize);
        p.turnLeft(120);
        p.forward(fishSize);
        p.finishFill();
        // Draws head of fish
        p.turnLeft(120);
        p.forward(fishSize);
        p.turnLeft(150);
        p.forward(fishSize/1.75);
        p.turnLeft(90);
        p.startFill(fishColor);
        p.circle(fishSize/1.75);
        p.finishFill();
        // Draws fin of fish
        p.turnLeft(90);
        p.forward(fishSize/1.5);
        p.turnRight(120);
        p.setPenColor(Color.BLACK);
        p.forward(fishSize/3);
        p.turnRight(120);
        p.forward(fishSize/3);
        p.turnRight(120);
        p.liftPen();
        // Draws mouth of fish
        p.forward(fishSize/2);
        p.lowerPen();
        p.forward(fishSize/3);
        p.liftPen();
        // Draws eye of fish
        p.turnRight(180);
        p.forward(fishSize/3);
        p.turnRight(90);
        p.forward(fishSize/4);
        p.turnRight(90);
        p.lowerPen();
        p.startFill(Color.BLACK);
        p.circle(fishSize/20);
        p.finishFill();
    }

    /**
     * Draws a single left facing fish at a random position.
     * The fish has a circular body, a triangular tail, and a small eye. 
     * Multiple fish will be drawn throughout the aquarium.
     *
     * @param p the painter used for this project
     * @param fishSize the size of the fish
     * @param fishColor the color of the fish's body
     * @param xPosition the X coordinate of the fish (using Math.random())
     * @param yPosition the Y coordinate of the fish (using Math.random())
     */
    public static void drawLeftFish(PainterAPI p, int fishSize, Color fishColor, int xPosition, int yPosition) {

        // Draws tail of fish
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.lowerPen();
        p.turnRight(180);
        p.setPenColor(fishColor);
        p.startFill(fishColor);
        p.turnRight(30);
        p.forward(fishSize);
        p.turnRight(120);
        p.forward(fishSize);
        p.turnRight(120);
        p.forward(fishSize);
        p.finishFill();
        // Draws head of fish
        p.turnRight(120);
        p.forward(fishSize);
        p.turnRight(150);
        p.forward(fishSize/1.75);
        p.turnLeft(90);
        p.startFill(fishColor);
        p.circle(fishSize/1.75);
        p.finishFill();
        // Draws fin of fish
        p.turnLeft(90);
        p.forward(fishSize/1.5);
        p.turnLeft(120);
        p.setPenColor(Color.BLACK);
        p.forward(fishSize/3);
        p.turnLeft(120);
        p.forward(fishSize/3);
        p.turnLeft(120);
        p.liftPen();
        // Draws mouth of fish
        p.forward(fishSize/2);
        p.lowerPen();
        p.forward(fishSize/3);
        p.liftPen();
        // Draws eye of fish
        p.turnLeft(180);
        p.forward(fishSize/3);
        p.turnLeft(90);
        p.forward(fishSize/4);
        p.turnLeft(90);
        p.lowerPen();
        p.startFill(Color.BLACK);
        p.circle(fishSize/20);
        p.finishFill();
        p.turnRight(180);
    }


    /**
     * Draws a single green blade of sea grass growing upward from the ocean floor.
     * Multiple blades of grass will be placed along the ocean floor.
     *
     * @param p the painter used for this project
     * @param grassHeight the height of the grass
     * @param grassColor the color of the grass
     * @param xPosition the X coordinate of the grass (using Math.random())
     * @param yPosition the Y coordinate of the bottom of the grass
     */
    public static void drawSeaGrass(PainterAPI p, int grassHeight, Color grassColor, int xPosition, int yPosition) {

        // Draws a blade of grass, which is an elongated triangle
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.setPenColor(grassColor);
        p.lowerPen();
        p.startFill(grassColor);
        p.turnLeft(85);
        p.forward(grassHeight);
        p.turnRight(170);
        p.forward(grassHeight);
        p.turnRight(95);
        p.forward(grassHeight/6);
        p.finishFill();
        p.turnLeft(180);
        p.liftPen();
    }


    /**
     * Draws a single pink starfish resting on the ocean floor.
     * The starfish has multiple pointed arms
     * extending outward.
     *
     * @param p the painter used for this project
     * @param starfishSize the size of the starfish
     * @param starfishColor the color of the starfish
     * @param xPosition the X coordinate of the starfish (using Math.random())
     * @param yPosition the Y coordinate of the starfish
     */
    public static void drawStarfish(PainterAPI p, int starfishSize, Color starfishColor, int xPosition, int yPosition) {

        p.moveTo(xPosition, yPosition);
        p.setPenColor(starfishColor);
        p.startFill(starfishColor);
        // For loop draws a star using 5 connected lines
        for (int i = 0; i < 5; i++) {
            p.forward(starfishSize);
            p.turnRight(144); 
        }
        p.finishFill();
    }


    /**
     * Draws a single small white seashell resting on the ocean floor.
     * The seashell has a rounded top, a flat bottom,
     * and several lines extending upward from its base.
     *
     * @param p the painter used for this project
     * @param shellSize the size of the seashell
     * @param shellColor the color of the seashell
     * @param xPosition the X coordinate of the seashell (using Math.random())
     * @param yPosition the Y coordinate of the seashell
     */
    public static void drawSeashell(PainterAPI p, int shellSize, Color shellColor, int xPosition, int yPosition) {

        // Draws shell body
        p.liftPen();
        p.moveTo(xPosition, yPosition);
        p.setPenColor(shellColor);
        p.turnRight(180);
        p.lowerPen();
        p.startFill(shellColor);
        p.circle(shellSize);
        p.finishFill();
        p.turnLeft(90);
        p.forward(shellSize*1.5);
        // Draws shell grooves
        p.setPenColor(Color.BLACK);
        p.turnRight(180);
        p.forward(shellSize*1.5);
        p.turnRight(180);
        p.forward(shellSize*1.5);
        p.turnRight(90);
        p.liftPen();
        p.forward(shellSize/6);
        p.turnRight(60);
        p.lowerPen();
        p.forward(shellSize * 1.25);
        p.turnRight(180);
        p.forward(shellSize * 1.25);
        p.turnRight(300);
        p.liftPen();
        p.forward(shellSize/3);
        p.turnLeft(60);
        p.lowerPen();
        p.forward(shellSize * 1.25);
        p.turnLeft(180);
        p.forward(shellSize * 1.25);
        p.turnLeft(300);
        p.liftPen();
        p.forward(shellSize/6);
        p.turnLeft(90);
        // Draws shell tail
        p.setPenColor(shellColor);
        p.turnRight(30);
        p.startFill(shellColor);
        p.forward(shellSize);
        p.turnLeft(120);
        p.forward(shellSize);
        p.turnLeft(120);
        p.forward(shellSize);
        p.finishFill();
        p.turnRight(120);
    }

}
