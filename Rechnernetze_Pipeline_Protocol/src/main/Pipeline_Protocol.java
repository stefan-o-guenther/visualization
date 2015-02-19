/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package main;

import panel.PanelRNPipelineProtocolMainImpl;

public class Pipeline_Protocol extends VisualizationAbstract {

	public Pipeline_Protocol() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
		baseVisualization(new PanelRNPipelineProtocolMainImpl());	
    }
}
