import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class AirlineServiceImpl extends UnicastRemoteObject implements AirlineService {
    private Airline airline;

    public AirlineServiceImpl(Airline airline) throws RemoteException {
        this.airline = airline;
    }

    @Override
    public List<Aircraft> getAircrafts() throws RemoteException {
        return airline.getFleet();
    }

    @Override
    public void addAircraft(Aircraft aircraft) throws RemoteException {
        airline.addAircraft(aircraft);
    }

    @Override
    public int getTotalCapacity() throws RemoteException {
        return airline.getTotalCapacity();
    }

    @Override
    public int getTotalCarryingCapacity() throws RemoteException {
        return airline.getTotalCarryingCapacity();
    }
}
