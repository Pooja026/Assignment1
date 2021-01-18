class whatsapp1 
{
	String str="avinash is a good boy";
  public void sendmsg()
  {
  	System.out.println("sendmsg()");
  }
}
class whatsapp2 extends whatsapp1
{
	public void sendvoicemsg()
	{
		System.out.println("sendvoicemsg() ....");
	}
}
class whatsapp3 extends whatsapp2
{
	public void sendvideomsg()
	{
		System.out.println("senvidemsg()");

	}
}
class mainclass1
{
	public static void main(String[] args) 
	{
	whatsapp1 ref = new  whatsapp1();
	ref.sendmsg();
	System.out.println("------------");
	System.out.println(ref.str);
	
	
	whatsapp2 ref1=new whatsapp2();
	ref1.sendvoicemsg();
	ref.sendmsg();
	System.out.println("----------------");
	whatsapp3 ref2=new whatsapp3();
	ref2.sendvideomsg();
		ref1.sendvoicemsg();
	ref.sendmsg();


}
}