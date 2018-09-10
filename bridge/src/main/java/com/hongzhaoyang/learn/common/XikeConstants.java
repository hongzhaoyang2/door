package com.hongzhaoyang.learn.common;

import java.nio.charset.Charset;

/**
 * <p>ERP系统的通用常量</p>
 *
 * @class: XikeConstants
 * @author kelvem
 * @version v1.0
 */
public class XikeConstants {
	
	private XikeConstants() {
		// do nothing
	}
	
	public static final String CHARSET_STR = "UTF-8";
	public static final Charset CHARSET = Charset.forName(CHARSET_STR);
	
	/**
	 * 分页
	 */
	public static final Integer PAGE_DEFAULT_PAGE_SIZE = 10;
	
	/**
	 * 树对象的根节点标识
	 */
	public static final Integer TREE_ROOT_PARENT_ID = -1;
	
	/**
	 * flag
	 */
	public static final Integer FLAG_YES = 1;
	public static final Integer FLAG_NO = 0;
	
	
	/**
	 * 多语言标志
	 */
	public static final String LANGUAGE_TAG = "languageTag";
	public static final String LANGUAGE_ZH_CN = "zh_CN";

	
}
