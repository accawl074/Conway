package fr.orange.services;

import fr.orange.domaine.Cell;
/**
 * Affiche table des cellule, cellule morte présenté pr : - et cellule vivante présenté par : +
 * @author selfchtali
 *
 */
public interface IPrintTableCells {
	
	public void printTableCells(Cell[][] tableCell);
}
