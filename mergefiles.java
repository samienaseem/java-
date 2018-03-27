import java.io.*;
class mergefiles {
	public static void main( String[] args)throws IOException {
		PrintWriter p=new PrintWriter("file2.txt");
		BufferedReader br=new BufferedReader(new FileReader("ptrlog.txt"));
		String line= br.readLine();
		while(line!=null) {
			p.println(line);
			line=br.readLine();
		}
		
		br=new BufferedReader(new FileReader("samar.txt"));
		line=br.readLine();
		while(line!=null) {
			p.println(line);
			line=br.readLine();
		}
		p.flush();
		
		br.close();
		p.close();
		
		System.out.println("file merged succesfull");
	}
};