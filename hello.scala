lazy val file1 = scala.io.Source.fromFile("hello.scala").mkString
println(file1)
