/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Node;

import java.util.List;

import ColorGetter.ColorGetter;
import Enum.EnumNodeType;
import Output.OutputEdge;

public interface Node extends ColorGetter {

	public String getName();
	public void setName(String value);
	
	public Node getPreviousNode();
	public void setPreviousNode(Node node);
	
	public void deletePreviousNode();
	
	public Integer getPreviousWeight();
	
	public Boolean isUsed();
	public void setUsed(Boolean value);
	
	public OutputEdge getPreviousEdge();
	
	public List<Node> getRoute();
	
	public void addEdge(OutputEdge edge);
	
	public Boolean hasPreviousNode();
		
	public Boolean isConnected(OutputEdge edge);
	public Boolean isConnected(Node node);
	
	public void initialize();
	
	public EnumNodeType getType();
	public void setType(EnumNodeType type);
}
