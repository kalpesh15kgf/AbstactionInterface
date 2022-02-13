interface tea{
	abstract public void suger();
}
interface coffee{
	void plan();
}
 class P1st implements tea,coffee
 {
	 public void suger()
	 {
		 System.out.println("Your Suger Free Tea");
	 }
	 public void plan()
	 {
		 System.out.println("Your Cold Coffee");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1st k = new P1st();
		k.suger();
		k.plan();

	}

}
