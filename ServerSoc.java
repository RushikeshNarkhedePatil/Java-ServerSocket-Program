import java.io.*;
import java.net.*;

public class ServerSoc
{
    public static void main(String args[]) throws IOException
     {
        System.out.println("Server is waiting to client");
        ServerSocket ss=new ServerSocket(9001);
        Socket s=ss.accept();
        System.out.println("Connection Established");

        DataInputStream dis=new DataInputStream(s.getInputStream());
        String clientMessage="";
        clientMessage=dis.readUTF();
        System.out.println("client message :"+clientMessage);
        ss.close();
    }
}