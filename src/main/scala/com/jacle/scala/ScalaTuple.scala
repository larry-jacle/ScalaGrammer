package com.jacle.scala

/**
  * Scala支持的元组最大是22个元素，超过可以使用集合来代替
  *
  */
object ScalaTuple {
  def main(args: Array[String]): Unit = {
    var t=(1,2,3,4,5,6,7,8,9);

    //元组的迭代
    t.productIterator.foreach(x=>println(x));
    println(t.productIterator.mkString(","))


  }

}
