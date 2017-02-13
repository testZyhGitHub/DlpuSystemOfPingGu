/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dlpu.eva.struts.form;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/** 
 * MyEclipse Struts
 * Creation date: 10-22-2014
 * 
 * XDoclet definition:
 * @struts.form name="newsuploadForm"
 */
@Entity
public class NewsuploadForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;

	/** newstitle property */
	private String newstitle;

	/** mytext property */
	private String mytext;

	/** imgtitle property */
	private String imgtitle;
	
	private FormFile imgfile;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getNewstitle() == null || getNewstitle().length() < 1) {
			errors.add("newstitle", new ActionMessage("error.newstitle.required"));
			// TODO: add 'error.username.required' key to your resources
		}
		return errors;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the newstitle.
	 * @return String
	 */
	public String getNewstitle() {
		return newstitle;
	}

	/** 
	 * Set the newstitle.
	 * @param newstitle The newstitle to set
	 */
	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}

	/** 
	 * Returns the mytext.
	 * @return String
	 */
	public String getMytext() {
		return mytext;
	}

	/** 
	 * Set the mytext.
	 * @param mytext The mytext to set
	 */
	public void setMytext(String mytext) {
		this.mytext = mytext;
	}

	/** 
	 * Returns the imgtitle.
	 * @return String
	 */
	public String getImgtitle() {
		return imgtitle;
	}

	/** 
	 * Set the imgtitle.
	 * @param imgtitle The imgtitle to set
	 */
	public void setImgtitle(String imgtitle) {
		this.imgtitle = imgtitle;
	}

	public FormFile getImgfile() {
		return imgfile;
	}

	public void setImgfile(FormFile imgfile) {
		this.imgfile = imgfile;
	}
	
	
	
}