package com.jacle.scala


/**
  * Scala的class不用声明为public
  * 类参数，可以用来构造类变量，类参数整个类中都可以访问
  * 一个scala文件中可以定义多个类
  * @param x
  * @param y
  */
class Point(x:Int,y:Int) {
  var pointx:Int=x;
  var pointy:Int=y;

  def showPosition(): Unit =
  {
    println(x+","+y)
  }
}


/**
  * 同一个scala文件中定义第二个类
  * @param x
  * @param y
  */
class Point2(x:Int,y:Int) {
  var pointx:Int=x;
  var pointy:Int=y;

  def showPosition(): Unit =
  {
    println(x+","+y)
  }
}



/**
  * object没有参数，直接是调用类class
  * scala中的new都是class的类
  */
object  Test
{
  def main(args: Array[String]): Unit = {

    def main(args: Array[String]): Unit = {
      var point:Point=new Point(1,2);
      point.showPosition();
    }
  }
}
