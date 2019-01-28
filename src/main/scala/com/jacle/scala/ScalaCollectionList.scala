package com.jacle.scala

import List._
import scala.collection.mutable.ListBuffer;

/**
  * scala的集合分为可变集合和不可变集合
  * List一点创建值都无法改变,Array是可以改变的
  */
object ScalaCollectionList {
  def main(args: Array[String]): Unit = {
    //List
    //List是一个不可变的集合
    //List可以包含多种类型
    var list = List(1, 2, 3, "abcd", 123.12312f);
    var nothinglist:List[Nothing]=List();
    var list2 = List(1, 2, 3);
    var listCompare:List[Int]=List(1,4,2,5,1232,2)
    var listTupleCompare:List[(Int,String)]=List((1,"123"),(120,"1221a33"),(3,"1b23"))

    var listZip1 = List(1, 2, 3);
    var listZip2 = List(11, 22,33);
    println(list);

    //构造列表的两个类型Nil ::
    println(Nil);
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil));
    println(site);

    //常用的List的方法
    println(site.head);
    //除了第一个元素之外的其他元素
    println(site.tail);
    println(nothinglist.isEmpty)

    //连接两个List
    println(site.contains("Baidu"));

    //:::是自然顺序的叠加，.:::是反过来的顺序叠加
    var newList=site.:::(list2);
    println(newList);
    println(site:::list2);
    println(site++list2);

    //将指定的元素加到List的开头
    println(2+:site)
    println(site:+2)

    //List的fill，指定将重复数值加入到List
    var siteList=List.fill(3)("Dubbo");
    println(siteList);

    println(List.tabulate(10)(x=>x*x))
    println(site.reverse);

    var strBuilder:StringBuilder=new StringBuilder();
    site.addString(strBuilder,",")
    println(strBuilder.toString())
    println(site.mkString(","));

    //apply获取元素
    println(site.apply(0));
    println(site(0));
    println(site.endsWith(List("Baidu")));

    //判断列表是否存在某个元素
    println(site.contains("123"))
    //判断元素是否有满足指定条件的
    println(site.exists(s=>s.length==3))
    println(site.filter(s=>s.startsWith("B")))
    //返回所有的元素，除了最后一个
    println(site.init)
    println(site.last)
    println(site.max)
    println(site.min)
//    println(site.sum());
    println("list排序:");
    //通过比较器来进行排序
    println(listCompare.sortWith(_.compareTo(_)<0));
    println(listCompare);
    //隐式的为Ordering，升序排列,也可以设置为降序
    println(listCompare.sorted.reverse)
    //根据指定的列或者多个列进行排序
    println(listTupleCompare.sortBy(x=>(x._2)).reverse)

    //可以将字符串转换为List
    println("hello".toList);

    //可以编辑的ListBuffer,ListBuffer一定要设置类型
    var listbuffer:ListBuffer[String]=new ListBuffer();
    for(i <- 1 to 9)
      {
        listbuffer+="listBufferElement"+i;
      }

    println(listbuffer.toList);

    //根据标记来删除指定位置的元素
    listbuffer.remove(0)
    listbuffer.remove(1,4);

    println(listbuffer);

    //删除指定的一组数值的元素
    listbuffer--=Seq("listBufferElement2","listBufferElement3");
    println(listbuffer)

    println(range(1,10).toList)

    //混合类型可以通过Any来代替
    var ListInList:List[List[Any]]=List(List(1,2,3),List(11,"abcd",22,33));
    //List的List的遍历
    for(listItem<-ListInList;item<-listItem)
      {
        println(item);
      }

    //将list变为list的元组
    var listZip3=List((111,222),(333,444),(555,666))
    println(listZip1 zip listZip2);
    println(listZip2 zip listZip3);
    var listzip=listZip1 zip listZip2

    //unzip过程
    var (list11,list22)=listzip.unzip
    println(list11);
    println(list22)

    //返回的是index的Range
    println(list11.indices)
    //返回数据和索引的元组
    println(list11.zipWithIndex)

    //可以通过updated来进行更新,返回一个新的List
    var listUpdated=list11.updated(0,999);
    println(listUpdated);

    //集合的reduce fold都可以做折叠计算，reduce和fold都是并行的，没有顺序。
    println(list11.reduce((sum,item)=>sum+item));
    //reduceLeft返回的是跟集合一样的类型
    println(list11.reduceLeft((sum,item)=>{println(sum+"+"+item);sum+item}))
    //reduceLeft是foldLeft的一种特例
    println(list11.tail.foldLeft(list11.head)((sum,item)=>{println(sum+"+"+item);sum+item}))
    //foldLeft跟reduceLeft的区别是foldLeft有初始值
    println(list11.foldLeft(10)((sum,item)=>{println(sum+"+"+item);sum+item}))

    //fold可以返回任意的类型
    println(list11.foldLeft(Array.empty[Int])((arr:Array[Int],i)=>arr:+i).toList);

    println(list11.reduceRight((sum,item)=>{println(sum+"+"+item);sum+item}));
    //foldRight的时候注意Arr是写在后面的
    println(list11.foldRight(Array.empty[Int])((item,arr:Array[Int])=>arr:+item).toList);

    //reduce和reduceOption的区别
    println(List.empty[Int].reduceOption(_+_))
//    println(List.empty[Int].reduce(_+_));
    //fold的简写 初始值/: 迭代对象,简写的时候，前面要用括号括起来，作为一个表达式
    println((List[Int]() /: list11){(list:List[Int],item:Int)=>item+:list});

    //按照个数进行分组，变为List[Tuple]
    println(list11.grouped(3))
  }

}
