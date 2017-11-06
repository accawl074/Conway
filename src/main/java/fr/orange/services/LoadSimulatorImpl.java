package fr.orange.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.orange.constantes.Symbols;
import fr.orange.domaine.Cell;
import fr.orange.domaine.Simulator;

public class LoadSimulatorImpl implements ILoadSimulator{

	public Simulator loadSimulator(String path) {
		Scanner scanner = null;
		int dimension;
		int nbrEvol;
		Cell[][] cells = null;
		
		try {
			scanner = new Scanner(new File(path));
			dimension = Integer.parseInt(scanner.nextLine());
			nbrEvol = Integer.parseInt(scanner.nextLine());
			String cellsLine = scanner.nextLine();
			cells = transformLineToCells(cellsLine, dimension);
			
			
		}catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return new Simulator(dimension, nbrEvol, cells);
		
	}
	
	private Cell[][] transformLineToCells(String LineCells, int dimension) {
		Cell[][] result = new Cell[dimension][dimension];
		int i = 0;
		String[] lines = LineCells.split(",");

		for (String line : lines) {
			String[] cells = line.split(" ");
			int j = 0;
			for (String cell : cells) {
				if (Symbols.PLUS.equals(cell)) {
					result[i][j] = new Cell(true);
				} 
				else {
					result[i][j] = new Cell(false);
				}
				j++;
			}
			i++;
		}
		return result;
	}
	
	
	

}
