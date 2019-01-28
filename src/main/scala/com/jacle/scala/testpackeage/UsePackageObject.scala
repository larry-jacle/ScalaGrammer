package com.jacle.scala.testpackeage
//可以对引用类重新命名，从而使得Java的类跟Scala的类不重复，重复的时候，前面要加多个包名才能区分
import java.util.{HashMap=>JavaHashMap}
//隐藏某个类

//import java.util.{HashMap=>_}
import  scala.collection.mutable.HashMap;

object UsePackageObject {
  def main(args: Array[String]): Unit = {
//    var year=20111;
    testpackageClassmethod(1,2)
    println(year)

    var javahashMap=new JavaHashMap[String,String]()
    javahashMap.put("key","val")
    println(javahashMap);

    //scala的hashmap

  }
}
