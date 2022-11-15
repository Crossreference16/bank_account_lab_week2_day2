import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance = 0.00;


     public BankAccount(String inputFirstname, String inputLastName, String inputDateOfBirth, String inputAccountNumber)
    {
    this.firstName = inputFirstname;
    this.lastName = inputLastName;
    this.dateOfBirth = inputDateOfBirth;
    this.accountNumber = inputAccountNumber;

    }

    void deposit(double DepositAmount) {
        this.balance += DepositAmount;
        System.out.println("Thank you for your deposit. You now have £" + this.balance + " in your account");
    }

    void withdraw(double WithdrawAmount) {
        this.balance -= WithdrawAmount;
    }

    //add interest
    public double addInterest(double interestRate) {

        this.balance += this.balance * interestRate;
        return this.balance;
    }


    public double accountBalance(){
         this.balance = 0.00;
        return (0.00);

    }








    //Getters below:
    public String getFirstName() {
        return "First name: " + this.firstName;
    }

    public String getLastName() {
        return "Last name: " + this.lastName;
    }

    public String getDateOfBirth() {
        return "DOB: " + this.dateOfBirth;
    }

    public String getAccountNumber() {
        return "Your account number is: " + this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    //Setters below:
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setBalance(Double newBalance) {
        this.balance = newBalance;

    }


}

