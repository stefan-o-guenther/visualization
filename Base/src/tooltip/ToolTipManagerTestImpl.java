package tooltip;
/**
 * @author:	Stefan Otto Günther
 * @date:	01.07.2014
 */



public class ToolTipManagerTestImpl extends ToolTipManagerAbstract implements ToolTipManagerTest {

	private static ToolTipManagerTest instance = new ToolTipManagerTestImpl();
	
	private ToolTipManagerTestImpl() {
		
	}
	
	public static ToolTipManagerTest getInstance() {
		return instance;
	}	
	
	@Override
	public String getToolTipTitle() {
		return "";
	}
}