/**
 * @author:	Stefan Otto G�nther
 * @date:	09.09.2014
 */

package Version_B;

import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

import enumeration.EnumSurface;
import Management.ManagementDijkstraAlgorithm;
import Management.ManagementDijkstraAlgorithmImpl;
import MinOutput.MinOutput;
import Output.OutputNode;

public class TableCellRendererRNDijkstraAlgorithmImpl implements TableCellRenderer {

	public TableCellRendererRNDijkstraAlgorithmImpl() {
		super();		
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		ManagementDijkstraAlgorithm dijkstra = ManagementDijkstraAlgorithmImpl.getInstance();
		EnumSurface surface = dijkstra.getSurface();
		List<String> listNames = dijkstra.getListNodeTargetNames();
		List<MinOutput> listMinOutput = dijkstra.getListMin();
		int sizeListNames = listNames.size();		
		JLabel label = new JLabel(value.toString());
		label.setOpaque(true);
		Border b = BorderFactory.createEmptyBorder(1, 5, 1, 1);
		label.setBorder(b);
		label.setFont(table.getFont());
		label.setForeground(Color.BLACK);
		label.setBackground(Color.WHITE);
		if ((column > 0) && (column <= sizeListNames)) {
			String name = listNames.get(column-1);
			List<OutputNode> listNodeOutput = dijkstra.getListNodeOutput(name);
			if (row < listNodeOutput.size()) {
				OutputNode nodeOutput = listNodeOutput.get(row);
				Color color = nodeOutput.getColor(surface);
				label.setForeground(color);
			}
		} else if (column == (sizeListNames+1)) {
			if (row < listMinOutput.size()) {
				MinOutput minOutput = listMinOutput.get(row);
				Color color = minOutput.getColor(surface);
				label.setForeground(color);
			}
		}
		return label;
	}
}