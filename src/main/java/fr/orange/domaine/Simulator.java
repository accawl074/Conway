package fr.orange.domaine;

import fr.orange.services.IConwaySimulator;
import fr.orange.services.IPrintTableCells;
/**
 * @author selfchtali
 *
 */
public class Simulator {
	private int dimension;
	private int nbrEvolutions;
	private Cell[][] cells;
	
	private IConwaySimulator conwaySimulator;
	private IPrintTableCells printTableCells;
	
	public Simulator() {
		super();
	}


	/**
	 * @param dimension
	 * @param nbrEvolutions
	 * @param cells
	 */
	public Simulator(int dimension, int nbrEvolutions, Cell[][] cells) {
		super();
		this.dimension = dimension;
		this.nbrEvolutions = nbrEvolutions;
		this.cells = cells;
	}
	
	public void simulate() {
		Cell[][] dataIn = this.getCells();
		System.out.println("\n Données d'entrées, Dimension :"+this.getDimension()+"x"+this.getDimension());
		printTableCells.printTableCells(dataIn);
		for(int i = 1; i <= this.getNbrEvolutions(); i++) {
			System.out.println("Evolution n° "+i);
			printTableCells.printTableCells(conwaySimulator.conwaySimulation(this.getDimension(), dataIn));
			dataIn = conwaySimulator.conwaySimulation(this.getDimension(), dataIn);
		}
	}


	/**
	 * @return the dimension
	 */
	public int getDimension() {
		return dimension;
	}


	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	/**
	 * @return the nbrEvolutions
	 */
	public int getNbrEvolutions() {
		return nbrEvolutions;
	}


	/**
	 * @param nbrEvolutions the nbrEvolutions to set
	 */
	public void setNbrEvolutions(int nbrEvolutions) {
		this.nbrEvolutions = nbrEvolutions;
	}


	/**
	 * @return the cells
	 */
	public Cell[][] getCells() {
		return cells;
	}


	/**
	 * @param cells the cells to set
	 */
	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}


	/**
	 * @return the conwaySimulator
	 */
	public IConwaySimulator getConwaySimulator() {
		return conwaySimulator;
	}


	/**
	 * @param conwaySimulator the conwaySimulator to set
	 */
	public void setConwaySimulator(IConwaySimulator conwaySimulator) {
		this.conwaySimulator = conwaySimulator;
	}


	/**
	 * @return the printTableCells
	 */
	public IPrintTableCells getPrintTableCells() {
		return printTableCells;
	}


	/**
	 * @param printTableCells the printTableCells to set
	 */
	public void setPrintTableCells(IPrintTableCells printTableCells) {
		this.printTableCells = printTableCells;
	}
	
}
