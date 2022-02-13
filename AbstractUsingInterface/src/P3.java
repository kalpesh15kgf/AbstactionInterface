interface P1{
	abstract public void test();
}

interface P2{
	void key();
}

 class P3 implements P1,P2
 {
	public void test()
	{
		System.out.println("kalpesh");
	}
	public void key()
	{
		System.out.println("Jadhav");
	}

	public static void main(String[] args) {
		P3 k=new P3();
		k.key();
		k.test();
		
	}
	}
