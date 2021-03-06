package pagereplacementalgorithm;
/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */


import java.util.ArrayList;
import java.util.List;

import cache.Cache;
import enumeration.EnumPagingStrategy;

public class PageReplacementAlgorithmNfuLfuImpl extends PageReplacementAlgorithmAbstract implements PageReplacementAlgorithmNfuLfu {

	public PageReplacementAlgorithmNfuLfuImpl(List<Integer> sequence, Integer ram, Integer disk) {
		super(sequence, ram, disk);
	}
	
	private List<Integer> listNFU_LFU;	

	@Override
	public Boolean isRmVisible() {
		return false;
	}
	
	@Override
	public EnumPagingStrategy getStrategy() {
		return EnumPagingStrategy.NFU_LFU;
	}

	@Override
	protected void initialize() {
		listNFU_LFU = new ArrayList<Integer>();
	}

	@Override
	protected void useNumber(Integer number) {
		if (number != null) {
			Integer size;		
			size = listNFU_LFU.size();
			for (Integer i = size; i <= number; i++) {
				listNFU_LFU.add(0);					
			}		
			Integer x = listNFU_LFU.get(number) + 1;
			listNFU_LFU.set(number, x);						
		}
	}

	@Override
	protected Boolean putOnOldPosition() {
		return false;
	}

	@Override
	protected void remove(List<Cache> ram, List<Cache> disk) {
		if ((ram != null) && (disk != null)) {
			while (ram.size() > maxRam) {				
				Integer minNumber = null;				
				Integer minIndex = null;
				Integer minCount = null;
				Cache res = null;
				for (Integer index = 1; index < ram.size(); index++) {
					res = ram.get(index);
					Integer number = res.getNumber();							
					Integer count;
					if (listNFU_LFU.size() > number) {
						count = listNFU_LFU.get(number);
					} else {
						System.out.println("Fehler");
						count = 0;
					}					
					if (((minNumber == null) || (count <= minCount)) && (res != cache)) {
						minNumber = number;
						minCount = count;
						minIndex = index;
					}		
				}				
				if (minNumber != null) {
					res = ram.remove(minIndex.intValue());
					disk.add(0, res);
					error();
				}				
			}
			while (disk.size() > maxDisk) {
				Integer l = disk.size() - 1;
				disk.remove(l.intValue());
			}
		}
	}

	@Override
	public Boolean isRmEnabled() {
		return false;
	}
}
