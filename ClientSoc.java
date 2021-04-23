import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ClientSoc 
 {
    public static void main(String args[])throws UnknownHostException, IOException
     {
        System.out.println("Client has Started");
        Socket s=new Socket("localhost",9001);
        
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Message :");
        String mag=sc.nextLine();
        dout.writeUTF(mag);
        s.close();
    }    
}
