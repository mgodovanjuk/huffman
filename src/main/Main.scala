package main

import huffman._
import scala.io.Source

/**
 * User: mychajlo
 * Date: 9/5/13
 * Time: 3:49 PM
 */
object Main {
  def main(args: Array[String]) {
    val text = Source.fromFile("text.txt").getLines.mkString("\n")
    val coder=new Coder
    println("Text\n"+"-"*80)
    println(text+"\n"+"Len = "+text.length*4+"\n"+"-"*80+"\n")
    println("Coded text:\n"+"-"*80)
    val (ctext, tree)=coder.code(text)
    println(ctext+"\n"+"Len = "+ctext.length+"\n"+"-"*80+"\n");
    println("Decoded:\n"+"-"*80)
    val decoder=new Decoder
    val dectext=decoder.decode(ctext,tree)
    println(dectext+"\n"+"-"*80+"\n")

    println("Res = "+ctext.length/(4.)/text.length*100+"%\n");

  }
}
