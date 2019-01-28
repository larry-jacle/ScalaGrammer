package com.jacle.scala


/**
  * 伴生对象，类和object定义在一个源文件中,名字相同
  * @param x
  */
class ScalaSingleton private (var x: Int) {
  def showPosition = {
    println("show:" + x)
  }
}

object ScalaSingleton
{
  def getSingleton(x:Int):ScalaSingleton={
     new ScalaSingleton(x)
  }
}
