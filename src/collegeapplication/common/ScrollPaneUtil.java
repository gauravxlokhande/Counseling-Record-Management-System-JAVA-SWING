package collegeapplication.common;

import java.awt.Adjustable;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


/* Made by : Gaurav Lokhande
 * Mail : gaurravlokhande@gmail.com
 * linkedin : https://www.linkedin.com/in/gauravlokhande
 * github : https://github.com/gaurravlokhande
 * Title : ScrollPaneUtil.java
 * Purpose : To set scroll bar at bottom 
 * Reference : https://stackoverflow.com/ 
 */


public class ScrollPaneUtil {

	public static void scrollToBottom(JScrollPane scrollPane) 
	{
	    JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
	    AdjustmentListener downScroller = new AdjustmentListener() 
	    {
	        @Override
	        public void adjustmentValueChanged(AdjustmentEvent e) 
	        {
	            Adjustable adjustable = e.getAdjustable();
	            adjustable.setValue(adjustable.getMaximum());
	            verticalBar.removeAdjustmentListener(this);
	        }
	    };
	    verticalBar.addAdjustmentListener(downScroller);
	}
}
