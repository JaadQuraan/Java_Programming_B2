package day40_exception.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne = new Bank();
        accountOne.balance = 100_000;


        try{
            accountOne.login("loopcamp", "123456!@#");

        } catch (InvalidCredentialException e){
            System.out.println(e.getMessage());
        }

        try{
            accountOne.withdrawal(120_000);
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("DONE");
    }
}
