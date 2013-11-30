package controllers

object Test
{
  def numberToString(number: Int): String =
    number match
    {
      case 1 => "ONE"
      case 2 => "TWO"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "SIX"
      case _ => "other"
    }

  def fact (n: Int) = (1 to n).foldLeft (1) { _ * _ }
}
