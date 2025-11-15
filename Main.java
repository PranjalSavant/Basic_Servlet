public class Main{
    public static void main(String args[])
    {
        // WelcomeFrame frame = new WelcomeFrame();
       
        //  Registration re= new Registration();
        //  frame.setVisible(true);
        //  re.setVisible(true);

        // RegistrService frame = new RegistrService();
        // frame.setVisible(true);

        databaseDao dao=new databaseDao();
        dao.save("kit","kit123");


    }
   
}