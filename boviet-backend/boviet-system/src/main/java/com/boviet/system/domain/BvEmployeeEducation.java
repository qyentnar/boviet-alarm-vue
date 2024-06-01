package com.boviet.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boviet.common.annotation.Excel;
import com.boviet.common.core.domain.BaseEntity;

/**
 * 教育经历对象 bv_employee_education
 * 
 * @author boviet
 * @date 2024-06-01
 */
public class BvEmployeeEducation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 人员号 */
    @Excel(name = "人员号")
    private Long employeeId;

    /** 学校 */
    @Excel(name = "学校")
    private String schoolName;

    /** 学历 */
    @Excel(name = "学历")
    private String qualifications;

    /** 学位 */
    @Excel(name = "学位")
    private String degree;

    /** 专业 */
    @Excel(name = "专业")
    private String professional;

    /** 学历编码 */
    @Excel(name = "学历编码")
    private Long qualificationCode;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEmployeeId(Long employeeId) 
    {
        this.employeeId = employeeId;
    }

    public Long getEmployeeId() 
    {
        return employeeId;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setQualifications(String qualifications) 
    {
        this.qualifications = qualifications;
    }

    public String getQualifications() 
    {
        return qualifications;
    }
    public void setDegree(String degree) 
    {
        this.degree = degree;
    }

    public String getDegree() 
    {
        return degree;
    }
    public void setProfessional(String professional) 
    {
        this.professional = professional;
    }

    public String getProfessional() 
    {
        return professional;
    }
    public void setQualificationCode(Long qualificationCode) 
    {
        this.qualificationCode = qualificationCode;
    }

    public Long getQualificationCode() 
    {
        return qualificationCode;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("employeeId", getEmployeeId())
            .append("schoolName", getSchoolName())
            .append("qualifications", getQualifications())
            .append("degree", getDegree())
            .append("professional", getProfessional())
            .append("qualificationCode", getQualificationCode())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
