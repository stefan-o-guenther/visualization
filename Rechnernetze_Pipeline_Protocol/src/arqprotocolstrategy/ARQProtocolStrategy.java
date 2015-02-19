package arqprotocolstrategy;

import java.util.List;

import actor.ActorReceiver;
import actor.ActorSender;
import enumeration.EnumARQStrategy;
import packetarq.PacketArq;

public interface ARQProtocolStrategy {

	public EnumARQStrategy getStrategy();
	public void execute();
	public void sendPacket();
	public Boolean canSendPacket();
	public void setSpeedPacket(Integer speed);
	public void setTimeout(Integer timeout);
	public Integer getBaseSender();
	public Integer getBaseReceiver();
	public Integer getWindowSizeSender();	
	public Integer getWindowSizeReceiver();
	public List<PacketArq> getListPacket();
	public ActorSender[] getArraySender();
	public ActorReceiver[] getArrayReceiver();
	public void disablePacket(PacketArq packet);
	public void deletePacket(PacketArq packet);
	public String getMessage();
}
