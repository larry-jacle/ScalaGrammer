/**
  *Trait实际相当于java的接口，可以实现多继承
  *
  */
trait ScalaTrait {
  def isequal(x:Int,y:Int):Boolean;
}


class ScalaTraitImplements extends ScalaTrait
{
  override def isequal(x: Int, y: Int): Boolean = x==y;
}