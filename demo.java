import java.io.*;
class demo {
	public static void main(String[] args) throws IOException {
		File f=new File("demo.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}
};