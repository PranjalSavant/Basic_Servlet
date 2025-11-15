import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Registration extends JFrame implements ActionListener {
        JTextField username;
         JTextField password;
        //  JPasswordField confirempass;
         JButton creatAcc;

        public Registration(){
            this.initComponent();
        }

      public void actionPerformed(ActionEvent event){
        System.out.println("Account Created");
        String userfeild =username.getText();
        String pass=password.getText();
        // String repass=confirempass.getText();
        // System.out.println(userfeild +"\n"+ pass + "\n " +repass);
        RegistrService service=new RegistrService();
        service.register(userfeild,pass);
      }

        public void initComponent(){
            username = new JTextField(20);
            password = new JTextField(20);
            // confirempass =new JPasswordField(8);
            creatAcc =new JButton("Create Account");

            this.setLayout(new FlowLayout());

            this.add(username);
            this.add(password);
            // this.add(confirempass);
            this.add(creatAcc);
            creatAcc.addActionListener(this);

            this.setSize(300,300);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
}