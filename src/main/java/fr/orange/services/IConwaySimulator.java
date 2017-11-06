package fr.orange.services;

import fr.orange.domaine.Cell;

/**
 * @author saad EL FCHTALI
 *
 */
public interface IConwaySimulator {
	/**
	 * jeux de la vie de conway, Dimension MAX 2
	 * @param dimension
	 * @param cellsIn
	 * @return
	 */
	public Cell[][] conwaySimulation(int dimension, Cell[][] cellsIn);

}
