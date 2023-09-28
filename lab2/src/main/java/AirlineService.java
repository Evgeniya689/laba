import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface AirlineService extends Remote {
    List<Aircraft> getAircrafts() throws RemoteException;
    void addAircraft(Aircraft aircraft) throws RemoteException;
    int getTotalCapacity() throws RemoteException;
    int getTotalCarryingCapacity() throws RemoteException;
}
