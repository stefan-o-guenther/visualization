package pagereplacementalgorithm;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import java.util.List;

import enumeration.EnumPagingStrategy;

public class PageReplacementAlgorithmFifoImpl extends PageReplacementAlgorithmFifoAbstract implements PageReplacementAlgorithmFifo {

	public PageReplacementAlgorithmFifoImpl(List<Integer> sequence, Integer ram, Integer disk) {
		super(sequence, ram, disk);
	}

	@Override
	public EnumPagingStrategy getStrategy() {
		return EnumPagingStrategy.FIFO;
	}

	@Override
	protected Boolean putOnOldPosition() {
		return true;
	}
}
