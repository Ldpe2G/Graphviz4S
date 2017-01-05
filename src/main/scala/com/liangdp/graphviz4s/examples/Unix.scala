package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Digraph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/unix.py
 * @author Depeng Liang
 */
object Unix {
  def main(args: Array[String]): Unit = {
    val u = new Digraph("unix")
    u.body += """size="6,6""""
    u.nodeAttr("color") = "lightblue2"
    u.nodeAttr("style") = "filled"

    u.edge(""""5th Edition"""", """"6th Edition"""")
    u.edge(""""5th Edition"""", """"PWB 1.0"""")
    u.edge(""""6th Edition"""", """"LSX"""")
    u.edge(""""6th Edition"""", """"1 BSD"""")
    u.edge(""""6th Edition"""", """"Mini Unix"""")
    u.edge(""""6th Edition"""", """"Wollongong"""")
    u.edge(""""6th Edition"""", """"Interdata"""")
    u.edge(""""Interdata"""", """"Unix/TS 3.0"""")
    u.edge(""""Interdata"""", """"PWB 2.0"""")
    u.edge(""""Interdata"""", """"7th Edition"""")
    u.edge(""""7th Edition"""", """"8th Edition"""")
    u.edge(""""7th Edition"""", """"32V"""")
    u.edge(""""7th Edition"""", """"V7M"""")
    u.edge(""""7th Edition"""", """"Ultrix-11"""")
    u.edge(""""7th Edition"""", """"Xenix"""")
    u.edge(""""7th Edition"""", """"UniPlus+"""")
    u.edge(""""V7M"""", """"Ultrix-11"""")
    u.edge(""""8th Edition"""", """"9th Edition"""")
    u.edge(""""1 BSD"""", """"2 BSD"""")
    u.edge(""""2 BSD"""", """"2.8 BSD"""")
    u.edge(""""2.8 BSD"""", """"Ultrix-11"""")
    u.edge(""""2.8 BSD"""", """"2.9 BSD"""")
    u.edge(""""32V"""", """"3 BSD"""")
    u.edge(""""3 BSD"""", """"4 BSD"""")
    u.edge(""""4 BSD"""", """"4.1 BSD"""")
    u.edge(""""4.1 BSD"""", """"4.2 BSD"""")
    u.edge(""""4.1 BSD"""", """"2.8 BSD"""")
    u.edge(""""4.1 BSD"""", """"8th Edition"""")
    u.edge(""""4.2 BSD"""", """"4.3 BSD"""")
    u.edge(""""4.2 BSD"""", """"Ultrix-32"""")
    u.edge(""""PWB 1.0"""", """"PWB 1.2"""")
    u.edge(""""PWB 1.0"""", """"USG 1.0"""")
    u.edge(""""PWB 1.2"""", """"PWB 2.0"""")
    u.edge(""""USG 1.0"""", """"CB Unix 1"""")
    u.edge(""""USG 1.0"""", """"USG 2.0"""")
    u.edge(""""CB Unix 1"""", """"CB Unix 2"""")
    u.edge(""""CB Unix 2"""", """"CB Unix 3"""")
    u.edge(""""CB Unix 3"""", """"Unix/TS++"""")
    u.edge(""""CB Unix 3"""", """"PDP-11 Sys V"""")
    u.edge(""""USG 2.0"""", """"USG 3.0"""")
    u.edge(""""USG 3.0"""", """"Unix/TS 3.0"""")
    u.edge(""""PWB 2.0"""", """"Unix/TS 3.0"""")
    u.edge(""""Unix/TS 1.0"""", """"Unix/TS 3.0"""")
    u.edge(""""Unix/TS 3.0"""", """"TS 4.0"""")
    u.edge(""""Unix/TS++"""", """"TS 4.0"""")
    u.edge(""""CB Unix 3"""", """"TS 4.0"""")
    u.edge(""""TS 4.0"""", """"System V.0"""")
    u.edge(""""System V.0"""", """"System V.2"""")
    u.edge(""""System V.2"""", """"System V.3"""")

    u.view(fileName = "unix.gv", directory = ".")
  }
}
