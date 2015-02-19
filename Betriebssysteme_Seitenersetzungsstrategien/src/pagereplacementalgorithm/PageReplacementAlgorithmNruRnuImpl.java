package pagereplacementalgorithm;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import java.util.List;

import enumeration.EnumPagingStrategy;

public class PageReplacementAlgorithmNruRnuImpl extends PageReplacementAlgorithmNruRnuAbstract implements PageReplacementAlgorithmNruRnu {

	public PageReplacementAlgorithmNruRnuImpl(List<Integer> sequence, Integer ram, Integer disk) {
		super(sequence, ram, disk);
	}

	@Override
	public EnumPagingStrategy getStrategy() {
		return EnumPagingStrategy.NRU_RNU;
	}

	@Override
	protected Boolean putOnOldPosition() {
		return true;
	}
}
