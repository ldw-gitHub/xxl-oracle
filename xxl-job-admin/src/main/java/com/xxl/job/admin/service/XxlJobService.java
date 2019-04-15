package com.xxl.job.admin.service;


import java.util.Date;
import java.util.Map;

import com.xxl.job.admin.core.model.Paging;
import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.core.biz.model.ReturnT;

/**
 * core job action for xxl-job
 * 
 * @author xuxueli 2016-5-28 15:30:33
 */
public interface XxlJobService {

	/**
	 * page list
	 *
	 * @param start
	 * @param length
	 * @param jobGroup
	 * @param jobDesc
	 * @param executorHandler
	 * @param filterTime
	 * @return
	 */
	public Map<String, Object> pageList(Paging page, Long jobGroup, String jobDesc, String executorHandler, String filterTime);

	/**
	 * add job, default quartz stop
	 *
	 * @param jobInfo
	 * @return
	 */
	public ReturnT<String> add(XxlJobInfo jobInfo);

	/**
	 * update job, update quartz-cron if started
	 *
	 * @param jobInfo
	 * @return
	 */
	public ReturnT<String> update(XxlJobInfo jobInfo);

	/**
	 * remove job, unbind quartz
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> remove(Long id);

	/**
	 * start job, bind quartz
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> start(Long id);

	/**
	 * stop job, unbind quartz
	 *
	 * @param id
	 * @return
	 */
	public ReturnT<String> stop(Long id);

	/**
	 * dashboard info
	 *
	 * @return
	 */
	public Map<String,Object> dashboardInfo();

	/**
	 * chart info
	 *
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public ReturnT<Map<String,Object>> chartInfo(Date startDate, Date endDate);

}
