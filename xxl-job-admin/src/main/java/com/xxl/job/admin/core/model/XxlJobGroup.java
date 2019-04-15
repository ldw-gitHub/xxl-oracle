package com.xxl.job.admin.core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by xuxueli on 16/9/30.
 */
@Entity
@Table(name = "SZBDC_TRIGGER_GROUP")
public class XxlJobGroup {

	@Id
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "APP_NAME")
    private String appName;
	@Column(name = "TITLE")
    private String title;
	@Column(name = "\"ORDER\"")
    private Integer order;
	@Column(name = "ADDRESS_TYPE")
    private Integer addressType;
	@Column(name = "ADDRESS_LIST")   // 执行器地址类型：0=自动注册、1=手动录入
    private String addressList;     // 执行器地址列表，多地址逗号分隔(手动录入)

    // registry list
    //private List<String> registryList;  // 执行器地址列表(系统注册)
    public List<String> getRegistryList() {
    	List<String> registryList = null;
        if (StringUtils.isNotBlank(addressList)) {
            registryList = new ArrayList<String>(Arrays.asList(addressList.split(",")));
        }
        return registryList;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getAddressType() {
		return addressType;
	}
	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}
	public String getAddressList() {
		return addressList;
	}
	public void setAddressList(String addressList) {
		this.addressList = addressList;
	}



}
