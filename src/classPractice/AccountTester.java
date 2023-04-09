package classPractice;

public class AccountTester {
    public static void main(String[] args) {
      Account arshadAccount=new Account();
      arshadAccount.accoutnNumber="A123";
      arshadAccount.userName="Arshad";
      arshadAccount.password="pass123";
      arshadAccount.balance= 1000000.34;
      arshadAccount.islooggedIn=true;
      arshadAccount.logIn("arshad","pass123");
arshadAccount.userInfo();

    }
}
