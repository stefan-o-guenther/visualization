/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package memorystrategy;

import java.util.List;

import space.Space;
import enumeration.EnumMemoryStatus;
import enumeration.EnumMemoryStrategy;

public interface MemoryStrategy {

	public EnumMemoryStrategy getStrategy();
	public EnumMemoryStatus getStatus();
	public List<Space> getListSpace();
	public void inputNumber(Integer value);
	public Boolean execute();
}
