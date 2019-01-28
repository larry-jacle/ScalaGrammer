package com.jacle.scala

import java.io.FileReader


/**
  * Scala的异常处理
  *     Scala的异常处理使用的是match模式匹配的形式
  *     object是没有构造方法的，但是可以apply方法来隐藏调用
  *           它当中所有的方法和变量默认的都是静态的
  */
object ScalaException {

  def main(args: Array[String]): Unit = {
     try
       {
         var fileReader=new FileReader("./test.txt");
       }catch
       {
         case ex:Exception=>
           {
             println(ex.printStackTrace())
           }

       }finally
     {
       println("finally")
     }


  }
}
