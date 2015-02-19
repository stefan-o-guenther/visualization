/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package node;

import java.util.ArrayList;
import java.util.List;

import enumeration.EnumNode;
import buddy.BuddySpace;
import buddy.BuddySpaceImpl;

public class NodeProcessImpl implements NodeProcess {

	public NodeProcessImpl(String s, Integer value, NodeBuddy p) {
		try {
			if ((s == null) || (value == null) || (p == null)) {
				throw new NullPointerException();
			}
			if (value < 0) {
				throw new IllegalArgumentException();
			}
			space = value;
			name = s;
			parent = p;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	private NodeBuddy parent = null;
	private Integer space = null;
	private String name = "";
	
	@Override
	public EnumNode getType() {
		return EnumNode.SPACE;
	}

	@Override
	public NodeBuddy getParent() {
		return parent;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getValue() {
		return space;
	}

	@Override
	public void print() {
		System.out.println("SpaceNode: "+ name + " " + space);
	}

	@Override
	public List<BuddySpace> getNodeList(Integer limit) {
		try {
			if (limit == null) {
				throw new NullPointerException();
			}
			if (limit < 0) {
				throw new IllegalArgumentException();
			}
			List<BuddySpace> list = new ArrayList<BuddySpace>();
			BuddySpace ps = new BuddySpaceImpl();
			ps.setName(name);
			ps.setSize(space);
			ps.setType(getType());
			list.add(ps);
			return list;
		} catch (Exception ex) {
			throw ex;
		}		
	}
}
