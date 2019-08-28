/** 
 * <pre>项目名称:book 
 * 文件名称:ResultPage.java 
 * 包名:com.jk.xxr.utils 
 * 创建日期:2019年5月17日下午8:31:23 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

/** 
 * <pre>项目名称：book    
 * 类名称：ResultPage    
 * 类描述：    
 * 创建人：许小瑞
 * 创建时间：2019年5月17日 下午8:31:23    
 * 修改人：许小瑞
 * 修改时间：2019年5月17日 下午8:31:23    
 * 修改备注：       
 * @version </pre>    
 */
public class ResultPage {

	private Integer total;
	
	private Object rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "ResultPage [total=" + total + ", rows=" + rows + "]";
	}
	
	
}
