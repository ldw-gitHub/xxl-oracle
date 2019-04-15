package com.xxl.job.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxl.job.admin.base.BaseDao;
import com.xxl.job.admin.core.model.XxlJobGroup;

/**
 * Created by xuxueli on 16/9/30.
 */
public interface XxlJobGroupDao extends BaseDao<XxlJobGroup>{

    public List<XxlJobGroup> findAll();

    public List<XxlJobGroup> findByAddressType(@Param("addressType") int addressType);

    public int save(XxlJobGroup xxlJobGroup);

    //public int update(XxlJobGroup xxlJobGroup);

    public int remove(@Param("id") Long id);

    public XxlJobGroup load(@Param("id") Long id);
}
