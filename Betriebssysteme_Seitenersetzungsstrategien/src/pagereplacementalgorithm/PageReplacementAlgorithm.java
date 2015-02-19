package pagereplacementalgorithm;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import java.util.List;

import cache.CacheBox;
import enumeration.EnumPagingStrategy;

public interface PageReplacementAlgorithm {
	public void execute();	
	public Boolean resetRBits();	
	public Boolean setMBit();
	public List<CacheBox> getListCacheBox();
	public EnumPagingStrategy getStrategy();
	public Integer getMaxRam();
	public Integer getMaxDisk();
	public Boolean isRmVisible();
	public Integer getErrorCount();
	public Integer getMaxRM();
	public Boolean isRmEnabled();
}