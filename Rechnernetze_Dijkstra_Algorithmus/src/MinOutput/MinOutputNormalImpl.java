/**
 * @author:	Stefan Otto G�nther
 * @date:	08.02.2014
 */

package MinOutput;

import java.awt.Color;

import enumeration.EnumSurface;
import Enum.EnumMinOutputType;

public class MinOutputNormalImpl implements MinOutputNormal {

	public MinOutputNormalImpl() {
		name = "";
	}
	
	public MinOutputNormalImpl(String value) {
		this();
		if (value != null) {
			name = value;
		}
	}
	
	private String name;
	
	@Override
	public EnumMinOutputType getType() {
		return EnumMinOutputType.NORMAL;
	}

	@Override
	public Color getColor(EnumSurface surface) {
		return Color.BLACK;
	}

	@Override
	public String getNodeName() {
		return name;
	}

	@Override
	public void setNodeName(String value) {
		if (value != null) {
			name = value;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}
