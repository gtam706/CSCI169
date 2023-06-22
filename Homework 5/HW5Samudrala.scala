object HW5Samudrala{
  def is_prime(x: Int): Boolean = {
    def helper(i: Int): Boolean = {
      if (i == 2)
        (x % 2 != 0)
      else
        (x % i != 0) && helper(i - 1)
    }
    if (x < 1) false
    else if (x == 2) true
    else helper(x - 1)
  }
  def add_fth(x:Int, f:Int=>Int):Int={
    if(x<1)0
    else x + add_fth(f(x),f)
  }
  def test(x:Int):Int={
    x-3
  }
  def add_third(x: Int): Int = {
    if (x < 1) 0
    else x + add_third(x - 3)
  }
  def apply_combine(f:Int=>Int, g: (Int,Int)=>Int,x:Int):Int={
    if(x==1)f(1)
    else g(f(x),apply_combine(f,g,x-1))
  }
  def add(x: Int, y: Int): Int = x + y
  def square(x: Int): Int = x * x
  def mult(x: Int, y: Int): Int = x * y
  def identity(x: Int) = x

  def reduce(f: (Int, Int) => Int, x: List[Int]): Int = {
    if (x.isEmpty) {
      0
    }
    else {
      f(x.head, reduce(f, x.tail))
    }
  }

  def ls = 7 :: 2 :: 5 :: 1 :: Nil

  def combineLists(f: (Int, Int) => Int, xs: List[Int], ys: List[Int]): List[Int] = {
    if (xs.isEmpty || ys.isEmpty) {
      Nil
    }
    else {
      f(xs.head, ys.head) :: combineLists(f, xs.tail, ys.tail)
    }
  }

  def x = 3 :: 8 :: 1 :: 5 :: Nil
  def y = 12 :: 6 :: 23 :: 1 :: 8 :: 4 :: Nil

  def currReduced(f: (Int, Int) => Int): (List[Int]) => Int = {
    def inner(x: List[Int]): Int = {
      if (x.isEmpty) {
        0
      }
      else {
        f(x.head, inner(x.tail))
      }
    }

    inner
  }

  def currCombineLists(f: (Int, Int) => Int): (List[Int], List[Int]) => List[Int] = {
    def inner(xs: List[Int], ys: List[Int]): List[Int] = {
      if (xs.isEmpty || ys.isEmpty) {
        Nil
      }
      else {
        f(xs.head, ys.head) :: inner(xs.tail, ys.tail)
      }
    }

    inner
  }

  def main(args: Array[String]) {
    println(reduce(add,ls))
    println(combineLists(add,x,y))
    println(currReduced(add)(ls))
    println(currCombineLists(add)(x,y))
  }
}
