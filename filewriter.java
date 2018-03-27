import java.io.*;
class MyFileWriter {
	public static void main(String[] args)throws IOException {
	FileWriter f=new FileWriter("ptrlog.txt");
	f.write("prolog\nAcademy");
	f.write("99");
	f.close();
	}
};
