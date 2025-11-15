import java.lang.*;

public class RegistrService {
    public void register(String user,String pass){
        DataAccessObject dao;

        dao=new FileDao();
        dao.save(user,pass);
        
        dao=new databaseDao();
        dao.save(user,pass);
    }
}