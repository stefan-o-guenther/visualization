/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package management;

import java.awt.Color;
import java.util.List;

import actor.ActorReceiver;
import actor.ActorSender;
import enumeration.EnumARQStrategy;
import packetarq.PacketArq;

public interface ManagementAutomaticRepeatRequest extends ManagementGeometry, ManagementPacket {

	public List<PacketArq> getListPacket();
	public Integer getPositionStart();
	public Integer getPositionTarget();
	public Integer getPacketHeight();
	public Integer getPacketWidth();
	public Integer getGapBetweenPackets();
	public ActorSender[] getArraySender();
	public ActorReceiver[] getArrayReceiver();
	public void assume(EnumARQStrategy strategy);
	public Boolean canSendPacket();
	public void sendPacket();
	public void setTimeout(Integer value);
	public Integer getWindowSenderBase();
	public Integer getWindowSenderSize();
	public Integer getWindowReceiverBase();
	public Integer getWindowReceiverSize();
	public void deletePacket(PacketArq packet);
	public void disablePacket(PacketArq packet);
	public Color getColorData();
	public Color getColorAck();
	public Color getColorNak();
	public Color getColorBroken();
	public Color getColorSenderOk();
	public Color getColorReceiverOk();
	public String getMessage();
}
