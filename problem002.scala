object problem002 {
  def main(args: Array[String]) {
    var answer = 0
    val list = fibToListUntil(4000000)
    println(list)

    answer = newList.filter(_ % 2 == 0).sum
    println(answer)
  }

  def fibToListUntil(n: Int) = {
    var count: Int = 0
    var fibNum: Int = 0
    var list:List[Int] = Nil
    do {
      count += 1
      fibNum = fib(count)
      if(fibNum <= n) {
        list = fibNum :: list
      }
    } while(fibNum <= n)
    list
  }

  def fibToList(n: Int) =
    for(i <- 1 to n) yield fib(i)

  def fib(n: Int): Int =
    n match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case _ => fib(n -2) + fib(n - 1)
    }
}
