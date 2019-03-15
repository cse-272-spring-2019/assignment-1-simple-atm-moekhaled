package atm;


	public class cardinfo {
	static double cardnumber = 123;
	static double pin=123;
	static double balance=0;
    static String history[]=new String[5];
     static int p=0;
     static int c=0;

public static double geetbalance()
{
	return balance;
}

public static void deposit(double amount)

{
	balance+=amount;
	if(c==5)
	{
		for (int i=0;i<4;i++)
			history[i]=history[i+1];
		c=4;
		
	}
	
	if(p==5)
		p=4;
	
	history[c++]="Deposit: "+amount;
	p++;
}

public static void withdraw(double amount)
{
	if(amount<balance)
		{balance-=amount;
		}
	if(c==5)
	{
		int i;
		for (i=0;i<4;i++)
			{history[i]=history[i+1];}
		c=4;}
		
	
	if(p==5)
		p=4;
	
	history[c]=("Withdraw: "+amount);
	p++;
	c++;
}


public String next()
{
	
	String s=new String();
	if(p<4) {
		p++;
		s=history[p];
		return s;
	}
	
	else 
		return "error";
}

public String pre()
{
	
	String s=new String();
	if(p>0) {
		p--;
		s=history[p];
		return s;}
	else return "error";
	
    }

	
	
	}
