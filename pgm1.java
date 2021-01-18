class superclass
{
	
	public static void display()
	{
		System.out.println("display() of superclass");
	
		

	}
}
class subclass extends superclass
{
	
	
	public  static void view()
	{
		System.out.println("view() of subclass");
		

	}
}
class mainclass
{
	public static void main(String[] args)
	 {
		subclass ref=new subclass();
		ref.view();
		ref.display();
System.out.println("......------------------");
		
	}
}