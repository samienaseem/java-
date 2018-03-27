import java.io.*;
class demo1 {
	public static void main(String[] args)throws IOException {
		File f=new File("prolog");
		f.mkdir();
		File f1=new File("prolog","samar.txt");
		f1.createNewFile();
		System.out.println(f.exists());
	}
};