/**
 * @author:	Stefan Otto G�nther
 * @date:	08.02.2014
 */

package MinOutput;

import ColorGetter.ColorGetter;
import Enum.EnumMinOutputType;


public interface MinOutput extends ColorGetter {
	public EnumMinOutputType getType();
}
