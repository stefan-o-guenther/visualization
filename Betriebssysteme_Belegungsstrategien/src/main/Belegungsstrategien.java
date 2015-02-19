/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package main;

import panel.PanelBSBelegungsstrategienMainImpl;

public class Belegungsstrategien extends VisualizationAbstract {
	
	public Belegungsstrategien() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
    	baseVisualization(new PanelBSBelegungsstrategienMainImpl());
    }
}