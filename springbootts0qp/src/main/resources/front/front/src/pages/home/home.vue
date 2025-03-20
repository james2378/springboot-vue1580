<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto","flexWrap":"wrap","justifyContent":"space-around","display":"flex"}'>




	

	<!-- 关于我们 -->
	<div :style='{"padding":"30px","boxShadow":"0 1px 6px rgba(255, 255, 255, .3)","margin":"0 0 10px","flexWrap":"wrap","display":"flex","width":"70%","position":"relative","height":"auto"}'>
	  <div :style='{"padding":"0 20px","borderColor":"#3aaddf","margin":"40px 35% 40px","color":"#333","textAlign":"center","borderWidth":"0 0 8px","width":"30%","lineHeight":"25px","fontSize":"40px","borderStyle":"solid"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"margin":"0 0 10px","color":"#999","textAlign":"center","display":"none","width":"100%","lineHeight":"1.5","fontSize":"20px"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"width":"60%","display":"flex","height":"auto"}'>
	    <img :style='{"width":"320px","margin":"0","objectFit":"cover","borderRadius":" 25px","height":"600px"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"width":"320px","margin":"0 0 0 -15%","objectFit":"cover","borderRadius":" 25px","height":"600px"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"width":"320px","margin":"0 0 0 -15%","objectFit":"cover","borderRadius":" 25px","height":"600px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"padding":"40px 30px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 0 10px 0","overflow":"hidden","color":"#000","borderRadius":"20px","flex":"1","background":"#FFFFFF","width":"100%","lineHeight":"2","fontSize":"16px","height":"600px"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>

<div class="lists" :style='{"margin":"0 0 10px","position":"relative"}'>
	<div v-if="true" class="idea" :style='{"padding":"20px","alignItems":"center","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"120px"}'>
		<div class="box1" :style='{"width":"20%","borderRadius":"10px","background":"linear-gradient(90deg, #5B7DE8 4%, #19DFD6 100%)","height":"10px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"10px auto","lineHeight":"54px","position":"absolute","top":"15px","textAlign":"center"}'>
	  <span :style='{"color":"#000","fontSize":"28px"}'>公告栏展示</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 260px","flexWrap":"wrap","display":"flex","height":"auto"}'>
		<div :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"8px","margin":"10px","textAlign":"center","background":"#fff","width":"18%","height":"auto"}' v-for="(item,index) in gonggaolanList" :key="index" @click="toDetail('gonggaolanDetail', item)" class="list-item animation-box">
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-if="item.tupian.substr(0,4)=='http'" :src="item.tupian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.biaoti}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('gonggaolan')" :style='{"border":"0","margin":"10px auto","borderRadius":"20px","textAlign":"center","background":"linear-gradient(-90deg, #5B7DE8 4%, #19DFD6 100%)","display":"block","width":"100px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"margin":"0 0 10px","position":"relative"}'>
	<div v-if="true" class="idea" :style='{"padding":"20px","alignItems":"center","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"120px"}'>
		<div class="box1" :style='{"width":"20%","borderRadius":"10px","background":"linear-gradient(90deg, #5B7DE8 4%, #19DFD6 100%)","height":"10px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"10px auto","lineHeight":"54px","position":"absolute","top":"15px","textAlign":"center"}'>
	  <span :style='{"color":"#000","fontSize":"28px"}'>学校信息展示</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 260px","flexWrap":"wrap","display":"flex","height":"auto"}'>
		<div :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"8px","margin":"10px","textAlign":"center","background":"#fff","width":"18%","height":"auto"}' v-for="(item,index) in xuexiaoxinxiList" :key="index" @click="toDetail('xuexiaoxinxiDetail', item)" class="list-item animation-box">
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-if="item.tupian.substr(0,4)=='http'" :src="item.tupian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.xuexiaomingcheng}}</div>
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.xuexiaodizhi}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('xuexiaoxinxi')" :style='{"border":"0","margin":"10px auto","borderRadius":"20px","textAlign":"center","background":"linear-gradient(-90deg, #5B7DE8 4%, #19DFD6 100%)","display":"block","width":"100px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"margin":"0 0 10px","position":"relative"}'>
	<div v-if="true" class="idea" :style='{"padding":"20px","alignItems":"center","flexWrap":"wrap","justifyContent":"center","display":"flex","height":"120px"}'>
		<div class="box1" :style='{"width":"20%","borderRadius":"10px","background":"linear-gradient(90deg, #5B7DE8 4%, #19DFD6 100%)","height":"10px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"10px auto","lineHeight":"54px","position":"absolute","top":"15px","textAlign":"center"}'>
	  <span :style='{"color":"#000","fontSize":"28px"}'>专业介绍展示</span>
	</div>
	
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"width":"100%","padding":"0 260px","flexWrap":"wrap","display":"flex","height":"auto"}'>
		<div :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"8px","margin":"10px","textAlign":"center","background":"#fff","width":"18%","height":"auto"}' v-for="(item,index) in zhuanyejieshaoList" :key="index" @click="toDetail('zhuanyejieshaoDetail', item)" class="list-item animation-box">
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-if="item.tupian.substr(0,4)=='http'" :src="item.tupian.split(',')[0]" alt="" />
			<img :style='{"objectFit":"cover","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.xuexiaomingcheng}}</div>
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.zhuanyemingcheng}}</div>
			<div class="name line1" :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#9E9E9E"}'>{{item.zhuanyeleibie}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('zhuanyejieshao')" :style='{"border":"0","margin":"10px auto","borderRadius":"20px","textAlign":"center","background":"linear-gradient(-90deg, #5B7DE8 4%, #19DFD6 100%)","display":"block","width":"100px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        newsList: [],

        gonggaolanList: [],
        xuexiaoxinxiList: [],
        zhuanyejieshaoList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getAboutUs();
      this.getList();
    },
    //方法集合
    methods: {
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('gonggaolan/list', {params: {
				sort : 'faburiqi',
				order: 'desc',
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.gonggaolanList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('xuexiaoxinxi/list', {params: {
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.xuexiaoxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('zhuanyejieshao/list', {params: {
				page: 1,
				limit: 5,
			}}).then(res => {
				if (res.data.code == 0) {
					this.zhuanyejieshaoList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: scale(0.95) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
