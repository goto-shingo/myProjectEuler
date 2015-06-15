object problem003 {
  def main(args: Array[String]) {
    var answer = 0L
    var start = 2L

    answer = getMaxPrimeFactor(600851475143L, start)
    println("answer is " + answer)
  }

  def getMaxPrimeFactor(n: Long, division: Long): Long = {
    if (n == division)
      n
    else if (n % division == 0)
      getMaxPrimeFactor(n / division, division)
    else if (n % division != 0)
      getMaxPrimeFactor(n, division + 1)
    else
      n // nop
  }
}
