package com.dh.domestic.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 
 * Title.通用Mapper
 * <p>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2018年5月11日 下午1:30:02
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
public interface BaseDao<T> extends Mapper<T>, MySqlMapper<T> {
  /**
   * 特别注意，该接口不能被扫描到，否则会出错
   */
}
