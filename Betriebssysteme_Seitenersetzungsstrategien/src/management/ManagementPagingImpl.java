package management;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import base.Checker;
import pagereplacementalgorithm.PageReplacementAlgorithm;
import pagereplacementalgorithm.PageReplacementAlgorithmFactory;
import cache.CacheBox;
import tooltip.ToolTipManager;
import tooltip.ToolTipManagerPagingImpl;
import enumeration.EnumAutomaticChecked;
import enumeration.EnumPagingStrategy;
import enumeration.EnumSurface;
import enumeration.EnumVisualizationStatus;

public class ManagementPagingImpl extends ManagementAbstract implements ManagementPaging {	
	
	private static ManagementPaging instance;
	
    private ManagementPagingImpl() {
    	super();
    }
    
    public static ManagementPaging getInstance() {
		if (instance == null) {
			instance = new ManagementPagingImpl();
		}
		return instance;
	}	
	
	private Boolean oldStates; 
	private PageReplacementAlgorithm repStrategy;
	
	@Override
	protected void initialize() {
		repStrategy = null;
		oldStates = true;
	}
	
	@Override
	public EnumPagingStrategy getStrategy() {
		if (repStrategy != null) {
			return repStrategy.getStrategy();
		} else {
			return EnumPagingStrategy.NULL;
		}
	}

	@Override
	public void assume(EnumPagingStrategy strategy, List<Integer> listSequence, Integer maxRam, Integer maxDisk) {
		try {
			this.initialize();
			Checker.checkIfNotNull(strategy);
			Checker.checkIfNotNull(listSequence);
			Checker.checkIfIntegerNotLessZero(maxRam);
			Checker.checkIfIntegerNotLessZero(maxDisk);
			repStrategy = PageReplacementAlgorithmFactory.getStrategy(strategy, listSequence, maxRam, maxDisk);
			this.updateViews();			
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	protected Boolean execute() {
		if ((repStrategy != null) && (this.getStatus() == EnumVisualizationStatus.RUN)) {
			repStrategy.execute();
		}
		return true;
	}	
	
	@Override
	public List<CacheBox> getListCache() {
		if (repStrategy != null) {
			return repStrategy.getListCacheBox();
		} else {
			return new ArrayList<CacheBox>();
		}
	}

	@Override
	public Integer getMaxRam() {
		if (repStrategy != null) {
			return repStrategy.getMaxRam();
		} else {
			return 0;
		}
	}

	
	@Override
	public Integer getMaxDisk() {
		if (repStrategy != null) {
			return repStrategy.getMaxDisk();
		} else {
			return 0;
		}
	}	

	@Override
	public Boolean resetRBits() {
		if ((repStrategy != null) && (repStrategy.isRmEnabled())) {
			Boolean result = repStrategy.resetRBits();
			this.updateViews();
			return result;
		} else {
			return false;
		}
	}

	@Override
	public Boolean setMBit() {
		if ((repStrategy != null) && (repStrategy.isRmEnabled())) {
			Boolean result = repStrategy.setMBit();
			this.updateViews();
			return result;
		} else {
			return false;
		}
	}

	@Override
	public Boolean isRmVisible() {
		if (repStrategy != null) {
			return repStrategy.isRmVisible();
		} else {
			return false;
		}
	}
	
	@Override
	public Boolean isRmEnabled() {
		if (repStrategy != null) {
			return repStrategy.isRmEnabled();
		} else {
			return false;
		}
	}

	@Override
	public Integer getErrorCount() {
		if (repStrategy != null) {
			return repStrategy.getErrorCount();
		} else {
			return 0;
		}
	}

	@Override
	public Color getColor() {		
		if (surface == EnumSurface.COLORED) {
			return Color.RED;
		} else {
			return Color.BLACK;
		}
	}

	@Override
	public Boolean isViewOldStatesEnabled() {
		return oldStates;
	}

	@Override
	public void setViewOldStatesEnabled(Boolean value) {
		if (value != null) {
			oldStates = value;
			this.updateViews();
		}
	}	

	@Override
	public String getTitle() {
		return "Seitenersetzungsstrategien";
	}

	@Override
	protected void showErrorMessage() {
		
	}

	@Override
	protected void updateSize() {
		
	}

	@Override
	protected void create() {
		
	}
	
	@Override
	protected EnumAutomaticChecked keepAutomaticChecked() {
		return EnumAutomaticChecked.CHOICE;
	}

	@Override
	public ToolTipManager getToolTipManager() {
		return ToolTipManagerPagingImpl.getInstance();
	}
}