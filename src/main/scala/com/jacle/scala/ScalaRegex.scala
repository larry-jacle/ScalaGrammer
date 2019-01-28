package com.jacle.scala

import scala.util.matching.Regex

/**
  * scala正则表达式
  */
object ScalaRegex {

  def main(args: Array[String]): Unit = {
    //正则处理
    var str="Test is a test";

    //scala中所有的正则都是.r结尾
    var pattern="(a|A)est".r
    var pattern2=new  Regex("(t|T)est");

    //返回的是Some
    println(pattern.findFirstIn(str));
    println(pattern2 findAllIn str)
    //findAllIn findFirstIn返回的是迭代器
    println((pattern2 findAllIn str).mkString(","));

  }

}
