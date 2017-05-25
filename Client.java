
import java.rmi.*;


public class Client {

    public static void main(String args[]) {
        try {
        		
            String ServerURL = "rmi://" + args[0] + "/Server";
            ServerIntf ServerIntf = (ServerIntf) Naming.lookup(ServerURL);
            
            System.out.println("Dimension of Matrix: " + args[1]);
            int N = Integer.valueOf(args[1]);
            System.out.println(ServerIntf.Matrix(N));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
