package com.qingfen.runningman.common;

/**
 * Created by zrb on 2016/10/24.
 * 常量类
 */

public class Constant {
    /**
     * 私募产品是否可见
     */
    public static final boolean SM_INVISIBLE = false;
    /*图片储存路径*/
    public static final String IMAGE_DIRECTORY = "hzagent/image/";
    /*下载apk文件储存路径*/
    public static final String DOWNLOAD_DIRECTORY = "hzagent/download/";
    /*平台常量*/
    public static final String TERMIANL = "Android";
    /*api版本常量*/
    public static final String API_VERSION = "1.0.0";
    /*请求成功状态*/
    public static final String ERROR_CODE_SUCCESS = "200";
    /**
     * token过期
     */
    public static final String ERROR_CODE_9999 = "9999";
    /*响应数据流异常msg*/
    public static final String ERROR_MSG_NET_IO = "获取响应数据流失败";
    /*响应数据解析异常msg*/
    public static final String ERROR_MSG_JSON = "数据解析失败";

    public static final String JSON_KEY = "12345678";

    /**
     * 接口的base url
     * http://10.10.19.102:8101/HzDeputy-wap"   //钟诚
     * http://10.10.19.119:8080/HzDeputy-wap 雷爷
     * http://10.10.19.81:8080/HzDeputy-wap 文斌
     * http://10.10.19.28:8085 谢昂
     * http://10.10.19.73:8082/HzDeputy-wap 烟枪
     * http://10.10.19.34:8081/HzDeputy-wap/ 登录注册
     * http://10.10.19.97:8080/HzDeputy-wap  banner
     * http://10.10.19.88:8180/HzDeputy-wap  周杰
     * http://10.10.19.21:8100 石羊 http://10.10.19.112:8080/mobile/
     * <p>
     *     http://10.10.19.88:8180 周杰
     * http://10.20.203.22:8050/mobile 私募接入代理人wap链接地址为：
     */

//    public static final String BASE_URL = "http://10.10.19.88:8180";
     //   public static final String BASE_URL = "http://10.10.19.200:9000/mobile";
       // public static final String BASE_URL = "http://10.10.19.88:8180/mobile";
        //10.10.19.88:8180/mobile
    public static final String BASE_URL ="http://10.20.203.23:8050/mobile";
//    public static final String BASE_URL = "http://www.mianbaoyun.cn/mobile";
    /*banner相关 接口的base url*/
    public static final String BASE_URL_BANNER = BASE_URL + "/app/banner/";
    /**
     * 私募产品相关 接口的base url
     */
    public static final String BASE_URL_PRODUCT_P2P = BASE_URL + "/app/product/p2p/";
    /*P2P产品相关 接口的base url*/
    public static final String BASE_URL_PRODUCT = BASE_URL + "/app/product/fund/";
    /*P2P列表排序接口*/
    public static final String BASE_URL_PRODUCT_P2P_SORT = BASE_URL + "/app/product/list";
    /*认证相关 接口的base url*/
    public static final String BASE_URL_CER = BASE_URL + "/app/user/auth/";
    /**
     * 下单相关 接口的base url
     * http://10.10.19.28:8080/HzDeputy-wap/
     */
    public static final String BASE_URL_ORDER = BASE_URL + "/app/order/";
    /**
     * 消息相关 接口的base url
     * http://10.10.19.47:8080/HzDeputy-wap
     */
    public static final String BASE_URL_MESSAGE = BASE_URL + "/app/message/";
    /**
     * 我的店铺 接口的base url
     * http://10.10.19.141:8100/HzDeputy-wap/app/shop/myShopInfo.htm
     * http://10.10.19.97:8088/HzDeputy-wap
     */
    public static final String BASE_URL_SHOP = BASE_URL + "/app/shop/";
    public static final String BASE_URL_SHOP_EDIT = BASE_URL + "/app/shop/";
    /**
     * 佣金费率 接口的base url
     * http://10.10.19.115:8082/HzDeputy-wap  眼神
     */
    public static final String BASE_URL_RATE = BASE_URL + "/app/rate/";
    /*分享 接口的base url*/
    public static final String BASE_URL_SHARE = BASE_URL + "/app/share/";
    /**
     * 代理人相关 接口的base url
     * http://10.10.19.47:8080/HzDeputy-wap
     */
    public static final String BASE_URL_USERAGENT = BASE_URL + "/app/userAgent/";
    /**
     * 用户相关 接口的base url
     */
    public static final String BASE_URL_USER = BASE_URL + "/app/user/";
    /**
     * 搜索相关 接口的base url
     */
    public static final String BASE_URL_SEARCH = BASE_URL + "/app/search/";


