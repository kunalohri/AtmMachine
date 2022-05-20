package MachineAtm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImp implements AtmOperationInterface{

    ATM atm = new ATM();
    HashMap <Double , String> hs = new HashMap<>();
    @Override
    public void viewBalance() {

        System.out.println("Available Balance is : "+ atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
       if(withdrawAmount%200==0){

           if (withdrawAmount<atm.getBalance()){
               hs.put(withdrawAmount, " is Amount Withdrawn");
               System.out.println(withdrawAmount + " is withdraw successfully");
               atm.setBalance(atm.getBalance() - withdrawAmount);
               viewBalance();
           }
           else{
               System.out.println("Insufficient Balance ! Please Enter a valid amount");
           }

       }
       else{
           System.out.println("Please Enter the amount in multiple of 200 !");
       }


    }

    @Override
    public void depositeAmount(double depositeAmount) {

        System.out.println(depositeAmount + " is Deposited ! ");
        hs.put(depositeAmount, " is Amount Deposited !");
        atm.setBalance(atm.getBalance() + depositeAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {

        System.out.println("Your MiniStatement is : ");
        for (Map.Entry<Double, String> m : hs.entrySet()){
            System.out.println(m.getKey() + " "+m.getValue());
        }
    }

}
