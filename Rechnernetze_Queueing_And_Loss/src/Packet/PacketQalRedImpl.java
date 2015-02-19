/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package Packet;

import java.awt.Color;

public class PacketQalRedImpl extends PacketQalAbstract implements PacketQalRed {

	public PacketQalRedImpl() {
		super(0);
	}

	public PacketQalRedImpl(Integer position) {
		super(position);
	}

	@Override
	protected Color getColoredColor() {
		return Color.RED;
	}

	@Override
	public PacketQal getClone() {
		return new PacketQalRedImpl(this.getPosition());
	}	
}
