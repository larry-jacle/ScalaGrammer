package com.jacle.scala

import java.io.{File, FileWriter, PrintWriter}

import scala.io.Source

object ScalaFile {
  def main(args: Array[String]): Unit = {
    //Scala File IO
    var writer=new PrintWriter(new File("test.txt"));

    writer.println("io file test");
    writer.print("123\n");
    writer.println("io file test");

    writer.close();

    //显示文件所有内容,foreach是一个个字符读取的
    Source.fromFile("./test.txt").foreach(print);
    var lines=Source.fromFile("./test.txt");
    for(x<-lines.getLines())
      {
        println(x);
      }
  }
}
