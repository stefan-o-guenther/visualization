/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package buddy;

import java.util.ArrayList;
import java.util.List;

public class BuddyOperationImpl implements BuddyOperation {

	public BuddyOperationImpl() {
		message = "";
		list = new ArrayList<BuddySpace>();
	}
	
	private String message;
	private List<BuddySpace> list;
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		try {
			if (message == null) {
				throw new NullPointerException();
			}
			this.message = message;
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public List<BuddySpace> getBuddyList() {
		return list;
	}

	@Override
	public void setBuddyList(List<BuddySpace> list) {
		try {
			if (list == null) {
				throw new NullPointerException();
			}
			this.list = list;
		} catch (Exception ex) {
			throw ex;
		}
	}
}
