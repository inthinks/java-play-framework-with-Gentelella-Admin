
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/xampp/htdocs/play/conf/routes
// @DATE:Fri Jul 14 21:37:49 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
