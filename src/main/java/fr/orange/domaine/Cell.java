package fr.orange.domaine;

public class Cell {
	/**
	 * true if cell is alive, false is cell is dead
	 */
	private boolean isAlive;

	/**
	 * 
	 */
	public Cell() {
		super();
	}

	/**
	 * @param isAlive
	 */
	public Cell(boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive
	 *            the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (isAlive != other.isAlive)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cell [isAlive=" + isAlive + "]";
	}

}
