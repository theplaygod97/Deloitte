package com.customtag;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomnameTag extends TagSupport{
		public CustomnameTag() {
			// TODO Auto-generated constructor stub
		}
		
	private  int noOfTimes = 3;
	private String nameToPrint;

	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
	     for(int i=0;i<=noOfTimes;i++)
	     {
	    	 try {
				out.println("<h1>"+nameToPrint+"</h1>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		
		
		
		return super.doStartTag();
	}


	public int getNoOfTimes() {
		return noOfTimes;
	}


	public void setNoOfTimes(int noOfTimes) {
		this.noOfTimes = noOfTimes;
	}


	public String getNameToPrint() {
		return nameToPrint;
	}


	public void setNameToPrint(String nameToPrint) {
		this.nameToPrint = nameToPrint;
	}

	
		
		
	}

