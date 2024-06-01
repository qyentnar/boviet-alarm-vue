package com.boviet.system.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boviet.common.annotation.Excel;
import com.boviet.common.core.domain.BaseEntity;

/**
 * 个人基本信息对象 bv_employee_info
 * 
 * @author boviet
 * @date 2024-06-01
 */
public class BvEmployeeInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员号 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fullName;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 出生日期型 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期型", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthDate;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String maritalStatus;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String politicalAffiliation;

    /** 子女(数量) */
    @Excel(name = "子女(数量)")
    private Long childrenCount;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idNumber;

    /** 身份证地址 */
    @Excel(name = "身份证地址")
    private String idAddress;

    /** 通信地址 */
    @Excel(name = "通信地址")
    private String contactAddress;

    /** 移动电话 */
    @Excel(name = "移动电话")
    private String mobilePhone;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String bankAccountNumber;

    /** 开户银行名称 */
    @Excel(name = "开户银行名称")
    private String bankName;

    /** 身高(CM) */
    @Excel(name = "身高(CM)")
    private Long height;

    /** 体重(KG) */
    @Excel(name = "体重(KG)")
    private Long weight;

    /** 工服尺码 */
    @Excel(name = "工服尺码")
    private String uniformSize;

    /** 是否住宿舍 */
    @Excel(name = "是否住宿舍")
    private Integer dormitoryResident;

    /** 首次参加工作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "首次参加工作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstJobDate;

    /** 户口性质 */
    @Excel(name = "户口性质")
    private String householdType;

    /** 籍贯地址 */
    @Excel(name = "籍贯地址")
    private String nativePlace;

    /** 民族 */
    @Excel(name = "民族")
    private String ethnicity;

    /** 血型 */
    @Excel(name = "血型")
    private String bloodType;

    /** 上传身份证 */
    @Excel(name = "上传身份证")
    private String idCardImage;

    /** 姓 */
    @Excel(name = "姓")
    private String lastName;

    /** 名 */
    @Excel(name = "名")
    private String firstName;

    /** 国籍/地区 */
    @Excel(name = "国籍/地区")
    private String nationality;

    /** 护照号 */
    @Excel(name = "护照号")
    private String passportNumber;

    /** 户口所在省 */
    @Excel(name = "户口所在省")
    private String householdProvince;

    /** 照片 */
    @Excel(name = "照片")
    private String cardImage;

    /** 身份证有效期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "身份证有效期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date idCardValidity;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 最高学历 */
    @Excel(name = "最高学历")
    private String highestEducation;

    /** 最高学历教育类型 */
    @Excel(name = "最高学历教育类型")
    private String educationType;

    /** 其他要求 */
    @Excel(name = "其他要求")
    private String otherRequired;

    /** 上传体检报告 */
    @Excel(name = "上传体检报告")
    private String healthReportImage;

    /** 上传银行卡图片 */
    @Excel(name = "上传银行卡图片")
    private String bankCardImage;

    /** 上传身份证复印件 */
    @Excel(name = "上传身份证复印件")
    private String idCardCopyImage;

    /** 上传《录用通知书回函》 */
    @Excel(name = "上传《录用通知书回函》")
    private String jobConfirmImage;

    /** 教育经历信息 */
    private List<BvEmployeeEducation> bvEmployeeEducationList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    public String getFullName() 
    {
        return fullName;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setBirthDate(Date birthDate) 
    {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() 
    {
        return birthDate;
    }
    public void setMaritalStatus(String maritalStatus) 
    {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() 
    {
        return maritalStatus;
    }
    public void setPoliticalAffiliation(String politicalAffiliation) 
    {
        this.politicalAffiliation = politicalAffiliation;
    }

    public String getPoliticalAffiliation() 
    {
        return politicalAffiliation;
    }
    public void setChildrenCount(Long childrenCount) 
    {
        this.childrenCount = childrenCount;
    }

    public Long getChildrenCount() 
    {
        return childrenCount;
    }
    public void setIdNumber(String idNumber) 
    {
        this.idNumber = idNumber;
    }

    public String getIdNumber() 
    {
        return idNumber;
    }
    public void setIdAddress(String idAddress) 
    {
        this.idAddress = idAddress;
    }

    public String getIdAddress() 
    {
        return idAddress;
    }
    public void setContactAddress(String contactAddress) 
    {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress() 
    {
        return contactAddress;
    }
    public void setMobilePhone(String mobilePhone) 
    {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone() 
    {
        return mobilePhone;
    }
    public void setBankAccountNumber(String bankAccountNumber) 
    {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountNumber() 
    {
        return bankAccountNumber;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setUniformSize(String uniformSize) 
    {
        this.uniformSize = uniformSize;
    }

    public String getUniformSize() 
    {
        return uniformSize;
    }
    public void setDormitoryResident(Integer dormitoryResident) 
    {
        this.dormitoryResident = dormitoryResident;
    }

    public Integer getDormitoryResident() 
    {
        return dormitoryResident;
    }
    public void setFirstJobDate(Date firstJobDate) 
    {
        this.firstJobDate = firstJobDate;
    }

    public Date getFirstJobDate() 
    {
        return firstJobDate;
    }
    public void setHouseholdType(String householdType) 
    {
        this.householdType = householdType;
    }

    public String getHouseholdType() 
    {
        return householdType;
    }
    public void setNativePlace(String nativePlace) 
    {
        this.nativePlace = nativePlace;
    }

    public String getNativePlace() 
    {
        return nativePlace;
    }
    public void setEthnicity(String ethnicity) 
    {
        this.ethnicity = ethnicity;
    }

    public String getEthnicity() 
    {
        return ethnicity;
    }
    public void setBloodType(String bloodType) 
    {
        this.bloodType = bloodType;
    }

    public String getBloodType() 
    {
        return bloodType;
    }
    public void setIdCardImage(String idCardImage) 
    {
        this.idCardImage = idCardImage;
    }

    public String getIdCardImage() 
    {
        return idCardImage;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getLastName() 
    {
        return lastName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getFirstName() 
    {
        return firstName;
    }
    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }

    public String getNationality() 
    {
        return nationality;
    }
    public void setPassportNumber(String passportNumber) 
    {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() 
    {
        return passportNumber;
    }
    public void setHouseholdProvince(String householdProvince) 
    {
        this.householdProvince = householdProvince;
    }

    public String getHouseholdProvince() 
    {
        return householdProvince;
    }
    public void setCardImage(String cardImage) 
    {
        this.cardImage = cardImage;
    }

    public String getCardImage() 
    {
        return cardImage;
    }
    public void setIdCardValidity(Date idCardValidity) 
    {
        this.idCardValidity = idCardValidity;
    }

    public Date getIdCardValidity() 
    {
        return idCardValidity;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setHighestEducation(String highestEducation) 
    {
        this.highestEducation = highestEducation;
    }

    public String getHighestEducation() 
    {
        return highestEducation;
    }
    public void setEducationType(String educationType) 
    {
        this.educationType = educationType;
    }

    public String getEducationType() 
    {
        return educationType;
    }
    public void setOtherRequired(String otherRequired) 
    {
        this.otherRequired = otherRequired;
    }

    public String getOtherRequired() 
    {
        return otherRequired;
    }
    public void setHealthReportImage(String healthReportImage) 
    {
        this.healthReportImage = healthReportImage;
    }

    public String getHealthReportImage() 
    {
        return healthReportImage;
    }
    public void setBankCardImage(String bankCardImage) 
    {
        this.bankCardImage = bankCardImage;
    }

    public String getBankCardImage() 
    {
        return bankCardImage;
    }
    public void setIdCardCopyImage(String idCardCopyImage) 
    {
        this.idCardCopyImage = idCardCopyImage;
    }

    public String getIdCardCopyImage() 
    {
        return idCardCopyImage;
    }
    public void setJobConfirmImage(String jobConfirmImage) 
    {
        this.jobConfirmImage = jobConfirmImage;
    }

    public String getJobConfirmImage() 
    {
        return jobConfirmImage;
    }

    public List<BvEmployeeEducation> getBvEmployeeEducationList()
    {
        return bvEmployeeEducationList;
    }

    public void setBvEmployeeEducationList(List<BvEmployeeEducation> bvEmployeeEducationList)
    {
        this.bvEmployeeEducationList = bvEmployeeEducationList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fullName", getFullName())
            .append("gender", getGender())
            .append("birthDate", getBirthDate())
            .append("maritalStatus", getMaritalStatus())
            .append("politicalAffiliation", getPoliticalAffiliation())
            .append("childrenCount", getChildrenCount())
            .append("idNumber", getIdNumber())
            .append("idAddress", getIdAddress())
            .append("contactAddress", getContactAddress())
            .append("mobilePhone", getMobilePhone())
            .append("bankAccountNumber", getBankAccountNumber())
            .append("bankName", getBankName())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("uniformSize", getUniformSize())
            .append("dormitoryResident", getDormitoryResident())
            .append("firstJobDate", getFirstJobDate())
            .append("householdType", getHouseholdType())
            .append("nativePlace", getNativePlace())
            .append("ethnicity", getEthnicity())
            .append("bloodType", getBloodType())
            .append("idCardImage", getIdCardImage())
            .append("lastName", getLastName())
            .append("firstName", getFirstName())
            .append("nationality", getNationality())
            .append("passportNumber", getPassportNumber())
            .append("householdProvince", getHouseholdProvince())
            .append("cardImage", getCardImage())
            .append("idCardValidity", getIdCardValidity())
            .append("email", getEmail())
            .append("highestEducation", getHighestEducation())
            .append("educationType", getEducationType())
            .append("otherRequired", getOtherRequired())
            .append("healthReportImage", getHealthReportImage())
            .append("bankCardImage", getBankCardImage())
            .append("idCardCopyImage", getIdCardCopyImage())
            .append("jobConfirmImage", getJobConfirmImage())
            .append("bvEmployeeEducationList", getBvEmployeeEducationList())
            .toString();
    }
}
