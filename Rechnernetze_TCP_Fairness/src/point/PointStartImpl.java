/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package point;

import java.awt.Color;

import enumeration.EnumPoint;

public class PointStartImpl extends PointAbstract implements PointStart {

	public PointStartImpl() {
		
	}
	
	public PointStartImpl(Integer connection1, Integer connection2) {
		super(connection1, connection2);
	}
	
	@Override
	public Color getColor() {
		return Color.BLACK;
	}

	@Override
	public EnumPoint getType() {
		return EnumPoint.START;
	}
}
