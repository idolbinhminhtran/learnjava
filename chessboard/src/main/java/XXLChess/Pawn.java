package XXLChess;

import processing.core.PImage;

public class Pawn extends Piece
{
    public Pawn(PImage image, int value, boolean isWhite) {
        super(image, value, isWhite);
    }

    @Override
    public int[][] possibleMoves(int x, int y, Spot[][] spots)
    {
        int[][] returnMoves = new int[][]{{0,1}, {0,2}};

        if (x == 12)
        {
            return new int[][]{{x, y - 1}, {x, y - 2}};
        }
        else
        {
            return new int[][]{{x, y-1 }};
        }
    }
}
