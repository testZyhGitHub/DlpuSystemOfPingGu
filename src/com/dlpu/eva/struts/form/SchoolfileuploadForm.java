/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dlpu.eva.struts.form;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/** 
 * MyEclipse Struts
 * Creation date: 10-27-2014
 * 
 * XDoclet definition:
 * @struts.form name="schoolfileuploadForm"
 */
@Entity
public class SchoolfileuploadForm extends ActionForm {
	/*
	 * Generated Methods
	 */
	private String thenumber;
	private String thetitle;
	private String filetitle;
	private String thedate;
	private FormFile thefile;
	private String mytext;

	
	
	public String getThenumber() {
		return thenumber;
	}

	public void setThenumber(String thenumber) {
		this.thenumber = thenumber;
	}

	public String getThetitle() {
		return thetitle;
	}

	public void setThetitle(String thetitle) {
		this.thetitle = thetitle;
	}

	public String getFiletitle() {
		return filetitle;
	}

	public void setFiletitle(String filetitle) {
		this.filetitle = filetitle;
	}

	
	
	public String getThedate() {
		return thedate;
	}

	public void setThedate(String thedate) {
		this.thedate = thedate;
	}

	public FormFile getThefile() {
		return thefile;
	}

	public void setThefile(FormFile thefile) {
		this.thefile = thefile;
	}

	
	

	public String getMytext() {
		return mytext;
	}

	public void setMytext(String mytext) {
		this.mytext = mytext;
	}

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}
}