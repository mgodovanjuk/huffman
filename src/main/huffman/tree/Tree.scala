package main.huffman.tree

/**
 * User: mychajlo
 * Date: 9/8/13
 * Time: 3:34 PM
 */
class Tree(root:Node) {
  var currentNode=root;
  var codesMap:Map[Char,String] =Map()
  def buildCodesMap = {
    def generateMap(s: String, node: Node): Map[Char, String] = {
      if (node.isEmpty) {
        node.left.code = 0
        node.right.code = 1
        generateMap(s + '0', node.left) ++ generateMap(s + "1", node.right)
      } else
        Map(node.getSymbol -> s)
    }
    codesMap=generateMap("", root)
  }
  def codeSymbol(c:Char) = codesMap(c)

  def decodeSymbol(c:Char):Char={
    currentNode=if(c=='0') currentNode.left else currentNode.right
    val res:Char=currentNode.getSymbol
    if (!currentNode.isEmpty)
      currentNode=root
    res
  }
}
