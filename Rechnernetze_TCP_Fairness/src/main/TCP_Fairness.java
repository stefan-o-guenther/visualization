/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package main;

import panel.PanelRNTCPFairnessMainImpl;
import main.VisualizationAbstract;

public class TCP_Fairness extends VisualizationAbstract {

	public TCP_Fairness() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNTCPFairnessMainImpl());	
    }
}
