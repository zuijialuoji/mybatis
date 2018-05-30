package com.dh.domestic.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.domestic.base.BaseServiceImpl;
import com.dh.domestic.dao.CatalogDao;
import com.dh.domestic.domain.Catalog;
import com.dh.domestic.service.CatalogService;

/**
 * 
 * Title. 自定义实现类
 * <p>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2018年5月11日 下午2:04:41
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
@Service
public class CatalogServiceImpl extends BaseServiceImpl<Catalog> implements CatalogService {
  @Autowired
  private CatalogDao catalogDao;



}
