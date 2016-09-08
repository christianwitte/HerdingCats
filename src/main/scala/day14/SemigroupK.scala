package day14

//import cats._
import cats.instances.all._
import cats.syntax.semigroup._
import cats.syntax.semigroupk._

object Day14SGK {

  val test1 = List(1,2,3) |+| List(4,5,6)
  val test2 = List(1,2,3) <+> List(4,5,6)

  object Catnip {
    implicit class IdOp[A](val a: A) extends AnyVal {
      def some: Option[A] = Some(a)
    }
    def none[A]: Option[A] = None
  }

  import Catnip._

  case class Foo(x: String)

  val test3 = Foo("x").some <+> Foo("y").some

  def main(args: Array[String]): Unit = {
    println(test1)
    println(test2)
    println(test1 == test2)
    println(test3)
  }

}
