/**
 * 
 */
package com.qtprinting.ext.jamesmailet;

import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.Type;

/**
 * @author Wong
 *
 */
public class NSLookup {

	/**
	 * 
	 */
	public NSLookup() {
		// TODO Auto-generated constructor stub
	}

	

	public static boolean mxQuery(String host){
		try{
			Lookup lookup = new Lookup(host, Type.MX);
			lookup.run();
			if (lookup.getResult() != Lookup.SUCCESSFUL){
			    return false;
			}
			Record[] answers = lookup.getAnswers();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public static boolean aQuery(String host){
		try{
			Lookup lookup = new Lookup(host, Type.A);
			lookup.run();
			if (lookup.getResult() != Lookup.SUCCESSFUL){
			    return false;
			}
			Record[] answers = lookup.getAnswers();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
}
