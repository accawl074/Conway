package fr.orange.app;

import fr.orange.domaine.Simulator;
import fr.orange.services.ILoadSimulator;
import fr.orange.services.LoadSimulatorImpl;
import fr.orange.services.PrintTableCellsImpl;
/**
 * App for iteration 3
 * @author selfchtali
 *
 */
public class App3 {
	public static void main(String[] args) {
		ILoadSimulator loadSimulator = new LoadSimulatorImpl();
		Simulator simulator = loadSimulator.loadSimulator("src/main/resources/app3.txt");
		simulator.setPrintTableCells(new PrintTableCellsImpl());
		simulator.setConwaySimulator(new iteration3.fr.orange.ConwaySimulatorImpl());
		simulator.simulate();
	}
}
