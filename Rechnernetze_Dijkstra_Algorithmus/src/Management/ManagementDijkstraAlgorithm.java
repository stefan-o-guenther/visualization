/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Management;

import java.util.List;
import java.util.Map;

import management.Management;
import Enum.EnumEdge;
import MinOutput.MinOutput;
import Node.Node;
import Output.OutputEdge;
import Output.OutputNode;

public interface ManagementDijkstraAlgorithm extends Management {

	public List<String> getListNodeNames();
	public Node getNode(String name);
	public OutputEdge getEdge(String nameA, String nameB);
	
	public Integer getMaxTableLines();	
	
	public List<OutputNode> getListNodeOutput(String name);
	public List<String> getListNodeTargetNames();
	public List<String> getListNodeUsedNames();
	public Map<String, List<OutputNode>> getMapNodesOutput();
	
	public List<MinOutput> getListMin();
	public List<String> getListRoute();
	
	public void assume(String start, String target);	
	
	public void changeWeight(EnumEdge edge, Integer weight);
}
