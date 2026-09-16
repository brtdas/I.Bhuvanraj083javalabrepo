public class Test19t
{
    public static void main(String[] args) 
	{
        Bank b;            // parent reference

        b = new SBI();
        System.out.println("SBI rate: "  + b.getInterestRate()); // 7.0

        b = new HDFC();
        System.out.println("HDFC rate: " + b.getInterestRate()); // 6.5

        // Array of Bank references → different objects
        Bank[] banks = { new SBI(), new HDFC(), new Bank() };
        for (Bank bank : banks)
            System.out.println(bank.getInterestRate()); // 7.0, 6.5, 4.0
    }
}