    /**
     * 用户银行相关 接口的base url
     * http://10.10.19.97:8088/HzDeputy-wap
     */
    public static final String BASE_URL_USERBANK = BASE_URL + "/app/userBank/";
    /*银行相关 接口的base url*/
    public static final String BASE_URL_BANK = BASE_URL + "/app/bank/";
    /*省市地区相关 接口的base url*/
    public static final String BASE_URL_AREA = BASE_URL + "/app/area/";
    /**
     * 佣金相关 接口的base url
     * http://10.10.19.115:8082/HzDeputy-wap
     */
    public static final String BASE_URL_COMMISSION = BASE_URL + "/app/commission/";
    /**
     * p2p个人信息相关 接口的base url
     * 获取p2p个人信息
     * /app/p2p/getUserInfop
     */
    public static final String BASE_URL_P2P = BASE_URL + "/app/p2p/";

    /**
     * 店铺分享活动  分享请求接口
     * /app/activity/shopShareInfo.htm
     */
    public static final String BASE_URL_ACTIVITY = BASE_URL + "/app/activity/";

 /**
  *  更多-我的团队-申请退出
  */
   // public static final String BASE_URL_QUITTEAM = "http://10.10.19.105:8080/HzDeputy-wap/app/team/function/";
    public static final String BASE_URL_QUITTEAM = BASE_URL+"/app/team/function/";

    /**
     *更多-我的团队-历史纪录
     */
    //public static final String BASE_URL_TEAMHISTORY = "http://10.10.19.105:8080/HzDeputy-wap/app/team/function/";
    public static final String BASE_URL_TEAMHISTORY = BASE_URL+"/app/team/function/";

    /**
     *更多-我的团队
     */
    public static final String BASE_URL_AGENT_MYTEAM = BASE_URL+"/app/team/";
    /**
     *我的团队接口
     */
    public static final String BASE_URL_MYTEAM=BASE_URL + "/app/team/";

    /**
     *加入团队
     */
    public static final String BASE_URL_JOINTEAM =BASE_URL+"/app/team/function/";

    /**
     * 获取优质团队列表
     * /app/team/queryTopforPage
     */
    public static final String BASE_URL_TEAM = BASE_URL + "/app/team/";

    /**
     * 获取证券开户状态
     */
    public static final String BASE_URL_SECURITIES=BASE_URL +"/app/securities/";



    /**
     * @see #API_IS_TEAM_USER
     * @see #API_IS_SHOW_DIALOG
     * /app/team/function/
     */
    public static final String BASE_URL_TEAM_FUNCTION = BASE_URL + "/app/team/function/";
    /*---------------------------------------接口名称------------------------------------------------*/
    /*接口的后缀*/
    public static final String API_SUFFIX = ".htm";
    /*banner 接口*/
    public static final String API_BANNER = "getBannerList";
    /*产品列表接口*/
    public static final String API_PRODUCT_LIST_HOME = "productList";
    /*我的订单列表接口*/
    public static final String API_ORDERS_LIST_MY = "orderList";
    /*取消订单或退款接口*/
    public static final String API_CANCELORDERS = "cancelOrder_fund";
    /*产品详情私募基金接口*/
    public static final String API_DETAIL_PRODUCT_PRIVATE = "detailProduct";
    /*产品详情P2P接口*/
    public static final String API_DETAIL_PRODUCT_P2P = "detail";
    /*产品详情文本接口*/
    public static final String API_DETAIL_PRODUCT_TEXT = "detailProductText";
    /*查询实名认证、合格投资人认证状态接口*/
    public static final String API_GET_STATUS = "getStatus";
    /*P2P认购下单接口*/
    public static final String API_GET_DO_ORDER_P2P = "doOrderP2P";
    /*私募认购下单接口*/
    public static final String API_GET_DO_ORDER_FUND = "doOrderFund";
    /*推送接口*/
    public static final String ADD_JPUSH_APPKEY = "addJpushAppKey";
    /*订单详情接口*/
    public static final String API_DETAIL_ORDER = "detailOrder";
    /*获取支付信息接口*/
    public static final String API_GET_PAY_INFO = "getPayInfo";
    /*获取合格投资人需要申请*/
    public static final String API_GET_INVESTOR_INFO = "getInvestorInfo";
    /*提交个人用户的合格投资人认证资料*/
    public static final String API_COMMIT_INVESTOR_PERSON = "commitInvestorPerson";
    /*提交企业用户的合格投资人认证资料*/
    public static final String API_COMMIT_INVESTOR_CONPANY = "commitInvestorConpany";
    /*版本更新*/
    public static final String API_UPDATE_APP = "updateApp";
    /*P2P订单详情接口*/
    public static final String API_ORDERDETAIL_P2P = "detailOrderP2P";
    /*私募基金订单详情接口*/
    public static final String API_ORDERDETAIL_PRIVATE = "detailOrderFund";
    /*出借记录接口*/
    public static final String API_LENDRECORD = "lendRecord";
    /*我的资产*/
    public static final String API_MYASSET = "myAsset";
    /*出借咨询与服务协议*/
    public static final String API_LENDPROTOCOL = "/h5/skip/loan.htm";
    /*富有-汇中专用账户协议*/
    public static final String API_DEDICATED = "/h5/skip/account.htm";
    /**/
    public static final String API_AGENTLISTBYSITEANDPRODUCTID = "agentListBySiteAndProductId";
    /**
     * 发送验证码
     * 我的店铺-绑定佣金卡-发送绑定佣金卡预留手机验证码
     * 接口名称：http://xxxxx/app/message/sendMsg.htm
     */
    public static final String API_SEND_MSG = "sendMsg";
    /**
     * p2p产品列表
     * 接口名称：app/product/p2p/list.htm
     */
    public static final String API_P2P_LIST = "list";

