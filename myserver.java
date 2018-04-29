import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;
class myserver 
{
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket sc=new ServerSocket(1000);
			System.out.println("WAITING FOR REQUEST");
			Socket s=sc.accept();
			System.out.println("connection successful");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw=new PrintWriter(s.getOutputStream());
			System.out.println("input to server");
			//String sm;
			while (true)
			{
				pw.print(br.readLine());
				pw.flush();
			}
		}
		catch (Exception e)
		{
			System.out.println("Not found data for socket" +e);

		}
			}
}
