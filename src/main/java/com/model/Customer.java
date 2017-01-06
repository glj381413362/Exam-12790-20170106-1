package com.model;

import java.util.Date;
import java.io.Serializable;

public class Customer implements Serializable  {

	private static final long serialVersionUID = 1L;
	private Short customerId;
	private Integer storeId;
	private String firstName;
	private String lastName;
	private String email;
	private Short addressId;
	private Boolean active;
	private Date createDate;
	private Date lastUpdate;
	private Integer limitStart;
	private Integer limitEnd;
	private String strSqlWhere;
	private String strSqlOrderBy;
	/**
	 * 
	 * @return 
	 */
	public Short getCustomerId() {
		return customerId;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setCustomerId(Short customerId) {
		this.customerId = customerId;
	}

	/**
	 * 
	 * @return 
	 */
	public Integer getStoreId() {
		return storeId;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	/**
	 * 
	 * @return 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return 
	 */
	public Short getAddressId() {
		return addressId;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setAddressId(Short addressId) {
		this.addressId = addressId;
	}

	/**
	 * 
	 * @return 
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * 
	 * @return 
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 
	 * @param fbMonth 
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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