class Foo {
  static def foo(Class a){}

  static def x = foo(this)
  def y = foo<warning descr="'foo' in 'Foo' cannot be applied to '(Foo)'">(this)</warning>

}