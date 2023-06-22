object main{
  def main(args: Array[String]) {
    def ls = 7 :: 2 :: 5 :: 1 :: Nil
    val x = new Biguint(ls)
    val y = new Biguint(ls)
    x.add(y).print
  }
}
class Biguint(x:List[Int]){
  def this(s:String) = this({def convert(s:String):List[Int] = {if(s.isEmpty) Nil else convert(s.tail):::List((s.head-'0'))}; convert(s)})
  def this() = this(0::Nil)
  def getNum:List[Int]={
    x
  }
  def add(y:Biguint):Biguint={
    val num = helper(x,0)
    val num1 = helper(y.getNum,0)
    new Biguint((num+num1).toString)
  }
  def helper(xs:List[Int],x:Int):Int ={
    if(xs.isEmpty)0
    else xs.head * exp(10,x)+helper(xs.tail,x+1)
  }
  def exp(x:Int,y:Int):Int = {
    if(y==0)1
    else x * exp(x,y-1)
  }
  def print ={
    println(x)
  }
}
