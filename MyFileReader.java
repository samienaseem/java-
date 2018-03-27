import java.io.*;
class MyFileReader {
	public static void main(String[] args)throws IOException {
	FileReader fr=new FileReader("ptrlog.txt");
	int i=fr.read(); 
	while(i!=-1) { 
	System.out.print((char)i); 
	i=fr.read(); 
	} 
	fr.close();

	
	}
};
