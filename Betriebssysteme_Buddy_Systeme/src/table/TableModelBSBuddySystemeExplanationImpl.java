/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package table;

import java.util.ArrayList;
import java.util.List;

import node.NodeBuddy;
import node.NodeProcess;
import node.NodeRest;
import management.ManagementBuddyMemoryAllocation;
import management.ManagementBuddyMemoryAllocationImpl;

public class TableModelBSBuddySystemeExplanationImpl extends TableModelExplanationAbstract {

	private static final long serialVersionUID = 1L;

	public TableModelBSBuddySystemeExplanationImpl() {
		super();	
	}
	
	@Override
	protected List<String> getListContent() {
		ManagementBuddyMemoryAllocation buddy = ManagementBuddyMemoryAllocationImpl.getInstance();
		List<String> listContent = new ArrayList<String>();
		listContent.add("Frei");
		listContent.add("Verschnitt");
		List<NodeProcess> listProcesses = buddy.getListRunningProcesses();
		for (NodeProcess pn : listProcesses) {
			NodeBuddy parent = pn.getParent();
			NodeRest rest = parent.getRestNode();
			Integer restValue = rest.getValue();
			Integer processValue = pn.getValue();
			String name = pn.getName();
			String text = (name + " (" + processValue + " / " + restValue + ")");
			listContent.add(text);
		}		
		return listContent;
	}
}
