package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

      Login obj = new Login();
        //System.out.println(obj.username);
        //obj.username = "Taras";
        obj.setUsername("Taras");
       // System.out.println(obj.password);
        //obj.password = "123";
        obj.setPassword("Qwer@123");


      //  System.out.println(obj.username);
       // System.out.println(obj.password);
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword("aras"));

    }

}
