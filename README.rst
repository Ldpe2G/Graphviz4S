Graphviz4S
========

|Maven version| |License| |Supported Scala| |Format|

This package facilitates the creation and rendering of graph descriptions in
the DOT_ language of the Graphviz_ graph drawing software (repo_) from Python.

Create a graph object, assemble the graph by adding nodes and edges, and
retrieve its DOT source code string. Save the source code to a file and render
it with the Graphviz installation of your system.

Use the ``view`` option/method to directly inspect the resulting (PDF, PNG,
SVG, etc.) file with its default application. Graphs can also be rendered
and displayed within `Jupyter notebooks`_ (a.k.a. `IPython notebooks`_,
example_).
