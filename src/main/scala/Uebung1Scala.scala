class Uebung1Scala {
  def fibRec(x: Int): Int = if (x==0) 0 else if(x==1) 1 else fibRec(x-1) + fibRec(x-2)
  def ggTRecursive(a: Int, b: Int): Int = if (b==0) a else ggTRecursive(b, a%b)
}
