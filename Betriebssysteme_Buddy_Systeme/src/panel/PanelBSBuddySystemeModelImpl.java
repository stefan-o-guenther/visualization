/**
 * @author:	Stefan Otto G�nther
 * @date:	27.01.2014
 */

package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import management.ManagementBuddyMemoryAllocation;
import management.ManagementBuddyMemoryAllocationImpl;
import enumeration.EnumNode;
import buddy.BuddyOperation;
import buddy.BuddySpace;

public class PanelBSBuddySystemeModelImpl extends PanelDrawingAbstract {

	private static final long serialVersionUID = 1L;

	public PanelBSBuddySystemeModelImpl() {
		super();
		this.createPanel();
	}

	private List<BuddyOperation> list = new ArrayList<BuddyOperation>();	
	
	private final Integer WIDTH = 512;
	private final Integer HEIGHT = 20;
	private final Integer GAP_X = 10;
	private final Integer GAP_Y = 10;	
	
	@Override
	protected void doDrawing() {
		ManagementBuddyMemoryAllocation buddy = ManagementBuddyMemoryAllocationImpl.getInstance();
		
		Integer height = 0;
		Integer size = buddy.getTotalSpace();					
		if (size > 0) {
			list = buddy.getNodeList();
			Integer length = list.size();			
			for (Integer i = 0; i < length; i++) {
				BuddyOperation operation = list.get(i);				
				List<BuddySpace> listbs = operation.getBuddyList();
				if (listbs != null) {
					Integer sum = 0;
					for (BuddySpace bs : listbs) {
						Integer widthNode = (bs.getSize() * WIDTH) / size;;						
						g2d.setColor(Color.BLACK);
						g2d.drawRect(sum+GAP_X, i*(HEIGHT+GAP_Y)+GAP_Y, widthNode, HEIGHT);
						EnumNode type = bs.getType();
						if (type != null) {
							Color color = null;
							switch (type) {
								case BUDDY: color = buddy.getColorBuddy(); break;
								case SPACE: color = buddy.getColorProcessNode(bs.getName()); break;
								case REST: color = buddy.getColorRest(); break;
								case USED: color = buddy.getColorUsed(); break;								
								default: color = Color.WHITE; break;								
							}
							g2d.setColor(color);
							g2d.fillRect(sum+GAP_X+1, i*(HEIGHT+GAP_Y)+GAP_Y+1, widthNode-1, HEIGHT-1);
							if (type == EnumNode.SPACE) {
								g2d.setColor(Color.BLACK);
								g2d.drawString(bs.getName(), sum+GAP_X+2, i*(HEIGHT+GAP_Y)+GAP_Y+15);
							}							
							sum += widthNode;
						}					
					}
					g2d.setColor(Color.BLACK);
					g2d.drawString(operation.getMessage(), WIDTH+20, i*(HEIGHT+GAP_Y)+GAP_Y+5+(HEIGHT/2));
				}				
			}
			height = (length-1)*(HEIGHT+GAP_Y)+GAP_Y+HEIGHT+GAP_Y;
		}
		Dimension area = new Dimension(0,0);		
		area.height = height;											                
        setPreferredSize(area);
        revalidate();
	}
	
	@Override
	protected void createDrawing() {
		
	}

	@Override
	public Integer getPanelHeight() {
		return 100;
	}

	@Override
	public Integer getPanelWidth() {
		return 100;
	}
}
