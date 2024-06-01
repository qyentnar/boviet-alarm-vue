package com.boviet.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.boviet.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.boviet.system.domain.BvEmployeeEducation;
import com.boviet.system.mapper.BvEmployeeInfoMapper;
import com.boviet.system.domain.BvEmployeeInfo;
import com.boviet.system.service.IBvEmployeeInfoService;

/**
 * 个人基本信息Service业务层处理
 * 
 * @author boviet
 * @date 2024-06-01
 */
@Service
public class BvEmployeeInfoServiceImpl implements IBvEmployeeInfoService 
{
    @Autowired
    private BvEmployeeInfoMapper bvEmployeeInfoMapper;

    /**
     * 查询个人基本信息
     * 
     * @param id 个人基本信息主键
     * @return 个人基本信息
     */
    @Override
    public BvEmployeeInfo selectBvEmployeeInfoById(Long id)
    {
        return bvEmployeeInfoMapper.selectBvEmployeeInfoById(id);
    }

    /**
     * 查询个人基本信息列表
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 个人基本信息
     */
    @Override
    public List<BvEmployeeInfo> selectBvEmployeeInfoList(BvEmployeeInfo bvEmployeeInfo)
    {
        return bvEmployeeInfoMapper.selectBvEmployeeInfoList(bvEmployeeInfo);
    }

    /**
     * 新增个人基本信息
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertBvEmployeeInfo(BvEmployeeInfo bvEmployeeInfo)
    {
        int rows = bvEmployeeInfoMapper.insertBvEmployeeInfo(bvEmployeeInfo);
        insertBvEmployeeEducation(bvEmployeeInfo);
        return rows;
    }

    /**
     * 修改个人基本信息
     * 
     * @param bvEmployeeInfo 个人基本信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateBvEmployeeInfo(BvEmployeeInfo bvEmployeeInfo)
    {
        bvEmployeeInfoMapper.deleteBvEmployeeEducationByEmployeeId(bvEmployeeInfo.getId());
        insertBvEmployeeEducation(bvEmployeeInfo);
        return bvEmployeeInfoMapper.updateBvEmployeeInfo(bvEmployeeInfo);
    }

    /**
     * 批量删除个人基本信息
     * 
     * @param ids 需要删除的个人基本信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBvEmployeeInfoByIds(Long[] ids)
    {
        bvEmployeeInfoMapper.deleteBvEmployeeEducationByEmployeeIds(ids);
        return bvEmployeeInfoMapper.deleteBvEmployeeInfoByIds(ids);
    }

    /**
     * 删除个人基本信息信息
     * 
     * @param id 个人基本信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBvEmployeeInfoById(Long id)
    {
        bvEmployeeInfoMapper.deleteBvEmployeeEducationByEmployeeId(id);
        return bvEmployeeInfoMapper.deleteBvEmployeeInfoById(id);
    }

    /**
     * 新增教育经历信息
     * 
     * @param bvEmployeeInfo 个人基本信息对象
     */
    public void insertBvEmployeeEducation(BvEmployeeInfo bvEmployeeInfo)
    {
        List<BvEmployeeEducation> bvEmployeeEducationList = bvEmployeeInfo.getBvEmployeeEducationList();
        Long id = bvEmployeeInfo.getId();
        if (StringUtils.isNotNull(bvEmployeeEducationList))
        {
            List<BvEmployeeEducation> list = new ArrayList<BvEmployeeEducation>();
            for (BvEmployeeEducation bvEmployeeEducation : bvEmployeeEducationList)
            {
                bvEmployeeEducation.setEmployeeId(id);
                list.add(bvEmployeeEducation);
            }
            if (list.size() > 0)
            {
                bvEmployeeInfoMapper.batchBvEmployeeEducation(list);
            }
        }
    }
}