 /**
  * 我的团队
  */
    public static final String API_MYTEAM="myTeam";

    /**
     * 团队首页-团队简介接口
     */
    public static final String API_TEAMINFO="info";

    /**
     * 团队管理-获取售卖权限状态
     */
    public static final String API_SELLAUTH="sell/sellAuth";

    /**
     * 团队首页-团队销售趋势
     */
    public static final String API_TEAMSELLTREND = "getGayaSellTrend";

    /**
     * 获取证券开户状态
     */
    public static final String API_CHECKSHOPAUTH="checkShopAuth";

    /**
     *团队列表
     */
    public static final String API_TEAM_LIST="queryforPage";

    /**
     * 团队首页-团队产品列表
     */
    public static final String API_TEAM_PRODUCT="product";

    /*-------------------我的店铺相关具体接口名称------------------------------*/

    /**
     * 我的店铺
     * 接口名称：http://xxxxx/app/shop/myShopInfo.htm
     * 作者：钟成
     * 与
     * 2.3.5.23我的店铺-店铺管理-查看
     * 接口名称：http://xxxxx/app/shop/myShopInfo.htm
     *
     * @see #API_MY_SHOP_INFO
     * 区别尚不清楚
     **/
    public static final String API_MY_SHOP_INFO_ZC = "myShopInfo";

    /*我的店铺-产品管理-获取店铺产品（返回数据参照P2P\私募产品列表）*/
    public static final String API_PRODUCT_GROUNDED_LIST = "productGroundedList";
    /**
     * 我的店铺-产品管理-获取店铺产品（私募产品列表）
     * 10.10.19.33:8080/HzDeputy-wap/app/product/fund/shopProductList.htm
     */
    public static final String API_SHOP_PRODUCT_LIST = "shopProductList";
    /**
     * 我的店铺-产品管理-获取上架\未上架店铺产品佣金
     * 接口名称：http://xxxxx/app/rate/productRates.htm
     */
    public static final String API_PRODUCT_RATES = "productRates";
    /**
     * 我的店铺-产品管理-获取上架店铺产品分享URL（）
     * 接口名称：http://xxxxx/app/share/shareInfo.htm
     */
    public static final String API_SHARE_INFO = "shareInfo";
    /**
     * 我的店铺-产品管理-店铺产品上架\下架操作
     * 接口名称：http://xxxxx/app/shop/productUpAndDown.htm
     */
    public static final String API_PRODUCT_UP_AND_DOWN = "productUpAndDown";
    /**
     * 我的店铺-申请代理人-我的申请查询状态
     * 接口名称：http://xxxxx/app/shop/applyAgentPage.htm
     */
    public static final String API_APPLY_AGENT_PAGE = "applyAgentPage";
    /**
     * 我的店铺-申请代理人-获取申请代理人列表（与用户选择代理人列表排序（无关注代理人情况下 雷同）
     * 接口名称：http://xxxxx/app/userAgent/agentList.htm
     */
    public static final String API_AGENT_LIST = "agentList";

    /**
     * 我的店铺-申请代理人-获取申请代理人店铺信息
     * 接口名称：http://xxxxx/app/shop/agentShopPage.htm
     */
    public static final String API_AGENT_SHOP_PAGE = "agentShopPage";

    /**
     * 我的店铺-申请代理人-提交申请代理人
     * 接口名称：http://xxxxx/app/shop/agentApply.htm
     */
    public static final String API_AGENT_APPLY = "agentApply";

