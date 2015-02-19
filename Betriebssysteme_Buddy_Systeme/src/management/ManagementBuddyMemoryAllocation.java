/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package management;

import java.awt.Color;
import java.util.List;

import node.NodeProcess;
import enumeration.EnumProcess;
import buddy.BuddyOperation;

public interface ManagementBuddyMemoryAllocation extends Management {

	public void setTotalSpace(Integer value);
	public void print();
	public List<BuddyOperation> getNodeList();
	public void limitOutput(Integer value);	
	public Color getColorProcessNode(String name);
	public Color getColorRest();
	public Color getColorUsed();
	public Color getColorBuddy();
	public List<String> getListProcessNames();
	public List<Color> getListUsedColors();	
	public Integer getTotalSpace();	
	public Integer getProcessCount();	
	public Integer getProcessSpace();
	public Double getProcessRate();	
	public Integer getFreeSpace();
	public Double getFreeRate();	
	public Integer getRestSpace();
	public Double getRestRate();
	public List<NodeProcess> getListRunningProcesses();
	public EnumProcess getProcessOperation();
	public void setProcessOperation(EnumProcess type);
	public void setProcessName(String name);
	public void setProcessSize(Integer value);
}
