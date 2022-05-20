package MachineAtm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AtmOperationInterface aop = new AtmOperationImp();

        int Atm_number = 12345;
        int Atm_pin = 123;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter your ATM Number : ");
        int user_atm_number = sc.nextInt();

        System.out.println("Enter your ATM Pin");
        int user_atm_pin = sc.nextInt();

        if(Atm_number == user_atm_number && Atm_pin== user_atm_pin ){

            System.out.println("Validation Done");

            while (true){
                System.out.println("1 )  Select One To view your Available Balance !");
                System.out.println("2 )  Select Two To Withdraw Amount !");
                System.out.println("3 )  Select Three To Deposite Money !");
                System.out.println("4 )  Select Four To view the mini statement !");
                System.out.println("5 )  select five To Exit from the application !");

                System.out.println("Enter your Choice : ");

                int choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("choice 1 is selected !");
                        aop.viewBalance();
                        break;
                    case 2:
                        System.out.println("How much money you want to withdraw ? ");
                        double withdraw_user = sc.nextDouble();
                        aop.withdrawAmount(withdraw_user);
                        break;
                    case 3:
                        System.out.println("Enter How much Amount you want to deposite !");
                        double deposite_user = sc.nextDouble();
                        aop.depositeAmount(deposite_user);
                        break;
                    case 4:
                        aop.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM Card !");
                        System.out.println("ThankYou for using this ATM Machine");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please Enter a Vaild Number !");
                        break;
                }
            }

        }
        else{
            System.out.println("You entered Wrong Details ! ");
            System.exit(0);
        }


    }
}
