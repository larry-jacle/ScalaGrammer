package com.jacle.scala

/**
  * scala的Map分为可变和不可变，默认使用不可变的Map
  */
object ScalaMap {

  def main(args: Array[String]): Unit = {
    var map: Map[String, String] = Map("1" -> "2");
    var map2: Map[String, String] = Map("1" -> "2");
    println(map.isEmpty)
    //Map的key是一个set
    println(map.keys);
    println(map.values)

    //map的合并
    println(map++map2)
    //map进行取值的时候要判断key是否存在
    if(map.contains("test3"))
      {
        //不能直接读取，否则会报错
        println(map("123"))
      }

    //如果获取元素的时候不行进行判断，可以返回一个Option
    println(map.get("test3"));
    println(map.get("12").getOrElse(""))
    println(map.get("test3").isEmpty);
    println(map.get("1").isEmpty)

    println(map.keys.iterator.max)

    //创建不可变map的第二种方式
    var m=Map((1,2),(1,"abcd"));
    println(m.get(1).get.toString);

    //建立Map集合的时候，设置集合类型
    var mutableMap=collection.mutable.Map[Int,Any]();
    mutableMap+=((1,"3"))
    println(mutableMap)

    //有序的Map,可设置key的升序还是降序
    var sortedMap=collection.SortedMap((1,90),(3,86),(2,88),(5,78),(4,93))(Ordering.Int.reverse);
    println(sortedMap);

    //按照插入的顺序的Map
    var linkedHashMap=collection.mutable.LinkedHashMap[Int,String]();
    linkedHashMap += ((6,"banana"))
    linkedHashMap += ((5,"banana"))
    linkedHashMap += ((19,"banana"),(15,"banana"))
    //从其他集合添加数据
    linkedHashMap ++= List((119,"banana"),(115,"banana"))
    println(linkedHashMap);
    //删除只需要指定key即可
    linkedHashMap -=(119,115,110)
    linkedHashMap --=List(119,115,6)

    //key如果不存在新建key对应的entry
    linkedHashMap(999)="123";

    println(linkedHashMap);

    for((k,v)<-linkedHashMap)
      {
        println(k,v);
      }

    linkedHashMap.foreach(x=>println(x._1,x._2))

  }

}
