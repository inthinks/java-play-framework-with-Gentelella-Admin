
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

object sidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
  <div class="menu_section">
    <h3>General</h3>
    <ul class="nav side-menu">
      <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="index.html">Dashboard</a></li>
          <li><a href="index2.html">Dashboard2</a></li>
          <li><a href="index3.html">Dashboard3</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="form.html">General Form</a></li>
          <li><a href="form_advanced.html">Advanced Components</a></li>
          <li><a href="form_validation.html">Form Validation</a></li>
          <li><a href="form_wizards.html">Form Wizard</a></li>
          <li><a href="form_upload.html">Form Upload</a></li>
          <li><a href="form_buttons.html">Form Buttons</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="general_elements.html">General Elements</a></li>
          <li><a href="media_gallery.html">Media Gallery</a></li>
          <li><a href="typography.html">Typography</a></li>
          <li><a href="icons.html">Icons</a></li>
          <li><a href="glyphicons.html">Glyphicons</a></li>
          <li><a href="widgets.html">Widgets</a></li>
          <li><a href="invoice.html">Invoice</a></li>
          <li><a href="inbox.html">Inbox</a></li>
          <li><a href="calendar.html">Calendar</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="tables.html">Tables</a></li>
          <li><a href="tables_dynamic.html">Table Dynamic</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="chartjs.html">Chart JS</a></li>
          <li><a href="chartjs2.html">Chart JS2</a></li>
          <li><a href="morisjs.html">Moris JS</a></li>
          <li><a href="echarts.html">ECharts</a></li>
          <li><a href="other_charts.html">Other Charts</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
          <li><a href="fixed_footer.html">Fixed Footer</a></li>
        </ul>
      </li>
    </ul>
  </div>
  <div class="menu_section">
    <h3>Live On</h3>
    <ul class="nav side-menu">
      <li><a><i class="fa fa-bug"></i> Additional Pages <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="e_commerce.html">E-commerce</a></li>
          <li><a href="projects.html">Projects</a></li>
          <li><a href="project_detail.html">Project Detail</a></li>
          <li><a href="contacts.html">Contacts</a></li>
          <li><a href="profile.html">Profile</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="page_403.html">403 Error</a></li>
          <li><a href="page_404.html">404 Error</a></li>
          <li><a href="page_500.html">500 Error</a></li>
          <li><a href="plain_page.html">Plain Page</a></li>
          <li><a href="login.html">Login Page</a></li>
          <li><a href="pricing_tables.html">Pricing Tables</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-sitemap"></i> Multilevel Menu <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
            <li><a href="#level1_1">Level One</a>
            <li><a>Level One<span class="fa fa-chevron-down"></span></a>
              <ul class="nav child_menu">
                <li class="sub_menu"><a href="level2.html">Level Two</a>
                </li>
                <li><a href="#level2_1">Level Two</a>
                </li>
                <li><a href="#level2_2">Level Two</a>
                </li>
              </ul>
            </li>
            <li><a href="#level1_2">Level One</a>
            </li>
        </ul>
      </li>                  
      <li><a href="javascript:void(0)"><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
    </ul>
  </div>

</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jul 14 21:20:06 ICT 2017
                  SOURCE: C:/xampp/htdocs/play/app/views/tags/sidebar.scala.html
                  HASH: 7c3663e532765e9194e908efccc308a082a73b1e
                  MATRIX: 1037->0
                  LINES: 33->1
                  -- GENERATED --
              */
          