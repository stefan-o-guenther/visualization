/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package node;

import java.util.ArrayList;
import java.util.List;

import enumeration.EnumNode;
import buddy.BuddySpace;
import buddy.BuddySpaceImpl;

public class NodeRestImpl implements NodeRest {

	public NodeRestImpl(Integer value, NodeBuddy p) {
		if ((value == null) || (value < 0)) {
			value = 0;
		}
		parent = p;
		space = value;
	}
	
	private Integer space = 0;
	private NodeBuddy parent = null;
	
	@Override
	public EnumNode getType() {
		return EnumNode.REST;
	}

	@Override
	public Integer getValue() {
		return space;
	}

	@Override
	public NodeBuddy getParent() {
		return parent;
	}

	@Override
	public void print() {
		System.out.println("RestNode: "+ space);
	}

	@Override
	public List<BuddySpace> getNodeList(Integer limit) {
		List<BuddySpace> list = new ArrayList<BuddySpace>();
		if (limit == null) {
			limit = 0;
		}
		BuddySpace ps = new BuddySpaceImpl();
		ps.setName("");
		ps.setSize(space);
		ps.setType(getType());
		list.add(ps);
		return list;
	}

}
