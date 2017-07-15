
package views.html.tags

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object notice extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,_root_.scala.Function1[String, Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(level: String = "error")(body: (String) => Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/level/*3.7*/ match/*3.13*/ {/*5.3*/case "success" =>/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<p class="success">
      """),_display_(/*7.8*/body("green")),format.raw/*7.21*/("""
    """),format.raw/*8.5*/("""</p>
  """)))}/*11.3*/case "warning" =>/*11.20*/ {_display_(Seq[Any](format.raw/*11.22*/("""
    """),format.raw/*12.5*/("""<p class="warning">
      """),_display_(/*13.8*/body("orange")),format.raw/*13.22*/("""
    """),format.raw/*14.5*/("""</p>
  """)))}/*17.3*/case "error" =>/*17.18*/ {_display_(Seq[Any](format.raw/*17.20*/("""
    """),format.raw/*18.5*/("""<p class="error">
      """),_display_(/*19.8*/body("red")),format.raw/*19.19*/("""
    """),format.raw/*20.5*/("""</p>
  """)))}}))
      }
    }
  }

  def render(level:String,body:_root_.scala.Function1[String, Html]): play.twirl.api.HtmlFormat.Appendable = apply(level)(body)

  def f:((String) => (_root_.scala.Function1[String, Html]) => play.twirl.api.HtmlFormat.Appendable) = (level) => (body) => apply(level)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jul 13 21:56:25 ICT 2017
                  SOURCE: C:/xampp/htdocs/play/app/views/tags/notice.scala.html
                  HASH: f44532a4840ede5a24eeeddf0dcb7ca7db8c81a8
                  MATRIX: 991->1|1135->50|1165->55|1177->60|1191->66|1200->74|1225->91|1264->93|1296->99|1349->127|1382->140|1414->146|1441->161|1467->178|1507->180|1540->186|1594->214|1629->228|1662->234|1689->249|1713->264|1753->266|1786->272|1838->298|1870->309|1903->315
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->5|35->5|35->5|36->6|37->7|37->7|38->8|39->11|39->11|39->11|40->12|41->13|41->13|42->14|43->17|43->17|43->17|44->18|45->19|45->19|46->20
                  -- GENERATED --
              */
          