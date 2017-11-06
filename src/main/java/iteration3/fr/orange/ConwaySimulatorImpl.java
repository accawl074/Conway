package iteration3.fr.orange;

import fr.orange.domaine.Cell;
import fr.orange.services.IConwaySimulator;
/**
 * Iteration 3, la régle :
 * - Une cellule morte possédant exactement trois voisines vivantes devient vivante (elle naît).
 * - Une cellule vivante possédant deux ou trois voisines vivantes le reste, sinon elle meurt.
 * @author selfchtali
 *
 */
public class ConwaySimulatorImpl implements IConwaySimulator {

	public Cell[][] conwaySimulation(int dimension, Cell[][] cellsIn) {
		Cell[][] result = new Cell[dimension][dimension];
		if (dimension > 0 && dimension <= 2) {
			for (int i = 0; i < dimension; i++) {
				for (int j = 0; j < dimension; j++) {
					result[i][j] = new Cell(false);
				}
			}
		} else {

			for (int i = 0; i < dimension; i++) {
				for (int j = 0; j < dimension; j++) {
					if (cellsIn[i][j].isAlive()) {
						if (checkIfNNeighborsAlive(i, j, dimension, 2, cellsIn)
								|| checkIfNNeighborsAlive(i, j, dimension, 3, cellsIn)) {
							result[i][j] = new Cell(true);
						} else {
							result[i][j] = new Cell(false);
						}

					} else {
						if (checkIfNNeighborsAlive(i, j, dimension, 3, cellsIn)) {
							result[i][j] = new Cell(true);
						} else {
							result[i][j] = new Cell(false);
						}
					}
				}
			}
		}
		return result;
	}
	
	
	/**
	 * 
	 * @param i
	 * @param j
	 * @param dimension
	 * @param n
	 * @param dataIn
	 * @return
	 */
	private boolean checkIfNNeighborsAlive(int i, int j, int dimension, int n, Cell[][] dataIn) {
		Cell[] neighbors = getNeighborsCells(i, j, dimension, dataIn);
		int counter = 0;
		for (int k = 0; k < 8; k++) {
			if (neighbors[k].isAlive()) {
				counter++;
			}
		}

		return (counter == n);
	}
	
	/**
	 * return list of Neighbors cells for one cell 
	 * 
	 * @param i
	 * @param j
	 * @param n
	 * @param cellsIn
	 * @return
	 */
	private static Cell[] getNeighborsCells(int i, int j, int n, Cell[][] cellsIn) {
		Cell[] neighbors = new Cell[8];
		if (i >= 1 && j >= 1) {
			neighbors[0] = cellsIn[i - 1][j - 1];
		} else {
			neighbors[0] = new Cell(false);
		}

		if (i >= 1) {
			neighbors[1] = cellsIn[i - 1][j];
			if (j < n - 1) {
				neighbors[2] = cellsIn[i - 1][j + 1];
				neighbors[3] = cellsIn[i][j + 1];
			} else {
				neighbors[2] =  new Cell(false);
				neighbors[3] =  new Cell(false);
			}
		} else {
			neighbors[1] = new Cell(false);
			neighbors[2] = new Cell(false);
			if (j < n - 1) {
				neighbors[3] = cellsIn[i][j + 1];
			} else {
				neighbors[3] = new Cell(false);
			}
		}

		if (j >= 1) {
			neighbors[4] = cellsIn[i][j - 1];
			if (i < n - 1) {
				neighbors[5] = cellsIn[i + 1][j - 1];
				neighbors[6] = cellsIn[i + 1][j];
			} else {
				neighbors[5] = new Cell(false);
				neighbors[6] = new Cell(false);
			}
		} else {
			neighbors[4] = new Cell(false);
			neighbors[5] = new Cell(false);
			if (i < n - 1) {
				neighbors[6] = cellsIn[i + 1][j];
			} else {
				neighbors[6] = new Cell(false);
			}
		}

		if (i < n - 1 && j < n - 1) {
			neighbors[7] = cellsIn[i + 1][j + 1];
		} else {
			neighbors[7] = new Cell(false);
		}

		return neighbors;
	}
}
