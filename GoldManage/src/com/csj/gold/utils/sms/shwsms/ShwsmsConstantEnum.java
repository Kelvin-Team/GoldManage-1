package com.csj.gold.utils.sms.shwsms;

public class ShwsmsConstantEnum {


  public  enum ShwsmsEnum{
   
   a(111,"发送成功"),
   b(000,"系统异常"),
   c(201,"参数不正确"),
   d(202,"平台暂停发送"),
   e(203,"账号不存在"),
   f(204,"账号密码不对，不能发送"),
   g(205,"账号状态不正确，不能发送"),
   h(206,"提交号码大于设定条数，不允许发送"),
   ad(207,"内容为空，不允许发送"),
   Ab(208,"内容过长，不允许发送，默认最大500个字。"),
   Av(209,"余额不足"),
   Ad(210,"发送总数小于最低限制发送量，不允许发送"),
   As(211,"内容存在关键字，监测不过关"),
   Aa(212,"存在错误号码，发送终止"),
   Af(224,"帐号不允许发送移动数据"),
   aA(225,"帐号不允许发送联通数据"),
   dA(226,"帐号不允许发送电信数据"),
   asA(227,"帐号不允许发送小灵通数据"),
   dfA(228,"移动通道存在有关键字"),
   ssA(229,"联通通道存在有关键字"),
   sdA(230,"电信通道存在有关键字"),
   aAa(231,"小灵通通道存在有关键字"),
   dAa(100,"发送失败！错误信息：平台停止发送"),
   fAd(101,"发送失败！单次发送总量超过系统设置上限"),
   dAf(102,"操作失败！错误信息：帐号不存在"),
   fAs(103,"发送失败！错误信息：帐号状态不正确，不能发送"),
   gAs(104,"发送失败！错误信息：余额不足"),
   wA(106,"发送失败！发送总数小于最低限制发送量"),
   wAd(115,"发送失败，内容过长"),
   Add(422,"短信内容存在有非法关键字！"),
   ddA(429,"子号错误"),
   Ada(430,"接口访问速度过快"),
   Asd(431,"IP验证失败");
    private String name;
    private int index;
    // 构造方法
       private ShwsmsEnum( int index,String name) {
           this.name = name;
           this.index = index;
       }
       public  String getIndex(int index){
		
    	   return name;   
       }
    }
}
