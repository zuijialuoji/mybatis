package com.dh.domestic.base;

import java.util.List;
import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * Title.
 * <p>
 * Description. 通用service接口
 * <p>
 * Copyright: Copyright (c) 2018年5月11日 下午1:37:55
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
public interface BaseService<T> {
  /**
   * 功能：根据id查询实体
   * 
   * @param id
   * @return 2018年5月11日下午1:45:37 zhaomingxing
   */
  T selectByPrimaryKey(String id);

  /**
   * 功能：条件查询
   * 
   * @param param
   * @return 2018年5月11日下午1:45:45 zhaomingxing
   */
  List<T> select(T param);

  /**
   * 
   * 功能：条件查询
   * 
   * @param example
   * @return 2018年5月11日下午2:25:53 zhaomingxing
   */
  List<T> selectByExample(Example example);

  /**
   * 功能：查询记录数
   * 
   * @param param
   * @return 2018年5月11日下午1:45:51 zhaomingxing
   */
  Integer selectCount(T param);

  /**
   * 
   * 功能：分页
   * 
   * @param param
   * @param pageInfo
   * @return 2018年5月11日下午1:52:18 zhaomingxing
   */
  PageInfo<T> selectPage(T param, PageInfo<T> pageInfo);

  /**
   * 功能：查询一条记录
   * 
   * @param param
   * @return 2018年5月11日下午1:53:23 zhaomingxing
   */
  T selectOne(T param);

  /**
   * 
   * 功能：查询一条记录
   * 
   * @param example
   * @return 2018年5月11日下午2:27:19 zhaomingxing
   */
  T selectOneByExample(Example example);

  /**
   * 功能：插入
   * 
   * @param param
   * @return 2018年5月11日下午1:54:11 zhaomingxing
   */
  Integer insert(T param);

  /**
   * 
   * 功能： 新增非空字段
   * 
   * @param param
   * @return 2018年5月11日下午1:55:36 zhaomingxing
   */
  Integer insertSelective(T param);

  /**
   * 
   * 功能：根据主键更新
   * 
   * @param param
   * @return 2018年5月11日下午1:56:23 zhaomingxing
   */
  Integer updateByPrimaryKey(T param);

  /**
   * 
   * 功能：根据主键更新非空字段
   * 
   * @param param
   * @return 2018年5月11日下午1:56:36 zhaomingxing
   */
  Integer updateSelective(T param);

  /**
   * 
   * 功能：根据Example条件更新实体
   * 
   * @param param
   * @param example
   * @return 2018年5月11日下午2:28:55 zhaomingxing
   */
  Integer updateByExample(T param, Example example);

  /**
   * 
   * 功能：根据Example条件更新实体 null值不更新
   * 
   * @param param
   * @param example
   * @return 2018年5月11日下午2:30:31 zhaomingxing
   */
  Integer updateByExampleSelective(T param, Example example);

  /**
   * 
   * 功能：根据主键删除
   * 
   * @param id
   * @return 2018年5月11日下午1:57:38 zhaomingxing
   */
  Integer deleteByPrimaryKey(String id);

  /**
   * 
   * 功能：根据条件 批量删除
   * 
   * @return 2018年5月11日下午1:59:50 zhaomingxing
   */
  Integer deleteByExample(Example example);


}
