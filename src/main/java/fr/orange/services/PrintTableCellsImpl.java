package fr.orange.services;

import fr.orange.constantes.Symbols;
import fr.orange.domaine.Cell;

public class PrintTableCellsImpl implements IPrintTableCells{

	public void printTableCells(Cell[][] tableCell) {
		for (Cell[] lineCells : tableCell) {
			int j = 0;
			for (Cell cell : lineCells) {
				if (j == lineCells.length - 1) {
					if (cell.isAlive()) {
						System.out.println(Symbols.PLUS);
					} else {
						System.out.println(Symbols.MINUS);
					}

				} else {
					if (cell.isAlive()) {
						System.out.print(Symbols.PLUS+" \t");
					} else {
						System.out.print(Symbols.MINUS+" \t");
					}
				}
				j++;
			}
		}
	}

}
