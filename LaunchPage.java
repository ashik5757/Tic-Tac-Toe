package Project.Tic_Tac_Toa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaunchPage implements ActionListener {


    Frame frame;

    LaunchPage() {


        frame = new Frame();

        frame.buttonNext.addActionListener(this);

        for (int i = 0; i < frame.gamePanel.buttons.length; i++) {
            frame.gamePanel.buttons[i].addActionListener(this);
        }
    }
    


    public void reset() {

        //System.out.println("Inside NextButton");

        for (int i=0; i<frame.gamePanel.buttons.length; i++) {

            frame.gamePanel.buttons[i].setText("");
            frame.gamePanel.buttons[i].setEnabled(true);
            frame.gamePanel.buttons[i].setSelected(false);
            frame.gamePanel.buttons[i].setBackground(new JButton().getBackground());
        }


        frame.gamePanel.setWin(0);
        frame.gamePanel.setCount(0);

        frame.panel2.remove(frame.buttonNext);

        frame.remove(frame.panel5);
        frame.label.labelWin1.setVisible(false);
        frame.label.labelWin2.setVisible(false);
        frame.label.labelWin3.setVisible(false);



        frame.add(frame.gamePanel.panel1, BorderLayout.CENTER);
        frame.gamePanel.panel1.setVisible(true);
    }

    


    @Override
    public void actionPerformed(ActionEvent e) {

       // System.out.println();

        //System.out.println(frame.gamePanel.checkPlayer());


        if (e.getSource() == frame.buttonNext) {

            reset();

            //System.out.println(frame.gamePanel.checkPlayer());


        }




        for (int i = 0; i < frame.gamePanel.buttons.length; i++) {

            if (e.getSource() == frame.gamePanel.buttons[i]) {

               // System.out.println("Button " + i);

                frame.gamePanel.termCount();
                //System.out.println("Count = " + frame.gamePanel.getCount());

                if (frame.gamePanel.checkPlayer() == 1) {
                    frame.gamePanel.buttons[i].setBackground(new Color(0xE53543));
                    frame.gamePanel.buttons[i].setText("X");

                }
                if (frame.gamePanel.checkPlayer() == 2){
                    frame.gamePanel.buttons[i].setBackground(new Color(0x21D424));
                    frame.gamePanel.buttons[i].setText("O");
                }
                frame.gamePanel.buttons[i].setEnabled(false);
                frame.gamePanel.checkPlayerWin();


            }

        }


        if (frame.gamePanel.checkPlayer() == 0) {
            frame.panel2.setBackground(new Color(0xEF0202));
            frame.label.label2.setVisible(false);
            frame.label.label1.setVisible(true);

        }
        if (frame.gamePanel.checkPlayer() == 1) {
           // System.out.println("CheckPlayer 1");
            frame.panel2.setBackground(new Color(0x41E720));
            frame.label.label1.setVisible(false);
            frame.label.label2.setVisible(true);
        }
        if (frame.gamePanel.checkPlayer() == 2) {
            //System.out.println("CheckPlayer 2");
            frame.panel2.setBackground(new Color(0xEF0202));
            frame.label.label2.setVisible(false);
            frame.label.label1.setVisible(true);

        }


        if (frame.gamePanel.getWin() != 0) {

            frame.gamePanel.panel1.setVisible(false);
            frame.label.label1.setVisible(false);
            frame.label.label2.setVisible(false);
            frame.panel2.add(frame.buttonNext);
            frame.add(frame.panel5, BorderLayout.CENTER);

            if (frame.gamePanel.getWin() == 1) {
                frame.label.labelWin1.setVisible(true);
                frame.panel5.setBackground(new Color(0xEC0D0D));
                frame.panel2.setBackground(new Color(0xEC0D0D));
                frame.setScore1(frame.getScore1()+1);
                frame.label.labelLeftScore.setText(""+frame.getScore1());
            }
            if (frame.gamePanel.getWin() == 2) {
                frame.label.labelWin2.setVisible(true);
                frame.panel5.setBackground(new Color(0x49E940));
                frame.panel2.setBackground(new Color(0x49E940));
                frame.setScore2(frame.getScore2()+1);
                frame.label.labelRightScore.setText(""+frame.getScore2());
            }
            if (frame.gamePanel.getWin() == 3) {
                frame.label.labelWin3.setVisible(true);
                frame.panel5.setBackground(new Color(0xAB3F5DD0, true));
                frame.panel2.setBackground(new Color(0xAB3F5DD0, true));

            }


        }


    }


}