public class Runner {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount("Khalil", "Hersi", "06/08", "1111");

            System.out.println(myAccount.getAccountNumber());
            System.out.println(myAccount.getFirstName());
            System.out.println(myAccount.getLastName());
            System.out.println(myAccount.getDateOfBirth());
            System.out.println("£" + myAccount.getBalance());


            myAccount.deposit(1000.00);

            System.out.println("£" + myAccount.addInterest(0.02));

            myAccount.withdraw(500.03);
            System.out.println("£" + myAccount.getBalance());











        }





    }
