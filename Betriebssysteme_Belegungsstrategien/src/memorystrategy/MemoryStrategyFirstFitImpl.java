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

public class MemoryStrategyFirstFitImpl extends MemoryStrategyFirstNextAbstract implements MemoryStrategyFirstFit {
	
	public MemoryStrategyFirstFitImpl(List<Space> example) {
		super(example);
	}

	@Override
	public EnumMemoryStrategy getStrategy() {
		return EnumMemoryStrategy.FIRST_FIT;
	}
	
	@Override
	protected void initialize() {
		ManagementFragmentation fragmentation = ManagementFragmentationImpl.getInstance();
		fragmentation.setStatus(EnumVisualizationStatus.INPUT);
		this.setStart(START);
		this.setPosition(START);		
		this.setNumber(1);
		resetIsFirst();
		copyListSpace();
	}
}