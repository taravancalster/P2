
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public Server(){
		int port = 12345;
		
		try {

			ServerSocket server = new ServerSocket(port);

			Socket socket = server.accept();
			
			Scanner in = new Scanner (socket.getInputStream());
			PrintWriter out = new PrintWriter (socket.getOutputStream());
			
			System.out.println(in.nextLine());
			out.println("Willkommen lieber Client!");
			out.flush();
			
			
			in.close();
			out.close();
			socket.close();
			server.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
	
}
