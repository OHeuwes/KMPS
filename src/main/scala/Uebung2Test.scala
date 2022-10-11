class Uebung2Test {
  def appendMyList(xs: MyList, ys: MyList): MyList = xs match {
    case Nil => ys
    case List(head, tail) => List(head, appendMyList(tail, ys))
  }
}

abstract class MyList
case object Nil extends MyList
case class List(head:Int,tail:MyList ) extends MyList
