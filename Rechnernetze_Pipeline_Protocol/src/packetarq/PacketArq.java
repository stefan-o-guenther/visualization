/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package packetarq;

import enumeration.EnumPacketStatus;
import enumeration.EnumPacketType;
import packet.Packet;

public interface PacketArq extends Packet {	
	public Integer getNumber();	
	public EnumPacketStatus getPacketStatus();	
	public void setPacketStatus(EnumPacketStatus status);	
	public EnumPacketType getPacketType();
}