    /**
     * 我的店铺-申请代理人-待答复的申请
     * 接口名称：http://xxxxx/app/shop/agentApplyList.htm
     */
    public static final String API_AGENT_APPLY_LIST = "agentApplyList";
    /**
     * 我的店铺-申请代理人-我的申请
     * 接口名称：http://xxxxx/app/shop/myAgentApplyList.htm
     */
    public static final String API_MY_AGENT_APPLY_LIST = "myAgentApplyList";

    /**
     * 我的店铺-申请代理人-操作申请信息
     * 接口名称：http://xxxxx/app/shop/agentApplyOperate.htm
     */
    public static final String API_AGENT_APPLY_OPERATE = "agentApplyOperate";

    /**
     * 我的店铺-店铺数据统计
     * http://10.10.19.28:8080/HzDeputy-wap/app/order/myContentCount.htm
     */
    public static final String API_MY_CONTENT_COUNT = "myContentCount";

    /**
     * 我的店铺-店铺数据-P2P/私募
     * http://10.10.19.28:8080/HzDeputy-wap/app/order/myContentList.htm
     */
    public static final String API_MY_CONTENT_LIST = "myContentList";

    /**
     * 我的店铺-绑定佣金卡-未绑定状态下-查看
     * 接口名称：http://xxxxx/app/userBank/getUserBankList.htm
     * 我的店铺-绑定佣金卡-绑定状态下-查看
     * 接口名称：http://xxxxx/app/userBank/getUserBankList.htm
     */
    public static final String API_GET_USER_BANK_LIST = "getUserBankList";


    /**
     * 我的店铺-绑定佣金卡-查询支持银行名称
     * 接口名称：http://xxxxx/app/bank/getBankList.htm
     */
    public static final String API_GET_BANK_LIST = "getBankList";

    /**
     * 我的店铺-绑定佣金卡-查询支持银行开户地（两级联动）
     * 接口名称：http://xxxxx/app/area/getProvince.htm
     */
    public static final String API_GET_PROVINCE = "getProvince";

    /**
     * 接口名称：http://xxxxx/app/area/getCity.htm
     * 接口功能描述：手机端发出请求，传入省id，查询该省底下所以市。
     */
    public static final String API_GET_CITY = "getCity";

    /**
     * 接口名称：http://xxxxx/app/area/getArea.htm
     * 接口功能描述：手机端发出请求，传入城市id，查询该城市底下所有地区。
     */
    public static final String API_GET_AREA = "getArea";

    /**
     * 我的店铺-绑定佣金卡-发送绑定佣金卡
     * 接口名称：http://xxxxx/app/userBank/bindBank.htm
     */
    public static final String API_BIND_BANK = "bindBank";
    /**
     * 我的店铺-店铺管理-查看
     * 接口名称：http://xxxxx/app/shop/myShopInfo.htm
     */
    public static final String API_MY_SHOP_INFO = "myShopInfo";

    /**
     * 我的店铺-店铺管理-设置基础开关
     * 接口名称：http://xxxxx/app/shop/updateIsAutoUp.htm
     */
    public static final String API_UPDATE_IS_AUTOUP = "updateIsAutoUp";

    /**
     * 我的店铺-店铺管理-设置店铺头像
     * 接口名称：http://xxxxx/app/shop/updateShopReviewed.htm
     */
    public static final String API_UPDATE_SHOP_REVIEWED = "updateShopReviewed";
    /**
     * 我的店铺-店铺管理-店铺名称校验
     * 接口名称：http://xxxxx/app/shop/shopNameValidate.htm
     */
    public static final String API_SHOP_NAME_VALIDATE = "shopNameValidate";

    /**
     * 我的店铺-店铺管理-设置店铺QQ
     * 接口名称：http://xxxxx/app/shop/updateQQ.htm
     */
    public static final String API_UPDATE_QQ = "updateQQ";
    /**
     * 我的店铺-店铺管理-设置个人简介
     * 接口名称：http://xxxxx/app/user/updateDes.htm
     */
    public static final String API_UPDATE_DES = "updateDes";

    /**
     * 我的店铺-用户管理-我的客户/我的代理数量统计
     * 接口名称：http://xxxxx/app/userAgent /getConsumerCount.htm
     */
    public static final String API_GET_CONSUMER_COUNT = "getConsumerCount";
    /**
     * 我的店铺-用户管理-我的代理/我的客户分页请求
     * http://10.10.19.47:8080/HzDeputy-wap/app/userAgent/getAgentAllRelation.htm 
     */
    public static final String API_GET_AGENT_ALL_RELATION = "getAgentAllRelation";
    /**
     * 我的店铺-用户管理-我的客户分页请求
     * 接口名称：http://xxxxx/app/userAgent/getAgentAllUsers.htm
     */
    public static final String API_GET_AGENT_ALL_USERS = "getAgentAllUsers";

