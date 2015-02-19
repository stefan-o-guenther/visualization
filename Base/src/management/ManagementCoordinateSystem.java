package management;

import enumeration.EnumCoordinateSystem;

/**
 * @author:	Stefan Otto G�nther
 * @date:	01.06.2014
 */


public interface ManagementCoordinateSystem extends ManagementGeometry {

	public Integer getArrowLength();	
	public EnumCoordinateSystem getPosition();
}
