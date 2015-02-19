/**
 * @author:	Stefan Otto Günther
 * @date:	01.07.2014
 */

package space;

import java.awt.Color;

import base.Checker;
import enumeration.EnumSpace;
import enumeration.EnumSurface;

public class SpaceFullImpl extends SpaceAbstract implements SpaceFull {

	public SpaceFullImpl(Integer value) {
		super(value);
	}

	@Override
	public EnumSpace getType() {
		return EnumSpace.FULL;
	}

	@Override
	public Color getColorFont(EnumSurface surface) {
		try {
			Checker.checkIfNotNull(surface);
			return Color.BLACK;
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public Color getColorBox(EnumSurface surface) {
		try {
			Checker.checkIfNotNull(surface);
			return Color.BLACK;
		} catch (Exception ex) {
			throw ex;
		}				
	}
}
