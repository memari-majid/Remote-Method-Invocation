
import java.net.*;
import java.rmi.*;

public class Server {
 	public static void main(String args[]) {
 		try {
	 		ServerImpl ServerImpl = new ServerImpl();
	 		Naming.rebind("Server", ServerImpl);
	 		System.out.println("Server is waiting ...\n");
	 		System.out.println("Please run the Client in another termianl\n");
	 		System.out.println("The first argument is localhost(127.0.0.1)\n");
	 		System.out.println("The second argument is the size of matrices\n");
 		}
 		catch(Exception e) {
 			System.out.println("Exception: " + e);
 		}
 	}
}

