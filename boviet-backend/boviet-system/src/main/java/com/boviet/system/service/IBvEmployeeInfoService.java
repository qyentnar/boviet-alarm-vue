package com.boviet.system.service;

import java.util.List;
import com.boviet.system.domain.BvEmployeeInfo;

/**
 * 个人基本信息Service接口
 * 
 * @author boviet
 * @date 2024-06-01
 */
public interface IBvEmployeeInfoService 
{
    /**
     * 查询个人基本信息
     * 
     * @param id 个人基本信息主键
     * @return 个人基本信息
     */
    public BvEmployeeInfo selectBvEmployeeInfoById(Long id);

    /**
     * 查询个人基本信息列表
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 个人基本信息集合
     */
    public List<BvEmployeeInfo> selectBvEmployeeInfoList(BvEmployeeInfo bvEmployeeInfo);

    /**
     * 新增个人基本信息
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 结果
     */
    public int insertBvEmployeeInfo(BvEmployeeInfo bvEmployeeInfo);

    /**
     * 修改个人基本信息
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 结果
     */
    public int updateBvEmployeeInfo(BvEmployeeInfo bvEmployeeInfo);

    /**
     * 批量删除个人基本信息
     * 
     * @param ids 需要删除的个人基本信息主键集合
     * @return 结果
     */
    public int deleteBvEmployeeInfoByIds(Long[] ids);

    /**
     * 删除个人基本信息信息
     * 
     * @param id 个人基本信息主键
     * @return 结果
     */
    public int deleteBvEmployeeInfoById(Long id);
}
