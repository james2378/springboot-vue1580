import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussxuexiaoxinxi from '@/views/modules/discussxuexiaoxinxi/list'
    import xuexiaoxinxi from '@/views/modules/xuexiaoxinxi/list'
    import zhuanyejieshao from '@/views/modules/zhuanyejieshao/list'
    import aboutus from '@/views/modules/aboutus/list'
    import baodaoyuyue from '@/views/modules/baodaoyuyue/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import ruxuetongzhi from '@/views/modules/ruxuetongzhi/list'
    import gonggaolan from '@/views/modules/gonggaolan/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import discusszhuanyejieshao from '@/views/modules/discusszhuanyejieshao/list'
    import sushexinxi from '@/views/modules/sushexinxi/list'
    import banjixinxi from '@/views/modules/banjixinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussxuexiaoxinxi',
        name: '学校信息评论',
        component: discussxuexiaoxinxi
      }
      ,{
	path: '/xuexiaoxinxi',
        name: '学校信息',
        component: xuexiaoxinxi
      }
      ,{
	path: '/zhuanyejieshao',
        name: '专业介绍',
        component: zhuanyejieshao
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/baodaoyuyue',
        name: '报道预约',
        component: baodaoyuyue
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/ruxuetongzhi',
        name: '入学通知',
        component: ruxuetongzhi
      }
      ,{
	path: '/gonggaolan',
        name: '公告栏',
        component: gonggaolan
      }
      ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/discusszhuanyejieshao',
        name: '专业介绍评论',
        component: discusszhuanyejieshao
      }
      ,{
	path: '/sushexinxi',
        name: '宿舍信息',
        component: sushexinxi
      }
      ,{
	path: '/banjixinxi',
        name: '班级信息',
        component: banjixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
