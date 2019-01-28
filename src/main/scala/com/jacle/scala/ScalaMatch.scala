package com.jacle.scala

class ScalaMatch(name:String,age:Int) {
   var fname:String=name;
   var aget:Int=age;
}


/**
  * 如果是类进行match，要定义match class样例类
  */
object  Test
{
  def main(args: Array[String]): Unit = {
    var m1=new ScalaMatch("jacle1",23)
    var m2=new ScalaMatch("jacle1",24)

    //Option是一个集合，Some是一个对象
    var list:List[ScalaMatch]=List(m1,m2);
    for(m<-list)
      {
        m match{
          case ScalaMatch("jacle",23)=>println("Just This");
            //解析nuapply
          //case ScalaMatch(name,age)=>println(name+","+age);
          case _=>println("None!")
        }
      }
  }

  //定义样例类,样例类要和比较类名称一致
  //第二种方法是自定义apply和unapply实现对象的模式匹配
  //case class自动帮我们建立apply和unapply方法
  case class ScalaMatch(x:String,y:Int);
}