    /**
     * 我的店铺-我的佣金-待结算/已结算
     * 接口名称：http://10.10.19.115:8082/HzDeputy-wap/app/commission/dataList.htm 
     */
    public static final String API_COMMISSION_DATA_LIST = "dataList";

    /**
     * 我的店铺-我的佣金
     * 接口名称：http://10.10.19.115:8082/HzDeputy-wap/app/commission/baseMsg.htm  
     */
    public static final String API_COMMISSION_BASE_MSG = "baseMsg";
    /**
     * 店铺分享活动  分享请求接口
     * /app/activity/shopShareInfo.htm
     */
    public static final String API_SHOP_SHARE_INFO = "shopShareInfo";
    /**
     * 我的店铺--申请退出面包客
     * xxx.xxxx.xxxx/app/shop/cancelAgentApplyPage.htm
     */
    public static final String API_CANCELAGENT_APPLYPAGE = "cancelAgentApplyPage";
    /**
     * 我的店铺--提交退出二级面包客申请
     * xxx.xxxx.xxxx/app/shop/cancelAgentApply.htm
     */
    public static final String API_CANCEL_AGENT_APPLY = "cancelAgentApply";
    /**
     * 我的店铺--退出面包客-待答复的申请
     * xxx.xxxx.xxxx/app/shop/cancelApplyList.htm
     */
    public static final String API_CANCEL_APPLY_LIST = "cancelApplyList";
    /**
     * 我的店铺--退出面包客-操作申请信息
     * xxx.xxxx.xxxx/app/shop/cancelApplyOperate.htm
     */
    public static final String API_CANCEL_APPLY_OPERATE = "cancelApplyOperate";
    /**
     * 我的店铺--退出面包客-我的申请
     * xxx.xxxx.xxxx/app/shop/myCancelAgentApplyList.htm
     */
    public static final String API_MYCANCELAGENT_APPLYLIST = "myCancelAgentApplyList";

 /*----------------------------end------------------------------*/
/*------工会相关接口--------*/
    /**
     * 获取优质团队列表
     * /app/team/queryTopforPage
     */
    public static final String API_QUERY_TOP_FOR_PAGE = "queryTopforPage";
    /**
     * 判断是否是团队用户
     * /app/team/function/isTeamUser.htm
     */
    public static final String API_IS_TEAM_USER = "isTeamUser";
    /**
     * 获取代理人用户的一级面包客加入团队
     * /app/team/function/isShowDialog.htm
     */
    public static final String API_IS_SHOW_DIALOG = "isShowDialog";
    //-----------------------------------
    /*账号检测接口*/
    public static final String API_USER_CHECK = BASE_URL + "/app/user/";
    public static final String API_USER_CHECK_FACECODE = "checkUserName";
    //风险评测
    public static final String API_Risk = API_USER_CHECK + "/auth/";
    /*上传文件接口*/
    public static final String API_FILE_UPLOAD = "/file/upload";
    /*登陆*/
    public static final String Login = BASE_URL + "/app/user/";
    public static final String Login_FaceCode = "dologin";
    /*注册*/
    public static final String Register = BASE_URL + "/app/user/";
    public static final String Register_FaceCode = "doRegister";
    /*忘记密码*/
    public static final String Reset_Pwd = BASE_URL + "/app/user/";
    public static final String Reset_Pwd_FaceCode = "forgetPSW";
    /*修改密码*/
    public static final String Pwd_Change = BASE_URL + "/app/user/";
    public static final String Pwd_Change_FaceCode = "modifyPSW";
    /*修改手机号*/
    public static final String Phone_Change_FaceCode = "modifyMobile";
    /*修改手机号-第一步*/
    public static final String Phone_Change_FaceCodeOne = "modifyMobileStep1";
    /*用户退出登录*/
    public static final String User_Exit = BASE_URL + "/app/user/";
    public static final String User_Exit_FaceCode = "logout";
    /*提交风险评测结果*/
    public static final String RiskResult_FaceCode = "commitRiskAssessment";
    /*获取风险评测结果*/
    public static final String GetRiskResult_FaceCode = "getRiskResult";
    /*获取验证码*/
    public static final String SendMessage = "message/sendMsg";


