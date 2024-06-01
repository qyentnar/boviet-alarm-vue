package com.boviet.web.controller.hr;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boviet.common.annotation.Log;
import com.boviet.common.core.controller.BaseController;
import com.boviet.common.core.domain.AjaxResult;
import com.boviet.common.enums.BusinessType;
import com.boviet.system.domain.BvEmployeeInfo;
import com.boviet.system.service.IBvEmployeeInfoService;
import com.boviet.common.utils.poi.ExcelUtil;
import com.boviet.common.core.page.TableDataInfo;

/**
 * 个人基本信息Controller
 * 
 * @author boviet
 * @date 2024-06-01
 */
@RestController
@RequestMapping("/hr/employee_info")
public class BvEmployeeInfoController extends BaseController
{
    @Autowired
    private IBvEmployeeInfoService bvEmployeeInfoService;

    /**
     * 查询个人基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:list')")
    @GetMapping("/list")
    public TableDataInfo list(BvEmployeeInfo bvEmployeeInfo)
    {
        startPage();
        List<BvEmployeeInfo> list = bvEmployeeInfoService.selectBvEmployeeInfoList(bvEmployeeInfo);
        return getDataTable(list);
    }

    /**
     * 导出个人基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:export')")
    @Log(title = "个人基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BvEmployeeInfo bvEmployeeInfo)
    {
        List<BvEmployeeInfo> list = bvEmployeeInfoService.selectBvEmployeeInfoList(bvEmployeeInfo);
        ExcelUtil<BvEmployeeInfo> util = new ExcelUtil<BvEmployeeInfo>(BvEmployeeInfo.class);
        util.exportExcel(response, list, "个人基本信息数据");
    }

    /**
     * 获取个人基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(bvEmployeeInfoService.selectBvEmployeeInfoById(id));
    }

    /**
     * 新增个人基本信息
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:add')")
    @Log(title = "个人基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BvEmployeeInfo bvEmployeeInfo)
    {
        return toAjax(bvEmployeeInfoService.insertBvEmployeeInfo(bvEmployeeInfo));
    }

    /**
     * 修改个人基本信息
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:edit')")
    @Log(title = "个人基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BvEmployeeInfo bvEmployeeInfo)
    {
        return toAjax(bvEmployeeInfoService.updateBvEmployeeInfo(bvEmployeeInfo));
    }

    /**
     * 删除个人基本信息
     */
    @PreAuthorize("@ss.hasPermi('hr:employee_info:remove')")
    @Log(title = "个人基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bvEmployeeInfoService.deleteBvEmployeeInfoByIds(ids));
    }
}
