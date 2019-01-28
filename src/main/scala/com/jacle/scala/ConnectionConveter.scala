package com.jacle.scala

import java.util

import com.google.gson.Gson

import scala.collection.JavaConversions
import scala.collection.mutable.ListBuffer



/**
  * java集合跟scala集合的转换
  */
object ConnectionConveter {
  def main(args: Array[String]): Unit = {

    val tmpList:util.List[Int] = new util.ArrayList[Int];
    tmpList.add(1);
    tmpList.add(100);
    tmpList.add(90);


    //java的集合之后转换为Scala的集合，才能使用scala的方法
    var list=JavaConversions.asScalaBuffer(tmpList);
    list.foreach(println)
    println(list.max)

    var tmpMap:util.HashMap[String,Int]=new util.HashMap[String,Int]();
    tmpMap.put("key1",1);
    tmpMap.put("key2",2);
    tmpMap.put("key3",3);

    var map=JavaConversions.mapAsScalaMap(tmpMap);
    map.foreach(println)

    //seq是不能进行数据元素添加的，可以转换为java的List,指定的时候指定为List
    var javaTmpList:util.List[Int] = JavaConversions.bufferAsJavaList(list);
    println(javaTmpList);

    //将scala的集合转为java的集合，在使用json转换，复杂类型是否能转换？？？
    var gson:Gson=new Gson()
    println(gson.toJson(javaTmpList))
  }
}
