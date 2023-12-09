package day33_b_encapsulation.login;

public class Login {

   // public String username;
    private String username;
    // public String password;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        if(password.length() >= 8) {
            this.password = password;
        }
    }
    public String getUsername (){ // Don't need argument here just returning
        return username;
    }
    public String getPassword (String lastFourUserName) {
       if(lastFourUserName.equals(username.substring(username.length()-4))) {
           return password;
       }
       return "Wrong last four characters";
    }

}
