/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */

package ToolTip;

import tooltip.ToolTipManagerSpeedPacket;

public interface ToolTipManagerQueueingAndLoss extends ToolTipManagerSpeedPacket {

	public String getToolTipProcessing();
	public String getToolTipInterval();
}
