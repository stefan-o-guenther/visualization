/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package Output;

import Node.Node;




public interface OutputEdge extends Output {

	public Node getNodeA();
	public void setNodeA(Node value);
	
	public Node getNodeB();
	public void setNodeB(Node value);
	
	public Integer getWeight();
	public void setWeight(Integer value);
	
	public Boolean isConnected(Node node);
	public Boolean isConnected(Node node1, Node node2);	
}
