import java.io.*;
import java.net.*;
import java.util.*;

public class receiver {
	public static void main(String args[])
	{
    		System.out.println("\n************SERVER END*************\n");
        
		try
        	{         
        		ServerSocket srverskt;
            		srverskt = new ServerSocket(8000);
            		Socket sckt = srverskt.accept();

        		DataInputStream dis = new DataInputStream(sckt.getInputStream());
        		Integer no_frame =dis.read();

        		for(int i=0; i<no_frame; i++)
        		{
            			ServerSocket frm_srverskt;
            			frm_srverskt = new ServerSocket(9000+i);
            			Socket frm_sckt = frm_srverskt.accept();

        			DataInputStream frm_dis = new DataInputStream(frm_sckt.getInputStream());
        			String msg = frm_dis.readUTF();
            			System.out.println("\nRECEIVED FRAME :: "+msg);
            			System.out.println("FRAME "+ i +" RECEIVED");

        			DataOutputStream frm_dos = new DataOutputStream(frm_sckt.getOutputStream());

        			frm_dos.write(i);
         			System.out.println("ACK SEND FOR FRAME "+ i); 
        		}
        	}
        	catch(Exception ex)
        	{
         		System.out.println("Error"+ex);
                }
	}
}