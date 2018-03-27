import java.io.*;
class alternatemerge {
	public static void main(String[] args)throws IOException {
	PrintWriter p=new PrintWriter("file3.txt");
	BufferedReader b1=new BufferedReader(new FileReader("ptrlog.txt"));
	BufferedReader b2=new BufferedReader(new FileReader("samar.txt"));
	
	String line1=b1.readLine();
	String line2=b2.readLine();
	
	while(line1!=null||line2!=null) {
		p.println(line1);
		p.println(line2);
		line1=b1.readLine();
		line2=b2.readLine();
	}
	p.flush();
	b1.close();
	b2.close();
	p.close();
	
	System.out.println(" file has been alternatively merged to file3");
	}
};