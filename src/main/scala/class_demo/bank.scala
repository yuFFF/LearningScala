package class_demo

class bank() {
  private var yue: Int = 0

  def addMoney(money: Int): Unit = {
    yue = money + yue
    println("存入金额：" + money)
    println("余额：" + yue)
  }

  def deleteMoney(money: Int): Unit = {
    if (money < yue) {
      yue = yue - money
      println("取出金额：" + money)
      println("余额：" + yue)
    }
    else {
      println("当前余额不足!")
    }
  }
}