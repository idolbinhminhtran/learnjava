package XXLChess;

//import org.reflections.Reflections;
//import org.reflections.scanners.Scanners;
import processing.core.PApplet;
import processing.core.PImage;
import processing.data.JSONObject;
import processing.data.JSONArray;
import processing.core.PFont;
import processing.event.MouseEvent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.awt.Font;
import java.io.*;
import java.util.*;

public class App extends PApplet {

    public static final int SPRITESIZE = 480;
    public static final int CELLSIZE = 48;
    public static final int SIDEBAR = 120;
    public static final int BOARD_WIDTH = 14;

    public static int WIDTH = CELLSIZE*BOARD_WIDTH+SIDEBAR;
    public static int HEIGHT = BOARD_WIDTH*CELLSIZE;

    public static final int FPS = 60;

    public static ArrayList<ChessPiece> chessPieces = new ArrayList<ChessPiece>();

    public Board board;

    public String configPath;

    public App() {
        this.configPath = "config.json";
    }

    /**
     * Initialise the setting of the window size.
    */
    public void settings()
    {
        size(WIDTH, HEIGHT);
        board = new Board(BOARD_WIDTH);





    }

    /**
     * Load all resources such as images. Initialise the elements such as the player, enemies and map elements.
    */
    public void setup() {
        frameRate(FPS);

        // Load images during setup

        // PImage spr = loadImage("src/main/resources/XXLChess/"+...);

		// load config

        PImage wPawnIMG = loadImage("src/main/resources/XXLChess/" + "w-pawn.png");
        board.setSpots(6, 7, new Pawn(wPawnIMG, 1, true));



//        JSONObject conf = loadJSONObject(new File(this.configPath));
//        PImage wPawnIMG = loadImage("src/main/resources/XXLChess/" + "w-pawn.png");
//        for(int i = 0; i < 14; i++)
//        {
//            ChessPiece piece = new ChessPiece("WhitePawn", 0, 1, new Position(i, 12), wPawnIMG, CELLSIZE);
//            chessPieces.add(piece);
//        }
//        PImage wRookIMG = loadImage("src/main/resources/XXLChess/" + "w-rook.png");
//        ChessPiece rookPiece1 = new ChessPiece("WhiteRook", 0, 5.25F, new Position(0, 13), wRookIMG, CELLSIZE);
//        chessPieces.add(rookPiece1);
//        ChessPiece rookPiece2 = new ChessPiece("WhiteRook", 0, 5.25F, new Position(13, 13), wRookIMG, CELLSIZE);
//        chessPieces.add(rookPiece2);
//        PImage wKnightIMG = loadImage("src/main/resources/XXLChess/" + "w-knight.png");
//        ChessPiece knightPiece1 = new ChessPiece("WhiteKnight", 0, 2, new Position(1, 13), wKnightIMG, CELLSIZE);
//        chessPieces.add(knightPiece1);
//        ChessPiece knightPiece2 = new ChessPiece("WhiteKnight", 0, 2, new Position(12, 13), wKnightIMG, CELLSIZE);
//        chessPieces.add(knightPiece2);
//        PImage wBishopIMG = loadImage("src/main/resources/XXLChess/" + "w-bishop.png");
//        ChessPiece bishopPiece1 = new ChessPiece("WhiteBishop", 0, 2, new Position(11, 13), wBishopIMG, CELLSIZE);
//        chessPieces.add(bishopPiece1);
//        ChessPiece bishopPiece2 = new ChessPiece("WhiteBishop", 0, 2, new Position(2, 13), wBishopIMG, CELLSIZE);
//        chessPieces.add(bishopPiece2);
//        PImage wArchbishop = loadImage("src/main/resources/XXLChess/" + "w-archbishop.png");
//        ChessPiece archbishop1 = new ChessPiece("Archbishop", 0, 2, new Position(3, 13), wArchbishop, CELLSIZE);
//        chessPieces.add(archbishop1);
//        ChessPiece archbishop2 = new ChessPiece("Archbishop", 0, 2, new Position(10, 13), wArchbishop, CELLSIZE);
//        chessPieces.add(archbishop2);
//        PImage wCamel = loadImage("src/main/resources/XXLChess/" + "w-camel.png");
//        ChessPiece camel1 = new ChessPiece("Camel", 0, 2, new Position(4, 13), wCamel, CELLSIZE);
//        chessPieces.add(camel1);
//        ChessPiece camel2 = new ChessPiece("Camel", 0, 2, new Position(9, 13), wCamel, CELLSIZE);
//        chessPieces.add(camel2);
//        PImage wAmazon = loadImage("src/main/resources/XXLChess/" + "w-amazon.png");
//        ChessPiece amazon1 = new ChessPiece("Amazon", 0, 12, new Position(6, 13), wAmazon, CELLSIZE);
//        chessPieces.add(amazon1);
//        PImage wGuard = loadImage("src/main/resources/XXLChess/" + "w-knight-king.png");
//        ChessPiece guard1 = new ChessPiece("Guard", 0, 5, new Position(5, 13), wGuard, CELLSIZE);
//        chessPieces.add(guard1);
//        ChessPiece guard2 = new ChessPiece("Guard", 0, 5, new Position(8, 13), wGuard, CELLSIZE);
//        chessPieces.add(guard2);
//        PImage wKing = loadImage("src/main/resources/XXLChess/" + "w-king.png");
//        ChessPiece king = new ChessPiece("King", 0, 1000000, new Position(7, 13), wKing, CELLSIZE);
//        chessPieces.add(king);
//
//        PImage bPawnIMG = loadImage("src/main/resources/XXLChess/" + "b-pawn.png");
//        for(int i = 0; i < 14; i++)
//        {
//            ChessPiece piece = new ChessPiece("BlackPawn", 1, 1, new Position(i, 1), bPawnIMG, CELLSIZE);
//            chessPieces.add(piece);
//        }
//        PImage bRookIMG = loadImage("src/main/resources/XXLChess/" + "b-rook.png");
//        ChessPiece brookPiece1 = new ChessPiece("BlackRook", 0, 5.25F, new Position(0, 0), bRookIMG, CELLSIZE);
//        chessPieces.add(brookPiece1);
//        ChessPiece brookPiece2 = new ChessPiece("BlackRook", 0, 5.25F, new Position(13, 0), bRookIMG, CELLSIZE);
//        chessPieces.add(brookPiece2);
//        PImage bKnightIMG = loadImage("src/main/resources/XXLChess/" + "b-knight.png");
//        ChessPiece bknightPiece1 = new ChessPiece("BlackKnight", 0, 2, new Position(1, 0), bKnightIMG, CELLSIZE);
//        chessPieces.add(bknightPiece1);
//        ChessPiece bknightPiece2 = new ChessPiece("BlackKnight", 0, 2, new Position(12, 0), bKnightIMG, CELLSIZE);
//        chessPieces.add(bknightPiece2);
//        PImage bBishopIMG = loadImage("src/main/resources/XXLChess/" + "b-bishop.png");
//        ChessPiece bbishopPiece1 = new ChessPiece("BlackBishop", 0, 2, new Position(11, 0), bBishopIMG, CELLSIZE);
//        chessPieces.add(bbishopPiece1);
//        ChessPiece bbishopPiece2 = new ChessPiece("BlackBishop", 0, 2, new Position(2, 0), bBishopIMG, CELLSIZE);
//        chessPieces.add(bbishopPiece2);
//        PImage bArchbishop = loadImage("src/main/resources/XXLChess/" + "b-archbishop.png");
//        ChessPiece barchbishop1 = new ChessPiece("Archbishop", 0, 2, new Position(3, 0), bArchbishop, CELLSIZE);
//        chessPieces.add(barchbishop1);
//        ChessPiece barchbishop2 = new ChessPiece("Archbishop", 0, 2, new Position(10, 0), bArchbishop, CELLSIZE);
//        chessPieces.add(barchbishop2);
//        PImage bCamel = loadImage("src/main/resources/XXLChess/" + "b-camel.png");
//        ChessPiece bcamel1 = new ChessPiece("Camel", 0, 2, new Position(4, 0), bCamel, CELLSIZE);
//        chessPieces.add(bcamel1);
//        ChessPiece bcamel2 = new ChessPiece("Camel", 0, 2, new Position(9, 0), bCamel, CELLSIZE);
//        chessPieces.add(bcamel2);
//        PImage bAmazon = loadImage("src/main/resources/XXLChess/" + "b-amazon.png");
//        ChessPiece bamazon1 = new ChessPiece("Amazon", 0, 12, new Position(6, 0), bAmazon, CELLSIZE);
//        chessPieces.add(bamazon1);
//        PImage bGuard = loadImage("src/main/resources/XXLChess/" + "b-knight-king.png");
//        ChessPiece bguard1 = new ChessPiece("Guard", 0, 5, new Position(5, 0), bGuard, CELLSIZE);
//        chessPieces.add(bguard1);
//        ChessPiece bguard2 = new ChessPiece("Guard", 0, 5, new Position(8, 0), bGuard, CELLSIZE);
//        chessPieces.add(bguard2);
//        PImage bKing = loadImage("src/main/resources/XXLChess/" + "b-king.png");
//        ChessPiece bking = new ChessPiece("King", 0, 1000000, new Position(7, 0), bKing, CELLSIZE);
//        chessPieces.add(bking);














    }

