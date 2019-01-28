package com.jacle.scala

import scala.collection.{SortedSet, mutable}

object ScalaSet {
  def main(args: Array[String]): Unit = {
    //Scala的set分为可变和不可变的
    var set=collection.mutable.Set(1,2,3,4,5);
    //set.retain(x=>x>3);
    println(set);

    var sortedSet:SortedSet[Int]=collection.mutable.SortedSet();
    sortedSet++=set;
    println(sortedSet);

    var linkedSet:mutable.LinkedHashSet[Int]=mutable.LinkedHashSet();
    linkedSet++=set;
    println(linkedSet);

  }
}
