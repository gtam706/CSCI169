object HW9P2Samudrala {
  def main(args: Array[String]): Unit = {
    cond(5 < 8)(
      {
        println("execute first expression");
        square(2)
      },
      {
        println("execute second expression");
        4 + 3 * 2
      })
  }
  def square(x:Int):Int = x*x
  def cond(bool: => Boolean):(=>Any,=>Any)=>Any  = {
    def inner(exp1: =>Any,exp2: =>Any): Any={
      if(bool){
        exp1
      }
      else{
        exp2
      }
    }
    inner
  }

}
