abstract class BSTree { //Can't be instantiated - can't make an object of type BSTree.
  def member(x: Int): Boolean //Tells us if x is in the BSTree
  def insert(x: Int): BSTree
  //creates a new tree that is the same as this one, but with x added
  def equals(other:BSTree):Boolean
  def depth:Int
  def max:Int
  def exactsubtree(that:BSTree):Boolean
}
//Add case in front of all children - allows us to do pattern matching!!
case object Leaf extends BSTree {//Leaf refers to the type AND the single object of that type
  override def toString = "."
  def member(x: Int): Boolean = false
  def insert(x: Int): BSTree = new Node(x, Leaf, Leaf)
  def equals(other:BSTree):Boolean = {
    other match {
      case Leaf => true
      case Node(_, _, _) => false //_ is "don't care"
    }
  }

  def depth: Int = {
    0
  }
  def max:Int={
    -1
  }
  def exactsubtree(that:BSTree):Boolean={
    that match {
      case Leaf => true
      case Node(_,_,_) => false
    }
  }
}
case class Node(value:Int, left:BSTree, right:BSTree) extends BSTree {
  override def toString = "{"+left.toString+value.toString+right.toString +"}"
  //What goes between {} if I want the string representation
  //of everything in my tree between the {}
  def member(x: Int): Boolean = {
    if(x==value) true//BC
    else if(x<value) left.member(x)
    else right.member(x)
  }
  //We need to make a copy of this BSTree (Node) that ALSO has x in it
  def insert(x: Int): BSTree = {
    if(x==value) this //new Node(value, left, right)
    else if(x<value) new Node(value, left insert x, right)
    else new Node(value, left, right insert x)
  }
  def equals(other:BSTree):Boolean = {
    other match {
      case Leaf => false
      case Node(v, l, r) => (value == v) && (left equals l) && (right equals r)
    }//Above case binds other's value to v, etc - especially useful since parameters can't be accessed like fields
  }

  def depth: Int ={
    val l = left.depth
    val r = right.depth
    if(l > r){
      1 + l
    }
    else{
      1 +r
    }
  }
  def max:Int = {
    if(right.max == -1){
      value
    }
    else{
      right.max
    }
  }

  def exactsubtree(that: BSTree): Boolean = {
    that match{
      case Leaf => true
      case Node(v,l,r) => equals(that) || left.exactsubtree(that) || right.exactsubtree(that)
    }
  }
}

object Main {
  val t = new Node(5, Leaf, Leaf)
  val t2 = new Node(7, t, Leaf)
  val t3 = t2 insert 3 insert 9
  def main(args: Array[String]): Unit = {
    println(t3.toString())
    println(t3.depth)
    println(t2.exactsubtree(t))
  }
}
