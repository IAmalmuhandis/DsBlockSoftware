/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;
//import userPackage.AboutUs;
import userPackage.SignUpWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Zarah
 */

public class HomeWindow implements ActionListener{
     JFrame homeFrame;
     JButton getStartedBtn;
     JMenu menu;
     JMenuItem SignUp;
     JMenuItem SignIn;
   
    public HomeWindow(){
        // Creating the Home window frame
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    homeFrame = new JFrame("Dan Sani Block Industry");
    homeFrame.setBounds(dim.width/15, dim.height/14,1200, 660);
    homeFrame.getContentPane().setBackground(new Color(115,215,255));
    homeFrame.setLayout(new BorderLayout());
    homeFrame.setResizable(false);
    homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon icon = new ImageIcon("C:\\Users\\ZAHRA AHMED GARBA\\Documents\\GitHub\\DsBlockSoftware\\src\\img\\logo.png");
    homeFrame.setIconImage(icon.getImage());
    
    // Creating Menu Bar
    JMenuBar menuBar = new JMenuBar();
    menuBar.setSize(10, 10);
    
     menu = new JMenu("Menu");
    SignUp = new JMenuItem("SignUp");
    SignIn = new JMenuItem("SignIn");
  
    // Adding actionlisteners to menu items
    SignUp.addActionListener(this);
    SignIn.addActionListener(this);
  
    
    SignUp.setMnemonic(KeyEvent.VK_S);
    SignIn.setMnemonic(KeyEvent.VK_L);
   
    
      // Adding elements to menuBar
      menu.add(SignUp);
      menu.add(SignIn);
      menuBar.add(menu);
   
    // Creating Header Panel
    JPanel HeaderPanel = new JPanel();
    HeaderPanel.setBackground(new Color(3,37,126));
    HeaderPanel.setPreferredSize(new Dimension(100,300));
    HeaderPanel.setLayout(null);
    
        // Creating home window Header Text
        JLabel logoPic = new JLabel();
        ImageIcon logoImage = new ImageIcon(new ImageIcon("C:\\Users\\ZAHRA AHMED GARBA\\Documents\\GitHub\\DsBlockSoftware\\src\\img\\logo.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

      
        logoPic.setBounds(80,4,400,200);
         logoPic.setIcon(logoImage);
        // main logo 
        
        
        // Creating home window Header  text
        JLabel headerText = new JLabel();
        headerText.setText("DAN SANI BLOCK");
        headerText.setForeground(Color.white);
        headerText.setFont(new Font("algerian", Font.BOLD, 25));
        headerText.setBounds(70,140,400,100);
        
        
     // Creating home window Header Paragraph text
        JLabel headerParagraphText = new JLabel();
        headerParagraphText.setText("Quality over Quantity..");
        headerParagraphText.setForeground(Color.white);
        headerParagraphText.setFont(new Font("MV Boli", Font.ITALIC, 15));
        headerParagraphText.setBounds(90,157,400,100);
        
        // creating home page picture
      //  Border border = BorderFactory.createLineBorder(new Color(115,215,255),8);
        JLabel sidePicture = new JLabel();
        ImageIcon HeaderImage = new ImageIcon(new ImageIcon("C:\\Users\\ZAHRA AHMED GARBA\\Documents\\GitHub\\DsBlockSoftware\\src\\img\\headerCircledImage.png").getImage().getScaledInstance(180,180, Image.SCALE_DEFAULT));
        
        sidePicture.setBounds(800,15,250,250); 
        sidePicture.setIcon(HeaderImage);
      //  sidePicture.setBorder(border);
        
        
        // Creating get Started Button
        getStartedBtn = new JButton("Get Started!");
        getStartedBtn.setForeground(new Color(3,37,126));
        getStartedBtn.setFont(new Font("MV Boli", Font.BOLD,15));
        getStartedBtn.setBounds(150,230,130,30);
        getStartedBtn.setFocusable(false);
        getStartedBtn.addActionListener(this);
     
        
     // Creating Body Panel
    JPanel BodyPanel = new JPanel();
    BodyPanel.setPreferredSize(new Dimension(200,250));
    BodyPanel.setBackground(new Color(115,215,255));
    BodyPanel.setLayout(null);
        
     // Creating home window Body Text
        JLabel BodyText = new JLabel();
        BodyText.setText("Why Join Us");
        BodyText.setForeground(new Color(3,37,126));
        BodyText.setFont(new Font("algerian", Font.BOLD, 30));
        BodyText.setBounds(480,80,200,80);
        
        // creating body animation image
         // creating home page picture
      //  Border border = BorderFactory.createLineBorder(new Color(115,215,255),8);
        JLabel questionMarkLabel = new JLabel();
        ImageIcon questionMarkPic = new ImageIcon(new ImageIcon("C:\\Users\\ZAHRA AHMED GARBA\\Documents\\GitHub\\DsBlockSoftware\\src\\img\\questionMark.png").getImage().getScaledInstance(140,140, Image.SCALE_DEFAULT));
        
        questionMarkLabel.setBounds(600,10,250,200); 
        questionMarkLabel.setIcon(questionMarkPic);
        
        
        // Creating home window Header Paragraph text
        JLabel BodyParagraphText = new JLabel();
        BodyParagraphText.setText("<html><body><div style='text-align:center;'>Dan Sani Block Industry is the number one Block company in katsina state.<br>"
                + "We provide our Customers with Qualitative Blocks and also make it easier for them"
                + " to order blocks even from inside their rooms, and we get the Blocks delivered as fast as possible"
                + " to their desired location</div></body></html>");
        BodyParagraphText.setVerticalAlignment(JLabel.CENTER);
        
        BodyParagraphText.setForeground(new Color(3,37,126));
        BodyParagraphText.setFont(new Font("times new roman", Font.ITALIC, 20));
        BodyParagraphText.setBounds(180,160,800,100);
        
  
 
    // Adding elements to HeaderPanel
    HeaderPanel.add(logoPic);
    HeaderPanel.add(headerText);
    HeaderPanel.add(headerParagraphText);
    HeaderPanel.add(getStartedBtn);
    HeaderPanel.add(sidePicture);
    
    // Adding elements to BodyPanel
    BodyPanel.add(BodyText);
    BodyPanel.add(BodyParagraphText);
    BodyPanel.add(questionMarkLabel);
    
    // Adding elements to home window frame
    homeFrame.add(HeaderPanel, BorderLayout.NORTH);
    homeFrame.add(BodyPanel, BorderLayout.CENTER);
    homeFrame.setJMenuBar(menuBar);
    homeFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == SignUp){
         homeFrame.dispose();
            try {
                new SignUpWindow();
            } catch (SQLException ex) {
                Logger.getLogger(HomeWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(e.getSource() == SignIn){
            homeFrame.dispose();
            try {
                new SignInWindow();
            } catch (SQLException ex) {
                Logger.getLogger(HomeWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(e.getSource()== getStartedBtn){
         int userResponse = JOptionPane.showConfirmDialog(homeFrame,"Do you aleardy have an Account?", "Info", JOptionPane.YES_NO_CANCEL_OPTION);
         if(userResponse == 0){
             homeFrame.dispose();
             try {
                 new SignInWindow();
             } catch (SQLException ex) {
                 Logger.getLogger(HomeWindow.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else if(userResponse == 1){
              homeFrame.dispose();
             try {
                 new SignUpWindow();
             } catch (SQLException ex) {
                 Logger.getLogger(HomeWindow.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
           
        }
    
    }
    
}
