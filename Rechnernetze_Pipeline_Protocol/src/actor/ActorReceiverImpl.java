package actor;

import enumeration.EnumARQReceiver;

public class ActorReceiverImpl implements ActorReceiver {

	public ActorReceiverImpl() {
		super();
		type = EnumARQReceiver.EMPTY;
	}
	
	private EnumARQReceiver type;
	
	@Override
	public EnumARQReceiver getType() {
		return this.type;
	}

	@Override
	public Boolean isReceived() {
		return (type == EnumARQReceiver.RECEIVED);
	}

	@Override
	public void setReceived() {
		type = EnumARQReceiver.RECEIVED;
	}

	@Override
	public Boolean isEmpty() {
		return (type == EnumARQReceiver.EMPTY);
	}
}
