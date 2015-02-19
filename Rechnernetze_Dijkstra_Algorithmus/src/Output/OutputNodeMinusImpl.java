/**
 * @author:	Stefan Otto Günther
 * @date:	08.02.2014
 */

package Output;

import Enum.EnumNodeOutputType;



public class OutputNodeMinusImpl extends OutputAbstract implements OutputNodeMinus {

	public OutputNodeMinusImpl() {
		super();
	}
	
	@Override
	public EnumNodeOutputType getNodeOutputType() {
		return EnumNodeOutputType.MINUS;
	}

	@Override
	public String toString() {
		return "-";
	}
}
