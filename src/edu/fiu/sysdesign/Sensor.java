/**
 * 
 */
package edu.fiu.ShengyaoFreenove;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author chris
 *
 */
public abstract class Sensor implements SelfCheckCapable {

	private int voltage;
	private double units;
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Sensor receving signal to detecting and correcting
	 */
	public void Detecting() {
		
	}
	

	public void Correcting() {
		
	}
	
}
