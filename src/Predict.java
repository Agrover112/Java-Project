
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class Predict extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JButton button1;
    private JTextArea textarea1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JTextField textfield5;

    //Constructor 
    public Predict(){

        this.setTitle("Predict");
        this.setSize(500,400);
        //menu generate method

        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(255,204,204));

        button1 = new JButton();
        button1.setBounds(189,142,90,35);
        button1.addActionListener(this);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Predict");
        button1.setVisible(true);

        textarea1 = new JTextArea();
        textarea1.setBounds(157,177,150,100);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,12));
        textarea1.setText("Results will be displayed here");
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(15,42,90,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(119,44,90,35);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        textfield3.setText("");
        textfield3.setVisible(true);

        textfield4 = new JTextField();
        textfield4.setBounds(237,45,90,35);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText(" ");
        textfield4.setVisible(true);

        textfield5 = new JTextField();
        textfield5.setBounds(343,46,90,35);
        textfield5.setBackground(new Color(255,255,255));
        textfield5.setForeground(new Color(0,0,0));
        textfield5.setEnabled(true);
        textfield5.setFont(new Font("sansserif",0,12));
        textfield5.setText("");
        textfield5.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(textarea1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield5);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu

    public void actionPerformed(ActionEvent e)
    {  
        String num1=textfield2.getText(); 
        String num2=textfield3.getText();
        String num3=textfield4.getText();
        String num4=textfield5.getText();
        textarea1.setText(num1+num2+num3+num4);

        
    }  

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new Predict();
                }
            });
    }

}
