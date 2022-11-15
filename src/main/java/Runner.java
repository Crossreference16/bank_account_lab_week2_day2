public class Runner {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount("Khalil", "Hersi", "06/08", "1111");

            System.out.println(myAccount.getAccountNumber());
            System.out.println(myAccount.getFirstName());
            System.out.println(myAccount.getLastName());
            System.out.println(myAccount.getDateOfBirth());
            System.out.println("£" + myAccount.getBalance());


            myAccount.deposit(5000);

            System.out.println("£" + myAccount.addInterest(0.02)); //adds 2% interest to the deposited £5000.

            myAccount.withdraw(500.63);
            System.out.println("£" + myAccount.getBalance());











        }





    }
