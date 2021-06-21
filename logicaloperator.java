package learningjava;

public class logicaloperator {

	public static void main(String[] args) {
		
		boolean a = 100 >50;
		boolean b = 50<=50;
		boolean c;
		
		int f= 200;
				int g= 20;
		
		
		if ( c = a&&b);
		{
			System.out.println("Answer is" +c);
		}
			
		c= a||b;
		System.out.println("Answer is"+c);
		// TODO Auto-generated method stub

		c= !b;
		
		int d= 10;
		
	int	h =d++;
		System.out.println(f/=g);
		System.out.println(f%=g); // reminder
	System.out.println(++d);   // incerement first and return value
	System.out.println("answer is" +h);  // give the value first than incement
	
	int n;
	for(n=0;n<=10;++n)
		
	{
		
		System.out.println(n);
	}
	}

}
