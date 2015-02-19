/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package management;

import tooltip.ToolTipManager;
import tooltip.ToolTipManagerRetransmissionImpl;
import enumeration.EnumAutomaticChecked;

public class ManagementTCPRetransmissionImpl extends ManagementAbstract implements ManagementTCPRetransmission {

	private static ManagementTCPRetransmission instance;
	
    private ManagementTCPRetransmissionImpl() {
    	super();
    }
    
    public static ManagementTCPRetransmission getInstance() {
		if (instance == null) {
			instance = new ManagementTCPRetransmissionImpl();
		}
		return instance;
	}	
 
    @Override
	public String getTitle() {
		return "TCP-Retransmission";
	}

	@Override
	protected void showErrorMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Boolean execute() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected EnumAutomaticChecked keepAutomaticChecked() {
		return EnumAutomaticChecked.ALWAYS;
	}

	@Override
	public ToolTipManager getToolTipManager() {
		return ToolTipManagerRetransmissionImpl.getInstance();
	}
}
