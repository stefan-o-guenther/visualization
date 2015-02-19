/**
 * @author:	Stefan Otto Günther
 * @date:	10.02.2014
 */

package combobox;

import javax.swing.JComboBox;

import enumeration.EnumARQStrategy;

public class ComboBoxStrategy extends JComboBox<Object> {

	private static final long serialVersionUID = 1L;

	public ComboBoxStrategy() {
		super(strategies);		
	}
	
	private static String[] strategies = {"Go Back N", "Selective Repeat"};
	private static EnumARQStrategy[] vals = {EnumARQStrategy.GO_BACK_N, EnumARQStrategy.SELECTIVE_REPEAT};
		
	public EnumARQStrategy getStrategy() {
		return  vals[super.getSelectedIndex()];
	}
}