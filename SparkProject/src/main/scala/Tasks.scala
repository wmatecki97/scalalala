import scala.annotation.tailrec

class x() {
    def power(x: Double, n: Int): Double = {
      if (n > 0) {
        if (n % 2 == 0) {
          var y = power(x,n/2);
          return y * y;
        }
        else {
          return x * x;
        }
      }
      else if (n == 0) {
        return 1;
      }
      else {
        return 1 / power(x,-n);
      }
    }

    var factorial: Function1[Int, Int] = new Function1[Int, Int] {
      def apply (x:Int): Int = {
        @tailrec def loop(x: Int, acc: Int = 1): Int = {
          if (x<=1) acc
          else loop(x-1, x*acc)
        }
        loop(x)
      }
    }
  }

object Tasks extends App {
  val rand = new util.Random(100)
  val tab = Seq.fill(10000)(rand.nextInt(200)).toArray
  def timeOf[A](f: => A) = {
    val s = System.nanoTime
    val r = f
    println("time: " + (System.nanoTime - s)/ 1e9 + " sec.")
  }
  timeOf(tab.map((x) => new x().factorial(x)));
  timeOf(tab.map((x) => new x().power(x,x)));
}
