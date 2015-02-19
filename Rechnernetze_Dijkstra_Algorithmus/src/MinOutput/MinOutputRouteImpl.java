/**
 * @author:	Stefan Otto Günther
 * @date:	08.02.2014
 */

package MinOutput;

import java.awt.Color;

import enumeration.EnumSurface;
import Enum.EnumMinOutputType;

public class MinOutputRouteImpl implements MinOutputRoute {

	public MinOutputRouteImpl() {
		weight = 0;
	}
	
	public MinOutputRouteImpl(Integer value) {
		this();
		if (value != null) {
			weight = value;
		}
	}
	
	private Integer weight;
	
	@Override
	public EnumMinOutputType getType() {
		return EnumMinOutputType.ROUTE;
	}

	@Override
	public Color getColor(EnumSurface surface) {
		if (surface != null) {
			if (surface == EnumSurface.COLORED) {
				return new Color(50,205,50);
			} else if (surface == EnumSurface.GRAY) {
				return Color.GRAY;
			}
		}
		return Color.BLACK;
	}

	@Override
	public Integer getWeight() {
		return weight;
	}

	@Override
	public void setWeight(Integer value) {
		if (value != null) {
			weight = value;
		}
	}

	@Override
	public String toString() {
		return weight.toString();
	}
}
