package userPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutUs2 extends JFrame{
	
	JPanel panel1 , panel2;
    JLabel text, text2;

   public AboutUs2(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1200,800);
        this.setVisible(true);

        text = new JLabel("About Us");
        text.setBounds(400, 200, 200, 50);
        text.setFont(new Font("Algerian", Font.BOLD,40));
        text.setForeground(Color.WHITE);

        text2 = new JLabel("<html><body style='text-align: center;'>The increasing need to build new residential houses, factors and offices to accommodate Nigeria's large population has made cement block production a successful business in the country.\n" +
                "<br>DS Block industries make high quality blocks fit for building houses such that the construction does not easily collapse.<br> And any block that falls short of this, is not good for building.<br> The business sells more in the dry season than the raining season because several builders build during dry season. \n" +
                "\tLooking at your immediate environment you will see that people are building houses, school, shops, religious center, hospitals, factories, offices and industries. This explain why this business opportunity is viable.<br> Although tech world is taking over the world with technology advancement everything is  get more easier and sufficient..<br> We started about an idea on how we can use technology to make/ create a software that will make contractors Engineers etc to find more easier to order blocks to there conducive and desired place for construction. We decided to build a software."
                + " conducive and desired place for construction. We decided to build a software that can make customers to order there block of there suitable desire without coming to the site so that it can be conveyed to there suitable location. </body></html>");
        text2.setBounds(130, 50, 750, 300);
        text2.setFont(new Font("aerial", Font.BOLD,14));
        text2.setForeground(new Color(3,37,126));




        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(280,270));
        panel1.setBackground(new Color(3,37,126));
        panel1.add(text);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBackground(Color.white);
        panel2.setPreferredSize(new Dimension(280,295));
        panel2.add(text2);
        panel2.setLayout(null);


        this.setSize(1000,700);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.CENTER);
        this.setLocationRelativeTo(null);


        this.setVisible(true);

    }

}
	
	
	
	
	
	
	

