package iteration1.fr.orange;

import fr.orange.domaine.Cell;
import fr.orange.services.IConwaySimulator;

/**
 * Jeux de la vie Implementation d'iteraton1, Dimenssion Max 2 Pour une
 * dimension inférieure ou égale à deux toutes les cellules meurent
 * 
 * @author saad EL FCHTALI
 *
 */
public class ConwaySimulatorImpl implements IConwaySimulator {

	public Cell[][] conwaySimulation(int dimension, Cell[][] cellsIn) {
		Cell[][] result = new Cell[cellsIn.length][cellsIn[0].length];
			for (int i = 0; i < dimension; i++) {
				for (int j = 0; j < dimension; j++) {
					result[i][j] = new Cell(false);
				}
			}
		return result;
	}

}
