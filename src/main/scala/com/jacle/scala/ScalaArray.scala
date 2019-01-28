package com.jacle.scala

import Array._
import scala.collection.mutable.ArrayBuffer;

object ScalaArray {

  def main(args: Array[String]): Unit = {
    var arr=new Array[Int](3);
    var arr2=Range(1,10,2);
    var arr3=Range(1,8,2);

    println(arr2);
    //Range和Array还是有区别的
    println(concat(arr2.toArray,arr3.toArray).toList);

    //Array是固定大小的，可以创建改变大小的Array
    var arrayBuffer=ArrayBuffer[String]("initVal");
    //第一种添加元素的方式
    arrayBuffer += "test";
    //第二种添加方式
    arrayBuffer++=Seq("test1","test2")
    //第三种方式
    arrayBuffer.append("test311","test346")

    println(arrayBuffer);

    arrayBuffer-=("test1")
    arrayBuffer--=Seq("test2")
    println(arrayBuffer)

    //take并不影响原来的List
    println(arrayBuffer.take(2))
    println(arrayBuffer);

    //数组的排序
    val x = Array("cherry","apple","banana")
    scala.util.Sorting.quickSort(x)
    //是在原来的List的基础上进行排序的
    println(x.toList);



  }

}
