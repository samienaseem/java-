import java.io.*;
import java.net.*;
class newclient 
{
	public static void main(String[] args)throws IOException
	{
		Socket s1=new Socket("127.0.0.1",2000);
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

		OutputStream os=s1.getOutputStream();
		PrintWriter pr=new PrintWriter(os,true);
		System.out.println("connection successful");
		String sm;
		while(true) 
		{
			sm=br1.readLine();
			pr.println(sm);
			pr.flush();
		}
	}
}
