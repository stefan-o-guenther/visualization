/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import management.ManagementAutomaticRepeatRequestImpl;

public class PanelRNPipelineProtocolMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelRNPipelineProtocolMainImpl() {
		super(ManagementAutomaticRepeatRequestImpl.getInstance());
		this.createPanel();
	}

	@Override
	protected PanelAbstract getNewPanelMenu() {
		PanelAbstract panelMenu = new PanelRNPipelineProtocolMenuImpl();
		PanelAbstract panelLabel = new PanelRNPipelineProtocolTableExplanationImpl();
		PanelAbstract panelLeft = this.getPanelCoupleHorizontal(panelMenu, panelLabel);
		
		PanelAbstract panelSpeed = new PanelControlSpeedPacketImpl(ManagementAutomaticRepeatRequestImpl.getInstance(), "Geschwindigkeit:");
		PanelAbstract panelTimeout = new PanelRNPipelineProtocolControlTimeoutImpl();		
		PanelAbstract panelAutomatic = this.getPanelCoupleVertical(panelSpeed, panelTimeout);
		
		PanelAbstract panelMessage = new PanelRNPipelineProtocolMessageImpl();
		//PanelAbstract panelMessage = new PanelRNPipelineProtocolTestImpl();
		PanelAbstract panelRight = this.getPanelCoupleVertical(panelAutomatic, panelMessage);
		
		return this.getPanelCoupleHorizontal(panelLeft, panelRight);
	}

	@Override
	protected PanelAbstract getNewPanelModel() {
		return new PanelRNPipelineProtocolModelImpl();
	}
}
