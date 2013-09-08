package main.huffman

import main.huffman.tree._


/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 4:03 PM
 */
class Coder {
  var nodeList:List[Node]=null
  private def createTree(): Tree = {
    def buildTree(list:List[Node]):List[Node] = {
      val l=list.sortWith(_.frequency<_.frequency)
      l match {
        case Nil => Nil
        case List(x) => List(x)
        case x :: y :: tail => buildTree(new EmptyNode(x,y) :: tail)
      }
    }
    new Tree(buildTree(nodeList).head)
  }

  def code(text: String): (String, Tree) = {
    nodeList = text.groupBy(_.toChar).map(p => (new NonEmptyNode(p._1,p._2.length ,null,null))).toList
    val tree: Tree = createTree()
    tree.buildCodesMap


    var codedText:String=""
    for (c<-text)
      codedText=codedText+tree.codeSymbol(c)

    (codedText, tree)
  }
}
