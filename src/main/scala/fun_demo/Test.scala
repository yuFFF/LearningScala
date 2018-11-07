package fun_demo

object Test {
  def main(args: Array[String]): Unit = {
    val f = new FunctionDemo
    f.fun1()
    val str:Array[String] = new Array[String](3)
    str(0)="1"
    str(1)="2"
    str(2)="3"
    f.fun4(args="12","123","1234","12345")
  }
}
