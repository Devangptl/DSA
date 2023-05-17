public class AccessModifir {
    public static void main(String[] args) {

        BankAccount BA = new BankAccount();

        BA.userName = "Devang Patel";
        System.out.println(BA.userName);

        // BA.password = "deahddfhid"; ---> that is throw error because this is private
        // variable

        BA.setPassword("Devandjfj");

    }
}

class BankAccount {

    public String userName;
    private String password;

    void setPassword(String newPassowrd) {
        password = newPassowrd;
        System.out.println(password);
    }

}
