package XXLChess;

public class Board
{
    private Cell[][] cells;

    private Spot[][] spots;

    private Color white = new Color(240, 217, 181);

    private Color brown = new Color(181, 136, 99);

    private Color chooseWhite = new Color(196, 224, 232);
    private Color chooseBrown = new Color(170, 210, 221);

    public Board(int BOARD_WIDTH)
    {
        this.cells = new Cell[BOARD_WIDTH][BOARD_WIDTH];
        this.drawCells(BOARD_WIDTH);
        this.spots = new Spot[BOARD_WIDTH][BOARD_WIDTH];

    }

    public Cell getCell(int x, int y)
    {
        return this.cells[x][y];

    }

    public Spot getSpot(int x, int y)
    {
        return this.spots[x][y];
    }
//    public void resetSpot(int BOARD_WIDTH)
//    {
//        for(int i = 0; i < BOARD_WIDTH; i++)
//            for(int j = 0; j < BOARD_WIDTH; j++)
//            {
//                spots[i][j] = new Spot(i, j, null);
//            }
//    }



    public void setSpots(int x, int y, Piece piece)
    {
        spots[x][y] = new Spot(x, y, piece);
    }




    public void setCellClick(int x, int y)
    {

        if ((x + y) % 2 == 0)
        {
            cells[x][y] = new Cell(x, y,chooseWhite);
        }

        else
        {
            cells[x][y] = new Cell(x, y, chooseBrown);
        }
    }

    public void setSpotClick(int x, int y)
    {
        if(spots[x][y] != null)
        {
            int[][] moves = spots[x][y].getPiece().possibleMoves(x, y, spots);
            for(int i = 0; i < moves.length; i++)
            {
                    setCellClick(moves[i][0], moves[i][1]);
            }
        }

    }





    public void drawCells(int BOARD_WIDTH)
    {
        for(int i = 0; i < BOARD_WIDTH; i++)
        {
            for(int j = 0; j < BOARD_WIDTH; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    cells[i][j] = new Cell(i, j, white);
                }
                else
                {
                    cells[i][j] = new Cell(i, j, brown);
                }
            }
        }
    }



}
