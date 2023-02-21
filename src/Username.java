import java.io.*;

public class Username {

    public String username;
    private int money = 100;

    void Username(String x){
        this.username = x;
    }

    public static void findUser(String username, File usernames) throws Exception{
        try{

                FileWriter newUser = new FileWriter("Usernames.txt");
                newUser.write(username);
                newUser.close();
                System.out.println("Text happened");


                BufferedReader br = new BufferedReader(new FileReader("Usernames.txt"));
                String search;

                while ((search = br.readLine()) != null){
                    if(username.equals(search)){
                        System.out.println("Welcome back "+username);
                    }else{


                }
            }

        }catch  (IOException e) {
            System.out.println("Error");
        }





    }

}
