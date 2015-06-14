object problem002 {
  def main(args: Array[String]) {
    val newList = fibToListUntil(100)
    println(newList)
  }

  def fibToListUntil(n: Int) = {
    var count: Int = 0
    var fibNum: Long = 0
    var list:List[Long] = Nil
    do {
      count += 1
      fibNum = fib(count)
      list = fibNum :: list
      println(count, list)
    } while(fibNum <= n)
    list
  }

  def fibToList(n: Int) =
    for(i <- 1 to n) yield fib(i)

  def fib(n: Long): Long =
    n match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case _ => fib(n -2) + fib(n - 1)
    }
}
