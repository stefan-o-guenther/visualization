/**
 * @author:	Stefan Otto G�nther
 * @date:	08.02.2014
 */

package Output;

import ColorGetter.ColorGetter;
import Enum.EnumOutputStatus;


public interface Output extends ColorGetter {
	public EnumOutputStatus getStatus();
	public void setStatus(EnumOutputStatus value);
}
