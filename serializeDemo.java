import java.io.*;
class emp implements Serializable {
	int i=10;
	transient int j=20;
	
};
class serializeDemo{
	public static void main(String[] args)throws Exception {
		
		emp e1=new emp();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		emp e2=(emp)ois.readObject();
		
		System.out.println(e2.i+"   "+e2.j);
		
	}
};