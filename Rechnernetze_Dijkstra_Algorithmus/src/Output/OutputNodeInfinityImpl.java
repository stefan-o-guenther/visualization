/**
 * @author:	Stefan Otto Günther
 * @date:	08.02.2014
 */

package Output;

import Enum.EnumNodeOutputType;



public class OutputNodeInfinityImpl extends OutputAbstract implements OutputNodeInfinity {

	public OutputNodeInfinityImpl() {
		super();
	}
	
	@Override
	public EnumNodeOutputType getNodeOutputType() {
		return EnumNodeOutputType.INFINITY;
	}

	@Override
	public String toString() {
		return Character.toString('\u221E');
	}
}
