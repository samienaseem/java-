import java.io.*;
class listmerge {
	public static void main(String[] args)throws IOException {
		PrintWriter p=new PrintWriter("file4.txt");
	File f=new File("Desktop");
	String[] s1=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		BufferedReader b=new BufferedReader(new FileReader(f1));
		
		String line=b.readLine();
		while(line!=null) {
			p.println(line);
			line=b.readLine();
		}
			}
			p.flsuh();
		p.close();

	}
};
