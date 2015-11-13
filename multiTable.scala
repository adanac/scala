def makeRow(row: Int) = 
    for(col <- 1 until 10 ) yield {
        val line = (row * col).toString
	val spaces = " " * (4 - line.length)
	line + spaces
    }
def multiTable() = {
     val table = 
          for(row <- 1 until 10)
	      yield makeRow(row).mkString
    table.mkString("\n")
    }
println(multiTable)
