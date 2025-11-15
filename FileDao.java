import java.lang.*;
import java.io.*;
public class FileDao implements DataAccessObject{
    public void save(String user,String pass){
            System.out.println("saved data in file");
            try{
                //open resource
                String filename="user.txt";
                FileWriter writer=new FileWriter(filename,true);
                FileReader readr=new FileReader("user.txt");
                try{
                    //process data
                    String data=String.format("%s,%s \n",user,pass);
                    // System.out.println();
                    writer.write(data);
                    int i;
                    while ((i=readr.read())!=-1) {
                        System.out.println((char)i);  
                    }

                }
                finally{
                    //close file              
                    writer.close();
                    readr.close();
                }
            }
            catch(Exception e){
                //handle exception
                e.printStackTrace();//it will print the detailed info of exception like which method,whos parent..
            }
    }
}