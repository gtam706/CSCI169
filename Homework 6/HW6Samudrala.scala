object HW6Samudrala {
  def reduce(f:(Int,Int) => Int,x: List[Int]):Int = {
    if(x.isEmpty){
      -1
    }
    else{
      f(x.head,reduce(f,x.tail))
    }
  }

  def combineLists(f:(Int,Int)=>Int,xs:List[Int],ys:List[Int]):List[Int]={
    if(xs.isEmpty || ys.isEmpty){
      Nil
    }
    else{
      f(xs.head,ys.head)::combineLists(f,xs.tail,ys.tail)
    }
  }
  def currReduced(f:(Int,Int) => Int):(List[Int])=>Int ={
    def inner(x:List[Int]):Int={
      if(x.isEmpty){
        0
      }
      else{
        f(x.head,inner(x.tail))
      }
    }
    inner
  }

  def currCombineLists(f:(Int,Int)=>Int):(List[Int],List[Int])=>List[Int] ={
    def inner(xs:List[Int],ys:List[Int]):List[Int] ={
      if (xs.isEmpty || ys.isEmpty) {
        Nil
      }
      else {
        f(xs.head, ys.head) :: inner(xs.tail, ys.tail)
      }
    }
    inner
  }
  def currCombineLists2(f:(Int,Int)=>Int):(List[Int])=>(List[Int])=>(List[Int])={
    def inner(xs:List[Int]):(List[Int])=>List[Int]={
      def innerinner(ys:List[Int]):List[Int] = {
        if(ys.isEmpty || xs.isEmpty) {
          Nil
        }
        else
          f(xs.head,ys.head)::inner(xs.tail)(ys.tail)
      }
      innerinner
    }
    inner
  }
  def count(xs:List[Int],value:Int):Int={
    xs match{
      case Nil=>0
      case head::tail=>if(x==y)1+count(tail,value) else count(tail,value)
    }
  }

  def ls = 7 :: 2 :: 5 :: 1 :: Nil
  def x = 3 :: 8 :: 1 :: 5 :: Nil
  def y = 12 :: 6 :: 23 :: 1 :: 8 :: 4 :: Nil
  def add(x: Int, y: Int) = x + y

  def main(args: Array[String]) {
    println(reduce(add, ls))
    println(combineLists(add, x, y))
    println(currReduced(add)(ls))
    println(currCombineLists(add)(x, y))
    println(currCombineLists2(add)(x)(y))
  }
}
