package com.qtprinting.ext.jamesmailet;

import javax.mail.MessagingException;

import org.apache.mailet.GenericRecipientMatcher;
import org.apache.mailet.MailAddress;

public class NSLookupMatcher extends GenericRecipientMatcher {

	public NSLookupMatcher() {
		// TODO Auto-generated constructor stub
	}

	public boolean matchRecipient(MailAddress recipient)
			throws MessagingException {
		// TODO Auto-generated method stub
		return true;
	}

}
