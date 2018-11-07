package array_demo

import scala.Array.range

object demo {
  def main(args: Array[String]): Unit = {

    /*创建数组*/
    val arr1: Array[String] = new Array[String](4)
    arr1(0) = "this"
    arr1(1) = "is"
    arr1(2) = "a"
    arr1(3) = "book"

    /*mkString*/
    println(arr1.mkString("《", " ", "》"))
    println(arr1.mkString("_"))

    /*更新值*/
    arr1.update(3, "file")
    println(arr1.mkString("《", " ", "》"))
    println(arr1.mkString("_"))

    val arr2: Array[Int] = range(0, 11)
    val arr3: Array[Int] = range(0, 11, 2)
    println(arr2.mkString(","))
    println(arr3.mkString(","))
  }

}
