/**
 * 
 */
package com.qtprinting.ext.jamesmailet;

//import org.apache.mailet.Mail;
//import org.apache.mailet.MailAddress;
//import org.apache.mailet.base.GenericMailet;
import javax.mail.MessagingException;


import org.apache.mailet.GenericMailet;
import org.apache.mailet.Mail;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.Type;


/**
 * @author Wong
 *
 */
public class NSLookupMailet extends GenericMailet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void service(Mail mail) throws MessagingException {
		// TODO Auto-generated method stub
		String  addr = mail.getRemoteHost();
		if (NSLookup.aQuery(addr)!=true){
			throw new MessagingException("host: "+addr + " is not A Domain record");
		}
		if (NSLookup.mxQuery(addr)!=true){
			throw new MessagingException("host: "+addr + " is not MX record");
		}
		
	}

}
