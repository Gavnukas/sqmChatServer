import static org.junit.Assert.*;

import java.io.IOException;
import java.net.Socket;

import org.junit.Test;

import g54ubi.chat.server.*;
import chatClient.*;
public class TestMessages {

	threadForServer newClass = new threadForServer();
	Thread thread = new Thread(newClass);
	
	
	@Test
	public void testLogin() throws IOException, InterruptedException {
		
		thread.start();
		
		assertEquals("OK Welcome to the chat server faggot",new ChatClient().faggot("IDEN faggot"));
		
		//	assertEquals(false, );
	}
	@Test
	public void checkForList() throws IOException {
		
		ChatClient newChat = new ChatClient();
		newChat.faggot("IDEN me");
		//System.out.println(newClass.server.doesUserExist("faggot"));
		assertEquals("ok faggot, me, ", newChat.faggot("LIST"));
		
	}
	@Test
	public void messageWhenNotLoggedIn() throws IOException{
		ChatClient newChat = new ChatClient();
		
		assertEquals("BAD You have not logged in yet",newChat.faggot("LIST"));
		assertEquals("BAD You have not logged in yet",newChat.faggot("HAIL lol"));
	}
	
	class threadForServer implements Runnable {
	volatile Server server ;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			server = new Server(9000);
			System.out.println("hello");
		}
		
	}

}
