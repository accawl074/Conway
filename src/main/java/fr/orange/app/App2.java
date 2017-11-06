package fr.orange.app;

import fr.orange.domaine.Simulator;
import fr.orange.services.ILoadSimulator;
import fr.orange.services.LoadSimulatorImpl;
import fr.orange.services.PrintTableCellsImpl;
/**
 * App for iteration2
 * @author selfchtali
 *
 */
public class App2 {
	public static void main(String[] args) {
		ILoadSimulator loadSimulator = new LoadSimulatorImpl();
		Simulator simulator = loadSimulator.loadSimulator("src/main/resources/app2.txt");
		simulator.setPrintTableCells(new PrintTableCellsImpl());
		simulator.setConwaySimulator(new iteration2.fr.orange.ConwaySimulatorImpl());
		simulator.simulate();
	}
}
