object problem001 {
  def main(args: Array[String]) {
    var answer = 0
    answer = (1 until 1000).toList.filter(n => n % 3 == 0 || n % 5 == 0).sum
    println("answer is " + answer)
  }
}
