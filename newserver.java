import java.net.*;
import java.io.*;
class newserver 
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket s=new ServerSocket(2000);
		System.out.println("server ready for chating");
		Socket s1=s.accept();

		InputStream os=s1.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(os));

		String rm;
		while(true) {
			if((rm=br.readLine())!=null)
			{
				System.out.println(rm);
			}
		
		}

	}
}
