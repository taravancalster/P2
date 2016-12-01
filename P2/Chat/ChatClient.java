import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {
	
	private int port = 1234;
	private JTextField textField = new JTextField(20);
	private JTextArea textArea = new JTextArea();
	private JButton sendBtn = new JButton("Send");
	private JPanel panel = new JPanel();
	private String name = "Tara";
	private ArrayList<String> msgList = new ArrayList<String>();

	public ChatClient(){
		
		setLayout(new BorderLayout());
		
		panel.add(textField);
		panel.add(sendBtn);
		add(textArea,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
			
		setSize(500,500);
		setTitle("Chat");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

//		try {
//			
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
			
	        sendBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	String message = textField.getText();
	            	msgList.add(message);
	            		
	            for (int j = 0; j < msgList.size(); j++){	
	            	
	            	for (int i = 0; i < msgList.size(); i++){
	            		textArea.setText(name + ": " + msgList.get(i) + "\n");
	            	}
	            }}
	        });
	    		
//			
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}		

	
	public static void main(String[] args) {
		new ChatClient();
	}
}