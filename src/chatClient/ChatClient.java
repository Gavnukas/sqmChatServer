package chatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Handler;

public class ChatClient {
	 private ClientListener cl ;
	 PrintWriter out;
	 BufferedReader in;
	public  ChatClient(){
		final String host = "localhost";
		final int portNumber = 9000;
		
		try {
		    Socket echoSocket = new Socket(host, portNumber);
		     out =
		        new PrintWriter(echoSocket.getOutputStream(), true);
		    in =
		        new BufferedReader(
		            new InputStreamReader(echoSocket.getInputStream()));
		    BufferedReader stdIn =
		        new BufferedReader(
		            new InputStreamReader(System.in));
		    String userInput=null;
		   
		   
		    
		    	//cl = new ClientListener( in);
		    	//Thread thread = new Thread(cl);
		    //	thread.start();
		    
		    System.out.println(in.readLine());
		    
		    	
		    //	 while ((userInput = stdIn.readLine()) != null) {
		    		 
		    		 	
		    	//	 		 out.println(userInput);
		    		 	
		    		 	
					   
		    		 	
					  
					 
					    
					
				
						
		    //}
		    
			
}catch(Exception e){
	
}
		
	}
public String faggot (String message ) throws IOException{
	out.println(message);
	return in.readLine().toString();
}
	
	public static void main(String args[]) {
		new ChatClient();
			
			
		
			
		}
	}

	
	


