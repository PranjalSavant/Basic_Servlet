// * this will import only classes not packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeFrame extends JFrame implements ActionListener{ //signature line
    private JTextField username;
    private JPasswordField password;
    private JButton loginbutton;
    private JButton createacc;

    public WelcomeFrame(){
        this.initComponent();
    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Button Clicked");
    }

    private void initComponent(){
              username =new JTextField(20);// bcz when we create textfield with default constructor size of textfield will 0
              password=new JPasswordField(20);
              loginbutton =new JButton("Login");
              createacc =new JButton("Create Account");

              this.setLayout(new FlowLayout());

              this.add(username);
              this.add(password);
              this.add(loginbutton);
              this.add(createacc);
              createacc.addActionListener(this);

              this.setSize(500,500);

              this.setDefaultCloseOperation(EXIT_ON_CLOSE);//EXIT_ON_CLOSE is a static varible

    }
}