    /*获取实名认证内容*/
    public static final String API_REALNAMEInfo = "getRealNameInfo";
    /*提交个人实名认证资料*/
    public static final String API_REALNAME_PERSONAL = "commitPersonRealname"; /*提交个人实名认证资料*/
    /*提交企业实名认证资料*/
    public static final String API_REALNAME_COMPANY = "commitEnterpriseRealname";
    /*获取我的页面数据*/
    public static final String API_MY = "myContent";
    /**
     * manactivity  获取用户 是否关注代理人，是否是代理，店铺申请状态等信息
     * 接口名称：/app/user/more.htm
     */
    public static final String API_USER_MORE = "more";
    /**
     * 更多-申请代理人-查看（前置已实名认证）
     * app/userAgent/getAgentInfo.htm
     */
    public static final String API_GET_AGENT_INFO = "getAgentInfo";
    /**
     * 更多-申请代理人(店铺)-提交
     * /app/shop/saveShopReviewed.htm
     */
    public static final String API_SAVE_SHOP_REVIEWED = "saveShopReviewed";
    /**
     * 获取p2p个人信息
     * /app/p2p/getUserInfo
     */
    public static final String API_P2P_GET_USER_INFO = "getUserInfo";


    /**
     * 申请代理人-提交（下一步）
     * /app/userAgent/addAgentInfo.htm
     */
    public static final String API_ADD_AGENT_INFO = "addAgentInfo";

    /*
      绑定投资卡-p2p
      /app/userBank/bindBankP2P.htm",
     */
    public static final String Bind_Card = "bindBankP2P";

    /**
     * 已关注产品中心--获取代理人信息
     * /app/userAgent/getAgentUserInfo.htm
     */
    public static final String API_GET_AGENT_USERINFO = "getAgentUserInfo";
    /**
     * 代理人列表--代理人详情页
     * /app/userAgent/getAgentUserInfoByUserId.htm
     */
    public static final String API_GET_AGENT_USERINFO_BYUSERID = "getAgentUserInfoByUserId";

    /**
     * 代理人详情页 关注代理人动作
     * /app/shop/follow.htm
     */
    public static final String API_SHOP_FOLLOW = "follow";

    /**
     * 获取h5 地址和title
     * h5/getStaticUrl.htm
     */
    public static final String API_GET_STATIC_URL = "/h5/getStaticUrl";
    /**
     * 获取申请店铺的url
     * /app/userAgent/getAgentShopUrl.htm
     */
    public static final String API_GET_AGENT_SHOP_URL = "getAgentShopUrl";
    /**
     * /app/user/submitConfirmation.htm   签署合格投资者确认函
     */
    public static final String API_SUBMIT_CONFIRMATION = "submitConfirmation";
    /**
     * 认证status
     * status	查询状态 0.未提交1.通过 2审核中 3审核失败
     */
    public static final String STATUS_NONE = "0";
    public static final String STATUS_SUCCESS = "1";
    public static final String STATUS_ING = "2";
    public static final String STATUS_FAIL = "3";
    /**
     * 网络超时时间
     */
    public static final int DEFAULT_TIMEOUT = 45 * 1000;
    /**
     * 申请二级代理输入最大限制
     */
    public static final int INPUT_MAX_LENGTH_APPLY = 100;

    /**
     * 团队管理---团队简介的输入的最大限制
     */
    public static final int INPUT_MAX_SELLING_PERMISSION = 200;

    /**
     * ui设置的屏幕宽度
     */
    public static final int UI_SCREEEN_WIDTH = 750;

    /**
     * 发送验证码等待时间
     */
    public static final int TIME_LENGTH_SEND_CODE = 60 * 1000;

    /**
     * 企业合格认证     净资产证明图片   限制
     */
    public static final int LIMIT_INVESTOR_COMPANY = 6;
    /**
     * 个人合格认证 金融资产证明图片 限制
     */
    public static final int LIMIT_INVESTOR_PERSON_FINANCE = 6;
    /**
     * 个人合格认证   近三年收入证明图片  限制
     */
    public static final int LIMIT_INVESTOR_PERSON_EARNING = 12;
    /**
     * 一次加载的数量
     */
    public static final int LOAD_PAGE_COUNT = 10;
    /**
     * 店铺名称的最大长度
     */
    public static final int MAX_SHOP_NAME_LENGTH = 15;
    /**
     * 取消二级面包客 最多输入长度60
     */
    public static final int INPUT_MAX_LENGTH_60 = 60;


    /*-------------------------------更多-团队管理相关接口---------------------------*/

    /**
     * 团队信息修改--提交
     */
    public static final String API_UPDATE_TEAM="update";

    /**
     * 团队信息--审核未通过理由
     */
    public static final String API_CHECK_TEAM_REASON="getNoPassReason";

    /**
     * 团队信息--查询是否可以修改
     */
    public static final String API_TEAM_IS_UPDATED="getTeamIsUpdate";

    /**
     * 团队管理--成员列表
     */
    public static final String API_MEMBER_LIST="userListForPage";


    //----------------------------------------------------------------------------------


    /**
     * 认证状态常量
     * zrb
     */
    public class CertificationConstant {

