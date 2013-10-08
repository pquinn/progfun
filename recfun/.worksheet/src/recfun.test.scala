package recfun

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet")
  import Main._;$skip(31); val res$0 = 
  pascal(1, 1);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  pascal(2, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  pascal(1, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  pascal(2, 5);System.out.println("""res3: Int = """ + $show(res$3));$skip(4); val res$4 = 
  1;System.out.println("""res4: Int(1) = """ + $show(res$4));$skip(53); 
  
  val test1 = "(if (zero? x) max (/ 1 x))".toList;System.out.println("""test1  : List[Char] = """ + $show(test1 ));$skip(88); 
  val test2 = "I told him (that it's not (yet) done). (But he wasn't listening)".toList;System.out.println("""test2  : List[Char] = """ + $show(test2 ));$skip(31); 
  
  val test3 = "())(".toList;System.out.println("""test3  : List[Char] = """ + $show(test3 ));$skip(20); val res$5 = 
  
  balance(test1);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(17); val res$6 = 
  balance(test2);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(17); val res$7 = 
  balance(test3);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(22); val res$8 = 
  balance("(".toList);System.out.println("""res8: Boolean = """ + $show(res$8))}
}
