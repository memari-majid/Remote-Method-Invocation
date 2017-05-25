
import java.rmi.*;
import java.rmi.server.*;
import java.util.Random;
import java.util.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {}

    public String Matrix(int N) throws RemoteException {
    	
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        String r = new String();
        r += "A =\n";
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt();
                r += A[i][j] + ",";
            }
            r += "\n";
        }
        r += "\nB =\n";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = rand.nextInt();
                r += B[i][j] + ",";
            }
            r += "\n";
        }

        r += "\nSum =\n";
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                c[i][j] = A[i][j] + B[i][j];
                r += c[i][j] + ",";
            }
            r += "\n";
        }

        return r;

    }
}
