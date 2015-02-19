package management;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import java.awt.Color;
import java.util.List;

import cache.CacheBox;
import enumeration.EnumPagingStrategy;


public interface ManagementPaging extends Management {
	public EnumPagingStrategy getStrategy();	
	public void assume(EnumPagingStrategy enumStrategy, List<Integer> listSequence, Integer ram, Integer disk);		
	public Integer getMaxRam();	
	public Integer getMaxDisk();		
	public Boolean resetRBits();	
	public Boolean setMBit();	
	public List<CacheBox> getListCache();	
	public Boolean isRmVisible();	
	public Integer getErrorCount();	
	public Color getColor();
	public Boolean isViewOldStatesEnabled();
	public void setViewOldStatesEnabled(Boolean value);
	public Boolean isRmEnabled();
}
