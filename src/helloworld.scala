

/**
 * @author Paul
 */
object helloworld {
  def main(args:Array[String]): Unit={
    println("Hello Word by Scala");
    
    //val tm = Timer;
    
    //tm.oncePerSecond { () => tm.timeFlies() }
    
    //val nm = new Person("Kang" , "Peter");
    
   //println( nm.toString())
    
    val b = Map( Building(5000) -> "Big" , Building(900) -> "Smal", Building(2500) -> "Medium")
    
    println(b(Building(900)))
    
  }
  
  
  
}