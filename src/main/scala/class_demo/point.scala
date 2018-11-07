package class_demo

class point(xPoint: Int, yPoint: Int) {
  var x: Int = xPoint
  var y: Int = yPoint

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x)
    println("y 的坐标点: " + y)
  }

}
