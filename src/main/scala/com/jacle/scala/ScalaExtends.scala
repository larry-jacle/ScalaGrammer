package com.jacle.scala

/**
  * 复写的时候，方法要写override，类属性不需要
  * @param x
  * @param y
  * @param z
  */
class ScalaExtends(x:Int,y:Int,z:Int) extends  Point(x,y) {
   val zx=z;

  override def showPosition =
  {
    println(x+","+y+","+z)
  }

}

object Test2
{
  def main(args: Array[String]): Unit = {
    var extendsObj=new ScalaExtends(1,2,3);
    extendsObj.showPosition();
  }
}


