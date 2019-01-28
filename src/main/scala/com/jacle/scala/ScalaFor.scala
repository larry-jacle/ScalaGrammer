package com.jacle.scala


/**
  * scala循环For的示例
  */
object ScalaFor {

  def main(args: Array[String]): Unit = {
    //测试scala的for循环语法
    //包含两个边界值
    for(i <- 1 to 9)
      {
        println(i);
      }

    println("############");

    //until不包含右边界的数值
    for(m<- 1 until  3)
      {
        println(m);
      }

    println("############");

    //这种方式是scala的迭代，而不是并列关系
    for(i <- 1 until 9;j<- 11 until 19)
      {
        println(i+","+j);
      }

    //遍历集合
    var list2=List(1,2,3,4);
    for(l <- list2)
      {
        println(l)
      }

    println("#######")
    //通过设定if条件来进行数据过滤
    for(l <- list2 if l>1;if l%2==0)
    {
      println(l)
    }

    //for遍历可以通过yueld来讲返回的数据，组织在一起返回，如果输入是List，返回就是List
    var listAfter=for(l <- list2 if l>1;if l%2==0) yield l;
    println(listAfter);


  }

}
