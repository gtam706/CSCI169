import scala.runtime.Nothing$

object HW8P12Samudrala {
  def merge(x:List[Int],y:List[Int]):List[Int]= {
    x match{
      case head::tail => head::merge(y,tail)
      case Nil => y
    }

  }
  def reduce[T<: AnyRef](f: (T,T) => T, x: List[T]):T = {
    if (x.tail.tail.isEmpty) {
      f(x.head,x.tail.head)
    }
    else {
      f(x.head, reduce(f, x.tail))
    }
  }


  def x = 3 :: 8 :: 1 :: 5 :: Nil
  def y = 12 :: 6 :: 23 :: 1 :: 8 :: 4 :: Nil
  def ls = 7 :: 2 :: 5 :: 1 :: Nil
  def s = "hello"::"loser"::Nil
  def add(string: String,string1: String):String={
    val answer = string.concat(string1)
    answer
  }

  def main(args: Array[String]): Unit = {
    println(merge(x,y))
    println(reduce(add,s))
  }
}
