package com.jacle.scala


/**
  * scala中的方法和函数，区别很小，在类中定义的function叫做方法；函数是可以进行类似变量的赋值
  * scal中的函数其实就是继承Trait的类对象
  */
object ScalaFunction {
   //方法最基本定义的方法
   //这种写法虽然不报错，但是运行是错误的，返回的是Unit为空
   def function1(x:Int){x}

   //通过=来构建方法
   //有等号的写法是标准化的写法
  private def function2(x:Int):Int={x}

   //通过=>来定义方法，这种方式返回的是一个对象变量
   //有等号的都可以自动返回返回值
   val function3=(x:Int)=>{x}

  def main(args: Array[String]): Unit = {

    //对象可以直接调用方法
    println(function1(1))
    println(function2(2))
    println(function2(3))

    scalaMethodType1(getCurrentTimeLong());
    scalaMethodType1(getCurrentTimeLong());

    ShowFlexibleParamFunction("你好","测试");

    println(bpackageFunction(4));
    println(bpackageFunction(5));
    //无参数的方法，可以不加括号
    println("123".length());
  }

  //1、scala的方法分为传名和传值调用
  //传值调用，计算完之后传入
  def scalaMethodType1(secondsInNanos:Long)={
     println("当前时间为："+secondsInNanos+"纳秒");
     secondsInNanos
  }

  //传名调用，注意=>两边有空格
  def scalaMethodType2(secondsInNanos2: => Long)={
    println("当前时间为："+secondsInNanos2+"纳秒");
    secondsInNanos2
  }

  //如果不写返回值类型，默认的根据具体的类型，自动加入返回类型
  def getCurrentTimeLong()={
    println("当前的时间：--")
    System.nanoTime();
  }


  def ShowFlexibleParamFunction(args:String*)={
    for(arg<-args)
      {
        println(arg);
      }
  }


  //闭包首先是一个函数，函数依赖于函数定义之外的一个或者多个变量
  var factor:Int=3;
  def bpackageFunction(x:Int)=x*factor;



}
