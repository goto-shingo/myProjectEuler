object problem002 {
  def main(args: Array[String]) {
    /*
    for(n <- 1 to 10) {
      println("answer is " + fib(n))
    }*/
    val list = fibToList(10)
    list.foreach(println("value is " + _))
  }

  def fibToList(n: Int) = {
    val list:List[Long] = List.empty

    for(i <- 1 to n) {
      list :+ fib(i)
    }
  }

  def fib(n: Long): Long =
    n match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case _ => fib(n -2) + fib(n - 1)
    }
}
