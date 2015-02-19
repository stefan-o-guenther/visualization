/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package node;

import java.util.List;

public interface NodeBuddy extends Node {
	public Integer getValue();
	public Boolean hasChildren();
	
	public NodeBuddy getLeftBuddyNode();
	public void setLeftBuddyNode(NodeBuddy value);
	
	public NodeBuddy getRightBuddyNode();
	public void setRightBuddyNode(NodeBuddy value);
	
	public NodeProcess getSpaceNode();
	public void setSpaceNode(NodeProcess value);
	
	public NodeRest getRestNode();
	public void setRestNode(NodeRest value);
	
	public NodeProcess insertSpace(String name, Integer value);
	public List<NodeBuddy> findPossibleBuddyNodes(Integer value);
	
	public Boolean isEmpty();
	public Boolean clean();
	public void removeSpace();
}
