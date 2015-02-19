/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Main;

import main.VisualizationAbstract;
import Panel.PanelRNQueueingAndLossMainImpl;

public class Queueing_And_Loss extends VisualizationAbstract {

	public Queueing_And_Loss() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNQueueingAndLossMainImpl());	
    }
}
