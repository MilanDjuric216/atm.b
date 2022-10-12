package atm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
	
	@Override
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the account holder name:");
			String customerName = br.readLine();
			
			System.out.print("Enter the account number:");
			long accno=Long.parseLong(br.readLine());
			
			
			System.out.print("Enter the bank name:");
			String bankName=br.readLine();
			
			setAccHolderName(customerName);
			setAccNumber(accno);
	        setBankName(bankName);	
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {

		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		return "Welcome to "+bname.toUpperCase()+" ATM "+" - "+accholdername;
	}
	
  
}
