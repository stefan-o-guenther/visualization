/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package memorystrategy;

import java.util.List;

import space.Space;
import management.ManagementFragmentation;
import management.ManagementFragmentationImpl;
import enumeration.EnumMemoryStrategy;
import enumeration.EnumVisualizationStatus;

public class MemoryStrategyNextFitImpl extends MemoryStrategyFirstNextAbstract implements MemoryStrategyNextFit {
	
	public MemoryStrategyNextFitImpl(List<Space> example) {
		super(example);
	}

	@Override
	public EnumMemoryStrategy getStrategy() {
		return EnumMemoryStrategy.NEXT_FIT;
	}
	
	@Override
	protected void initialize() {
		ManagementFragmentation fragmentation = ManagementFragmentationImpl.getInstance();
		fragmentation.setStatus(EnumVisualizationStatus.INPUT);
		this.setStart(this.getPosition());
		this.setNumber(1);
		resetIsFirst();
		copyListSpace();
	}
}
