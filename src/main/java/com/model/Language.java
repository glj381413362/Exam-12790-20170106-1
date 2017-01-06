package com.model;

import java.io.Serializable;
import java.util.Date;

public class Language implements Serializable  {

	private static final long serialVersionUID = 1L;
	private Integer languageId;
	private String name;
	private Date lastUpdate;
	private Integer limitStart;
	private Integer limitEnd;
	private String strSqlWhere;
	private String strSqlOrderBy;
	/**
	 * 
	 * @return 
	 */
	public Integer getLanguageId() {
		return languageId;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	/**
	 * 
	 * @return 
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return 
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * 
	 * @return 分页查询起期
	 */
	public Integer getLimitStart() {
		return limitStart;
	}

	/**
	 * 
	 * @param fbMonth 分页查询起期
	 */
	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * 
	 * @return 分页查询止期
	 */
	public Integer getLimitEnd() {
		return limitEnd;
	}

	/**
	 * 
	 * @param fbMonth 分页查询止期
	 */
	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * 
	 * @return 自定义sqlWhere
	 */
	public String getStrSqlWhere() {
		return strSqlWhere;
	}

	/**
	 * 
	 * @param fbMonth 自定义sqlWhere
	 */
	public void setStrSqlWhere(String strSqlWhere) {
		this.strSqlWhere = strSqlWhere;
	}

	/**
	 * 
	 * @return 自定义order by
	 */
	public String getStrSqlOrderBy() {
		return strSqlOrderBy;
	}

	/**
	 * 
	 * @param fbMonth 自定义order by
	 */
	public void setStrSqlOrderBy(String strSqlOrderBy) {
		this.strSqlOrderBy = strSqlOrderBy;
	}


}