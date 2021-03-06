package cache;
/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */


import java.util.List;

import enumeration.EnumCache;


public interface Cache {

	public Integer getNumber();	
	
	public Integer getR();
	public void setR(Integer r);
	
	public Integer getM();	
	public void setM(Integer m);
	
	public Cache getCopy();	
		
	public List<Integer> getRPrevious();
	public void setRPrevious(List<Integer> r);
	public void addRPrevious(Integer r);
	public Integer getRPreviousSize();
	public void initializeRPrevious();
	
	public List<Integer> getMPrevious();
	public void setMPrevious(List<Integer> m);
	public void addMPrevious(Integer m);
	public Integer getMPreviousSize();
	public void initializeMPrevious();
	
	public EnumCache getStatus();
	public void setStatus(EnumCache value);	
}
