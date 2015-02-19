/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package buddy;

import java.util.List;

public interface BuddyOperation {
	public String getMessage();
	public void setMessage(String value);
	
	public List<BuddySpace> getBuddyList();
	public void setBuddyList(List<BuddySpace> value);
}
