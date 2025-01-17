```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value == other.value 
  }
}

object Main extends App {
  val obj1 = new MyClass(10)
  val obj2 = new MyClass(10)
  println(obj1.myMethod(obj2)) //true

  val str1 = new MyClass("hello")
  val str2 = new MyClass("hello")
  println(str1.myMethod(str2)) //true

  val list1 = new MyClass(List(1, 2, 3))
  val list2 = new MyClass(List(1, 2, 3))
  println(list1.myMethod(list2)) //false (unexpected)
}
```