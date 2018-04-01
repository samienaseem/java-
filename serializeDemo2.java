import java.io.*;
class fog implements Serializable {
	cat c1=new cat();
};
class cat implements Serializable {
	rat r1=new rat();	
};
class rat implements Serializable {
	int i=10;
};
class serializeDemo2 {
	
	public static void main(String[] args )throws Exception {
		fog d1=new fog();
		
		FileOutputStream fos=new FileOutputStream("abd.ser");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(d1);
	    
	    
	    FileInputStream fis=new FileInputStream("abd.ser");
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    fog d2=(fog)ois.readObject();
	    
	    System.out.println(d2.c1.r1.i);
	}
};