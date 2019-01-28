package com.jacle.scala.testpackeage

import com.jacle.scala.ScalaExtractor

object ExtractorTest {
  def main(args: Array[String]): Unit = {
     var e=ScalaExtractor("jacle",19)

     var e2=new ScalaExtractor("jacle",19)
     println(e2)

    e match {
        //对象的模式匹配，进行unapply
      case ScalaExtractor(name,age) =>println(name+","+age);
      case _=>println("None!")
    }

    //匹配模式中的序列，通常会使用占位符来匹配
    var alist:List[Int]=List(1,2,3);
    alist match
      {
        //序列模式独有的匹配符
      case List(x@_,y@_*)=>println(x,y)

    }



  }
}
