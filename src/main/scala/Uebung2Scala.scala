class Uebung2Scala {
  /*def ins(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => x :: Nil
    case y :: ys => if (x <= y) x :: xs else y :: ins(x, ys)
  }

  def insSort(xs: List[Int]): List[Int] = insSortRec(Nil, xs)

  def insSortRec(xs: List[Int], ys: List[Int]): List[Int] = ys match {
    case Nil => xs
    case y :: zs => insSortRec(ins(y, xs), zs)
  }

  def appendScalaList(xs: List[Int], ys: List[Int]): List[Int] = xs match {
    case Nil => ys
    case x::zs => x::appendScalaList(zs,ys)
  }*/
}

abstract class MyTree
case object empty extends MyTree
case class BinTree(node:Int,left:MyTree,right:MyTree) extends MyTree