        //    authType	用户认证的状态类型 	状态；1:个人，2:企业
//CertificationStatus	实名认证的状态	-1不存在,0：待审核1.通过 2拒绝
        //status	实名状态	Y		-1不存在，0待审核，1.通过 2拒绝

        /**
         * authType	用户认证的状态类型 	状态；1:个人，2:企业
         */
        public static final String AUTH_TYPE_PERSON = "1";
        /**
         * authType	用户认证的状态类型 	状态；1:个人，2:企业
         */
        public static final String AUTH_TYPE_COMPANY = "2";


        /**
         * CertificationStatus	实名认证的状态	-1不存在,0：待审核1.通过 2拒绝
         */
        public static final String CERTIFICATION_STATUS_NULL = "-1";
        /**
         * CertificationStatus	实名认证的状态	-1不存在,0：待审核1.通过 2拒绝
         */
        public static final String CERTIFICATION_STATUS_PASS = "1";
        /**
         * CertificationStatus	实名认证的状态	-1不存在,0：待审核1.通过 2拒绝
         */
        public static final String CERTIFICATION_STATUS_ING = "0";
        /**
         * CertificationStatus	实名认证的状态	-1不存在,0：待审核1.通过 2拒绝
         */
        public static final String CERTIFICATION_STATUS_FAIL = "2";


        /**
         * status	实名状态	Y		-1不存在，0待审核，1.通过 2拒绝
         */
        public static final String CHECK_STATUS_NULL = "-1";
        /**
         * status	实名状态	Y		-1不存在，0待审核，1.通过 2拒绝
         */
        public static final String CHECK_STATUS_PASS = "1";
        /**
         * status	实名状态	Y		-1不存在，0待审核，1.通过 2拒绝
         */
        public static final String CHECK_STATUS_ING = "0";
        /**
         * status	实名状态	Y		-1不存在，0待审核，1.通过 2拒绝
         */
        public static final String CHECK_STATUS_FAIL = "2";


    }


    /**
     * 用户点击通知跳转
     * 企业实名认证审核通过	更多-个人中心	企业实名结果通过，点击查看详情	code：10201
     * 企业实名认证审核不通过	更多-个人中心	企业实名结果未通过，点击查看详情	code：10202
     * 企业合格投资人审核通过	更多-个人中心-私募个人信息	合格人认证结果通过，点击查看详情	code：10203
     * 企业合格投资人审核不通过	更多-个人中心-私募个人信息	合格人认证结果未通过，点击查看详情	code：10204
     * 店铺申请审核通过/不通过	店铺管理	店铺申请结果通知，点击查看详情	code：10205   status  0 失败   1 成功
     * 二级代理申请审核通过/不通过	申请二级代理-我申请的	二级代理申请结果通知，点击查看详情	code：10206
     * 收到二级代理申请	申请二级代理-待答复的	您收到一条二级代理申请通知，点击查看详情	code：10207
     * 结算佣金时未绑卡	店铺管理-绑佣金卡	由于暂未绑卡，您本月佣金将累计至下月发放，去绑卡	code：10208
     * 佣金结算完成	店铺管理-我的佣金-已结算	您本月的佣金已结算，点击查看详情	code：10209
     */
    public class JPush {
        /**
         * 极光推送 bundle 获取 需要的参数
         * 参数一的键为code
         */
        public static final String KEY_CODE = "code";
        /**
         * 极光推送 bundle 获取 需要的参数
         * 参数二的键为status
         * 店铺申请审核通过/不通过
         * status  0 失败   1 成功
         */
        public static final String KEY_STATUS = "status";
        /**
         * 极光推送 bundle 获取 需要的参数
         * 参数二的键为status
         * 店铺申请审核/不通过
         * status  0 失败    需要shopUrl
         */
        public static final String KEY_SHOP_URL = "shopUrl";
        /**
         * 极光推送 bundle 获取 需要的参数
         * 参数二的键为status
         * 店铺申请审核通过/不通过
         * status  0 失败   1 成功
         */
        public static final String STATUS_VALUE_STATUS_OK = "1";
        /**
         * 极光推送 bundle 获取 需要的参数
         * 参数二的键为status
         * 店铺申请审核通过/不通过
         * status  0 失败   1 成功
         */
        public static final String STATUS_VALUE_STATUS_FAIL = "0";
        /*企业实名认证审核通过	更多-个人中心	企业实名结果通过，点击查看详情	code：10201*/
        public static final String CODE_VALUE_REALNAME_OK = "10201";
        /*企业实名认证审核不通过	更多-个人中心	企业实名结果未通过，点击查看详情	code：10202*/
        public static final String CODE_VALUE_REALNAME_FAIL = "10202";
        /*企业合格投资人审核通过	更多-个人中心-私募个人信息	合格人认证结果通过，点击查看详情	code：10203*/
        public static final String CODE_VALUE_INVESTOR_OK = "10203";
        /*企业合格投资人审核不通过	更多-个人中心-私募个人信息	合格人认证结果未通过，点击查看详情	code：10204*/
        public static final String CODE_VALUE_INVESTOR_FAIL = "10204";
        /*店铺申请审核通过/不通过	店铺管理	店铺申请结果通知，点击查看详情	code：10205   status  0 失败   1 成功*/
        public static final String CODE_VALUE_SHOP_MANAGER = "10205";
        /* 二级代理申请审核通过/不通过	申请二级代理-我申请的	二级代理申请结果通知，点击查看详情	code：10206*/
        public static final String CODE_VALUE_AGENT_TWO = "10206";
        /*收到二级代理申请	申请二级代理-待答复的	您收到一条二级代理申请通知，点击查看详情	code：10207*/
        public static final String CODE_VALUE_AGENT_TWO_NONE = "10207";
        /*结算佣金时未绑卡	店铺管理-绑佣金卡	由于暂未绑卡，您本月佣金将累计至下月发放，去绑卡	code：10208*/
        public static final String CODE_VALUE_UNBIND_CARD = "10208";
        /*佣金结算完成	店铺管理-我的佣金-已结算	您本月的佣金已结算，点击查看详情	code：10209*/
        public static final String CODE_VALUE_COMMISSION = "10209";

    }

