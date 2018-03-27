import java.io.*;
class duplicate {
	public static void main(String[] args)throws IOException {
	PrintWriter p=new PrintWriter("prolog.txt");
	BufferedReader b1=new BufferedReader(new FileReader("samar.txt"));
	String line1=b1.readLine(); 
	while(line1!=null) {
		boolean flag=false;
		
		BufferedReader b2=new BufferedReader(new FileReader("prolog.txt"));
		String line2=b2.readLine();
		
		while(line2!=null) {
			if(line1.equals(line2)) {
				flag=true;
				break;
			}
			line2=b2.readLine();
		}
		if(!flag) {
		p.println(line1); 
		p.flush();
	
	  }
	  line1=b1.readLine();
	}
	p.close();
	b1.close();
	//b2.close();
	
	}
};