
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public EchoServer(){
		int port = 12345;
		
		try {

			ServerSocket server = new ServerSocket(port);

			Socket socket = server.accept();
			
			Scanner in = new Scanner (socket.getInputStream());
			PrintWriter out = new PrintWriter (socket.getOutputStream());
			
			String varName = in.nextLine() ;	
			String varMsg = in.nextLine() ;
			
			if (varName.equals("QUIT") || varMsg.equals("QUIT")){
				System.out.println(varName);
				System.out.println(varMsg);
				out.println("Looooser");
				out.flush();
				
				in.close();
				out.close();
				socket.close();
				server.close();
			}
			
			else {
				
				System.out.println(varName);
				out.println("Erfolgreich Name");
				if (out.checkError()){
					System.err.println("ohoh");
					
				}
				System.out.println(varMsg);
				out.println("Erfolgreich Nachricht");
				out.flush();	
				
				
			}
				
			in.close();
			out.close();
			socket.close();
			server.close();

			
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
	
}
