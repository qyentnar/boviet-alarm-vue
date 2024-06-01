import request from '@/utils/request'

// 查询个人基本信息列表
export function listEmployee_info(query) {
  return request({
    url: '/hr/employee_info/list',
    method: 'get',
    params: query
  })
}

// 查询个人基本信息详细
export function getEmployee_info(id) {
  return request({
    url: '/hr/employee_info/' + id,
    method: 'get'
  })
}

// 新增个人基本信息
export function addEmployee_info(data) {
  return request({
    url: '/hr/employee_info',
    method: 'post',
    data: data
  })
}

// 修改个人基本信息
export function updateEmployee_info(data) {
  return request({
    url: '/hr/employee_info',
    method: 'put',
    data: data
  })
}

// 删除个人基本信息
export function delEmployee_info(id) {
  return request({
    url: '/hr/employee_info/' + id,
    method: 'delete'
  })
}
