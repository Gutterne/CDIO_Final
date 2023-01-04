package org.example;
import Fields.Field;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import java.awt.*;
public class GameController {
    Holder holder;
    GameRunner2 gameRunner2;
    GameRunner3 gameRunner3;
    GameRunner4 gameRunner4;
    Player player1,player2,player3,player4;
    Board board3;
    private GameBoard[] board;
    boolean playing = true;
    String inputText= "";
    String Textdata;
    GUI gui;
    private GameBoard [] board4;
    GUI_Field[] board1,board2= new GUI_Field[24];
    GameBoard gameBoard;
    public GameController() {
        holder=new Holder();
        board3= new Board();
        gameRunner2 = new GameRunner2();
        gameRunner3 = new GameRunner3();
        gameRunner4 = new GameRunner4();
        board1 = GameBoard.makeFields();
        for(int i = 0; i < board2.length; ++i) {
            board2[i] = board1[i];
        }
        gameBoard = new GameBoard(board4);
        gui = new GUI(board2);
    }

    public void play() throws InterruptedException {
        Textdata = "" + gui.getUserString(inputText);
        try {


            int x = Integer.parseInt(Textdata);

            if (x == 2) {
                GUI_Car car1 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play1 = new GUI_Player("Player1", 20, car1);
                gui.addPlayer(play1);

                GUI_Car car2 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play2 = new GUI_Player("Player2", 20, car2);
                gui.addPlayer(play2);

                player1 = new Player(20);
                player2 = new Player(20);
                board2[0].setCar(play1, true);
                board2[0].setCar(play2, true);
                while (playing) {
                    gameRunner2.GameRun2(play1, play2, board2, gui, player1, player2);
                    if (gameRunner2.winner) {
                        gameRunner2.setWinner(gui);
                        break;
                    }
                }
            } else if (x == 3) {
                GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play1 = new GUI_Player("Player1", 18, car1);
                gui.addPlayer(play1);

                GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play2 = new GUI_Player("Player2", 18, car2);
                gui.addPlayer(play2);

                GUI_Car car3 = new GUI_Car(Color.BLUE, Color.WHITE, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play3 = new GUI_Player("Player3", 18, car3);
                gui.addPlayer(play3);

                player1 = new Player(18);
                player2 = new Player(18);
                player3 = new Player(18);
                board2[0].setCar(play1, true);
                board2[0].setCar(play2, true);
                board2[0].setCar(play3, true);



                while (playing) {
                    gameRunner3.GameRun3(play1, play2, play3, board2, gui, player1, player2, player3);
                }
            } else {
                GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play1 = new GUI_Player("Player1", 16, car1);
                gui.addPlayer(play1);

                GUI_Car car2 = new GUI_Car(Color.YELLOW, Color.WHITE, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play2 = new GUI_Player("Player2", 16, car2);
                gui.addPlayer(play2);

                GUI_Car car3 = new GUI_Car(Color.BLUE, Color.BLACK, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play3 = new GUI_Player("Player3", 16, car3);
                gui.addPlayer(play3);

                GUI_Car car4 = new GUI_Car(Color.GREEN, Color.BLACK, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_DUAL_COLOR);
                GUI_Player play4 = new GUI_Player("Player4", 16, car4);
                gui.addPlayer(play4);

                player1 = new Player(16);
                player2 = new Player(16);
                player3 = new Player(16);
                player4 = new Player(16);


                board2[0].setCar(play1, true);
                board2[0].setCar(play2, true);
                board2[0].setCar(play3, true);
                board2[0].setCar(play4, true);

                while (playing) {
                    gameRunner4.GameRun4(play1, play2, play3, play4, board2, gui, player1, player2, player3, player4);
                }
            }
        }

            catch (Exception e){
            gui.showMessage("Try a digit.");
            }
        }
}