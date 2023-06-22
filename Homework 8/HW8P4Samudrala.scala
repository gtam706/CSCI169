import HW8P12Samudrala.{add, ls, merge, reduce, x, y}

object HW8P4Samudrala {
  def negs(x: Int) = x < 0

  def one(x: Int) = x == 1

  def empty(x: Int) = false

  def contains(set: Int => Boolean, value: Int): Boolean = set(value)

  def complement(set: Int => Boolean): Int => Boolean = {
    (x: Int) => !(contains(set, x))
  }

  def complement2(set: Int => Boolean): Int => Boolean = {
    def inner(x: Int) = !(contains(set, x))
    inner
  }

  def union(s1: Int => Boolean, s2: Int => Boolean): Int => Boolean = {
    (x: Int) => contains(s1, x) || contains(s2, x)
  }

  def intersection(s1: Int => Boolean, s2: Int => Boolean): Int => Boolean = {
    (x: Int) => contains(s1, x) && contains(s2, x)
  }

  def difference(s1: Int => Boolean, s2: Int => Boolean): Int => Boolean = {
    intersection(s1, complement(s2))
  }

  def singleton(value: Int): Int => Boolean = {
    (x: Int) => x == value
  }

  def eight = singleton(8)
  def setList(l:List[Int]):Int=>Boolean={
    def inner(x:Int):Boolean={
      if(l.isEmpty) false
      else  (l.head ==x) || setList(l.tail)(x)
    }
    inner
  }
  def filter(s: Int=>Boolean, p:Int=>Boolean): Int=>Boolean={
    (x:Int) => {
      contains(s,x) || p(x)
    }
  }
  def forall(s:Int=>Boolean, p:Int=>Boolean):Boolean={
    val num = -1000
    def inner(x:Int):Boolean={
      if(contains(s,x) && x <= 1000){
        p(x) && inner(x-1)
      }
      else{
        true
      }
    }
    inner(num)
  }
  def y = 12 :: 6 :: 23 :: 1 :: 8 :: 4 :: Nil
  def predicate(x:Int)={
    (x%2) == 0
  }

  def main(args: Array[String]): Unit = {
    println(setList(y)(8))
    println(filter(setList(y),predicate)(5))
    println(forall(setList(y),predicate))
  }


}
