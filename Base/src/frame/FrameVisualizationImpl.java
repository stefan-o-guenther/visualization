package frame;

import panel.PanelMainAbstract;

/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */



public class FrameVisualizationImpl extends FrameAbstract {
	
	private static final long serialVersionUID = 1L;
	
	public FrameVisualizationImpl(PanelMainAbstract panelMain) {
		super(panelMain);
		this.initUI();
	}
}
