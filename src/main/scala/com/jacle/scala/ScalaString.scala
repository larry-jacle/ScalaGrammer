package com.jacle.scala


/**
  * scala的字符串
  */
object ScalaString {

  def main(args: Array[String]): Unit = {
    var str:String="scala string";

    println(str.length);
    println(str.concat("concat"));

    //直接通过printf来格式化字符串的输出
    var formatStr=printf("float is %f,int is %d",12.3213f,3213);
    println(formatStr);

  }

}
