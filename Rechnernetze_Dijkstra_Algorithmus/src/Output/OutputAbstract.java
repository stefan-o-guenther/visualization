/**
 * @author:	Stefan Otto G�nther
 * @date:	08.02.2014
 */

package Output;

import java.awt.Color;

import enumeration.EnumSurface;
import Enum.EnumOutputStatus;

public abstract class OutputAbstract implements Output {

	public OutputAbstract() {
		status = EnumOutputStatus.NORMAL;
	}
	
	protected EnumOutputStatus status;
	
	protected Color getColoredColor() {
		if (status == EnumOutputStatus.ACTIVATED) {
			return Color.RED;
		} else if (status == EnumOutputStatus.ROUTE) {
			return new Color(50,205,50);
		} else if (status == EnumOutputStatus.NORMAL) {
			return Color.BLACK;
		} else {
			return Color.BLACK;
		}
	}
	
	protected Color getGrayColor() {
		if (status == EnumOutputStatus.ACTIVATED) {
			return Color.GRAY;
		} else if (status == EnumOutputStatus.ROUTE) {
			return Color.GRAY;
		} else if (status == EnumOutputStatus.NORMAL) {
			return Color.BLACK;
		} else {
			return Color.BLACK;
		}
	}	
	
	@Override
	public Color getColor(EnumSurface surface) {
		if (surface != null) {
			if (surface == EnumSurface.COLORED) {
				return getColoredColor();
			} else if (surface == EnumSurface.GRAY) {
				return getGrayColor();
			}
		}
		return Color.BLACK;
	}

	@Override
	public EnumOutputStatus getStatus() {
		return status;
	}

	@Override
	public void setStatus(EnumOutputStatus value) {
		if (value != null) {
			status = value;
		}
	}
}
