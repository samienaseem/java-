import java.io.*;
class repeatfile {
	public static void main(String[] args)throws IOException {
	PrintWriter p=new PrintWriter("file5.txt");
	
	BufferedReader b1=new BufferedReader(new FileReader("ptrlog.txt"));
	//BufferedReader b2=new BufferedReader(new FileReader("samar.txt"));
	
	String line1=b1.readLine();
//	String line2=b2.readLine();
	
	while(line1!=null) {
		
		BufferedReader b2=new BufferedReader(new FileReader("samar.txt"));
		String line2=b2.readLine();
		
		while(line2!=null) {
			if(line1.equals(line2)) {
				p.println(line1);
				line2=b2.readLine();
			}
			else if(! line1.equals(line2)) {
				p.println(line2);
				line2=b2.readLine();
		}
		}
		line1=b1.readLine();
	}
		//p.println(line1);
		
	}
	p.flush();
	p.close();
	}
};