package com.dh.domestic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dh.domestic.config.Result;
import com.dh.domestic.config.ResultCode;
import com.dh.domestic.domain.Catalog;
import com.dh.domestic.service.CatalogService;
import com.dh.domestic.utils.UUIDUtils;
import com.github.pagehelper.PageInfo;

/**
 * Title.目录 相关操作
 * <p>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2018年5月9日 下午4:52:35
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
@RequestMapping(value = "/catalog")
@RestController
public class CatalogController {

  @Autowired
  private CatalogService catalogService;

  /**
   * 功能： 获取目录列表
   *
   * @return 2018年5月9日下午4:57:14 zhaomingxing
   */
  @GetMapping(value = "/")
  public Result list(Catalog param, PageInfo<Catalog> pageInfo) {
    pageInfo = catalogService.selectPage(param, pageInfo);
    return Result.createSuccessResult(pageInfo, "获取成功");
  }

  /**
   *
   * 功能：根据ID删除
   *
   * @param id
   * @return 2018年5月11日下午3:27:35 zhaomingxing
   */
  @DeleteMapping(value = "/delete/{id}")
  public Result delete(@PathVariable String id) {
    catalogService.deleteByPrimaryKey(id);
    return Result.create(ResultCode.SUCCESS);
  }

  /**
   * 
   * 功能：添加
   * 
   * @param param
   * @return 2018年5月11日下午3:29:32 zhaomingxing
   */
  @PostMapping(value = "/add")
  public Result add(Catalog param) {
    param.setId(UUIDUtils.getUUID());
    catalogService.insert(param);
    return Result.create(ResultCode.SUCCESS);
  }

  /**
   * 
   * 功能：更新
   * 
   * @param param
   * @return 2018年5月14日下午1:55:14 zhaomingxing
   */
  @PatchMapping(value = "/update/{id}/")
  public Result update(Catalog param) {
    catalogService.updateByPrimaryKey(param);
    return Result.create(ResultCode.SUCCESS);
  }


}
