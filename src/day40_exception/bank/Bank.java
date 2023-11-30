package day40_exception.bank;

public class Bank {

    double balance;

    //login
    public void login(String username, String password) throws InvalidCredentialException{
        if(!username.equals("loopcamp")){
           // System.out.println("Invalid username");
            throw new InvalidCredentialException("Invalid username");
        }
        if(!password.equals("123456!@#")){
            throw new InvalidCredentialException("Invalid Password");
        }
    }


    public void withdrawal(double withdrawalAmount) throws NotEnoughBalanceException {
        if(withdrawalAmount>balance){
            throw new NotEnoughBalanceException("Not enough funds");
        }
    }
}
