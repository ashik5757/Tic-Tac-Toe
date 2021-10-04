package Project.Tic_Tac_Toa;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame  {

    private int score1 = 0;
    private int score2 = 0;


    GamePanel gamePanel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;

    Label label;
    JButton buttonNext;

    Frame() {

        Border border1 = BorderFactory.createDashedBorder(new Color(0xFDD900), 3,2,1,true);

        gamePanel = new GamePanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

        label = new Label();

        buttonNext = new JButton("Next Round..??");
       // buttonNext.setBounds(500,200,200,60);
        buttonNext.setPreferredSize(new Dimension(230,90));
        buttonNext.setHorizontalTextPosition(JButton.CENTER);
        buttonNext.setVerticalTextPosition(JButton.CENTER);
        buttonNext.setFocusable(false);
        buttonNext.setFont(new Font("Algerian",Font.BOLD,25));
        buttonNext.setBackground(new Color(0xEC8E4C));
        buttonNext.setForeground(new Color(0xFFFFFF));
        buttonNext.setBorder(border1);

        ImageIcon image = new ImageIcon("headphone.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setBackground(new Color(0x000000));
        this.setTitle("Tic-Tac-Toa");
        //this.setSize(900,900);
        this.setBounds(500,100,900,900);
        this.setIconImage(image.getImage());
        this.setLayout(new BorderLayout(6,6));
        //this.setBackground(new Color(0x000000));
        this.setResizable(false);



        panel3.setLayout(null);
        panel4.setLayout(null);
        panel5.setLayout(null);


        panel1.add(label.labelTop);


        panel2.add(label.label1);
        panel2.add(label.label2);

        panel3.add(label.labelLeft1);
        panel3.add(label.labelLeft2);
        panel3.add(label.labelLeftScore);

        panel4.add(label.labelRight1);
        panel4.add(label.labelRight2);
        panel4.add(label.labelRightScore);

        panel5.add(label.labelWin1);
        panel5.add(label.labelWin2);
        panel5.add(label.labelWin3);



        panel1.setBackground(new Color(0xFC5112));
        panel2.setBackground(new Color(0xE30F0F));
        panel3.setBackground(new Color(0xD0FDD20A, true));
        panel4.setBackground(new Color(0xD0FDD20A, true));



        panel1.setPreferredSize(new Dimension(100,200));
        panel2.setPreferredSize(new Dimension(100,150));
        panel3.setPreferredSize(new Dimension(180,100));
        panel4.setPreferredSize(new Dimension(180,100));


        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
        this.add(panel3,BorderLayout.WEST);
        this.add(panel4,BorderLayout.EAST);
        this.add(gamePanel.panel1,BorderLayout.CENTER);


        this.setVisible(true);

//
//        while (true) {
//
//            try {
//                label.labelTop.setVisible(true);
//                Thread.sleep(800);
//                label.labelTop.setVisible(false);
//                Thread.sleep(500);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        }

    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore1() {
        return score1;
    }
    public int getScore2() {
        return score2;
    }


}
