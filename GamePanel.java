package Project.Tic_Tac_Toa;

import javax.swing.*;
import java.awt.*;
public class GamePanel {

    private int win = 0;
    private int count = 0;

    JPanel panel1 = new JPanel();
    JButton[] buttons = new JButton[9];


   GamePanel() {

       panel1.setBackground(new Color(0x4F4D4D));
       panel1.setPreferredSize(new Dimension(400,400));
       panel1.setLayout(new GridLayout(3,3,10,10));


       for (int i=0; i<buttons.length; i++) {
           buttons[i] = new JButton();
           panel1.add(buttons[i]);
           buttons[i].setFocusable(false);
           buttons[i].setFont(new Font("Algerian",Font.BOLD,90));
           buttons[i].setForeground(new Color(0xFFFFFF));
       }



   }



    public int checkPlayer() {

       if (getCount()==0)
           return 0;
       else if (getCount()%2!=0)
           return 1;
       else
           return 2;
    }



   public void termCount() {
       count++;
   }



    public void checkPlayerWin() {

        if (    (this.buttons[0].getText().equals("X") && this.buttons[1].getText().equals("X") && this.buttons[2].getText().equals("X"))||
                (this.buttons[3].getText().equals("X") && this.buttons[4].getText().equals("X") && this.buttons[5].getText().equals("X"))||
                (this.buttons[6].getText().equals("X") && this.buttons[7].getText().equals("X") && this.buttons[8].getText().equals("X"))||
                (this.buttons[0].getText().equals("X") && this.buttons[3].getText().equals("X") && this.buttons[6].getText().equals("X"))||
                (this.buttons[1].getText().equals("X") && this.buttons[4].getText().equals("X") && this.buttons[7].getText().equals("X"))||
                (this.buttons[2].getText().equals("X") && this.buttons[5].getText().equals("X") && this.buttons[8].getText().equals("X"))||
                (this.buttons[0].getText().equals("X") && this.buttons[4].getText().equals("X") && this.buttons[8].getText().equals("X"))||
                (this.buttons[2].getText().equals("X") && this.buttons[4].getText().equals("X") && this.buttons[6].getText().equals("X"))
        ) {

            //System.out.println("Player 1 win");
            win = 1;



        }

        else if (
                        (this.buttons[0].getText().equals("O") && this.buttons[1].getText().equals("O") && this.buttons[2].getText().equals("O"))||
                        (this.buttons[3].getText().equals("O") && this.buttons[4].getText().equals("O") && this.buttons[5].getText().equals("O"))||
                        (this.buttons[6].getText().equals("O") && this.buttons[7].getText().equals("O") && this.buttons[8].getText().equals("O"))||
                        (this.buttons[0].getText().equals("O") && this.buttons[3].getText().equals("O") && this.buttons[6].getText().equals("O"))||
                        (this.buttons[1].getText().equals("O") && this.buttons[4].getText().equals("O") && this.buttons[7].getText().equals("O"))||
                        (this.buttons[2].getText().equals("O") && this.buttons[5].getText().equals("O") && this.buttons[8].getText().equals("O"))||
                        (this.buttons[0].getText().equals("O") && this.buttons[4].getText().equals("O") && this.buttons[8].getText().equals("O"))||
                        (this.buttons[2].getText().equals("O") && this.buttons[4].getText().equals("O") && this.buttons[6].getText().equals("O"))
        ) {

            //System.out.println("Player 2 win");
            win = 2;
        }

        else if (win==0 && getCount()==9){
           // System.out.println("Draw");
            win = 3;
        }


    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }


    public int getWin() {
       return win;
   }
    public void setWin(int win) {
        this.win = win;
    }


}
