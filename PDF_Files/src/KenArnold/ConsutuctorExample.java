package KenArnold;

public class ConsutuctorExample {
	
		public void test2() {
			
			System.out.println("Inside Test2");
			}
			public void test1() {
			this.test2();
			System.out.println("Inside Test1");
			}
			public static void main(String[] args) {
				ConsutuctorExample cm = new ConsutuctorExample();
			cm.test1();
			}
}