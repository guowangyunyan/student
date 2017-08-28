package com.yuanx.model;

import java.util.List;

public class PageBean<T> {
	private int pageNum;// 当前页
	private int pageSize;// 每页展示的数据条数
	private int totalRecord;// 总的记录条数

	private int totalPage;// 总页数
	private int startIndex;// 开始索引

	private List<T> list;

	public PageBean() {
	}

	public PageBean(int pageNum, int pageSize, int totalRecord) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;

		if (totalRecord % pageSize == 0) {
			this.totalPage = totalRecord / pageSize;

		} else {
			this.totalPage = totalRecord / pageSize + 1;
		}
		this.startIndex = (pageNum - 1) * pageSize;
	}

	public int getPageNum() {
		return pageNum;
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

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
