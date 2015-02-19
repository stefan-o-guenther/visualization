package main;
/**
 * @author:	Stefan Otto Günther
 * @date:	27.01.2014
 */


import panel.PanelBSSeitenersetzungsstrategienMainImpl;

public class Seitenersetzungsstrategien extends VisualizationAbstract {

	public Seitenersetzungsstrategien() {
		super();
	}
	
	public static void main(String[] args) {
		initialize();		
    	baseVisualization(new PanelBSSeitenersetzungsstrategienMainImpl());	
    }
}