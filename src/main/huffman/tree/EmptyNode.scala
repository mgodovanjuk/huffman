package main.huffman.tree

/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 5:33 PM
 */
class EmptyNode(var left:Node,var right:Node) extends Node {
  var frequency=left.frequency+right.frequency

  def getSymbol: Char = 0

  def isEmpty =true
  override def toString = "freg: "+frequency
}
