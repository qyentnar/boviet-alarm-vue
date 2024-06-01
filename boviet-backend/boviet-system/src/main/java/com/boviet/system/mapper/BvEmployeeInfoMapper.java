package com.boviet.system.mapper;

import java.util.List;
import com.boviet.system.domain.BvEmployeeInfo;
import com.boviet.system.domain.BvEmployeeEducation;

/**
 * 个人基本信息Mapper接口
 * 
 * @author boviet
 * @date 2024-06-01
 */
public interface BvEmployeeInfoMapper 
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
     * 删除个人基本信息
     * 
     * @param id 个人基本信息主键
     * @return 结果
     */
    public int deleteBvEmployeeInfoById(Long id);

    /**
     * 批量删除个人基本信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBvEmployeeInfoByIds(Long[] ids);

    /**
     * 批量删除教育经历
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBvEmployeeEducationByEmployeeIds(Long[] ids);
    
    /**
     * 批量新增教育经历
     * 
     * @param bvEmployeeEducationList 教育经历列表
     * @return 结果
     */
    public int batchBvEmployeeEducation(List<BvEmployeeEducation> bvEmployeeEducationList);
    

    /**
     * 通过个人基本信息主键删除教育经历信息
     * 
     * @param id 个人基本信息ID
     * @return 结果
     */
    public int deleteBvEmployeeEducationByEmployeeId(Long id);
}
