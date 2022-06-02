## /成员管理
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/log
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/log/login
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/log/login

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
membername | 哦哦哦哦哦 | Text | 是 | 登录选用用户名登录，可切换为memberid登录
password | 123456 | Text | 是 | 密码
qx | 2 | Integer | 是 | 要登录的页面所需权限
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/log/logout
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/log/logout

#### 请求方式
> POST

#### Content-Type
> form-data

#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/findMember
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/findMember

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Header参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 52 | Text | 是 | -
membername | Test | Text | 是 | -
#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 否 | 可选，根据ID查询或用户名查询
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/updateMember
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/updateMember

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 是 | 需要修改的成员id
membername | TestX | Text | 否 | 需要修改的用户名，最多七个字
force | 1 | Text | 否 | 修改的战力值 `force`=`force`+force
bumen | 技术部 | Text | 否 | 修改部门
password | 123456 | Text | 否 | 修改密码
picture | www.com | Text | 否 | 上传新头像
introduce | 技术部副部长 | Text | 否 | 修改个人描述
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/insertMember
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/insertMember

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 52 | Text | 是 | 新增成员的ID
membername | Test | Text | 是 | 新增成员的用户名，最多不超过七个字
bumen | Test | Text | 是 | 新增成员所属部门
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/deleteMember
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/deleteMember

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 52 | Text | 是 | 需要删除的成员id
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/findMembers
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/findMembers

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
pageNum | 1 | Text | 否 | 分页查询所有成员的，当前页数，默认为1，一页十行
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/findMemberBulletins
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/findMemberBulletins

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 是 | 查询该成员的所有告示
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Member/findMemberForces
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/member/findMemberForces

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 是 | 查询该成员的所有战力修改日志
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/findForce
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/findForce

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
forceid | 45 | Text | 是 | 查询编号为45的战力日志信息
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/insertForce
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/insertForce

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 是 | 战力对应成员id
forceindex | -10 | Text | 是 | 战力日志修改的战力值
forceadddata | 打架打不过，就这就这？？？ | Text | 是 | 战力日志的描述
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/updateForce
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/updateForce

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
forceid | 45 | Text | 是 | 战力日志ID
memberid | 1 | Text | 否 | 对应成员ID
forcestate | 0 | Text | 否 | 修改状态值
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/deleteForce
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/deleteForce

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
forceid | 45 | Text | 是 | 所需删除的日志编号，一般不使用，只更改状态码让其查不出来
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/findForces
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/findForces

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
pageNum | 1 | Text | 否 | 分页查询所有日志的，当前页数，默认为1，一页十行
memberid | 51 | Text | 否 | 查询对应成员的所有日志
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Force/findForceState
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/force/findForceState

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
forcestate | 0 | Text | 是 | 根据状态码查询
pageNum | 1 | Text | 否 | 分页查询所有日志的，当前页数，默认为1，一页十行
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/findBulletin
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/findBulletin

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinid | 1 | Text | 是 | 根据ID查询对应告示
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/updateBulletin
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/updateBulletin

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinid | 1 | Text | 是 | 需要修改的告示ID
bulletinstate | 0 | Text | 是 | 需要修改的告示状态
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/insertBulletin
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/insertBulletin

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
memberid | 51 | Text | 是 | 插入的成员ID
bulletinclass | 活动 | Text | 是 | 插入的告示类型
bulletintitle | 中秋佳节 | Text | 是 | 插入的告示标题
bulletinbody | 中秋节活动安排如下……………… | Text | 是 | 插入的告示内容
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/deleteBulletin
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/findBulletin

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinid | 0 | Text | 是 | 所需删除的告示，一般不使用，只更改状态码让其查不出来
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/findBulletinPictures
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/findBulletinPictures

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinid | 1 | Text | 是 | 根据ID查询对应告示及其插入的图片地址
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/Bulletin/findBulletinState
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/bulletin/findBulletinState

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinstate | 0 | Text | 是 | 根据状态码查询
pageNum | 1 | Text | 否 | 分页查询所有日志的，当前页数，默认为1，一页十行
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/picture
```text
暂无描述
```
#### 公共Header参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Query参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 公共Body参数
参数名 | 示例值 | 参数描述
--- | --- | ---
暂无参数
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/picture/findPicture
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/picture/findPicture

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
pictureid | 1 | Text | 是 | 根据ID查询图片地址
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/picture/insertPicture
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/picture/insertPicture

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
bulletinid | 1 | Text | 是 | 根据所属告示ID插入对应图片
pictureurl | www.cn | Text | 是 | 图片地址
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/picture/updatePicture
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/picture/updatePicture

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
pictureid | 1 | Text | 是 | 需要修改的图片
pictureurl | www.baidu.com | Text | 是 | 新的图片地址
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```
## /成员管理/picture/deletePicture
```text
暂无描述
```
#### 接口状态
> 开发中

#### 接口URL
> http://localhost/picture/deletePicture

#### 请求方式
> POST

#### Content-Type
> form-data

#### 请求Body参数
参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述
--- | --- | --- | --- | ---
pictureid | 1 | Text | 是 | 根据ID删除对应图片
#### 预执行脚本
```javascript
暂无预执行脚本
```
#### 后执行脚本
```javascript
暂无后执行脚本
```