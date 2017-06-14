package com.taotao.common.utils;

import java.util.List;

/**
 * json 数据格式，因为 easyUI 要求数据为
 * {total:”2”,rows:[{“id”:”1”,”name”,”张三”},{“id”:”2”,”name”,”李四”}]}
 * */
public class JsonUtils {

	private Integer total;
	private List<?> rows;
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
