/**
 * @author:	Stefan Otto G�nther
 * @date:	14.01.2014
 */

package main;

import frame.FrameDefaultImpl;
import main.MainAbstract;

public class Visualisierungen extends MainAbstract {

	public Visualisierungen() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();
    	baseMain(new FrameDefaultImpl());
    }
}
