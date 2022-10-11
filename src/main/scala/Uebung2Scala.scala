class Uebung2Scala {
  def ins(x: Int, xs: List[Int]): List[Int] = xs match {
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
  }

  def appendMyList(xs: MyList, ys: MyList): MyList = xs match {
    case EmptyList => ys
    case OwnList(head, tail) => OwnList(head, appendMyList(tail, ys))
  }

  def transList(xs: List[Int]): MyList = xs match {
    case Nil => EmptyList
    case x::ys => OwnList(x,transList(ys))
  }

  def prefix(xs:List[Int],ys:List[Int]): Boolean = xs match {
    case Nil => ys match {
      case Nil => true
      case _ => false
    }
    case x::zs => ys match {
      case Nil => true
      case y::ls => if(x==y) prefix(zs, ls) else false
      case _ => false
    }
  }

  def attach(xs:List[Int], x:Int): List[Int] = xs match {
    case Nil => x::Nil
    case y::ys => y::attach(ys,x)
  }

  def anzKnoten(xb: MyTree): Int = xb match {
    case EmptyTree => 0
    case BinTree(x, left, right) => 1 + anzKnoten(left) + anzKnoten(right)
  }
}

abstract class MyTree
case object EmptyTree extends MyTree
case class BinTree(node: Int, left: MyTree, right: MyTree) extends MyTree

abstract class MyList
case object EmptyList extends MyList
case class OwnList(head:Int,tail:MyList ) extends MyList
