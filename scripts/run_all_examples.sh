ROOT=$(cd "$(dirname $0)/.."; pwd)

CLASS_PATH=$ROOT/target/scala-2.12/classes/:\
$HOME/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.8.jar:\
$HOME/.ivy2/cache/org.apache.commons/commons-lang3/jars/commons-lang3-3.5.jar

echo $CLASS_PATH

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Cluster

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Er

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Fsm

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Hello

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Structs

java -Xmx1G -cp $CLASS_PATH com.liangdp.graphviz4s.examples.Unix


