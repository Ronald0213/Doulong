package com.hotyi.hotyi.utils;

/**
 * Created by HOTYI on 2017/8/17.
 */

public class MyAsynctask {
    //  接口
    public final String HOST = "https://app.muops.com/";
    public final String Regist = "AppLoginReg/Reg";//注册接口
    public final String Login = "AppLoginReg/Login";//登陆接口
    public final String SendRegistCode = "AppLoginReg/RegCode";//发送注册验证码
    public final String FogetCode = "AppLoginReg/ForgetCode";//发送忘记密码验证码
    public final String SendNewPwd = "AppLoginReg/SendNewPwd";//发送忘记密码临时密码
    public final String Logout = "AppLoginReg/Logout";//退出登陆
    public final String JudgeCode = "AppLoginReg/JudgeCode";//验证码验证登陆
    public final String ThirdLogin = "AppLoginReg/ThirdLogin";//第三方登录
    public final String ThirdReg = "AppLoginReg/ThirdReg";//第三方账号绑定
    public final String TFirstLogin = "AppIndex/TFirstLogin";//首次线上积分
    public final String GameIndex = "AppIndex/GameIndex";//游戏列表接口
    public final String SearchShow = "AppIndex/SearchShow";//搜索列表接口
    public final String GameInGuildIndex = "AppIndex/GameInGuildIndex";//游戏下的工会列表接口
    public final String GameCollect = "AppIndex/GameCollect";//游戏收录
    public final String GetGameList = "AppIndex/GetGameList";//游戏名列表
    public final String SearchMoreGame = "AppIndex/SearchMoreGame";//搜索更多游戏
    public final String HotGame = "AppIndex/HotGame";//热门和其他游戏列表
    public final String TheCarouselFigure = "AppIndex/TheCarouselFigure";//轮播图
    public final String LinkMan = "AppIndex/LinkMan";//联系人页面
    public final String SearchGameList = "AppIndex/SearchGameList";//热门和其他游戏的搜索
    public final String CreateGuild = "AppGuild/CreateGuild";//创建公会
    public final String ApplyIntoGuild = "AppGuild/ApplyIntoGuild";//申请进入工会
    public final String OptionApplyIntoGuild = "AppGuild/OptionApplyIntoGuild";//允许/拒绝用户加入公会
    public final String GuildMemberIndex = "AppGuild/GuildMemberIndex";//公会成员列表
    public final String GuildMemberSearch = "AppGuild/GuildMemberSearch";//公会成员搜索
    public final String GuildInfo = "AppGuild/GuildInfo";//工会信息
    public final String InviteGuildMember = "AppGuild/InviteGuildMember";//邀请好友进工会
    public final String InviteGuildFriendIndex = "AppGuild/InviteGuildFriendIndex";//公会中邀请好友的好友列表
    public final String RemoveGuildFriend = "AppGuild/RemoveGuildFriend";//移除工会成员
    public final String SearchMoreGuild = "AppGuild/SearchMoreGuild";//搜索工会
    public final String GuildSigned = "AppGuild/GuildSigned";//工会签到
    public final String GuildSignedRankingList = "AppGuild/GuildSignedRankingList";//工会签到排行榜
    public final String GetGuildActiveList = "AppGuild/GetGuildActiveList";//工会活动列表
    public final String LeaveGuild = "AppGuild/LeaveGuild";//成员退出公会
    public final String AppointedAdministrator = "AppGuild/AppointedAdministrator";//会长任命管理员
    public final String DevoteGoldToGuild = "AppGuild/DevoteGoldToGuild";//贡献积分给工会
    public final String GuildLevel = "AppGuild/GuildLevel";//公会等级
    public final String JoinGuildActive = "AppGuild/JoinGuildActive";//参加公会活动
    public final String CreateActive = "AppGuild/CreateActive";//会长发布活动
    public final String CreateNoticeTemplate = "AppGuild/CreateNoticeTemplate";//会长添加公告模板
    public final String CreateNoticeInfo = "AppGuild/CreateNoticeInfo";//会长添加公告
    public final String Owner2Other = "AppGuild/Owner2Other";//会长转移身份
    public final String GuildInfoEdit = "AppGuild/GuildInfoEdit";//工会信息修改
    public final String GuildInfoByGuildId = "AppGuild/GuildInfoByGuildId";//公会简单信息
    public final String DismissGuild = "AppGuild/DismissGuild";//解散工会
    public final String GetGuildNoticeList = "AppGuild/GetGuildNoticeList";//获取公会公告
    public final String DelGuildNotice = "AppGuild/DelGuildNotice";//删除公会公告
    public final String DelNoticeTemplate = "AppGuild/DelNoticeTemplate";//删除公会模板
    public final String GetNoticeTemplateList = "AppGuild/GetNoticeTemplateList";//获取公会公告模板
    public final String OptionIntoGuild = "AppGuild/OptionIntoGuild";//受邀用户同意/拒绝加入公会
    public final String RemoveAdministrator = "AppGuild/RemoveAdministrator";//移除管理员
    public final String IsInGuildId = "AppGuild/IsInGuildId";//判断用户是否在该工会
    public final String UpdateGuildInfo = "AppGuild/UpdateGuildInfo";//修改公会logo和简介
    public final String ActiveTempContent = "AppGuild/ActiveTempContent";//获取活动发布内容模板
    public final String ActiveDetail = "AppGuild/ActiveDetail";//公会活动详情
    public final String CreateAppGroup = "AppGroup/CreateAppGroup";//创建群组
    public final String GroupMemberIndex = "AppGroup/GroupMemberIndex";//群组成员列表
    public final String InviteMemberInGroup = "AppGroup/InviteMemberInGroup";//邀请好友入群
    public final String LeaveGroup = "AppGroup/LeaveGroup";//退出群聊
    public final String DismissGroup = "AppGroup/DismissGroup";//解散群聊
    public final String GroupMemberSearch = "AppGroup/GroupMemberSearch";//群成员搜索
    public final String OwnerGroup2Other = "AppGroup/OwnerGroup2Other";//群主转移身份
    public final String EditeGroupName = "AppGroup/EditeGroupName";//修改群名
    public final String GroupInfo = "AppGroup/GroupInfo";//群信息
    public final String MakeFriendsInToGroupList = "AppGroup/MakeFriendsInToGroupList";//拉好友入群列表
    public final String AddFriendsInToGroup = "AppGroup/AddFriendsInToGroup";//拉好友入群
    public final String GroupInfoByRYGroupId = "AppGroup/GroupInfoByRYGroupId";//通过融云id获取群信息
    public final String RemoveGroupFriend = "AppGroup/RemoveGroupFriend";//移除群成员
    public final String IsInGroup = "AppGroup/IsInGroup";//判断是否在该群
    public final String UserComplaint = "AppGameCircle/UserComplaint";//用户投诉
    public final String MyFriendsList = "AppIndex/MyFriendsList";//我的好友
    public final String SearchUser = "AppIndex/SearchUser";//搜索用户
    public final String AddFriend = "AppIndex/AddFriend";//添加好友
    public final String AccessFriend = "AppIndex/AccessFriend";//允许通过好友验证
    public final String DenyFriend = "AppIndex/DenyFriend";//拒绝通过好友验证
    public final String MyFriendInfo = "AppIndex/MyFriendInfo";//查看用户信息
    public final String EditFriendName = "AppIndex/EditFriendName";//修改备注好友姓名
    public final String DeleteMyFriend = "AppUser/DeleteMyFriend";//删除我的好友
    public final String GetUserInfoByRYAccount = "AppIndex/GetUserInfoByRYAccount";//通过融云id查用户信息
    public final String ApplyMsgIndex = "AppIndex/ApplyMsgIndex";//请求消息列表
    public final String DelMsg = "AppIndex/DelMsg";//删除请求消息
    public final String UpdateUserName = "AppUser/UpdateUserName";
    public final String UpdatePassWord = "AppUser/UpdatePassWord";
    public final String MyGuildIndex = "AppUser/MyGuildIndex";
    public final String MyPointChange = "AppUser/MyPointChange";
    public final String UpdateUserHeadImage = "AppUser/UpdateUserHeadImage";
    public final String MyFocusGameRecordList = "AppUser/MyFocusGameRecordList";
    public final String MyGuildActiveList = "AppUser/MyGuildActiveList";
    public final String GuildActiveInfo = "AppUser/GuildActiveInfo";
    public final String MyFeedback = "AppUser/MyFeedback";
    public final String AddFocusGameRecord = "AppUser/AddFocusGameRecord";
    public final String DeleteFocusGameRecord = "AppUser/DeleteFocusGameRecord";
    public final String GiftsList = "AppUser/GiftsList";
    public final String GetGifts = "AppUser/GetGifts";
    public final String MyGiftsList = "AppUser/MyGiftsList";
    public final String MyUserInfo = "AppUser/MyUserInfo";
    public final String EditMyGifts = "AppUser/EditMyGifts";
    public final String MyGroupList = "AppUser/MyGroupList";
    public final String MyFocusGameList = "AppUser/MyFocusGameList";
    public final String GiftInfo = "AppUser/GiftInfo";
    public final String VersionContent = "AppUser/VersionContent";
    public final String UpdateUserSex = "AppUser/UpdateUserSex";
    public final String CheckVersen = "AppUser/CheckVersen";
    public final String QA = "AppUser/QA";
    public final String GetPointIntroduce = "AppUser/GetPointIntroduce";
    public final String GiftsType = "AppUser/GiftsType";
    public final String TheGamerStarList = "AppIndex/TheGamerStarList";
    public final String ApplyGamerStar = "AppIndex/ApplyGamerStar";
    public final String AddOrDeleteClickLike = "AppGameCircle/AddOrDeleteClickLike";
    public final String AddGameCircleRecord = "AppGameCircle/AddGameCircleRecord";
    public final String MyGameCircleRecord = "AppGameCircle/MyGameCircleRecord";
    public final String SelectGameCircleRecord = "AppGameCircle/SelectGameCircleRecord";
    public final String MoreCommentRecord = "AppGameCircle/MoreCommentRecord";
    public final String DeleteMyGameCircle = "AppGameCircle/DeleteMyGameCircle";
    public final String MyGameCircleComment = "AppGameCircle/MyGameCircleComment";
    public final String MyNewsRecord = "AppGameCircle/MyNewsRecord";
    public final String MoreNewComment = "AppGameCircle/MoreNewComment";
    public final String ClearNewComment = "AppGameCircle/ClearNewComment";
    public final String ClearNewCommentNum = "AppGameCircle/ClearNewCommentNum";
    public final String UpdateGameCircleCover = "AppGameCircle/UpdateGameCircleCover";
    public final String DeleteMyComment = "AppGameCircle/DeleteMyComment";
    public final String NewCommentNum = "AppGameCircle/NewCommentNum";
    public final String OptionGameCircleBlack = "AppGameCircle/OptionGameCircleBlack";
    public final String MoreLikeInfo = "AppGameCircle/MoreLikeInfo";
    public final String GameCircleTip = "AppGameCircle/GameCircleTip";
    public final String ShareGameCircle = "AppGameCircle/ShareGameCircle";
    public final String AddPointByShareGameCircle = "AppGameCircle/AddPointByShareGameCircle";
    public final String SetAppConfig = "AppLoginReg/SetAppConfig";
    public final String GetToken = "AppLoginReg/GetToken";



}