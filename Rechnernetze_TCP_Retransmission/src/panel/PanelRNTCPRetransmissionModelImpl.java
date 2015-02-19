/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package panel;

import management.ManagementTCPRetransmission;
import management.ManagementTCPRetransmissionImpl;

public class PanelRNTCPRetransmissionModelImpl extends PanelDrawingAbstract {

	private static final long serialVersionUID = 1L;

	public PanelRNTCPRetransmissionModelImpl() {
		super();
		this.createPanel();
	}
	
	private ManagementTCPRetransmission retransmission;

	@Override
	protected void doDrawing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createDrawing() {
		this.retransmission = ManagementTCPRetransmissionImpl.getInstance();
	}

	@Override
	public Integer getPanelHeight() {
		return 100;
	}

	@Override
	public Integer getPanelWidth() {
		return 100;
	}
}
