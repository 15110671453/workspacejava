package com.java;

public class TestJava {
  public static void main (String args[])
  {
	//为变量设置内容是用以下格式
	//数据类型 变量名称 ＝ 常量
	  //整形存储范围 2147483648   int 32 位 2147483647
	  int num =10;//10是常量 常量的默认类型是int
	  int result = num* 2;//利用num变量内容乘以2并且将其赋值给result变量 处理 运算
	  num = result;
	  System.out.println(result);
	  //变量 与 常量的区别 在程序运行过程中 变量是可以改变的 但是常量不可以
	  int  max = Integer.MAX_VALUE;
	  int min= Integer.MIN_VALUE;
	  System.out.println(max);
	  System.out.println(min);
	  System.out.println(max+1);//最大值加1 －2147483648 
	  System.out.println(min-1);//最小值减1 2147483647
	  
	  //最大值如果继续增加就变为最小值  如果继续增加就变为了－2147483647
	  //因为任何的数据的计算都是按照二进制进行（整型 32 位 （32位cpu 真么来的）四字节）
	  //32位 第一位是符号位 其余31位 是数值位 ；一旦
	  
	  
	  //扩大数据类型
	  //类型转换   数据范围小的数据与数据范围大的数据进行数学计算 系统自动转换为大数据类型
	  //数据范围大的数据变为数据范围小的数据 那么必须采用强制转换
	  //如果是常量怎样数据转换
	  //int变量+long型常量 结果还是long类型
	  System.out.println(max+1L);
	  //利用数据的转型解决数据的溢出
	  //范围大的数据类型 转为数据范围小的数据类型
	   long lint=1000;//
	    int x = (int)lint;//数据类型 不匹配 如果确定long传过来的数据不会超过int范围 可以进行强制转换;如果过大
	    long lint2=2147483647;//
	    long lint3=2147483650L;// 在使用常量时也需要考虑是用的数据类型
	    
	    
	    System.out.println(11+1L);
	    //short C语言中 双字节 整型的取值范围 32768 32767
	    //byte型数据 它的取值范围 －128 ～127 无符号 IP地址 unsigned char 1字节 0-255
	  
	    int num2 =130;
	    byte bynum = (byte)num2;
	    
	    byte bynum2=100;
	    
	    //虽然任何一个整数常量默认都属于int数据类型 那么你直接赋值 给byte类型应该指明
	    //数据类型 就像  long lint2=2147483648; 会报错才对 但这里没有因为
	    //虽然任何一个整数常量默认都属于int数据类型 但是java编译的时候 如果直接赋值的时候
	    //你这个常量的值范围并没有超出byte的范围 java会帮我们自动的转换数据类型为byte
	   // 
	    int num5;
	    System.out.println(num5);
	    //以上操作形式 是定义了一个变量num 但是没有初始化变量； 影响编译 所以在注意初始化
	    //定义变量 与 初始化 要不要 分步 写
	    int num3;
	    num3=13;
	    System.out.println(num3);
	    //标准
	    int num4=14;
	    System.out.println(num4);
  
  }


}
