package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Nametag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		
		
		JspWriter out=pageContext.getOut();
		
		try {
			int i=0;
			
			out.println("MY NAME IS SANDEEP<br/>");
			/*/out.println("Block \"C\" Divyasree Technopolis<br/>");
			out.println("Survey No: 123 &132/2<br/>");
			out.println("Yemlur Post<br/>");
			out.println("Off Old Airport Road Karnataka 560037<br/>");*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
		
}
}
