import java.io.*;
class grandparent {
	int i=10;
	grandparent() {
		System.out.println("no arguement constructor called");
		
	}
};
class parent extends grandparent implements Serializable  {
	int j=20;
	parent() {
		System.out.println("no arguement constructor of parent class called");
	}
};
class son extends parent implements Serializable
{
	int k=30;
	son() {
		System.out.println("son class constructor called");
	}
}
class serializedemo6
{
	public static void main(String[] args)throws Exception
	son s1=new son();
	s1.i=99;
	s1.j=100;
	s1.j=300;
	System.out.println(s1.i+"    "+s1.j+"     "+s1.k);
	FileOutputStream fos=new FileOutputStream("samar.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
    System.out.println("de-seriliazation started");

	FileInputStream fis=new FileInputStream("samar.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	son s2=(son)ois.readObject();


	System.out.println(s2.i+"     "+s2.j+"    "+s2.k);



}