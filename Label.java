package Project.Tic_Tac_Toa;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel labelTop = new JLabel();
    JLabel labelRight1 = new JLabel();
    JLabel labelRight2 = new JLabel();
    JLabel labelRightScore = new JLabel();
    JLabel labelLeft1 = new JLabel();
    JLabel labelLeft2 = new JLabel();
    JLabel labelLeftScore = new JLabel();
    JLabel labelWin1 = new JLabel();
    JLabel labelWin2 = new JLabel();
    JLabel labelWin3 = new JLabel();


    Label() {


        label1.setText("Player 1 turn");
        label1.setFont(new Font("Algerian",Font.BOLD,50));
        label1.setOpaque(false);
        label1.setVisible(true);
        label1.setPreferredSize(new Dimension(400,150));

        label2.setText("Player 2 turn");
        label2.setFont(new Font("Algerian",Font.BOLD,50));
        label2.setOpaque(false);
        label2.setVisible(false);
        label2.setPreferredSize(new Dimension(400,150));

        labelTop.setText("Tic-Tac-Toa");
        labelTop.setFont(new Font("Algerian",Font.BOLD,80));
        labelTop.setOpaque(false);
        labelTop.setVisible(true);
        labelTop.setPreferredSize(new Dimension(520,150));


        labelLeft1.setText("Player 1");
        labelLeft1.setFont(new Font("Algerian",Font.BOLD,30));
        labelLeft1.setOpaque(false);
        labelLeft1.setVisible(true);
        labelLeft1.setBounds(15,50,150,50);

        labelLeft2.setText(">>> Score <<<");
        labelLeft2.setFont(new Font("Algerian",Font.BOLD,20));
        labelLeft2.setOpaque(false);
        labelLeft2.setVisible(true);
        labelLeft2.setBounds(20,150,150,50);

        labelLeftScore.setText("00");
        labelLeftScore.setFont(new Font("Algerian",Font.BOLD,100));
        labelLeftScore.setOpaque(false);
        labelLeftScore.setVisible(true);
        labelLeftScore.setBounds(30,250,150,150);


        labelRight1.setText("Player 2");
        labelRight1.setFont(new Font("Algerian",Font.BOLD,30));
        labelRight1.setOpaque(false);
        labelRight1.setVisible(true);
        labelRight1.setBounds(15,50,150,50);

        labelRight2.setText(">>> Score <<<");
        labelRight2.setFont(new Font("Algerian",Font.BOLD,20));
        labelRight2.setOpaque(false);
        labelRight2.setVisible(true);
        labelRight2.setBounds(20,150,150,50);

        labelRightScore.setText("00");
        labelRightScore.setFont(new Font("Algerian",Font.BOLD,100));
        labelRightScore.setOpaque(false);
        labelRightScore.setVisible(true);
        labelRightScore.setBounds(30,250,150,150);


        labelWin1.setText("!!...Player 1 Win...!!");
        labelWin1.setFont(new Font("Algerian",Font.BOLD,40));
        labelWin1.setOpaque(false);
        labelWin1.setVisible(false);
        labelWin1.setBounds(60,150,500,150);

        labelWin2.setText("!!...Player 2 Win...!!");
        labelWin2.setFont(new Font("Algerian",Font.BOLD,40));
        labelWin2.setOpaque(false);
        labelWin2.setVisible(false);
        labelWin2.setBounds(60,150,500,150);

        labelWin3.setText("!!...Draw...!!");
        labelWin3.setFont(new Font("Algerian",Font.BOLD,40));
        labelWin3.setOpaque(false);
        labelWin3.setVisible(false);
        labelWin3.setBounds(130,150,250,150);

    }
}
