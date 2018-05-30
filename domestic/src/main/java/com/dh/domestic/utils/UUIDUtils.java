package com.dh.domestic.utils;

import java.util.UUID;

/**
 * Title.
 * <p>
 * Description.生成随机字符串的工具类 uuid
 * <p>
 * Copyright: Copyright (c) 2018年5月9日 下午6:18:16
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
public class UUIDUtils {

	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	public static void main(String[] args) {
		System.out.println("格式前的UUID ： " + UUID.randomUUID().toString());
		System.out.println("格式化后的UUID ：" + getUUID());
	}
}