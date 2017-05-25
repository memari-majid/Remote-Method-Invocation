
import java.rmi.*;

	public interface ServerIntf extends Remote {
		String Matrix(int N) throws RemoteException;
}
