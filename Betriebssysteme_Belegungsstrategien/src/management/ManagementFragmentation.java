/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package management;

import java.util.List;

import space.Space;
import enumeration.EnumMemoryStrategy;

public interface ManagementFragmentation extends Management {

	public EnumMemoryStrategy getStrategy();
	public void inputNumber(Integer value);	
	public List<Space> getListSpace();
	public Integer getTotalSpace();
	public Integer getFreeSpace();
	public Integer getUsedSpace();
	public Double getFreeSpaceRate();
	public Double getUsedSpaceRate();
	public void assume(EnumMemoryStrategy strategy, List<Integer> list);
}
