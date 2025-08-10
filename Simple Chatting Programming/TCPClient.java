import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		try{
			Socket socket=new Socket("192.168.43.80",8888);
			DataInputStream inStream=new DataInputStream(socket.getInputStream());
    		DataOutputStream outStream=new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msg;
			
			System.out.println("\n**************USER_2 END****************\n");
			while(true)
			{
				System.out.print("\nYOU : ");
				msg = br.readLine();
				outStream.writeUTF(msg);
      			outStream.flush();
				msg = inStream.readUTF();
      			System.out.println("FRIEND: "+msg);
				if(msg.equals("bye"))
				{
					outStream.writeUTF("bye");
					break;
				}
			}
			inStream.close();
    		outStream.close();
    		socket.close();
  		}
		catch(Exception e)
		{
    		System.out.println(e);
  		}
  	}
}