package GameDev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener
{
    public static  int BOARD_SIZE = 3;

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton clickedButton = (JButton)e.getSource();
        makeMove(clickedButton);
        GameStatus gs = this.getGameStatus();

        if(gs ==GameStatus.Incomplete)
        {
            return;
        }

        declareWinner(gs);

        int choice = JOptionPane.showConfirmDialog(this, "Do you want to restart the game");

        if(choice == JOptionPane.YES_OPTION)
        {
            for (int row = 0; row < BOARD_SIZE; row++)
            {
                for (int col = 0; col < BOARD_SIZE; col++)
                {
                    buttons[row][col].setText("");

                }
            }

            crossTurn = true;
        }

        else
        {
            super.dispose();
        }
    }

    private void declareWinner(GameStatus gs)
    {
        if(gs == GameStatus.XWins)
        {
            JOptionPane.showMessageDialog(this,"X Wins");
        }
        else if(gs == GameStatus.OWins)
        {
            JOptionPane.showMessageDialog(this,"O Wins");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Tie");
        }
    }

    private GameStatus getGameStatus()
    {
        String txt1 = "";
        String txt2;
        int row = 0;
        int col;

        while(row < BOARD_SIZE)
        {
            col = 0;
            while(col < BOARD_SIZE - 1)
            {
                txt1 = buttons[row][col].getText();
                txt2 = buttons[row][col+1].getText();
                if(!txt1.equals(txt2) || txt1.length() == 0)
                {
                    break;
                }
                col++;
            }

            if(col == BOARD_SIZE-1)
            {
                if(txt1.equals("X"))
                {
                    return GameStatus.XWins;
                }
                else
                {
                    return  GameStatus.OWins;
                }
            }

            row++;
        }

        col = 0;
        while(col < BOARD_SIZE)
        {
            row = 0;
            while(row < BOARD_SIZE - 1)
            {
                txt1 = buttons[row][col].getText();
                txt2 = buttons[row+1][col].getText();
                if(!txt1.equals(txt2) || txt1.length() == 0)
                {
                    break;
                }
                row++;
            }

            if(row == BOARD_SIZE-1)
            {
                if(txt1.equals("X"))
                {
                    return GameStatus.XWins;
                }
                else
                {
                    return  GameStatus.OWins;
                }
            }

            col++;
        }
        row = 0;
        col = 0;

        while(row < BOARD_SIZE - 1)
        {
            txt1 = buttons[row][col].getText();
            txt2 = buttons[row+1][col+1].getText();
            if(!txt1.equals(txt2) || txt1.length() == 0)
            {
                break;
            }
            row++;
            col++;
        }
        if(row == BOARD_SIZE-1)
        {
            if(txt1.equals("X"))
            {
                return GameStatus.XWins;
            }
            else
            {
                return  GameStatus.OWins;
            }
        }


        row = BOARD_SIZE-1;
        col = 0;

        while(row > 0)
        {
            txt1 = buttons[row][col].getText();
            txt2 = buttons[row-1][col+1].getText();
            if(!txt1.equals(txt2) || txt1.length() == 0)
            {
                break;
            }
            row--;
            col++;
        }
        if(row == 0)
        {
            if(txt1.equals("X"))
            {
                return GameStatus.XWins;
            }
            else
            {
                return  GameStatus.OWins;
            }
        }


        String txt;

        for (row = 0; row < BOARD_SIZE; row++)
        {
            for (col = 0; col < BOARD_SIZE; col++)
            {
                txt = buttons[row][col].getText();

                if(txt.isEmpty())
                {
                    return GameStatus.Incomplete;
                }
            }
        }


        return GameStatus.Tie;
    }

    private void makeMove(JButton clickedButton)
    {
        String btntext = clickedButton.getText();

        if(btntext.length() > 0)
        {
            JOptionPane.showMessageDialog(this,"Wrong move");
        }
        else
        {
            if(crossTurn)
            {
                clickedButton.setText("X");
            }
            else
            {
                clickedButton.setText("O");
            }
            crossTurn = !crossTurn;
        }
    }

    public enum GameStatus
    {
        Incomplete, XWins, OWins, Tie
    }

    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
    boolean crossTurn = true;

    public TicTacToe()
    {
        super.setTitle("TicTacToe");
        super.setSize(800,800);

        GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
        super.setLayout(grid);

        Font font = new Font("Comic Sans", Font.BOLD, 150);

        for (int row = 0; row < BOARD_SIZE; row++)
        {
            for (int col = 0; col < BOARD_SIZE; col++)
            {
                JButton button = new JButton("");
                buttons[row][col] =  button;
                button.setFont(font);
                button.addActionListener(this);
                super.add(button);
            }

        }
        super.setResizable(false);
        super.setVisible(true);
    }

}
