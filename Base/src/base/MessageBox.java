package base;

/**
 * @author:	Stefan Otto G�nther
 * @date:	01.06.2014
 */


import javax.swing.JOptionPane;

import labeling.Labeling;

public class MessageBox {

	public static void showErrorMessage(String message) {
		try {
			if (message == null) {
				throw new NullPointerException();
			}
			Object[] option = {Labeling.CLOSE};
			JOptionPane.showOptionDialog(null,
					message,
				    Labeling.ERROR,
				    JOptionPane.ERROR_MESSAGE,
				    JOptionPane.ERROR_MESSAGE,
				    null,
				    option,
				    option[0]);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
