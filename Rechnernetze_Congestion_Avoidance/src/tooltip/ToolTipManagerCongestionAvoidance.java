/**
 * @author:	Stefan Otto G�nther
 * @date:	12.05.2014
 */

package tooltip;

public interface ToolTipManagerCongestionAvoidance extends ToolTipManager {

	public String getToolTipTcpTahoe();
	public String getToolTipTcpReno();
	public String getToolTipSSThresh();
	public String getToolTipTimeout();
	public String getToolTipTrippleDuplAck();
	public String getToolTipSSThreshTCPReno();
	public String getToolTipSSThreshTCPTahoe();
}