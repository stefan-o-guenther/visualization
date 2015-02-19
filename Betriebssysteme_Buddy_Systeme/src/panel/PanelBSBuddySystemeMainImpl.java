/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import management.ManagementBuddyMemoryAllocationImpl;
import enumeration.EnumScrollbarPolicy;

public class PanelBSBuddySystemeMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelBSBuddySystemeMainImpl() {
		super(ManagementBuddyMemoryAllocationImpl.getInstance());
		this.createPanel();
	}

	@Override
	protected PanelAbstract getNewPanelMenu() {
		PanelAbstract panelLeft = new PanelBSBuddySystemeMenuImpl();
		PanelAbstract panelRightLeft = new PanelBSBuddySystemeTableImpl();
		PanelAbstract panelRightRight = new PanelBSBuddySystemeLabelImpl();
		PanelAbstract panelRight = this.getPanelCoupleHorizontal(panelRightLeft, panelRightRight);
		return this.getPanelCoupleHorizontal(panelLeft, panelRight);
	}

	@Override
	protected PanelAbstract getNewPanelModel() {
		PanelAbstract panel = new PanelBSBuddySystemeModelImpl();
		return new PanelScrollPanelImpl(panel, EnumScrollbarPolicy.NEVER, EnumScrollbarPolicy.ALWAYS);
	}
}
