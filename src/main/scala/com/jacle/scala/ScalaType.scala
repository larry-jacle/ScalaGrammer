package com.jacle.scala

/**
  * scala数据类型示例
  */
object ScalaType {
  def main(args: Array[String]): Unit = {
    //scala是一个对象的集合，通过对象的方法来进行参数的传递；

    //新版本中文件名跟程序名不行也要相同；
    //对象、类、方法、字段 四个主要的核心
    //Unit表示为void，空，跟Python的pass 一样的意思；
    println(Unit)

    //三个需要注意的类型,Nothing,Any,AnyRe
    println(10/3)
    println(10/3.0f)
    println(3==4)

    //默认的修饰符是public，scala的对象可以直接调用方法
    println(ScalaFunction.function3(5))


  }
}
