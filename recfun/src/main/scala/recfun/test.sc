package recfun

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import Main._
  pascal(1, 1)                                    //> res0: Int = 1
  pascal(2, 3)                                    //> res1: Int = 3
  pascal(1, 3)                                    //> res2: Int = 3
  pascal(2, 5)                                    //> res3: Int = 10
  1                                               //> res4: Int(1) = 1
  
  val test1 = "(if (zero? x) max (/ 1 x))".toList //> test1  : List[Char] = List((, i, f,  , (, z, e, r, o, ?,  , x, ),  , m, a, x
                                                  //| ,  , (, /,  , 1,  , x, ), ))
  val test2 = "I told him (that it's not (yet) done). (But he wasn't listening)".toList
                                                  //> test2  : List[Char] = List(I,  , t, o, l, d,  , h, i, m,  , (, t, h, a, t,  
                                                  //| , i, t, ', s,  , n, o, t,  , (, y, e, t, ),  , d, o, n, e, ), .,  , (, B, u,
                                                  //|  t,  , h, e,  , w, a, s, n, ', t,  , l, i, s, t, e, n, i, n, g, ))
  
  val test3 = "())(".toList                       //> test3  : List[Char] = List((, ), ), ()
  
  balance(test1)                                  //> res5: Boolean = true
  balance(test2)                                  //> res6: Boolean = true
  balance(test3)                                  //> res7: Boolean = false
  balance("(".toList)                             //> res8: Boolean = false
}