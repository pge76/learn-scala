package higherorderfunc

case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  /*
  Here the method convertCtoF is passed to the higher order function map. This is possible because the compiler coerces convertCtoF to the function x => convertCtoF(x) (note: x will be a generated name which is guaranteed to be unique within its scope).
   */
  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
}
