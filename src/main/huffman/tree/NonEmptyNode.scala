package main.huffman.tree

/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 5:32 PM
 */
class NonEmptyNode(symbol :Char,var frequency:Int,var left: Node,var right: Node) extends Node {
  def isEmpty = false
  def getSymbol = symbol
  override def toString = symbol+" "+frequency
}
