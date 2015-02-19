/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package Panel;

import panel.PanelAbstract;
import panel.PanelControlSpeedPacketImpl;
import panel.PanelMainAbstract;
import Management.ManagementQueueingAndLossImpl;

public class PanelRNQueueingAndLossMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelRNQueueingAndLossMainImpl() {
		super(ManagementQueueingAndLossImpl.getInstance());
		this.createPanel();
	}

	@Override
	protected PanelAbstract getNewPanelMenu() {
		PanelAbstract panelLeft = new PanelRNQueueingAndLossMenuImpl();
		
		PanelAbstract panelSpeed = new PanelControlSpeedPacketImpl(ManagementQueueingAndLossImpl.getInstance(), "Übertragungsrate Eingang:");
		
		PanelAbstract panelProcessing = new PanelRNQueueingAndLossControlProcessingImpl();
		PanelAbstract panelInterval = new PanelRNQueueingAndLossControlIntervalImpl();
		
		PanelAbstract panelCoupleVertical = this.getPanelCoupleVertical(panelSpeed, panelProcessing);
		PanelAbstract panelRight = this.getPanelCoupleVertical(panelCoupleVertical, panelInterval);		
		
		return this.getPanelCoupleHorizontal(panelLeft, panelRight);
	}

	@Override
	protected PanelAbstract getNewPanelModel() {
		return new PanelRNQueueingAndLossModelImpl();
	}
}
