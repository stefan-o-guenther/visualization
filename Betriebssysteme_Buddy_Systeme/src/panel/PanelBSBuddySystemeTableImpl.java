/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import javax.swing.table.TableColumnModel;

import table.TableCellRendererBSBuddySystemeExplanationImpl;
import table.TableColumnModelExplanationImpl;
import table.TableModelBSBuddySystemeExplanationImpl;
import table.TableModelExplanationAbstract;
import enumeration.EnumScrollbarPolicy;

public class PanelBSBuddySystemeTableImpl extends PanelScrollTableAbstract {
	
	private static final long serialVersionUID = 1L;
	
	public PanelBSBuddySystemeTableImpl() {
		super(EnumScrollbarPolicy.NEVER, EnumScrollbarPolicy.ALWAYS);
		this.createPanel();
	}
	
	@Override
	public Integer getPanelHeight() {
		return 50;
	}

	@Override
	public Integer getPanelWidth() {
		return 150;
	}

	@Override
	protected TableModelExplanationAbstract getNewTableModel() {
		return new TableModelBSBuddySystemeExplanationImpl();
	}

	@Override
	protected TableColumnModel getNewTableColumnModel() {		
		return new TableColumnModelExplanationImpl(new TableCellRendererBSBuddySystemeExplanationImpl());
	}
}
