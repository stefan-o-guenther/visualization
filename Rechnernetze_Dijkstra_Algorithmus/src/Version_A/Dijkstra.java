/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Version_A;

import main.VisualizationAbstract;

public class Dijkstra extends VisualizationAbstract {

	public Dijkstra() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNDijkstraAlgorithmMainImpl());	
    }
}
