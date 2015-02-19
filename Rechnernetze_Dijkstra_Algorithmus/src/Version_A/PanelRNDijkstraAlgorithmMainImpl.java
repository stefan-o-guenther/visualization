/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Version_A;

import panel.PanelAbstract;
import panel.PanelMainAbstract;
import Management.ManagementDijkstraAlgorithmImpl;
import Panel.PanelRNDijkstraAlgorithmModelImpl;
import Panel.PanelRNDijkstraAlgorithmTableImpl;

public class PanelRNDijkstraAlgorithmMainImpl extends PanelMainAbstract {

	private static final long serialVersionUID = 1L;

	public PanelRNDijkstraAlgorithmMainImpl() {
		super(ManagementDijkstraAlgorithmImpl.getInstance());
		this.createPanel();
	}

	@Override
	public PanelAbstract getNewPanelMenu() {
		PanelAbstract panelMenu = new PanelRNDijkstraAlgorithmMenuImpl();
		return this.getPanelMenuAutomatic(panelMenu, 0);
	}

	@Override
	public PanelAbstract getNewPanelModel() {
		PanelAbstract panelModel = new PanelRNDijkstraAlgorithmModelImpl();
		PanelAbstract panelTable = new PanelRNDijkstraAlgorithmTableImpl();
		return this.getPanelCoupleVertical(panelModel, panelTable);
	}
}
