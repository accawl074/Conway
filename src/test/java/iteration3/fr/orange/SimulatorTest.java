package iteration3.fr.orange;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.orange.domaine.Cell;
import fr.orange.domaine.Simulator;
import fr.orange.services.IConwaySimulator;
import fr.orange.services.ILoadSimulator;
import fr.orange.services.LoadSimulatorImpl;

/**
 * Test jeux de la vie ( conway ) Iteration 3 
 * 
 * @author saad EL FCHTALI
 *
 */
public class SimulatorTest {

	private IConwaySimulator conwaySimulator;

	private ILoadSimulator loadSimulator;

	@Before
	public void setUp() throws Exception {
		conwaySimulator = new ConwaySimulatorImpl();
		loadSimulator = new LoadSimulatorImpl();
	}

	@Test
	public void testConwaySimulator1x1() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim1.txt");
		assertFalse(conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells())[0][0].isAlive());
	}

	@Test
	public void testConwaySimulator2x2v1() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim2-v1.txt");
		for (int i = 0; i < simulator.getDimension(); i++) {
			for (int j = 0; j < simulator.getDimension(); j++)
				assertFalse(conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells())[i][j]
						.isAlive());
		}
	}

	@Test
	public void testConwaySimulator2x2v2() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim2-v2.txt");
		for (int i = 0; i < simulator.getDimension(); i++) {
			for (int j = 0; j < simulator.getDimension(); j++)
				assertFalse(conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells())[i][j]
						.isAlive());
		}
	}

	@Test
	public void testConwaySimulator3x3v1() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim3-v1.txt");
		Cell[][] CellsResult = { { new Cell(false), new Cell(true), new Cell(false) },
				{ new Cell(false), new Cell(true), new Cell(false) },
				{ new Cell(false), new Cell(true), new Cell(false) } };
		Cell[][] conwayResult = conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells());
		for (int i = 0; i < simulator.getDimension(); i++) {
			for (int j = 0; j < simulator.getDimension(); j++)
				assertTrue(CellsResult[i][j].equals(conwayResult[i][j]));
		}
		System.out.println("------------");
	}

	@Test
	public void testConwaySimulator3x3v2() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim3-v2.txt");
		Cell[][] CellsResult = { { new Cell(true), new Cell(false), new Cell(true) },
				{ new Cell(false), new Cell(false), new Cell(true) },
				{ new Cell(true), new Cell(true), new Cell(true) } };
		Cell[][] conwayResult = conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells());
		for (int i = 0; i < simulator.getDimension(); i++) {
			for (int j = 0; j < simulator.getDimension(); j++)
				assertTrue(CellsResult[i][j].equals(conwayResult[i][j]));
		}
		System.out.println("------------");
	}
	
	// { { false,true,true,false,false }, { false,true,true,false,true },
	//{ false,false,false,false,true }, { false,false,false,false,false },
//	{ false,false,true,false,true } };
	@Test
	public void testConwaySimulator5x5() {
		Simulator simulator = loadSimulator.loadSimulator("src/test/resources/iteration3/input-dim5.txt");
		Cell[][] CellsResult = { { new Cell(false), new Cell(true), new Cell(true), new Cell(false), new Cell(false)},
				{ new Cell(false), new Cell(true), new Cell(true), new Cell(false), new Cell(true)},
				{ new Cell(false), new Cell(false), new Cell(false), new Cell(false), new Cell(true)},
				{ new Cell(false), new Cell(false), new Cell(false), new Cell(false), new Cell(false)},
				{ new Cell(false), new Cell(false), new Cell(true), new Cell(false), new Cell(true)}};
		Cell[][] conwayResult = conwaySimulator.conwaySimulation(simulator.getDimension(), simulator.getCells());
		for (int i = 0; i < simulator.getDimension(); i++) {
			for (int j = 0; j < simulator.getDimension(); j++)
				assertTrue(CellsResult[i][j].equals(conwayResult[i][j]));
		}
	}
}
