package atm;

import java.util.HashMap;
import java.util.Map;

public class atmOperationImpl  {
	

	    atm ATM=new atm();
	    Map<Double,String> ministmt=new HashMap<>();
	   
	    public void viewBalance() {
	        System.out.println("Available Balance is : "+ATM.getBalance());

	    }

	 
	    public void withdrawAmount(double withdrawAmount) {
	        if(withdrawAmount%500==0) {
	            if (withdrawAmount <= ATM.getBalance()) {
	                ministmt.put(withdrawAmount, " Amount Withdrawn");
	                System.out.println("Collect the Cash " + withdrawAmount);
	                ATM.setBalance(ATM.getBalance() - withdrawAmount);
	                viewBalance();
	            } else {
	                System.out.println("Insufficient Balance !!");
	            }
	        }
	        else {
	            System.out.println("Please enter the amount in multipal of 500");
	        }

	    }

	    public void depositAmount(double depositAmount) {
	        ministmt.put(depositAmount," Amount Deposited");
	        System.out.println(depositAmount+" Deposited Successfully !!");
	        ATM.setBalance(ATM.getBalance()+depositAmount);
	        viewBalance();

	    }

	 
	    public void viewMiniStatement() {
	        for(Map.Entry<Double,String> m:ministmt.entrySet()){
	            System.out.println(m.getKey()+""+m.getValue());
	        }

	    }
	}



