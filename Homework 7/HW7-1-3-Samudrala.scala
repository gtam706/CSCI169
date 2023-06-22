object HW713Samudrala {
  def currReduced(f: (Int, Int) => Int): (List[Int]) => Int = {
    (x:List[Int]) => {
      if(x.isEmpty){
        0
      }
      else{
        f(x.head,currReduced(f)(x.tail))
      }
    }
  }

  def currCombineLists2(f: (Int, Int) => Int): (List[Int]) => (List[Int]) => (List[Int]) = {
    (xs: List[Int]) => {
      (ys: List[Int]) => {
        if (ys.isEmpty || xs.isEmpty) {
          Nil
        }
        else
          f(xs.head, ys.head) :: currCombineLists2(f)(xs.tail)(ys.tail)
      }
    }
  }
  def add(x: Int, y: Int) = x + y
  def ls = 7 :: 2 :: 5 :: 1 :: Nil
  def x = 3 :: 8 :: 1 :: 5 :: Nil
  def y = 12 :: 6 :: 23 :: 1 :: 8 :: 4 :: Nil

  def findlast(xs:List[Int], x:Int):Int = {
    xs match{
      case head::tail=>
        val index = findlast(tail,x)
        if(index != -1)index +1
        else if(head ==x)0
        else -1
      case Nil => -1
    }
  }

  def main(args: Array[String]) {
    println(currReduced(add)(ls))
    println(currCombineLists2(add)(x)(y))
    println(findlast(ls,1))
  }
}
