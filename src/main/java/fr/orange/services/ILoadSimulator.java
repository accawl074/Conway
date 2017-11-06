package fr.orange.services;

import fr.orange.domaine.Simulator;
/**
 * Charger un objet Simulator 
 * @author selfchtali
 *
 */
public interface ILoadSimulator {
	public Simulator loadSimulator(String path);
}
