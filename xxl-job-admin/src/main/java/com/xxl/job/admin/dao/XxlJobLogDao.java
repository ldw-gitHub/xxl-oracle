package com.xxl.job.admin.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xxl.job.admin.core.model.XxlJobLog;

/**
 * job log
 * @author xuxueli 2016-1-12 18:03:06
 */
public interface XxlJobLogDao {

	// exist jobId not use jobGroup, not exist use jobGroup
	public List<XxlJobLog> pageList(@Param("jobGroup") Long jobGroup,
									@Param("jobId") Long jobId,
									@Param("triggerTimeStart") Date triggerTimeStart,
									@Param("triggerTimeEnd") Date triggerTimeEnd,
									@Param("logStatus") Integer logStatus);
	public Integer pageListCount(@Param("offset") Integer offset,
							 @Param("pagesize") Integer pagesize,
							 @Param("jobGroup") Integer jobGroup,
							 @Param("jobId") Integer jobId,
							 @Param("triggerTimeStart") Date triggerTimeStart,
							 @Param("triggerTimeEnd") Date triggerTimeEnd,
							 @Param("logStatus") Integer logStatus);
	
	public XxlJobLog load(@Param("id") Long id);

	public Integer save(XxlJobLog xxlJobLog);

	public Integer updateTriggerInfo(XxlJobLog xxlJobLog);

	public Integer updateHandleInfo(XxlJobLog xxlJobLog);
	
	public Integer delete(@Param("jobId") Long jobId);

	public Integer triggerCountByHandleCode(@Param("handleCode") Integer handleCode);

	public List<Map<String, Object>> triggerCountByDay(@Param("from") Date from,
													   @Param("to") Date to);

	public Integer clearLog(@Param("jobGroup") Long jobGroup,
						@Param("jobId") Long jobId,
						@Param("clearBeforeTime") Date clearBeforeTime,
						@Param("clearBeforeNum") Integer clearBeforeNum);

	public List<Long> findFailJobLogIds(@Param("pagesize") Integer pagesize);

	public Integer updateAlarmStatus(@Param("logId") Long logId,
								 @Param("oldAlarmStatus") Integer oldAlarmStatus,
								 @Param("newAlarmStatus") Integer newAlarmStatus);

}
