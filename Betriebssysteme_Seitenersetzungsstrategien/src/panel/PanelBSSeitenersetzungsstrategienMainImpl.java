package panel;
/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */


import management.ManagementPagingImpl;

public class PanelBSSeitenersetzungsstrategienMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelBSSeitenersetzungsstrategienMainImpl() {
		super(ManagementPagingImpl.getInstance());
		this.createPanel();
	}

	@Override
	protected PanelAbstract getNewPanelMenu() {
		PanelAbstract panelMenu = new PanelBSSeitenersetzungsstrategienMenuImpl();
		PanelAbstract panelReplacement = new PanelBSSeitenersetzungsstrategienReplacementImpl();
		PanelAbstract panelRM = new PanelBSSeitenersetzungsstrategienRMImpl();
		
		PanelAbstract panelM = this.getPanelCoupleVertical(panelMenu, panelReplacement);
		PanelAbstract panel = this.getPanelCoupleVertical(panelM, panelRM);
		
		return this.getPanelMenuAutomatic(panel, 5);
	}

	@Override
	protected PanelAbstract getNewPanelModel() {
		return new PanelBSSeitenersetzungsstrategienModelImpl();
	}
}
