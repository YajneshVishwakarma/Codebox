class Account {
    private int account_No;
    private String account_Name;
    private double balance;
    private String bank_Name;
    private String bank_location;

    public void setAccount_No(int account_No)
    {
        this.account_No = account_No;
    }

    public void setAccount_Name(String account_Name)
    {
        this.account_Name = account_Name;
    }

    public  void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setBank_Name(String bank_Name)
    {
        this.bank_Name = bank_Name;
    }

    public void setBank_location(String bank_location)
    {
        this.bank_location = bank_location;
    }

    public int getAccount_No()
    {
        return  account_No;
    }

    public String getAccount_Name()
    {
        return account_Name;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getBank_Name()
    {
        return bank_Name;
    }

    public String getBank_location()
    {
        return bank_location;
    }

    public String toString()
    {
        return "Account number : "+this.getAccount_No()+"\nAccount name : "+this.getAccount_Name()+"\nAccount balance : "+this.getBalance()+"\nBank name : "+this.getBank_Name()+"\nBank location : "+this.getBank_location();
    }
}

public class Account_Driver {
    public static void main(String[] args) {
        Acc_ a = new Acc_();

        a.setAccount_Name("Vishesh");
        a.setAccount_No(444);
        a.setBalance(1000.00);
        a.setBank_location("Moodubidre");
        a.setBank_Name("Swiss bank");


    }
}

