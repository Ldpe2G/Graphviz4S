package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Graph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/er.py
 * @author Depeng Liang
 */
object Er {
  def main(args: Array[String]): Unit = {
    val e = new Graph("ER")

    e.attr("node", Map("shape" -> "box"))
    e.node("course")
    e.node("institute")
    e.node("student")

    e.attr("node", Map("shape" -> "ellipse"))
    e.node("name0", attrs = Map("label" -> "name"))
    e.node("name1", attrs = Map("label" -> "name"))
    e.node("name2", attrs = Map("label" -> "name"))
    e.node("code")
    e.node("grade")
    e.node("number")

    e.attr("node", attrs = Map("shape" -> "diamond",
        "style" -> "filled", "color" -> "lightgrey"))
    e.node("C-I")
    e.node("S-C")
    e.node("S-I")

    e.edge("name0", "course")
    e.edge("code", "course")
    e.edge("course", """"C-I"""", label = "n", attrs = Map("len" -> "1.00"))
    e.edge(""""C-I"""", "institute", label = "1", attrs = Map("len" -> "1.00"))
    e.edge("institute", "name1")
    e.edge("institute", """"S-I"""", label = "1", attrs = Map("len" -> "1.00"))
    e.edge(""""S-I"""", "student", label = "n", attrs = Map("len" -> "1.00"))
    e.edge("student", "grade")
    e.edge("student", "name2")
    e.edge("student", "number")
    e.edge("student", """"S-C"""", label = "m", attrs = Map("len" -> "1.00"))
    e.edge(""""S-C"""", "course", label = "n", attrs = Map("len" -> "1.00"))

    e.body += """label = "\n\nEntity Relation Diagram\ndrawn by NEATO""""
    e.body += "fontsize=20"

    e.view(engine = "neato", fileName = "er.gv", directory = ".")
  }
}
