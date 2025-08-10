import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) throws Exception 
	{
    	try
		{
      		ServerSocket server=new ServerSocket(8888);
      		Socket serverClient=server.accept();
      		DataInputStream inStream=new DataInputStream(serverClient.getInputStream());
      		DataOutputStream outStream=new DataOutputStream(serverClient.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msg;
				
			System.out.println("\n**************USER_1 END****************\n");
			while(true)
			{
				msg = inStream.readUTF();
        		System.out.println("FRIEND: "+msg);
				if(msg.equals("bye"))
				{
					outStream.writeUTF("bye");
					outStream.flush();
					break;
				}
				System.out.print("\nYOU : ");
				msg = br.readLine();
				outStream.writeUTF(msg);
				outStream.flush();
      		}
      		inStream.close();
      		outStream.close();
      		serverClient.close();
      		server.close();
		}
		catch(Exception e)
		{
      		System.out.println(e);
    	}
  	}
}