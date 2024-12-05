package PraktikumOOP.Week11.Projek1;

import javax.swing.*;

public class LatihanGUI {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My First Frame");
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
        JLabel myLabel = new JLabel("Label Pertama Ku...");
        JButton myButton =  new JButton("Tombol 1st");
        JButton myButton2 = new JButton("Tombol 2nd");
        JTextArea myTextArea = new JTextArea("My First Text Area", 5, 30);

        JCheckBox myCbxOne = new JCheckBox("Libur masih lama");
        JCheckBox myCbxTwo = new JCheckBox("Libur agak dekat");
        JCheckBox myCbxThree = new JCheckBox("Libur sudah dekat");
        JCheckBox myCbxFour = new JCheckBox("Libur sudah tiba");

        JRadioButton myRdoOne = new JRadioButton("Putra", true);
        JRadioButton myRdoTwo = new JRadioButton("Putri", false);
        ButtonGroup grpRdo = new ButtonGroup();

        grpRdo.add(myRdoOne);
        grpRdo.add(myRdoTwo);

        myPanel.add(myLabel);
        myPanel.add(myButton);
        myPanel.add(myButton2);
        myPanel.add(myTextArea);
        myPanel.add(myCbxOne);
        myPanel.add(myCbxTwo);
        myPanel.add(myCbxThree);
        myPanel.add(myCbxFour);
        myPanel.add(myRdoOne);
        myPanel.add(myRdoTwo);

        myFrame.getContentPane().add(myPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 600);
        myFrame.setVisible(true);
    }
}
