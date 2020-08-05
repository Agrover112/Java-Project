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
import javax.swing.ListSelectionModel;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class HomeGUI extends JFrame  {
    private JMenuBar menuBar;
    private JLabel label1;
    private JList list1;

    //Constructor 
    public HomeGUI() {

        this.setTitle("HOME");
        this.setSize(500,400);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(255,204,204));

        label1 = new JLabel();
        label1.setBounds(132,5,246,45);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,20)); 
        label1.setText("............WELCOME................");
        label1.setVisible(true);

        DefaultListModel<String> l1= new DefaultListModel<>();
        l1.addElement("Create a new account!");
        l1.addElement("Existing  user");

        JList<String> L=new JList<>(l1);
        L.setBounds(165,99,250,250);
        L.addListSelectionListener(new ListSelectionListener()
            {
                public void valueChanged(ListSelectionEvent e)
                {
                    if (e.getValueIsAdjusting() == false)
                    {
                        switch(L.getSelectedIndex())
                        {
                            case 0:
                            User obj1=new User();
                            obj1.NewUser();

                            break;
                            case 1:
                            User obj2=new User();
                            obj2.ExistingUser();
                            break;

                        }
                    }
                }
            });
        L.setBackground(new Color(255,204,204));
        L.setForeground(new Color(0,0,0));
        L.setEnabled(true);
        L.setFont(new Font("sansserif",0,20));
        L.setVisible(true);
        //adding components to contentPane panel
        contentPane.add(label1);
        contentPane.add(L);


        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new HomeGUI();
                }
            });
    }

}
