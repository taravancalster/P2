//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.InetAddress;
//import java.net.Socket;
//import java.net.UnknownHostException;
//import java.util.Scanner;
//
//public class Client {
//
//	public Client() {
//		int port = 1234;
//		
//		try {
//			Socket socket = new Socket (InetAddress.getByName("127.0.0.1"), port);
//			
//			Scanner in = new Scanner (socket.getInputStream());
//			PrintWriter out = new PrintWriter (socket.getOutputStream());
//			
//			out.println("Hallo Server!");
//			out.flush();
//			
//			System.out.println(in.nextLine());
//			
//			in.close();
//			out.close();
//			socket.close();
//			
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		new Client();
//	}
//}
