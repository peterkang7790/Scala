

/**
 * @author Paul
 */
class Person (fname: String, lname:String) {
  
  def firstname() = fname
  def lastname() = lname
  
  override def toString() = firstname() + " " + lastname() 
}