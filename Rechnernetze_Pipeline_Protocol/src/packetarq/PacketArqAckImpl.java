/**
 * @author:	Stefan Otto Günther
 * @date:	22.10.2014
 */

package packetarq;

import enumeration.EnumPacketType;

public class PacketArqAckImpl extends PacketArqResultAbstract implements PacketArqAck {

	public PacketArqAckImpl(Integer number, Integer position) {
		super(number, position);
	}

	@Override
	public EnumPacketType getPacketType() {
		return EnumPacketType.ACK;
	}

	@Override
	public PacketArq getClone() {
		return new PacketArqAckImpl(this.number, this.position);
	}
}
