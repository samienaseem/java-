class dadaji
{
	int a=10;
}
class papaji extends dadaji
{
	int a=20;
}
class betaji extends papaji
{
	int a=30;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	public Static void main(String[] args)
	{
		betaji b=new betaji();
		b.show();
	}
	
}