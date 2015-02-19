/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Node;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import enumeration.EnumSurface;
import Enum.EnumNodeType;
import Output.OutputEdge;

public class NodeImpl implements Node {

	public NodeImpl(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "";
		}
		listEdges = new ArrayList<OutputEdge>();
		initialize();
	}	
	
	private List<OutputEdge> listEdges;
	private String name;
	private Node previousNode;
	private Boolean used;
	private EnumNodeType type;
	
	private Node getOtherNodeOfEdge(OutputEdge edge) {
		if (edge != null) {
			Node nodeA = edge.getNodeA();	
			Node nodeB = edge.getNodeB();
			if (nodeA == this) {
				return nodeB;				
			} else if (nodeB == this) {
				return nodeA;
			}
		}
		return null;
	}
	
	private OutputEdge getConnectedEdge(Node node) {
		if (node != null) {
			for (OutputEdge edge : listEdges) {
				if (edge.isConnected(this, node)) {
					return edge;
				}
			}
		}
		return null;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String value) {
		if (value != null) {
			name = value;
		}
	}

	@Override
	public Node getPreviousNode() {
		return previousNode;
	}
	
	@Override
	public void setPreviousNode(Node node) {
		if ((node != null) && (isConnected(node))) {
			previousNode = node;
		}
	}

	@Override
	public void deletePreviousNode() {
		previousNode = null;
	}

	@Override
	public Integer getPreviousWeight() {
		if (previousNode != null) {
			Integer previousWeight = previousNode.getPreviousWeight();
			if (previousWeight < 0) {
				previousWeight = 0;
			}
			OutputEdge previousEdge = this.getConnectedEdge(previousNode);
			return previousEdge.getWeight() + previousWeight;
		} else {
			return -1;
		}		
	}
	
	@Override
	public Boolean hasPreviousNode() {
		return (previousNode != null);
	}
	
	@Override
	public Boolean isUsed() {
		return used;
	}

	@Override
	public void setUsed(Boolean value) {
		if (value != null) {
			used = value;
		}
	}

	@Override
	public OutputEdge getPreviousEdge() {
		if (previousNode != null) {
			for (OutputEdge edge : listEdges) {
				Node node = this.getOtherNodeOfEdge(edge);
				if (previousNode == node) {
					return edge;
				}
			}
		}
		return null;
	}

	@Override
	public List<Node> getRoute() {
		List<Node> list = null;
		if (this.hasPreviousNode()) {
			list = getPreviousNode().getRoute();
		} else {
			list = new ArrayList<Node>();
		}
		list.add(this);
		return list;
	}

	@Override
	public void addEdge(OutputEdge edge) {
		if (edge != null) {
			if (listEdges == null) {
				listEdges = new ArrayList<OutputEdge>();
			}
			if (this.isConnected(edge)) {
				listEdges.add(edge);
			}
		}
	}

	@Override
	public Boolean isConnected(OutputEdge edge) {
		if (edge != null) {
			Node nodeA = edge.getNodeA();		
			Node nodeB = edge.getNodeB();
			if ((nodeA == this) || (nodeB == this)) {
				return true;
			}		
		}
		return false;
	}

	@Override
	public Boolean isConnected(Node node) {
		if (node != null) {
			for (OutputEdge edge : listEdges) {
				if (edge.isConnected(this, node)) {
					return true;
				}
			}
		}	
		return false;
	}

	@Override
	public void initialize() {
		previousNode = null;
		setUsed(false);
		this.type = EnumNodeType.NORMAL;
	}
	
	private Color getColoredColor() {
		if (used) {
			return Color.RED;
		} else {
			return Color.WHITE;
		}
	}
	
	private Color getGrayColor() {
		if (used) {
			return Color.LIGHT_GRAY;
		} else {
			return Color.WHITE;
		}
	}

	@Override
	public Color getColor(EnumSurface surface) {
		if (surface != null) {
			if (surface == EnumSurface.COLORED) {
				return getColoredColor();
			} else if (surface == EnumSurface.GRAY) {
				return getGrayColor();
			}
		}
		return Color.WHITE;
	}

	@Override
	public EnumNodeType getType() {
		return type;
	}

	@Override
	public void setType(EnumNodeType type) {
		try {
			if (type == null) {
				throw new NullPointerException();
			}
			this.type = type;
		} catch (Exception ex) {
			throw ex;
		}
	}
}
