/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import imageloader.ImageLoader;

import javax.swing.ImageIcon;

import management.ManagementAutomaticRepeatRequest;
import management.ManagementAutomaticRepeatRequestImpl;
import ToolTip.ToolTipManagerARQ;

public class PanelRNPipelineProtocolControlTimeoutImpl extends PanelControlSliderAbstract {

	private static final long serialVersionUID = 1L;
	
	public PanelRNPipelineProtocolControlTimeoutImpl() {
		super(ManagementAutomaticRepeatRequestImpl.getInstance());
		this.createPanel();
	}
	
	@Override
	protected Integer getMax() {
		return 60;
	}

	@Override
	protected Integer getMin() {
		return 5;
	}

	@Override
	protected Integer getStep() {
		return 5;
	}

	@Override
	protected Integer getInit() {
		return 15;
	}

	@Override
	protected ImageIcon getImageIconLeft() {
		return ImageLoader.getImageIconTimeout02();
	}

	@Override
	protected ImageIcon getImageIconRight() {
		return ImageLoader.getImageIconTimeout01();
	}

	@Override
	protected Boolean isInverted() {
		return true;
	}

	@Override
	protected void setSliderValueToManagement(Integer value) {
		ManagementAutomaticRepeatRequest pipeline = ManagementAutomaticRepeatRequestImpl.getInstance();
		pipeline.setTimeout(value);
	}

	@Override
	protected String getLabel() {
		return "Timeout:";
	}

	@Override
	protected String getToolTip() {
		ToolTipManagerARQ tooltip = (ToolTipManagerARQ) management.getToolTipManager();
		return tooltip.getToolTipTimeout();
	}

	@Override
	protected Boolean isLabelsEnabled() {
		return true;
	}
}
