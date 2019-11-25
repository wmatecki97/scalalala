class Punkt2D(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def przesun(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("2D x : " + x);
    println("2D y : " + y);
  }
}
class Punkt3D(override val xc: Int,
              override val yc: Int,
              val zc: Int)
  extends Punkt2D(xc, yc) {
  var z: Int = zc
  def przesun(dx: Int, dy: Int, dz: Int) {
    super.przesun(dx, dy)
    z = z + dz
    println("3D z : " + z);
  }
}

object ScalaObject extends App {
  val p2d = new Punkt2D(11, 12)
  p2d.przesun(11, 12)
  val p3d = new Punkt3D(1, 2, 3)
}
