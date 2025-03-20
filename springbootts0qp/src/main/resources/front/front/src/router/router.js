import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import gonggaolanList from '../pages/gonggaolan/list'
import gonggaolanDetail from '../pages/gonggaolan/detail'
import gonggaolanAdd from '../pages/gonggaolan/add'
import xuexiaoxinxiList from '../pages/xuexiaoxinxi/list'
import xuexiaoxinxiDetail from '../pages/xuexiaoxinxi/detail'
import xuexiaoxinxiAdd from '../pages/xuexiaoxinxi/add'
import ruxuetongzhiList from '../pages/ruxuetongzhi/list'
import ruxuetongzhiDetail from '../pages/ruxuetongzhi/detail'
import ruxuetongzhiAdd from '../pages/ruxuetongzhi/add'
import zhuanyejieshaoList from '../pages/zhuanyejieshao/list'
import zhuanyejieshaoDetail from '../pages/zhuanyejieshao/detail'
import zhuanyejieshaoAdd from '../pages/zhuanyejieshao/add'
import baodaoyuyueList from '../pages/baodaoyuyue/list'
import baodaoyuyueDetail from '../pages/baodaoyuyue/detail'
import baodaoyuyueAdd from '../pages/baodaoyuyue/add'
import sushexinxiList from '../pages/sushexinxi/list'
import sushexinxiDetail from '../pages/sushexinxi/detail'
import sushexinxiAdd from '../pages/sushexinxi/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import banjixinxiList from '../pages/banjixinxi/list'
import banjixinxiDetail from '../pages/banjixinxi/detail'
import banjixinxiAdd from '../pages/banjixinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'gonggaolan',
					component: gonggaolanList
				},
				{
					path: 'gonggaolanDetail',
					component: gonggaolanDetail
				},
				{
					path: 'gonggaolanAdd',
					component: gonggaolanAdd
				},
				{
					path: 'xuexiaoxinxi',
					component: xuexiaoxinxiList
				},
				{
					path: 'xuexiaoxinxiDetail',
					component: xuexiaoxinxiDetail
				},
				{
					path: 'xuexiaoxinxiAdd',
					component: xuexiaoxinxiAdd
				},
				{
					path: 'ruxuetongzhi',
					component: ruxuetongzhiList
				},
				{
					path: 'ruxuetongzhiDetail',
					component: ruxuetongzhiDetail
				},
				{
					path: 'ruxuetongzhiAdd',
					component: ruxuetongzhiAdd
				},
				{
					path: 'zhuanyejieshao',
					component: zhuanyejieshaoList
				},
				{
					path: 'zhuanyejieshaoDetail',
					component: zhuanyejieshaoDetail
				},
				{
					path: 'zhuanyejieshaoAdd',
					component: zhuanyejieshaoAdd
				},
				{
					path: 'baodaoyuyue',
					component: baodaoyuyueList
				},
				{
					path: 'baodaoyuyueDetail',
					component: baodaoyuyueDetail
				},
				{
					path: 'baodaoyuyueAdd',
					component: baodaoyuyueAdd
				},
				{
					path: 'sushexinxi',
					component: sushexinxiList
				},
				{
					path: 'sushexinxiDetail',
					component: sushexinxiDetail
				},
				{
					path: 'sushexinxiAdd',
					component: sushexinxiAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'banjixinxi',
					component: banjixinxiList
				},
				{
					path: 'banjixinxiDetail',
					component: banjixinxiDetail
				},
				{
					path: 'banjixinxiAdd',
					component: banjixinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
