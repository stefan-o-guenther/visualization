/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package main;

import panel.PanelRNTCPRetransmissionMainImpl;
import main.VisualizationAbstract;

public class TCP_Retransmission extends VisualizationAbstract {

	public TCP_Retransmission() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNTCPRetransmissionMainImpl());	
    }
}
