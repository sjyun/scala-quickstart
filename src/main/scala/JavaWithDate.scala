import java.io.PrintStream
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
 * 기본 자바 패키지에 있는 클래스들을 스칼라 오브젝트에서 사용하기
 */
object JavaWithDate {
  def main(args:Array[String]): Unit ={
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)

    System.out.println(df format now)

  }
}
