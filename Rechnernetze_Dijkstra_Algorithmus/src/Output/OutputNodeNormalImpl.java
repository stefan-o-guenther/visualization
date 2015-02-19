/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */

package Output;

import Enum.EnumNodeOutputType;



public class OutputNodeNormalImpl extends OutputAbstract implements OutputNodeNormal {

	public OutputNodeNormalImpl() {
		super();
		name = "";
		weight = 0;		
	}
	
	public OutputNodeNormalImpl(String vName, Integer vWeight) {
		this();
		if (vName != null) {
			name = vName;
		}		
		if (vWeight != null) {
			weight = vWeight;
		}		
	}
	
	private String name;
	private Integer weight;
	
	@Override
	public EnumNodeOutputType getNodeOutputType() {
		return EnumNodeOutputType.NORMAL;
	}
		
	@Override
	public String getPreviousNodeName() {
		return name;
	}

	@Override
	public void setPreviousNodeName(String value) {
		if (value != null) {
			name = value;
		}
	}

	@Override
	public Integer getWeightToAccess() {
		return weight;
	}

	@Override
	public void setWeightToAccess(Integer value) {
		if (value != null) {
			weight = value;
		}
	}

	@Override
	public String toString() {
		return (weight.toString() + ", " + name) ;
	}
}
