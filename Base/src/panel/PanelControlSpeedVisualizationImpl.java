package panel;
/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */


import imageloader.ImageLoader;

import javax.swing.ImageIcon;

import tooltip.ToolTipManager;
import management.Management;

public class PanelControlSpeedVisualizationImpl extends PanelControlSliderAbstract {

	private static final long serialVersionUID = 1L;
	
	public PanelControlSpeedVisualizationImpl(Management management) {
		super(management);
		this.createPanel();
	}
	
	@Override
	protected Integer getMax() {
		return 2000;
	}

	@Override
	protected Integer getMin() {
		return 125;
	}

	@Override
	protected Integer getStep() {
		return 125;
	}

	@Override
	protected Integer getInit() {
		return 1000;
	}

	@Override
	protected ImageIcon getImageIconLeft() {
		return ImageLoader.getImageIconTurtle();
	}

	@Override
	protected ImageIcon getImageIconRight() {
		return ImageLoader.getImageIconRabbit();
	}

	@Override
	protected Boolean isInverted() {
		return true;
	}

	@Override
	protected void setSliderValueToManagement(Integer value) {
		if (management != null) {
			management.setSpeed(value);
		}
	}

	@Override
	protected String getLabel() {
		return "Geschwindigkeit:";
	}

	@Override
	protected String getToolTip() {
		ToolTipManager tooltip = management.getToolTipManager();
		return tooltip.getToolTipAutomaticSlider();
	}

	@Override
	protected Boolean isLabelsEnabled() {
		return false;
	}
}
