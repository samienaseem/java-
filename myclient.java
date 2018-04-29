import java.io.*;
import java.net.*;
class myclient 
{
	public static void main(String[] args) 
	{
		BufferedReader br=null;
		try
		{
			Socket s=new Socket("127.0.0.1",1000);
			System.out.println("connected successfully");
			 br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
		}
		catch (UnknownHostException e)
		{
			System.out.println("not find the ip address");
		}
		catch (IOException e)
		{
			System.out.println("not found the data");
		}
				String rm;
				while (true) {
					try
					{
					if ((rm=br.readLine())!=null)
				{
					System.out.println(rm);
				}
						
					}
					catch (IOException e)
					{
						
					}
		
				
			}
//			br.close();

		
	}
}
