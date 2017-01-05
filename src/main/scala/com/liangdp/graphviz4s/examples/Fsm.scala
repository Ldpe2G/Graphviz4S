package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Digraph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/fsm.py
 * @author Depeng Liang
 */
object Fsm {
  def main(args: Array[String]): Unit = {
    val f = new Digraph("finite_state_machine")
    f.body += "rankdir=LR"
    f.body += """size="8,5""""

    f.attr("node", Map("shape" -> "doublecircle"))
    f.node("LR_0")
    f.node("LR_3")
    f.node("LR_4")
    f.node("LR_8")

    f.attr("node", Map("shape" -> "circle"))
    f.edge("LR_0", "LR_2", label = "SS(B)")
    f.edge("LR_0", "LR_1", label = "SS(S)")
    f.edge("LR_1", "LR_3", label = "S($end)")
    f.edge("LR_2", "LR_6", label = "SS(b)")
    f.edge("LR_2", "LR_5", label = "SS(a)")
    f.edge("LR_2", "LR_4", label = "S(A)")
    f.edge("LR_5", "LR_7", label = "S(b)")
    f.edge("LR_5", "LR_5", label = "S(a)")
    f.edge("LR_6", "LR_6", label = "S(b)")
    f.edge("LR_6", "LR_5", label = "S(a)")
    f.edge("LR_7", "LR_8", label = "S(b)")
    f.edge("LR_7", "LR_5", label = "S(a)")
    f.edge("LR_8", "LR_6", label = "S(b)")
    f.edge("LR_8", "LR_5", label = "S(a)")

    f.view(fileName = "fsm.gv", directory = ".")
  }
}
