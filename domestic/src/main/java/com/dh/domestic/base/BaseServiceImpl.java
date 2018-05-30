package com.dh.domestic.base;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.entity.Example;

/**
 * 
 * Title.通用实现
 * <p>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2018年5月11日 下午2:34:49
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
public class BaseServiceImpl<T> implements BaseService<T> {
  @Autowired
  private BaseDao<T> baseDao;


  @Override
  public T selectByPrimaryKey(String id) {
    return baseDao.selectByPrimaryKey(id);
  }


  @Override
  public List<T> select(T param) {
    if (param != null) {
      return baseDao.select(param);
    } else {
      return baseDao.selectAll();
    }


  }

  @Override
  public List<T> selectByExample(Example example) {
    return baseDao.selectByExample(example);
  }


  @Override
  public T selectOneByExample(Example example) {
    return selectOneByExample(example);
  }

  @Override
  public Integer selectCount(T param) {
    return baseDao.selectCount(param);
  }


  @Override
  public PageInfo<T> selectPage(T param, PageInfo<T> pageInfo) {
    PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
    return new PageInfo<T>(baseDao.select(param));

  }


  @Override
  public T selectOne(T param) {
    return baseDao.selectOne(param);
  }


  @Override
  public Integer insert(T param) {
    return baseDao.insert(param);
  }


  @Override
  public Integer insertSelective(T param) {
    return baseDao.insertSelective(param);
  }


  @Override
  public Integer updateByPrimaryKey(T param) {
    return baseDao.updateByPrimaryKey(param);
  }


  @Override
  public Integer updateSelective(T param) {
    return baseDao.updateByPrimaryKeySelective(param);
  }

  @Override
  public Integer updateByExample(T param, Example example) {
    return updateByExample(param, example);
  }


  @Override
  public Integer updateByExampleSelective(T param, Example example) {
    return updateByExampleSelective(param, example);
  }

  @Override
  public Integer deleteByPrimaryKey(String id) {
    return baseDao.deleteByPrimaryKey(id);
  }


  @Override
  public Integer deleteByExample(Example example) {
    return baseDao.deleteByExample(example);
  }



}
