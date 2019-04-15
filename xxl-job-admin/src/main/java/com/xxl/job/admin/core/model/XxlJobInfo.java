package com.xxl.job.admin.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * xxl-job info
 *
 * @author xuxueli  2016-1-12 18:25:49
 */
@Entity
@Table(name = "SZBDC_TRIGGER_INFO")
public class XxlJobInfo {
	@Id
	@Column(name = "ID")
	private Long id;				// 主键ID	    (JobKey.name)
	
	@Column(name = "JOB_GROUP")
	private Long jobGroup;		// 执行器主键ID	(JobKey.group)
	@Column(name = "JOB_CRON")
	private String jobCron;		// 任务执行CRON表达式 【base on quartz】
	@Column(name = "JOB_DESC")
	private String jobDesc;
	
	@Column(name = "ADD_TIME")
	private Date addTime;
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	@Column(name = "AUTHOR")
	private String author;		// 负责人
	@Column(name = "ALARM_EMAIL")
	private String alarmEmail;	// 报警邮件

	@Column(name = "EXECUTOR_ROUTE_STRATEGY")
	private String executorRouteStrategy;	// 执行器路由策略
	@Column(name = "EXECUTOR_HANDLER")
	private String executorHandler;		    // 执行器，任务Handler名称
	@Column(name = "EXECUTOR_PARAM")
	private String executorParam;		    // 执行器，任务参数
	@Column(name = "EXECUTOR_BLOCK_STRATEGY")
	private String executorBlockStrategy;	// 阻塞处理策略
	@Column(name = "EXECUTOR_TIMEOUT")
	private Integer executorTimeout;     		// 任务执行超时时间，单位秒
	@Column(name = "EXECUTOR_FAIL_RETRY_COUNT")
	private Integer executorFailRetryCount;		// 失败重试次数
	
	@Column(name = "GLUE_TYPE")
	private String glueType;		// GLUE类型	#com.xxl.job.core.glue.GlueTypeEnum
	@Column(name = "GLUE_SOURCE")
	private String glueSource;		// GLUE源代码
	@Column(name = "GLUE_REMARK")
	private String glueRemark;		// GLUE备注
	@Column(name = "GLUE_UPDATETIME")
	private Date glueUpdatetime;	// GLUE更新时间

	@Column(name = "CHILD_JOBID")
	private String childJobId;		// 子任务ID，多个逗号分隔
	
	// copy from quartz
	private String jobStatus;		// 任务状态 【base on quartz】

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(Long jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobCron() {
		return jobCron;
	}

	public void setJobCron(String jobCron) {
		this.jobCron = jobCron;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAlarmEmail() {
		return alarmEmail;
	}

	public void setAlarmEmail(String alarmEmail) {
		this.alarmEmail = alarmEmail;
	}

	public String getExecutorRouteStrategy() {
		return executorRouteStrategy;
	}

	public void setExecutorRouteStrategy(String executorRouteStrategy) {
		this.executorRouteStrategy = executorRouteStrategy;
	}

	public String getExecutorHandler() {
		return executorHandler;
	}

	public void setExecutorHandler(String executorHandler) {
		this.executorHandler = executorHandler;
	}

	public String getExecutorParam() {
		return executorParam;
	}

	public void setExecutorParam(String executorParam) {
		this.executorParam = executorParam;
	}

	public String getExecutorBlockStrategy() {
		return executorBlockStrategy;
	}

	public void setExecutorBlockStrategy(String executorBlockStrategy) {
		this.executorBlockStrategy = executorBlockStrategy;
	}

	public Integer getExecutorTimeout() {
		return executorTimeout;
	}

	public void setExecutorTimeout(Integer executorTimeout) {
		this.executorTimeout = executorTimeout;
	}

	public Integer getExecutorFailRetryCount() {
		return executorFailRetryCount;
	}

	public void setExecutorFailRetryCount(Integer executorFailRetryCount) {
		this.executorFailRetryCount = executorFailRetryCount;
	}

	public String getGlueType() {
		return glueType;
	}

	public void setGlueType(String glueType) {
		this.glueType = glueType;
	}

	public String getGlueSource() {
		return glueSource;
	}

	public void setGlueSource(String glueSource) {
		this.glueSource = glueSource;
	}

	public String getGlueRemark() {
		return glueRemark;
	}

	public void setGlueRemark(String glueRemark) {
		this.glueRemark = glueRemark;
	}

	public Date getGlueUpdatetime() {
		return glueUpdatetime;
	}

	public void setGlueUpdatetime(Date glueUpdatetime) {
		this.glueUpdatetime = glueUpdatetime;
	}

	public String getChildJobId() {
		return childJobId;
	}

	public void setChildJobId(String childJobId) {
		this.childJobId = childJobId;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}


	

}
