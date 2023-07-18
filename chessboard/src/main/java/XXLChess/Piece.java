package XXLChess;

import processing.core.PImage;

public abstract class Piece
{
    private PImage image;
    private int value;
    private boolean isWhite = false;


    public Piece(PImage image, int value, boolean isWhite) {
        this.image = image;
        this.value = value;
        this.isWhite = isWhite;
    }

    public PImage getImage() {
        return image;
    }

    public void setImage(PImage image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract int[][] possibleMoves(int x, int y, Spot[][] spots);




}
