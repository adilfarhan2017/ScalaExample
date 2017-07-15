import scala.collection.mutable.HashMap

object ScalaDemo extends App {
  
  val msg = "First program";
  println("hello world:"+msg)
  
  def max(x:Int,y:Int) = if (x>y) x else y;
  def max2(x:Int,y:Int) :Int = {x+y}
  val i = max(3,4)
  val j = max2(3,4)

  println(i)
  println(j)
  
  var greetStrings = new Array[String](3)
  greetStrings(0) = "Hi"
  greetStrings(1) = "How are you ?"
  greetStrings(2)= "Farhan\n"
  
  greetStrings.foreach(println)
  
  greetStrings.foreach((s:String)=>print(s+"Adil"))
  
  val oneTwo = List(1,2)
  val threeFour = List(3,4,5,6)
  
  val all = oneTwo ::: threeFour
  
  println(all);
  println(all(2))
  println(all.reverse)
  
  val tupleExam = (3,"trtrtrtrt",8.9)
  //val k = 2;
  println(tupleExam);
  println(tupleExam._2)
  println(tupleExam._1)
  
  val mapEx = Map( 1 -> "Adil", 2->"Farhan", 3->"free")
  print(mapEx(2))
  print(mapEx(1))
 
  val mapEx2 = new HashMap [Int, String]
  mapEx2 += ( 1 -> "Hello")
  mapEx2 += (2-> "World")
  println(mapEx2(2))
  mapEx2.-=(2)
  println(":::::"+mapEx2(2))
  
   
  
  
}

