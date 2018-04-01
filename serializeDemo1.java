import java.io.*;
class dog implements Serializable {
	int i=10;
};
class cat implements Serializable {
	int j=20;
};
class rat implements Serializable {
	int m=50;
};
class serializeDemo1 {
	public static void main(String[] args)throws Exception {
		dog d1=new dog();
		cat c1=new cat();
		rat r1=new rat();
		
		FileOutputStream fos=new FileOutputStream("Abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		
		FileInputStream fis=new FileInputStream("Abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		dog d2=(dog)ois.readObject();
		cat c2=(cat)ois.readObject();
		rat r2=(rat)ois.readObject();
		
		System.out.println(d2.i);
		System.out.println(c2.j);
		System.out.println(r2.m);
	}
};