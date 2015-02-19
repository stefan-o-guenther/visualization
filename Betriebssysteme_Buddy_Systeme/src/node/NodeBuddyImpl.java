/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package node;

import java.util.ArrayList;
import java.util.List;

import enumeration.EnumNode;
import buddy.BuddyHelper;
import buddy.BuddySpace;
import buddy.BuddySpaceImpl;

public class NodeBuddyImpl implements NodeBuddy {

	public NodeBuddyImpl(Integer value) {
		try {
			this.calculateSize(value);
			this.parent = null;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public NodeBuddyImpl(Integer value, NodeBuddy parent) {
		try {
			if (parent == null) {
				throw new NullPointerException();
			}
			this.calculateSize(value);
			this.parent = parent;
		} catch (Exception ex) {
			throw ex;
		}
	}	
	
	private Integer size = 0;
	private NodeBuddy left = null;
	private NodeBuddy right = null;
	private NodeBuddy parent = null;
	private NodeProcess space = null;
	private NodeRest rest = null;
	
	private void calculateSize(Integer value) {
		try {
			if (value == null) {
				throw new NullPointerException();
			}
			if (value < 0) {
				throw new IllegalArgumentException();
			}
			if (value > 0) {
				Integer x = BuddyHelper.getPotence(value);
				size = (int) Math.pow(2, x);
			} else {
				size = 0;
			}			
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	@Override
	public Integer getValue() {
		return size;
	}

	@Override
	public Boolean hasChildren() {
		return ((left != null) || (right != null));
	}

	@Override
	public NodeBuddy getLeftBuddyNode() {
		return left;
	}

	@Override
	public void setLeftBuddyNode(NodeBuddy left) {
		try {
			if (left == null) {
				throw new NullPointerException();
			}
			this.left = left;
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public NodeBuddy getRightBuddyNode() {
		return right;
	}

	@Override
	public void setRightBuddyNode(NodeBuddy right) {
		try {
			if (right == null) {
				throw new NullPointerException();
			}
			this.right = right;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	@Override
	public NodeProcess getSpaceNode() {
		return space;
	}

	@Override
	public void setSpaceNode(NodeProcess value) {
		try {
			if (value == null) {
				throw new NullPointerException();
			}
			space = value;
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public NodeRest getRestNode() {
		return rest;
	}

	@Override
	public void setRestNode(NodeRest value) {
		try {
			if (value == null) {
				throw new NullPointerException();
			}
			rest = value;
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public EnumNode getType() {
		return EnumNode.BUDDY;
	}

	@Override
	public NodeBuddy getParent() {
		return parent;
	}

	@Override
	public NodeProcess insertSpace(String name, Integer value) {
		try {
			if ((name == null) || (value == null)) {
				throw new NullPointerException();
			}
			if ((value < 0) || (value > size)) {
				throw new IllegalArgumentException();
			}
			Integer ownPotence = BuddyHelper.getPotence(size);
			Integer valuePotence = BuddyHelper.getPotence(value);
			if (ownPotence < valuePotence) {
				return null;
			} else if (ownPotence.equals(valuePotence)) {
				if (isEmpty()) {
					space = new NodeProcessImpl(name, value, this);
					rest = new NodeRestImpl(size-value, this);
					return space;
				} else {
					return null;
				}
			} else if ((ownPotence > valuePotence) && (ownPotence > 0)) {
				if (space != null) {
					return null;
				}
				if (left == null) {
					left = new NodeBuddyImpl((size/2), this);
				}
				if (right == null) {
					right = new NodeBuddyImpl((size/2), this);
				}				
				NodeProcess node = left.insertSpace(name, value);
				if (node == null) {
					node = right.insertSpace(name, value);					
				}
				return node;
			} else {
				return null;
			}
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public Boolean isEmpty() {
		return ((left == null) && (right == null) && (space == null) && (rest == null));
	}

	@Override
	public void print() {
		System.out.println("BuddyNode: " + size);
		if (left != null) {
			left.print();
		}
		if (right != null) {
			right.print();
		}
		if (space != null) {
			space.print();
		}
		if (rest != null) {
			rest.print();
		}
	}

	@Override
	public Boolean clean() {
		if ((left != null) && (right != null)) {
			if (left.isEmpty() && right.isEmpty()) {
				left = null;
				right = null;
				return true;
			} else {
				Boolean result = left.clean();
				if (result == false) {
					result = right.clean();
				}
				return result;
			}
		} else {
			return false;
		}
	}

	@Override
	public void removeSpace() {
		space = null;
		rest = null;
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
			if (isEmpty()) {
				BuddySpace ps = new BuddySpaceImpl();
				ps.setName("");
				ps.setSize(size);
				ps.setType(getType());
				list.add(ps);
			} else {
				if (size > limit) {
					if (left != null) {
						list.addAll(left.getNodeList(limit));
					}
					if (right != null) {
						list.addAll(right.getNodeList(limit));
					}
					if (space != null) {
						list.addAll(space.getNodeList(limit));
					}
					if (rest != null) {
						list.addAll(rest.getNodeList(limit));
					}
				} else {
					BuddySpace ps = new BuddySpaceImpl();
					ps.setName("");
					ps.setSize(size);
					ps.setType(EnumNode.USED);
					list.add(ps);
				}
			}	
			return list;
		} catch (Exception ex) {
			throw ex;
		}		
	}

	@Override
	public List<NodeBuddy> findPossibleBuddyNodes(Integer value) {
		try {
			if (value == null) {
				throw new NullPointerException();
			}
			if (value < 0) {
				throw new IllegalArgumentException();
			}
			List<NodeBuddy> list = new ArrayList<NodeBuddy>();
			if (value <= size) {
				Integer ownPotence = BuddyHelper.getPotence(size);
				Integer valuePotence = BuddyHelper.getPotence(value);
				if (ownPotence.equals(valuePotence) && isEmpty()) {					
					list.add(this);									
				} else if ((ownPotence > valuePotence) && (ownPotence > 0) && (space == null)) {
					if ((left == null) && (right == null)) {
						list.add(this);						
					} else {
						if (left != null) {							
							list.addAll(left.findPossibleBuddyNodes(value));
						}
						if (right != null) {
							list.addAll(right.findPossibleBuddyNodes(value));
						}			
					}					
				}			
			}
			return list;
		} catch (Exception ex) {
			throw ex;
		}
	}
}