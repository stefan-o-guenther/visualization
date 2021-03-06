/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package buddy;

import enumeration.EnumNode;

public interface BuddySpace {

	public EnumNode getType();
	public void setType(EnumNode value);
	
	public String getName();
	public void setName(String value);
	
	public Integer getSize();
	public void setSize(Integer value);
}
