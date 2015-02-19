package actor;

import enumeration.EnumARQSender;

public interface ActorSender extends Actor {

	public EnumARQSender getType();
	public void resetTimer();
	public void incTimer();
	public Integer getTimer();
	public void setSent();
	public Boolean isSent();
}
