package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Digraph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/cluster.py
 * @author Depeng Liang
 */
object Cluster {
  def main(args: Array[String]): Unit = {
    val g = new Digraph("G")

    val c0 = new Digraph("cluster_0")
    c0.body += "style=filled"
    c0.body += "color=lightgrey"
    c0.nodeAttr("style") = "filled"
    c0.nodeAttr("color") = "white"
    c0.edges(Array(("a0", "a1"), ("a1", "a2"), ("a2", "a3")))
    c0.body += """label = "process #1""""

    val c1 = new Digraph("cluster_1")
    c1.nodeAttr("style") = "filled"
    c1.edges(Array(("b0", "b1"), ("b1", "b2"), ("b2", "b3")))
    c1.body += """label = "process #2""""
    c1.body += "color=blue"

    g.subGraph(c0)
    g.subGraph(c1)

    g.edge("start", "a0")
    g.edge("start", "b0")
    g.edge("a1", "b3")
    g.edge("b2", "a3")
    g.edge("a3", "a0")
    g.edge("a3", "end")
    g.edge("b3", "end")

    g.node("start", attrs = Map("shape" -> "Mdiamond"))
    g.node("end", attrs = Map("shape" -> "Msquare"))

    g.view(fileName = "cluster.gv", directory = ".")
  }
}
