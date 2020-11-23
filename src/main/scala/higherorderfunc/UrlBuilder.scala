package higherorderfunc

object UrlBuilder {

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }
  def a(): (Int, Int) => (Int, Int) = (x: Int, y: Int) => (y, x)
  def main(args: Array[String]): Unit = {
    println(a()(10,1))
  }

}
