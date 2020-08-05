/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
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

public class BCW extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;

    //Constructor 
    public BCW(){

        this.setSize(500,400);
        //menu generate method

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(255,204,204));

        button1 = new JButton();
        button1.setBounds(206,122,90,35);
        button1.addActionListener(this);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Predict");
        button1.setVisible(true);                    //SETTING BUTTON1

        button2 = new JButton();
        button2.setBounds(205,195,90,35);
        button2.addActionListener(this);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("For Users");
        button2.setVisible(true);                  //SETTING BUTTON 2

        button3 = new JButton();
        button3.setBounds(202,257,90,35);
        button3.addActionListener(this);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("comingsoon");
        button3.setVisible(true);               //SETTING BUTTON3

        label1 = new JLabel();
        label1.setBounds(220,12,150,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,20));
        label1.setText("WELCOME");
        label1.setVisible(true);  

        
        //SETTING     LABEL
        //adding components to contentPane panel
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(label1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cancer Research Insitute");
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button1)
        {
            new Predict();
        }
        else if (e.getSource()==button2)
        {
            String  args[]={"as","as"};
            //Home.main(args);
            new HomeGUI();
        }
        else if (e.getSource()==button3)
        {
            //do something
        }
    }

    public static void main(String[] args)
    {

        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new BCW();
                }
            });
    }
}

