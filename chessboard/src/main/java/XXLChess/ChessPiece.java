package XXLChess;

import javafx.geometry.Pos;
import processing.core.PImage;

public class ChessPiece {
    private int colour;
    private float value;
    private Position position;
    private PImage image;
    private int size;
    private String name;


    public ChessPiece(String name, int colour, float value, Position position, PImage image, int size) {
        this.colour = colour;
        this.value = value;
        this.position = position;
        this.image = image;
        this.size = size;
        this.name = name;
    }

    public ChessPiece()
    {

    }

    public int[] drawChess()
    {
        int[] allPosition = {position.getX() * size, position.getY() * size, size, size};
        return allPosition;
    }




    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public PImage getImage() {
        return image;
    }

    public void setImage(PImage image) {
        this.image = image;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
