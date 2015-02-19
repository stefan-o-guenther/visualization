/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package Packet;

import java.awt.Color;

public class PacketQalYellowImpl extends PacketQalAbstract implements PacketQalYellow {

	public PacketQalYellowImpl() {
		super(0);
	}

	public PacketQalYellowImpl(Integer position) {
		super(position);
	}

	@Override
	protected Color getColoredColor() {
		return Color.YELLOW;
	}

	@Override
	public PacketQal getClone() {
		return new PacketQalYellowImpl(this.getPosition());
	}	
}
