/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package main;

import panel.PanelRNCongestionAvoidanceMainImpl;

public class Congestion_Avoidance extends VisualizationAbstract {

	public Congestion_Avoidance() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNCongestionAvoidanceMainImpl());	
    }
}