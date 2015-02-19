/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import management.ManagementTCPFairnessImpl;

public class PanelRNTCPFairnessMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelRNTCPFairnessMainImpl() {
		super(ManagementTCPFairnessImpl.getInstance());
		this.createPanel();
	}

	@Override
	protected PanelAbstract getNewPanelMenu() {
		PanelAbstract panelMenu = new PanelRNTCPFairnessMenuImpl();
		return this.getPanelMenuAutomatic(panelMenu, 5);
	}

	@Override
	protected PanelAbstract getNewPanelModel() {
		return new PanelRNTCPFairnessModelImpl();
	}
}
