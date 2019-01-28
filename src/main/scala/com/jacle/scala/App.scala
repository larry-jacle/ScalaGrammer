package com.jacle.scala

/**
  * @author ${user.name}
  */
object App {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def prt(s: String) = {
    println(s);
  }

  //表达式就是方法返回的数值
  def apply1(user: String, domain: String) = user + "@" + domain

  def main(args: Array[String]) = {

    ScalaSingleton.getSingleton(1);
    //编译通过，运行报错
//    new ScalaSingleton(1)

    println("Hello World!")
    println("concat arguments = " + foo(args))
    println(apply1("test","com"))

    //默认的Some里面放置的是一个元组
    var s=Some((1,2,3))
    var p=Option((1,2,3))
    println(s.get);
    println(p.get)
  }

}
