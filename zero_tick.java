package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zero_tick implements ActionListener {
    static JFrame f, f1;

    static ImageIcon one;
    static ImageIcon two;
    static ImageIcon three;
    static ImageIcon four;
    static ImageIcon five;
    static ImageIcon six;
    static ImageIcon seven;
    static ImageIcon eight;
    static ImageIcon nine;
    static ImageIcon zero;
    static ImageIcon cross;
    static ImageIcon info_icon;

    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton b6;
    static JButton b7;
    static JButton b8;
    static JButton b9;
    static JButton enter;
    static JButton restart_button;
    static JButton rename_button;
    static JButton info;

    static JMenuBar menubar;
    static JMenuBar menubar1;

    static JLabel player_name;
    static JLabel enter_name_label;
    static JTextArea note;
    static JTextField enter_name;
    static String user = "user", com = "com";

    static void declare(){

    }
    zero_tick() {

        int i = 120;
        f = new JFrame("zero tick");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        one = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\one.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        two = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\two.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        three = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\three.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        four = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\four.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        five = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\five.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        six = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\six.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        seven = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\seven.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        eight = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\eight.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        nine = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\nine.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        cross = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\X.png").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));
        zero = new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\zero.jpg").getImage().getScaledInstance(i, i, Image.SCALE_DEFAULT));

        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        restart_button = new JButton("restart game");
        rename_button = new JButton("rename player");

        player_name = new JLabel();
        player_name.setSize(100, 30);

        menubar = new JMenuBar();
        menubar.add(restart_button);
        menubar.add(rename_button);
        menubar.add(player_name);
        f.setJMenuBar(menubar);

        b1.setIcon(one);
        b2.setIcon(two);
        b3.setIcon(three);
        b4.setIcon(four);
        b5.setIcon(five);
        b6.setIcon(six);
        b7.setIcon(seven);
        b8.setIcon(eight);
        b9.setIcon(nine);

        b1.setSize(50, 50);
        b2.setSize(50, 50);
        b3.setSize(50, 50);
        b4.setSize(50, 50);
        b5.setSize(50, 50);
        b6.setSize(50, 50);
        b7.setSize(50, 50);
        b8.setSize(50, 50);
        b9.setSize(50, 50);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        rename_button.addActionListener(e -> {
            f1.setVisible(true);
            f.setVisible(false);
        });
        restart_button.addActionListener(e -> {

            restart();

        });

        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 3, 10, 10));

        f1 = new JFrame("enter player name");
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setSize(300, 250);
        f1.setLayout(null);
        f1.setVisible(true);

        menubar1= new JMenuBar();
        f1.setJMenuBar(menubar1);
        menubar1.setSize(300,20);

        enter_name_label = new JLabel("enter name -->");
        enter_name_label.setBounds(20, 20, 100, 20);
        note = new JTextArea("Note: If Text area is not visible click \non region above submit button");
        note.setBounds(10, 100, 200, 40);
        note.setEditable(false);

        enter = new JButton("submit");
        enter.setBounds(130, 60, 150, 30);
        enter.addActionListener(e ->
        {
            if (enter_name.getText().equals("")) player_name.setText("  Player is playing");
            else player_name.setText("  " + enter_name.getText() + " is playing");
            enter_name.setText("");
            f1.setVisible(false);
            f.setVisible(true);
        });
        info= new JButton();
        info_icon= new ImageIcon(new ImageIcon("C:\\Users\\Sarabjeet\\Downloads\\info.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        menubar1.add(info);
        info.setIcon(info_icon);
        info.setText("info");
        info.addActionListener(e -> {
            JOptionPane.showMessageDialog(f1,"Note: If window is empty, move cursor over the window region");
        });

        f1.add(enter);
        f1.add(enter_name_label);
        f1.add(note);
        enter_name = new JTextField();
        enter_name.setBounds(130, 20, 150, 30);
        f1.add(enter_name);

    }

    static void win(String s) {
        String message = "";
        if (s.equals(user))
            message = "you won";
        else if (s.equals(com))
            message = "computer won";
        else if (s.equals("tie")) message = " It is a Tie";
        JOptionPane.showMessageDialog(f, message);

        restart();
    }

    static void com_turn() {
        int com;
        while (true) {
            com = (int) (Math.random() * 10);
            if (com == 1) {
                if (b1.isEnabled()) {
                    b1.setEnabled(false);
                    b1.setIcon(zero);
                    break;
                }
            } else if (com == 2) {
                if (b2.isEnabled()) {
                    b2.setEnabled(false);
                    b2.setIcon(zero);
                    break;
                }
            } else if (com == 3) {
                if (b3.isEnabled()) {
                    b3.setEnabled(false);
                    b3.setIcon(zero);
                    break;
                }
            } else if (com == 4) {
                if (b4.isEnabled()) {
                    b4.setEnabled(false);
                    b4.setIcon(zero);
                    break;
                }
            } else if (com == 5) {
                if (b5.isEnabled()) {
                    b5.setEnabled(false);
                    b5.setIcon(zero);
                    break;
                }
            } else if (com == 6) {
                if (b6.isEnabled()) {
                    b6.setEnabled(false);
                    b6.setIcon(zero);
                    break;
                }
            } else if (com == 7) {
                if (b7.isEnabled()) {
                    b7.setEnabled(false);
                    b7.setIcon(zero);
                    break;
                }
            } else if (com == 8) {
                if (b8.isEnabled()) {
                    b8.setEnabled(false);
                    b8.setIcon(zero);
                    break;
                }
            } else if (com == 9) {
                if (b9.isEnabled()) {
                    b9.setEnabled(false);
                    b9.setIcon(zero);
                    break;
                } else {
                    System.out.println(10);
                    if (!b1.isEnabled() || !b2.isEnabled() || !b3.isEnabled() || !b4.isEnabled() || !b5.isEnabled() || !b6.isEnabled() || !b7.isEnabled() || !b8.isEnabled() || !b9.isEnabled()) {
                        break;
                    }
                }
            }
        }
    }

    static boolean is_Win(Icon i) {
        Icon a = null;
        int j = 0;
        String tocheck = "";
        if (i.equals(cross)) {
            a = cross;
            tocheck = user;
        } else if (i.equals(zero)) {
            a = zero;
            tocheck = com;
        }
        if (b1.getIcon().equals(a) && b2.getIcon().equals(a) && b3.getIcon().equals(a)) {
            win(tocheck);
            j++;
            return true;
        } else if (b4.getIcon().equals(a) && b5.getIcon().equals(a) && b6.getIcon().equals(a)) {
            win(tocheck);
            j++;
            return true;
        } else if (b7.getIcon().equals(a) && b8.getIcon().equals(a) && b9.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else if (b1.getIcon().equals(a) && b4.getIcon().equals(a) && b7.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else if (b2.getIcon().equals(a) && b5.getIcon().equals(a) && b8.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else if (b3.getIcon().equals(a) && b6.getIcon().equals(a) && b9.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else if (b1.getIcon().equals(a) && b5.getIcon().equals(a) && b9.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else if (b3.getIcon().equals(a) && b5.getIcon().equals(a) && b7.getIcon().equals(a)) {
            win(tocheck);
            return true;
        } else {
            if (!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled()) {
                win("tie");
            }
            return false;
        }

    }

    static void restart() {
        try {
            f.setVisible(false);
            new zero_tick();
        } catch (NullPointerException e) {
            System.out.print("e");
        }
    }

    public static void main(String[] args) throws NullPointerException {
        try {
            new zero_tick();
            System.out.println("Note: If window is empty, move cursor over the window region");

        } catch (NullPointerException e) {
            System.out.print("e");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        b.setEnabled(false);
        b.setIcon(cross);
        com_turn();
        is_Win(cross);
        if (!is_Win(cross))
            is_Win(zero);
    }
}