    /**
     * Receive key pressed signal from the keyboard.
    */
    public void keyPressed(){


    }
    
    /**
     * Receive key released signal from the keyboard.
    */
    public void keyReleased(){

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int x = mouseX / CELLSIZE;
        int y = mouseY / CELLSIZE;
        if(board.getSpot(x, y)!= null)
        {
            board.setSpotClick(x, y);
        }
//        if (0 <= x && x < BOARD_WIDTH && 0 <= y && y < BOARD_WIDTH)
//        {
//            board.setCellClick(x, y);
//        }
//
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    /**
     * Draw all elements in the game by current frame. 
    */
    public void draw()
    {
        for(int i = 0; i < BOARD_WIDTH; i++)
        {
            for(int j = 0; j < BOARD_WIDTH; j++)
            {
                Cell cell = board.getCell(i, j);
                fill(cell.getColor().getR(), cell.getColor().getG(), cell.getColor().getB());
                rect(i * CELLSIZE, j * CELLSIZE, CELLSIZE, CELLSIZE);


            }
        }


        for(int i = 0; i < BOARD_WIDTH; i++)
        {
            for(int j = 0; j < BOARD_WIDTH; j++)
            {
                if (board.getSpot(i, j) != null)
                {
                    System.out.println(i);
                    System.out.println(j);
                    Spot spot = board.getSpot(i, j);
                    image(spot.getPiece().getImage(), i * CELLSIZE, j * CELLSIZE, CELLSIZE, CELLSIZE);
                }

            }
        }


//        for(int i = 0; i < 14; i++)
//        {
//            for(int j = 0; j < 14; j++)
//            {
//                if((i + j + 1) % 2 == 0)
//                {
//                    fill(181, 136, 99); //fill with brown
//                }
//                else
//                {
//                    fill(240, 217, 181); //fill with white
//                }
//                rect(i * CELLSIZE, j * CELLSIZE, CELLSIZE, CELLSIZE);
////
//            }
//        }
//        chessPieces.forEach((items) -> {
//            int[] positions = items.drawChess();
//            image(items.getImage(), positions[0], positions[1], positions[2], positions[3]);
//        });
    }


	
	// Add any additional methods or attributes you want. Please put classes in different files.


    public static void main(String[] args) {
        PApplet.main("XXLChess.App");

    }

}
