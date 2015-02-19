/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package point;

import java.awt.Color;

import enumeration.EnumPoint;

public class PointRouteImpl extends PointAbstract implements PointRoute {

	public PointRouteImpl() {
		
	}
	
	public PointRouteImpl(Integer connection1, Integer connection2) {
		super(connection1, connection2);
	}
	
	@Override
	public Color getColor() {
		return Color.WHITE;
	}

	@Override
	public EnumPoint getType() {
		return EnumPoint.ROUTE;
	}
}
