package main.huffman.tree

/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 5:32 PM
 */
abstract class Node {
  def isEmpty: Boolean
  def getSymbol: Char

  var frequency: Int
  var left: Node
  var right: Node
  var code: Int = -1



}
