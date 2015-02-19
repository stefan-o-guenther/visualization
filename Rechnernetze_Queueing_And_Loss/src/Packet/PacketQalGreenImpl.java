/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package Packet;

import java.awt.Color;

public class PacketQalGreenImpl extends PacketQalAbstract implements PacketQalGreen {

	public PacketQalGreenImpl() {
		super(0);
	}
	
	public PacketQalGreenImpl(Integer position) {
		super(position);
	}

	@Override
	protected Color getColoredColor() {
		return Color.GREEN;
	}

	@Override
	public PacketQal getClone() {
		return new PacketQalGreenImpl(this.getPosition());
	}
}