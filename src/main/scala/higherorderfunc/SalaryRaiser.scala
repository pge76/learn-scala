package higherorderfunc

class SalaryRaiser

object SalaryRaiserBad {

  /* bad example */
  def smallPromotion(salaries: List[Double]): List[Double] = salaries.map(s => s * 1.1)
  def greatPromotion(salaries: List[Double]): List[Double] = salaries.map(s => s * math.log(s))
  def hugePromotion(salaries: List[Double]): List[Double] = salaries.map(s => s * s)
}

object SalaryRaiserBetter {

  /* better example */
  private def promotion(salaries: List[Double], promotionFunc: Double => Double): List[Double] =  salaries.map(promotionFunc)

  def smallPromotion(salaries: List[Double]): List[Double] = promotion(salaries, s => s * 1.1)
  def greatPromotion(salaries: List[Double]): List[Double] = promotion(salaries, s => s * math.log(s))
  def hugePromotion(salaries: List[Double]): List[Double] = promotion(salaries, s => s * s)
}
