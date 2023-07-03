import scala.io.StdIn.readInt
object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter Number: ")
    val num = readInt()
    num match {
      case x if(x<= 0) => println("Negative/Zero")
      case x if(x%2==0) => println("Even")
      case _ => println("Odd")
    }
  }
}