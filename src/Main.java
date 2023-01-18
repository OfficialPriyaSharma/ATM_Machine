import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ATMOperation op = new ATMOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner scan = new Scanner(System.in);
        System.out.println(" *************** WELCOME TO ATM MACHINE *************** ");
        System.out.println("Enter the ATM Number : ");
        int atmNumber = scan.nextInt();
        System.out.println("Enter the ATM Pin : ");
        int pin = scan.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin))
        {
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = scan.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2)
                {

                }
                else if(ch==3)
                {
                    System.out.println("Enter Amount to Deposit");
                    double depositAmount = scan.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4)
                {

                }
                else if(ch==5)
                {
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please enter correct choice");
                }
            }
        }

        {
            System.out.println("Incorrect ATM Number or Pin..!!");
            System.exit(0);
        }
    }
}