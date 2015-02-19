/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package node;

import java.util.List;

import enumeration.EnumNode;
import buddy.BuddySpace;

public interface Node {
	public EnumNode getType();
	public NodeBuddy getParent();
	public void print();
	public List<BuddySpace> getNodeList(Integer limit);
}
