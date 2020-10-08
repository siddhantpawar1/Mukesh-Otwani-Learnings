package KenArnold;

public class Fibonaccidividedby2 {
	
	static final int Max_index = 9;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 1;
		int i;

		String mark;
		System.out.println("1: "+ x);
		for(i=2;i<=Max_index;i++); {
		if(y%2==0)
			mark="*";
		else
			mark="";
		System.out.println(i + ":" +x + mark);
		y=x+y;
		x=y-x;
		
		}
	}

}
