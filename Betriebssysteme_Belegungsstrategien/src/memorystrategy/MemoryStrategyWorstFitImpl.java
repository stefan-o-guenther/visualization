/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package memorystrategy;

import java.util.List;

import base.Checker;
import space.Space;
import enumeration.EnumMemoryStrategy;

public class MemoryStrategyWorstFitImpl extends MemoryStrategyBestWorstAbstract implements MemoryStrategyWorstFit {
	
	public MemoryStrategyWorstFitImpl(List<Space> example) {
		super(example);
	}

	@Override
	public EnumMemoryStrategy getStrategy() {
		return EnumMemoryStrategy.WORST_FIT;
	}
	
	@Override
	protected Boolean isSpaceSuitable(Integer number, Integer value) {
		try {
			Checker.checkIfIntegerNotLessZero(number);
			Checker.checkIfIntegerNotLessZero(value);
			if (number.intValue() <= value.intValue()) {
				this.checkIfWorst(value);
			}
			return false;
		} catch (Exception ex) {
			throw ex;
		}
	}
}