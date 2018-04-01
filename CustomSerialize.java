import java.io.*;
class Account implements Serializable {
	String name="samar";
	String pwd="samar123";
};

class CustomSerialize {
	public static void main(String[] args)throws Exception {
		
		Account a1=new Account();
		
		FileOutputStream fos=new FileOutputStream("pass.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		
		FileInputStream fis=new FileInputStream("pass.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account)ois.readObject();
		
		System.out.println(a2.name+"  "+a2.pwd);
	}
};