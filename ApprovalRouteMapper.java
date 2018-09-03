package com.chinamobile.epic.baby5.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chinamobile.epic.zebra.model.ApprovalRoute;

@Mapper
public interface ApprovalRouteMapper {
  /**
   * 根据部门Id删除审路径
   * @param organizationId
   * @return
   */
  int deleteByOrganizationId(String organizationId);
  
  /**
   * 删除审批路径
   * @param id
   * @return
   */
  int deleteByOrganizationIdAndpoolId(@Param(value = "poolId") String poolId, @Param(value = "organizationId") String organizationId);
  
  /**
   * 插入审批路径
   * @param record
   * @return
   */
  int insert(@Param(value = "approvalRoutes") List<ApprovalRoute> approvalRoutes, @Param(value = "organizationId") String organizationId, @Param(value = "poolId") String poolId);
  
  /**
   * 根据资源池Id和部门Id获取审批路径
   * @param poolId
   * @param organizationId
   * @return
   */
  List<ApprovalRoute> selectWith(@Param(value = "poolId") String poolId, @Param(value = "organizationId") String organizationId);
  
  /**
   * 根据资源池Id和部门Id和订单类型获取审批路径
   * @param poolId
   * @param organizationId
   * @return
   */
  ApprovalRoute selectRoute(@Param(value = "poolId") String poolId, @Param(value = "organizationId") String organizationId, @Param(value = "type") Integer type, @Param(value = "operateType") String operateType);
  
  /**
   * 获取审批路径
   * @param id
   * @return
   */
  List<ApprovalRoute> selectById(String id);

  /**
   * 自服务部门根据Id更改审批路径
   * @param record
   * @return
   */
  int updateById(ApprovalRoute record);
  
  /**
   * 获取不同平台的默认审批路径
   */
  List<ApprovalRoute> selectByOrganizationType(Integer defaultScope);

  /**
   * 根据资源池Id和部门类型获取默认审批路径
   * @param id
   * @param type
   * @return
   */
  List<ApprovalRoute> selectByPoolIdAndOrgType(@Param(value="poolId")String poolId, 
                                               @Param(value="type")Integer type);
}
