/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */

package point;

import java.awt.Color;

import enumeration.EnumPoint;

public class PointErrorImpl extends PointAbstract implements PointError {

	public PointErrorImpl() {
		
	}
	
	public PointErrorImpl(Integer connection1, Integer connection2) {
		super(connection1, connection2);
	}
	
	@Override
	public Color getColor() {
		return Color.RED;
	}

	@Override
	public EnumPoint getType() {
		return EnumPoint.ERROR;
	}
}
