package com.xxl.job.admin.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.github.pagehelper.PageInfo;

public class Paging implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pageNum = 1; // 当前页
	private int pageSize = 10; // 每页显示记录数
	private String orderBy; // 排序
	private long totalCount; // 总记录数
	private long totalPages; // 总页数
	private int pageCount;// 当前页记录数
	private Collection<?> items;

	public int getPageNum() {
		return pageNum;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Collection<?> getItems() {
		return items;
	}

	public void setItems(Collection<?> items) {
		this.items = items;
	}

	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotalPages() {
		if (totalCount == 0) {
			totalPages = 0;
			return totalPages;
		}
		if (totalCount % pageSize == 0) {
			totalPages = totalCount / pageSize;
		} else {
			totalPages = (totalCount / pageSize) + 1;
		}
		return totalPages;
	}

	public Paging() {
		super();
	}

	/**
	 * @param pageNum
	 * @param pageSize
	 */
	public Paging(int pageNum, int pageSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public Paging(int pageNum, int pageSize, String orderBy) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.orderBy = orderBy;
	}

	public Paging(int pageNum, int pageSize, long totalCount, long totalPages, int pageCount, Collection<?> items) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPages = totalPages;
		this.pageCount = pageCount;
		this.items = items;
	}

	public Paging(PageInfo<?> page, Collection<?> items) {
		super();
		this.pageNum = page.getPageNum();
		this.pageSize = page.getPageSize();
		this.totalCount = page.getTotal();
		this.totalPages = page.getPages();
		this.pageCount = page.getSize();
		this.items = items;
	}

	public Paging(PageInfo<?> page) {
		super();
		if(null != page){
			this.pageNum = page.getPageNum();
			this.pageSize = page.getPageSize();
			this.totalCount = page.getTotal();
			this.totalPages = page.getPages();
			this.pageCount = page.getSize();
			this.items = (Collection<?>) page.getList();
		}else{
			this.items = new ArrayList<>();
		}
	}
}