    /**
     * 我的店铺 相关 公共常量 类
     */
    public class Shop {
        /**
         * 产品类型id	Y			1：p2p ；2：私募
         */
        public static final String TYPE_P2P = "1";
        /**
         * 产品类型id	Y			1：p2p ；2：私募
         */
        public static final String TYPE_SM = "2";

        /**
         * 产品类型id	Y			1：p2p ；2：私募
         */
//        public static final String TYPE_P2P_NAME = "P2P";
        public static final String TYPE_P2P_NAME = "财富产品";
        /**
         * 产品类型id	Y			1：p2p ；2：私募
         */
        public static final String TYPE_SM_NAME = "世泽产品";

        /**
         * 41：已上架:42：已下架:43：未上架
         */
        public static final String STATUS_UP = "41";

        /**
         * 41：已上架:42：已下架:43：未上架
         */
        public static final String STATUS_DOWN = "42";
        /**
         * 41：已上架:42：已下架:43：未上架
         */
        public static final String STATUS_NOT_UP = "43";

    }

    /**
     * 关于我们	/h5/skip/about.htm"
     */
    public static final String H5_ABOUT_US = BASE_URL + "/h5/skip/about.htm";
    /**
     * 联系我们					/h5/skip/contact.htm
     */
    public static final String H5_CONTACT_US = BASE_URL + "/h5/skip/contact.htm";

    /**
     * 平台佣金规则					/h5/skip/commission.htm
     */
    public static final String H5_COMMISSION = BASE_URL + "/h5/skip/commission.htm";
    /**
     * 面包云注册协议					/h5/skip/reg.htm
     */
    public static final String H5_REG = BASE_URL + "/h5/skip/reg.htm";
    /**
     * 面包客推广服务合作协议				/h5/skip/agent.htm
     */
    public static final String H5_AGENT = BASE_URL + "/h5/skip/agent.htm";
    /**
     * 富友-汇中专用账户协议/h5/skip/account.htm
     */
    public static final String H5_ACCOUNT = BASE_URL + "/h5/skip/account.htm";

    /**
     * 富友-汇中网出借咨询与服务协议（出借计划）    /h5/skip/loan.htm
     */
    public static final String H5_LOAN = BASE_URL + "/h5/skip/loan.htm";

    /**
     * 面包云商家合作协议 /h5/skip/seller.htm
     */
    public static final String H5_SELLER = BASE_URL + "/h5/skip/seller.htm";

    /**
     * 搜索接口
     */
    public static final String API_SEARCH_RESULT = "index";

    /**
     * 搜索类型面包客
     */
    public static final String SEARCH_TYPE_AGENT = "1";
    /**
     * 搜索类型店铺
     */

    public static final String SEARCH_TYPE_SHOP = "2";

    /**
     * 更多-我的团队
     */
    public static final String API_MYTEAM_INFO = "myInfo";

    /**
     * 更多-我的团队-申请退会
     */
    public static final String API_QUIT_TEAM = "appQuitTeam";

    /**
     * 更多-我的团队-历史纪录
     */
    public static final String API_TEAM_HISTORY = "queryTeamUserHistory";

    /**
     * 加入团队
     */
    public static final String API_JOIN_Team = "joinTeam";
    /**
     * 是否是公会管理员
     */
    public static final String API_IS_TEAM_LEADER = "isTeamLeader";
}
