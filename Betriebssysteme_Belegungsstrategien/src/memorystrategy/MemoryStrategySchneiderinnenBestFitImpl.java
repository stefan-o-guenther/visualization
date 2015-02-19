/**
 * @author:	Stefan Otto Günther
 * @date:	04.06.2014
 */

package memorystrategy;

import java.util.List;

import base.Checker;
import space.Space;
import enumeration.EnumMemoryStrategy;

public class MemoryStrategySchneiderinnenBestFitImpl extends MemoryStrategyBestWorstAbstract implements MemoryStrategySchneiderinnenBestFit{

	public MemoryStrategySchneiderinnenBestFitImpl(List<Space> example) {
		super(example);
	}

	@Override
	public EnumMemoryStrategy getStrategy() {
		return EnumMemoryStrategy.SCHNEIDERINNEN_BEST_FIT;
	}	

	@Override
	protected Boolean isSpaceSuitable(Integer number, Integer value) {
		try {
			Checker.checkIfIntegerNotLessZero(number);
			Checker.checkIfIntegerNotLessZero(value);
			if (number.intValue() <= value.intValue()) {
				this.checkIfWorst(value);
				if (number.intValue() == value.intValue()) {
					this.checkIfBest(value);
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}			
		} catch (Exception ex) {
			throw ex;
		}
	}
}