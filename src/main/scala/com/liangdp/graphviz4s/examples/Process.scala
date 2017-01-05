package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Graph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/process.py
 * @author Depeng Liang
 */
object Process {
  def main(args: Array[String]): Unit = {
    val g = new Graph("G")

    g.edge("run", "intr")
    g.edge("intr", "runbl")
    g.edge("runbl", "run")
    g.edge("run", "kernel")
    g.edge("kernel", "zombie")
    g.edge("kernel", "sleep")
    g.edge("kernel", "runmem")
    g.edge("sleep", "swap")
    g.edge("swap", "runswap")
    g.edge("runswap", "new")
    g.edge("runswap", "runmem")
    g.edge("new", "runmem")
    g.edge("sleep", "runmem")

    g.view(engine = "sfdp", fileName = "process.gv", directory = ".")
  }
}
