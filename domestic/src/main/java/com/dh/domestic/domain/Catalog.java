package com.dh.domestic.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Title. 目录
 * <p>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2018年5月9日 下午4:39:15
 * <p>
 * Company: 中科威荣
 * <p>
 * 
 * @author zhaomingxing
 * @version 1.8
 */
@SuppressWarnings("serial")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "dom_ndoe_catalog")
public class Catalog implements Serializable {
  /**
   * 主键
   */
  @Id
  @Column(name = "pk_ndoe_catalog")
  private String id;

  /**
   * 目录【文件】名称
   */
  @Column(name = "cata_name")
  private String cataName;

  /**
   * 父目录
   */
  @Column(name = "fk_parent_id")
  private String parentId;

  /**
   * 是否是默认接收目录
   */
  @Column(name = "default_directory")
  private Integer defaultDir;

  /**
   * 目录所属方
   */
  @Column(name = "fk_the_nod_id")
  private String nodId;

  /**
   * 目录类型 0：目录，1：文件
   */
  @Column(name = "cata_type")
  private Integer cataType;

  /**
   * 创建人
   */
  @Column(name = "cre_user")
  private String creUser;

  /**
   * 创建时间
   */
  @Column(name = "cre_date")
  private Date creDate;

  /**
   * 更新人
   */
  @Column(name = "upd_user")
  private String updUser;

  /**
   * 更新时间
   */
  @Column(name = "upd_date")
  private Date updDate;

  /**
   * 删除标识 0:未删除，1：已删除
   */
  @Column(name = "del_flag")
  private Integer delFlag;

  /**
   * 附件ID
   */
  @Column(name = "attach_id")
  private String attachId;
}
