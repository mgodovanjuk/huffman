package main.huffman
import main.huffman.tree._

/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 10:29 PM
 */
class Decoder {
  def decode(codedText:String, tree:Tree):String ={
    val text:StringBuilder=new StringBuilder()
    val nullChar:Char=0.toChar
    var dec: Char=0
    for(c<-codedText)          {
      dec=tree.decodeSymbol(c)
      if (dec!=nullChar)
        text append dec
    }
    text.toString()
  }
}
