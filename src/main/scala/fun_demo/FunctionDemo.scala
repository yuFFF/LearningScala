package fun_demo

class FunctionDemo() {

  /*默认参数*/
  def fun1(v1: Int = 5, v2: Int = 6): Int = {
    val sum = v1 + v2
    println("默认参数", sum)
    sum
  }

  /*带名参数*/
  def fun2(): Unit = {}

  /*变长参数*/
  def fun3(args: Int*): Int = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def fun4(args: String*): Unit = {
    var i: Int = 0
    for (arg <- args) {
      println("input value [" + i + "] = " + arg)
      i += 1
    }
  }
}
