package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Digraph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/hello.py
 * @author Depeng Liang
 */
object Hello {
  def main(args: Array[String]): Unit = {
    val g = new Digraph("G")
    g.edge("Hello", "World")
    g.view(fileName = "hello.gv", directory = ".")
  }
}
