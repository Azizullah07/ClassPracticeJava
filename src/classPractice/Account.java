package classPractice;

public class Account {


    String userName;
    String password;
    double balance;
    String accoutnNumber;
    boolean islooggedIn;


    public void logIn(String userLoggedInUserName, String userloogedInPassword) {
        if (userName.equals(userLoggedInUserName) && password.equals(userloogedInPassword)) {
            System.out.println("Welcome to your account");
            islooggedIn = true;

        } else {
            System.out.println("Your user name or password is incoorect");
        }
    }
public void userInfo(){
        if (islooggedIn){
            System.out.println("Your account number is "+ accoutnNumber + " and your balace is "+ balance);
        }else {
            System.out.println("your credentials are incorrect try again");
        }
}

}




