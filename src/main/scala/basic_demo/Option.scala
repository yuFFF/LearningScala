package basic_demo

/*
*
* */
object Option {
  def main(args: Array[String]): Unit = {

    val map1: Map[String, String] = Map(
      "a" -> "1",
      "b" -> "2",
      "c" -> "3")

    /*调用apply方法获取值*/
    println(map1("a"))
    println(map1.apply("a"))
    println(map1("b"))
    println(map1.apply("b"))
    println(map1("c"))
    println(map1.apply("c"))

    /*若不存在->报错*/
    /*println(map1("d"))*/

    /*调用get方法获取值*/
    println(map1.get("b"))
    println(map1.get("c"))
    println(map1.get("d"))

  }
}
