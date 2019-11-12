import scala.math.{ max, floor }

object solve {
  def apply(problem: String) = {
    val numAs = problem.count(_ == 'A')
    val numBs = problem.count(_ == 'B')
    val timeAs = 8 * numAs - 3

    if (numAs % 2 == 0)
      max(timeAs, numAs + floor((numBs - 1) / 2).toInt * 10 + 5)
    else if (numBs % 2 == 0)
      max(timeAs, 5 * numBs + numAs - 4)
    else
      max(timeAs, 5 * numBs + numAs - 6)
  }
}

object Main extends App {
  val problems = Seq("A", "AB", "BB", "ABB", "AABABBAB")
  problems.foreach(p => println(s"$p: ${solve(p)}"))
}

