// ============================================================================
//    Taken and adapted from: http://programmingnotes.org/
// ============================================================================
import javax.swing.*;
import java.awt.*;

public class Logic
{
    private static boolean check=true;
    public static void getMove(int rowMove, int colMove, int move, Font font, JButton square[][], 
    String startingPlayer)
    {   
        String second;
        if(startingPlayer.equals("X")){
            second = "O";
        }else{
            second = "X";
        }
        // gets the current move "X" or "O" for the user & displays to screen
        square[rowMove][colMove].setFont(font);
        
        //TODO: create logic to set which player made the move
        if(check==true){
            square[rowMove][colMove].setText(startingPlayer);
            check=false;
        }else{
            square[rowMove][colMove].setText(second);
            check = true;
        }
    }

    public static void showGame(JPanel pnlSouth, JPanel pnlPlayingField)
    {   // shows the Playing Field
        pnlSouth.setLayout(new BorderLayout());
        pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
        pnlPlayingField.requestFocus(); 
    }

    public static void clearPanelSouth(JPanel pnlSouth, JPanel pnlTop, 
    JPanel pnlNewGame, JPanel pnlPlayingField, JPanel pnlBottom, JPanel radioPanel) 
    {   // clears any posible panels on screen
        pnlSouth.remove(pnlTop); 
        pnlSouth.remove(pnlBottom);
        pnlSouth.remove(pnlPlayingField);
        pnlTop.remove(pnlNewGame);
        pnlSouth.remove(radioPanel);
    }
}
