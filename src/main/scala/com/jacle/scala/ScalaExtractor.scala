package com.jacle.scala

class ScalaExtractor(val name:String,val age:Int) {
}

/**
  * 伴生对象
  */
object ScalaExtractor
{
  def apply( name: String,age: Int):ScalaExtractor = new ScalaExtractor(name,age);

  def unapply(arg: ScalaExtractor): Option[(String, Int)] = {if(arg!=null){Some(arg.name,arg.age)} else None;}

}
