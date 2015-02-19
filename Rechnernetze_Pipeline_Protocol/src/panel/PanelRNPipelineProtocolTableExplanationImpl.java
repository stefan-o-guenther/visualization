/**
 * @author:	Stefan Otto Günther
 * @date:	09.09.2014
 */

package panel;

import javax.swing.table.TableColumnModel;

import table.TableCellRendererRNPipelineProtocolExplanationImpl;
import table.TableColumnModelExplanationImpl;
import table.TableModelExplanationAbstract;
import table.TableModelRNPipelineProtocolExplanationImpl;
import enumeration.EnumScrollbarPolicy;

public class PanelRNPipelineProtocolTableExplanationImpl extends PanelScrollTableAbstract {
	
	private static final long serialVersionUID = 1L;
	
	public PanelRNPipelineProtocolTableExplanationImpl() {
		super(EnumScrollbarPolicy.NEVER, EnumScrollbarPolicy.AS_NEEDED);
		this.createPanel();
	}
	
	@Override
	public Integer getPanelHeight() {
		return 100;
	}

	@Override
	public Integer getPanelWidth() {
		return 200;
	}

	@Override
	protected TableModelExplanationAbstract getNewTableModel() {
		return new TableModelRNPipelineProtocolExplanationImpl();
	}

	@Override
	protected TableColumnModel getNewTableColumnModel() {		
		return new TableColumnModelExplanationImpl(new TableCellRendererRNPipelineProtocolExplanationImpl());
	}
}
