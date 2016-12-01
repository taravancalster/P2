
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	public EchoClient(){
	int port = 12345;
	String name = "Ellyn";
	String msg = "Hej Tara!! What uuuuppp??!!";
	
	try {
		Socket socket = new Socket (InetAddress.getByName("141.22.51.50"), port);
		
		Scanner in = new Scanner (socket.getInputStream());
		PrintWriter out = new PrintWriter (socket.getOutputStream());
		
//		out.println(name);
//		out.flush();
//		
//		out.println(msg);
//		out.flush();
//		
//		System.out.println(in.nextLine());
//		System.out.println(in.nextLine());
		
		out.println(msg);
		out.flush();
		
		out.println("QUIT");
		out.flush();
		
		System.out.println(in.nextLine());
		System.out.println(in.nextLine());

		in.close();
		out.close();
		socket.close();
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	
	public static void main(String[] args) {
		new EchoClient();
	}

}
