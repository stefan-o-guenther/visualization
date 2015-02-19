/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package memorystrategy;

import java.util.List;

import base.Checker;
import space.Space;

public abstract class MemoryStrategyFirstNextAbstract extends MemoryStrategyAbstract {

	public MemoryStrategyFirstNextAbstract(List<Space> example) {
		super(example);
	}

	protected Integer getChosenPosition() {
		return this.getPosition();
	}
	
	protected Boolean isSpaceSuitable(Integer number, Integer value) {
		try {
			Checker.checkIfIntegerNotLessZero(number);
			Checker.checkIfIntegerNotLessZero(value);
			return (number.intValue() <= value.intValue());
		} catch (Exception ex) {
			throw ex;
		}
	}
		
	protected Boolean finishNotFit() {
		finishFit();
		finish();
		return false;
	}
}
