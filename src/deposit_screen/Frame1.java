package deposit_screen;

import java.awt.*;
import javax.swing.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Frame1
    extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();

  public Frame1() {
    try {
      jbInit();
    }
    catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
	 
    getContentPane().setLayout(borderLayout1);
    jLabel1.setText("jLabel1");
    jTextField1.setText("jTextField1");
    this.getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);
    this.getContentPane().add(jTextField1, java.awt.BorderLayout.NORTH);
  }

  public static void main(String[] args) {
    
  }
}
