package barber.simulator;

import java.util.Observable;

/**
 * Created by Mumrik on 2017-02-27.
 */
public class SimulatorState extends Observable {

    boolean simulating;
    
    public void breakSimulation() {
    	simulating = false;
    }
}
