package KenArnold;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		Practice2 p = new Practice2();
		int total = p.test1(10, 20); //Calling Statement
		System.out.println(total);
		}
		public int test1(int a, int b) { //Called Statement
		System.out.println("Adding");
	
		int c;
		c=a+b;
		return c;
			
		}

	}


