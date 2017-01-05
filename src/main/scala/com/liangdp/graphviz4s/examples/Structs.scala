package com.liangdp.graphviz4s.examples

import com.liangdp.graphviz4s.Digraph
import scala.collection.mutable.Map

/**
 * corresponding to the python example:
 * https://github.com/xflr6/graphviz/blob/master/examples/structs.py
 * @author Depeng Liang
 */
object Structs {
  def main(args: Array[String]): Unit = {
    val s = new Digraph("structs")

    s.node("struct1", """<
      <TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">
        <TR>
          <TD>left</TD>
          <TD PORT="f1">middle</TD>
          <TD PORT="f2">right</TD>
        </TR>
      </TABLE>>""")
    s.node("struct2", """<
      <TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">
        <TR>
          <TD PORT="f0">one</TD>
          <TD>two</TD>
        </TR>
      </TABLE>>""")
    s.node("struct3", """<
    <TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0" CELLPADDING="4">
      <TR>
        <TD ROWSPAN="3">hello<BR/>world</TD>
        <TD COLSPAN="3">b</TD>
        <TD ROWSPAN="3">g</TD>
        <TD ROWSPAN="3">h</TD>
      </TR>
      <TR>
        <TD>c</TD>
        <TD PORT="here">d</TD>
        <TD>e</TD>
      </TR>
      <TR>
        <TD COLSPAN="3">f</TD>
      </TR>
    </TABLE>>""")

    s.edges(Array(("struct1:f1", "struct2:f0"), ("struct1:f2", "struct3:here")))

    s.view(fileName = "structs.gv", directory = ".")
  }
}
