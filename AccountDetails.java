import java.util.*;
class AD
{
    private String customerID;
    private int accountNumber;
    private double initBalance;
    void setInitBalance(double initBalance){this.initBalance=initBalance;}
    double getInitBalance(){return initBalance;}
    void readAccountDetails()
    {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            try {
                System.out.println("Enter CustomerId:");
                customerID = s.next();
                if (!(Character.isLetter(customerID.charAt(0)) && Character.isDigit(customerID.charAt(1)) && Character.isDigit(customerID.charAt(2))
 && Character.isDigit(customerID.charAt(3))))
        throw new Exception("Customer ID must start with a letter and should be followed by three digits");
            }
            catch(Exception e) {
                System.out.println(e);continue;}
            try {
                System.out.println("Enter accountNumber:");
                accountNumber = s.nextInt();
                if (String.valueOf(accountNumber).length() != 5)
                    throw new Exception("Account no must be of five digits");
            }
            catch(Exception e) {
                System.out.println(e);
                continue;}
            try{
                System.out.println("Enter InitialBalance:");
                initBalance=s.nextDouble();
                setInitBalance(initBalance);
                if (initBalance <= 1000)
                    throw new Exception("Initial balance must be above $1000");
                break;
            }
            catch(Exception e) {System.out.println(e);}
        }

    }
    void deposit()
    {
        Scanner s = new Scanner(System.in);
        double amount;
        while(true) {
            try {
                System.out.println("ENTER AMOUNT TO DEPOSIT ");
                amount = s.nextDouble();
                if (getInitBalance() + amount > 5000)
                    throw new InvalidAmount('D', amount);
                else {
                    setInitBalance(initBalance += amount);
                    System.out.println("Yes,your amount is deposited ,current balance : " + getInitBalance());
                    break;
                }
            } catch (InvalidAmount i) {
                System.out.println(i);
            }
        }

    }
    void withdraw()
    {Scanner s = new Scanner(System.in);
        double withdrawAmount;
        while(true) {
            try{
                System.out.println("ENTER AMOUNT TO WITHDRAW ");
                withdrawAmount= s.nextDouble();
                if (getInitBalance() - withdrawAmount < 1000)
                    throw new InvalidAmount('W', withdrawAmount);
                else {
                    setInitBalance(initBalance -= withdrawAmount);
                    System.out.println("Yes,your amount is " + withdrawAmount + " ,current balance : " + getInitBalance());
                }
                break;
              }
            catch (InvalidAmount i) {
                System.out.println(i);
            }
        }
    }

    void displayAccountDetails()
    {
        System.out.println("     ACCOUNT_DETAILS  ");
        System.out.println("CUSTOMER ID  :"+customerID+"\nACCOUNT_NUMBER  :"+accountNumber+"\nINITIAL BALANCE  :"+initBalance);

    }

}
class InvalidAmount extends Exception
{
    char transactionType;
    double amount;
    InvalidAmount(char ttype,double amount)
    {
        this.transactionType=ttype;
        this.amount=amount;
    }
    public String toString()
    {
        if(transactionType=='D')
             return "Sorry,account balance is more than 5000,you cannot deposit "+amount;
        if(transactionType=='W')
             return "Sorry,account balance is less than "+amount+" you cannot withdraw "+amount;
        return "1";
    }
}
public class AccountDetails
{
    public static void main(String[] args)
    {
        AD ad= new AD();
        ad.readAccountDetails();
        ad.displayAccountDetails();
        ad.deposit();
        ad.withdraw();
    }}

