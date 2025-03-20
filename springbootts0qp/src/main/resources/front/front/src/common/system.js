export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"公告栏","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学校信息","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"入学通知","menuJump":"列表","tableName":"ruxuetongzhi"}],"menu":"入学通知管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除","查看评论"],"menu":"专业介绍","menuJump":"列表","tableName":"zhuanyejieshao"}],"menu":"专业介绍管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除","审核"],"menu":"报道预约","menuJump":"列表","tableName":"baodaoyuyue"}],"menu":"报道预约管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"宿舍信息","menuJump":"列表","tableName":"sushexinxi"}],"menu":"宿舍信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除","导入"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"公告栏列表","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","报道"],"menu":"学校信息列表","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"入学通知列表","menuJump":"列表","tableName":"ruxuetongzhi"}],"menu":"入学通知模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"专业介绍列表","menuJump":"列表","tableName":"zhuanyejieshao"}],"menu":"专业介绍模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"宿舍信息列表","menuJump":"列表","tableName":"sushexinxi"}],"menu":"宿舍信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","删除"],"menu":"报道预约","menuJump":"列表","tableName":"baodaoyuyue"}],"menu":"报道预约管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"公告栏列表","menuJump":"列表","tableName":"gonggaolan"}],"menu":"公告栏模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","报道"],"menu":"学校信息列表","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"入学通知列表","menuJump":"列表","tableName":"ruxuetongzhi"}],"menu":"入学通知模块"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"专业介绍列表","menuJump":"列表","tableName":"zhuanyejieshao"}],"menu":"专业介绍模块"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"宿舍信息列表","menuJump":"列表","tableName":"sushexinxi"}],"menu":"宿舍信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
