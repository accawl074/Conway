package fr.orange.app;

import fr.orange.domaine.Simulator;
import fr.orange.services.ILoadSimulator;
import fr.orange.services.LoadSimulatorImpl;
import fr.orange.services.PrintTableCellsImpl;
/**
 * @author selfchtali
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		ILoadSimulator loadSimulator = new LoadSimulatorImpl();
		Simulator simulator = loadSimulator.loadSimulator("src/main/resources/demo.txt");
		simulator.setPrintTableCells(new PrintTableCellsImpl());
		simulator.setConwaySimulator(new iteration3.fr.orange.ConwaySimulatorImpl());
		simulator.simulate();
	}
}
