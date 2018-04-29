import java.io.*;
class cat implements Serializable
{
	int i=10;
}
class dog extends cat 
{
	int j=20;
}

class serializedemo5
{
	public static void main(String []args)throws Exception
	{
		dog d1=new dog();
		System.out.println(d1.i+"     "+d1.j);
		FileOutputStream fos=new FileOutputStream("samar.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis=new FileInputStream("samar.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		dog d2=(dog)ois.readObject();

		System.out.println(d2.i+"   "+d2.j);
	}
}
