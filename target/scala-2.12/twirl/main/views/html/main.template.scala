
package views.html

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
/*7.2*/import tags._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.32*/("""

"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),format.raw/*20.62*/("""
        """),format.raw/*21.9*/("""<title>"""),_display_(/*21.17*/title),format.raw/*21.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("vendors/bootstrap/dist/css/bootstrap.min.css")),format.raw/*22.125*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*23.54*/routes/*23.60*/.Assets.versioned("vendors/font-awesome/css/font-awesome.min.css")),format.raw/*23.126*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*24.54*/routes/*24.60*/.Assets.versioned("vendors/nprogress/nprogress.css")),format.raw/*24.112*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("vendors/iCheck/skins/flat/green.css")),format.raw/*25.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*26.54*/routes/*26.60*/.Assets.versioned("vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css")),format.raw/*26.150*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*27.54*/routes/*27.60*/.Assets.versioned("vendors/jqvmap/dist/jqvmap.min.css")),format.raw/*27.115*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*28.54*/routes/*28.60*/.Assets.versioned("vendors/bootstrap-daterangepicker/daterangepicker.css")),format.raw/*28.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*29.54*/routes/*29.60*/.Assets.versioned("stylesheets/custom.min.css")),format.raw/*29.107*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*31.54*/routes/*31.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*31.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*32.59*/routes/*32.65*/.Assets.versioned("images/favicon.png")),format.raw/*32.104*/("""">
    </head>
    <body class="nav-md">

        <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src=""""),_display_(/*49.28*/routes/*49.34*/.Assets.versioned("images/img.jpg")),format.raw/*49.69*/("""" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            """),_display_(/*61.14*/sidebar()),format.raw/*61.23*/("""
            """),format.raw/*62.13*/("""<!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            """),_display_(/*65.14*/footer_button()),format.raw/*65.29*/("""
            """),format.raw/*66.13*/("""<!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        """),_display_(/*71.10*/header()),format.raw/*71.18*/("""
        """),format.raw/*72.9*/("""<!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            """),_display_(/*76.14*/content),format.raw/*76.21*/("""
        """),format.raw/*77.9*/("""</div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
         """),_display_(/*82.11*/footer()),format.raw/*82.19*/("""
        """),format.raw/*83.9*/("""</footer>
        <!-- /footer content -->
      </div>
    </div>
        
        <script src=""""),_display_(/*88.23*/routes/*88.29*/.Assets.versioned("vendors/jquery/dist/jquery.min.js")),format.raw/*88.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("vendors/bootstrap/dist/js/bootstrap.min.js")),format.raw/*89.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*90.23*/routes/*90.29*/.Assets.versioned("vendors/fastclick/lib/fastclick.js")),format.raw/*90.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*91.23*/routes/*91.29*/.Assets.versioned("vendors/nprogress/nprogress.js")),format.raw/*91.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*92.23*/routes/*92.29*/.Assets.versioned("vendors/Chart.js/dist/Chart.min.js")),format.raw/*92.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*93.23*/routes/*93.29*/.Assets.versioned("vendors/gauge.js/dist/gauge.min.js")),format.raw/*93.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*94.23*/routes/*94.29*/.Assets.versioned("vendors/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*94.108*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.versioned("vendors/iCheck/icheck.min.js")),format.raw/*95.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*96.23*/routes/*96.29*/.Assets.versioned("vendors/skycons/skycons.js")),format.raw/*96.76*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*97.23*/routes/*97.29*/.Assets.versioned("vendors/Flot/jquery.flot.js")),format.raw/*97.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*98.23*/routes/*98.29*/.Assets.versioned("vendors/Flot/jquery.flot.pie.js")),format.raw/*98.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*99.23*/routes/*99.29*/.Assets.versioned("vendors/Flot/jquery.flot.time.js")),format.raw/*99.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*100.23*/routes/*100.29*/.Assets.versioned("vendors/Flot/jquery.flot.stack.js")),format.raw/*100.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*101.23*/routes/*101.29*/.Assets.versioned("vendors/Flot/jquery.flot.resize.js")),format.raw/*101.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*102.23*/routes/*102.29*/.Assets.versioned("vendors/flot.orderbars/js/jquery.flot.orderBars.js")),format.raw/*102.100*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*103.23*/routes/*103.29*/.Assets.versioned("vendors/flot-spline/js/jquery.flot.spline.min.js")),format.raw/*103.98*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*104.23*/routes/*104.29*/.Assets.versioned("vendors/flot.curvedlines/curvedLines.js")),format.raw/*104.89*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*105.23*/routes/*105.29*/.Assets.versioned("vendors/DateJS/build/date.js")),format.raw/*105.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*106.23*/routes/*106.29*/.Assets.versioned("vendors/jqvmap/dist/jquery.vmap.js")),format.raw/*106.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*107.23*/routes/*107.29*/.Assets.versioned("vendors/jqvmap/dist/maps/jquery.vmap.world.js")),format.raw/*107.95*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*108.23*/routes/*108.29*/.Assets.versioned("vendors/jqvmap/examples/js/jquery.vmap.sampledata.js")),format.raw/*108.102*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*109.23*/routes/*109.29*/.Assets.versioned("vendors/moment/min/moment.min.js")),format.raw/*109.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*110.23*/routes/*110.29*/.Assets.versioned("vendors/moment/min/moment.min.js")),format.raw/*110.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*111.23*/routes/*111.29*/.Assets.versioned("vendors/bootstrap-daterangepicker/daterangepicker.js")),format.raw/*111.102*/("""" type="text/javascript"></script>
        
        <script src=""""),_display_(/*113.23*/routes/*113.29*/.Assets.versioned("javascripts/custom.min.js")),format.raw/*113.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*114.23*/routes/*114.29*/.Assets.versioned("javascripts/main.js")),format.raw/*114.69*/("""" type="text/javascript"></script>
        
         <!-- Flot -->
    <script>
      $(document).ready(function() """),format.raw/*118.36*/("""{"""),format.raw/*118.37*/("""
        """),format.raw/*119.9*/("""var data1 = [
          [gd(2012, 1, 1), 17],
          [gd(2012, 1, 2), 74],
          [gd(2012, 1, 3), 6],
          [gd(2012, 1, 4), 39],
          [gd(2012, 1, 5), 20],
          [gd(2012, 1, 6), 85],
          [gd(2012, 1, 7), 7]
        ];

        var data2 = [
          [gd(2012, 1, 1), 82],
          [gd(2012, 1, 2), 23],
          [gd(2012, 1, 3), 66],
          [gd(2012, 1, 4), 9],
          [gd(2012, 1, 5), 119],
          [gd(2012, 1, 6), 6],
          [gd(2012, 1, 7), 9]
        ];
        $("#canvas_dahs").length && $.plot($("#canvas_dahs"), [
          data1, data2
        ], """),format.raw/*140.12*/("""{"""),format.raw/*140.13*/("""
          """),format.raw/*141.11*/("""series: """),format.raw/*141.19*/("""{"""),format.raw/*141.20*/("""
            """),format.raw/*142.13*/("""lines: """),format.raw/*142.20*/("""{"""),format.raw/*142.21*/("""
              """),format.raw/*143.15*/("""show: false,
              fill: true
            """),format.raw/*145.13*/("""}"""),format.raw/*145.14*/(""",
            splines: """),format.raw/*146.22*/("""{"""),format.raw/*146.23*/("""
              """),format.raw/*147.15*/("""show: true,
              tension: 0.4,
              lineWidth: 1,
              fill: 0.4
            """),format.raw/*151.13*/("""}"""),format.raw/*151.14*/(""",
            points: """),format.raw/*152.21*/("""{"""),format.raw/*152.22*/("""
              """),format.raw/*153.15*/("""radius: 0,
              show: true
            """),format.raw/*155.13*/("""}"""),format.raw/*155.14*/(""",
            shadowSize: 2
          """),format.raw/*157.11*/("""}"""),format.raw/*157.12*/(""",
          grid: """),format.raw/*158.17*/("""{"""),format.raw/*158.18*/("""
            """),format.raw/*159.13*/("""verticalLines: true,
            hoverable: true,
            clickable: true,
            tickColor: "#d5d5d5",
            borderWidth: 1,
            color: '#fff'
          """),format.raw/*165.11*/("""}"""),format.raw/*165.12*/(""",
          colors: ["rgba(38, 185, 154, 0.38)", "rgba(3, 88, 106, 0.38)"],
          xaxis: """),format.raw/*167.18*/("""{"""),format.raw/*167.19*/("""
            """),format.raw/*168.13*/("""tickColor: "rgba(51, 51, 51, 0.06)",
            mode: "time",
            tickSize: [1, "day"],
            //tickLength: 10,
            axisLabel: "Date",
            axisLabelUseCanvas: true,
            axisLabelFontSizePixels: 12,
            axisLabelFontFamily: 'Verdana, Arial',
            axisLabelPadding: 10
          """),format.raw/*177.11*/("""}"""),format.raw/*177.12*/(""",
          yaxis: """),format.raw/*178.18*/("""{"""),format.raw/*178.19*/("""
            """),format.raw/*179.13*/("""ticks: 8,
            tickColor: "rgba(51, 51, 51, 0.06)",
          """),format.raw/*181.11*/("""}"""),format.raw/*181.12*/(""",
          tooltip: false
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""");

        function gd(year, month, day) """),format.raw/*185.39*/("""{"""),format.raw/*185.40*/("""
          """),format.raw/*186.11*/("""return new Date(year, month - 1, day).getTime();
        """),format.raw/*187.9*/("""}"""),format.raw/*187.10*/("""
      """),format.raw/*188.7*/("""}"""),format.raw/*188.8*/(""");
    </script>
    <!-- /Flot -->

    <!-- JQVMap -->
    <script>
      $(document).ready(function()"""),format.raw/*194.35*/("""{"""),format.raw/*194.36*/("""
        """),format.raw/*195.9*/("""$('#world-map-gdp').vectorMap("""),format.raw/*195.39*/("""{"""),format.raw/*195.40*/("""
            """),format.raw/*196.13*/("""map: 'world_en',
            backgroundColor: null,
            color: '#ffffff',
            hoverOpacity: 0.7,
            selectedColor: '#666666',
            enableZoom: true,
            showTooltip: true,
            values: sample_data,
            scaleColors: ['#E6F2F0', '#149B7E'],
            normalizeFunction: 'polynomial'
        """),format.raw/*206.9*/("""}"""),format.raw/*206.10*/(""");
      """),format.raw/*207.7*/("""}"""),format.raw/*207.8*/(""");
    </script>
    <!-- /JQVMap -->

    <!-- Skycons -->
    <script>
      $(document).ready(function() """),format.raw/*213.36*/("""{"""),format.raw/*213.37*/("""
        """),format.raw/*214.9*/("""var icons = new Skycons("""),format.raw/*214.33*/("""{"""),format.raw/*214.34*/("""
            """),format.raw/*215.13*/(""""color": "#73879C"
          """),format.raw/*216.11*/("""}"""),format.raw/*216.12*/("""),
          list = [
            "clear-day", "clear-night", "partly-cloudy-day",
            "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
            "fog"
          ],
          i;

        for (i = list.length; i--;)
          icons.set(list[i], list[i]);

        icons.play();
      """),format.raw/*228.7*/("""}"""),format.raw/*228.8*/(""");
    </script>
    <!-- /Skycons -->

    <!-- Doughnut Chart -->
    <script>
      $(document).ready(function()"""),format.raw/*234.35*/("""{"""),format.raw/*234.36*/("""
        """),format.raw/*235.9*/("""var options = """),format.raw/*235.23*/("""{"""),format.raw/*235.24*/("""
          """),format.raw/*236.11*/("""legend: false,
          responsive: false
        """),format.raw/*238.9*/("""}"""),format.raw/*238.10*/(""";

        new Chart(document.getElementById("canvas1"), """),format.raw/*240.55*/("""{"""),format.raw/*240.56*/("""
          """),format.raw/*241.11*/("""type: 'doughnut',
          tooltipFillColor: "rgba(51, 51, 51, 0.55)",
          data: """),format.raw/*243.17*/("""{"""),format.raw/*243.18*/("""
            """),format.raw/*244.13*/("""labels: [
              "Symbian",
              "Blackberry",
              "Other",
              "Android",
              "IOS"
            ],
            datasets: ["""),format.raw/*251.24*/("""{"""),format.raw/*251.25*/("""
              """),format.raw/*252.15*/("""data: [15, 20, 30, 10, 30],
              backgroundColor: [
                "#BDC3C7",
                "#9B59B6",
                "#E74C3C",
                "#26B99A",
                "#3498DB"
              ],
              hoverBackgroundColor: [
                "#CFD4D8",
                "#B370CF",
                "#E95E4F",
                "#36CAAB",
                "#49A9EA"
              ]
            """),format.raw/*267.13*/("""}"""),format.raw/*267.14*/("""]
          """),format.raw/*268.11*/("""}"""),format.raw/*268.12*/(""",
          options: options
        """),format.raw/*270.9*/("""}"""),format.raw/*270.10*/(""");
      """),format.raw/*271.7*/("""}"""),format.raw/*271.8*/(""");
    </script>
    <!-- /Doughnut Chart -->
    
    <!-- bootstrap-daterangepicker -->
    <script>
      $(document).ready(function() """),format.raw/*277.36*/("""{"""),format.raw/*277.37*/("""

        """),format.raw/*279.9*/("""var cb = function(start, end, label) """),format.raw/*279.46*/("""{"""),format.raw/*279.47*/("""
          """),format.raw/*280.11*/("""console.log(start.toISOString(), end.toISOString(), label);
          $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
        """),format.raw/*282.9*/("""}"""),format.raw/*282.10*/(""";

        var optionSet1 = """),format.raw/*284.26*/("""{"""),format.raw/*284.27*/("""
          """),format.raw/*285.11*/("""startDate: moment().subtract(29, 'days'),
          endDate: moment(),
          minDate: '01/01/2012',
          maxDate: '12/31/2015',
          dateLimit: """),format.raw/*289.22*/("""{"""),format.raw/*289.23*/("""
            """),format.raw/*290.13*/("""days: 60
          """),format.raw/*291.11*/("""}"""),format.raw/*291.12*/(""",
          showDropdowns: true,
          showWeekNumbers: true,
          timePicker: false,
          timePickerIncrement: 1,
          timePicker12Hour: true,
          ranges: """),format.raw/*297.19*/("""{"""),format.raw/*297.20*/("""
            """),format.raw/*298.13*/("""'Today': [moment(), moment()],
            'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
            'Last 7 Days': [moment().subtract(6, 'days'), moment()],
            'Last 30 Days': [moment().subtract(29, 'days'), moment()],
            'This Month': [moment().startOf('month'), moment().endOf('month')],
            'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
          """),format.raw/*304.11*/("""}"""),format.raw/*304.12*/(""",
          opens: 'left',
          buttonClasses: ['btn btn-default'],
          applyClass: 'btn-small btn-primary',
          cancelClass: 'btn-small',
          format: 'MM/DD/YYYY',
          separator: ' to ',
          locale: """),format.raw/*311.19*/("""{"""),format.raw/*311.20*/("""
            """),format.raw/*312.13*/("""applyLabel: 'Submit',
            cancelLabel: 'Clear',
            fromLabel: 'From',
            toLabel: 'To',
            customRangeLabel: 'Custom',
            daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
            monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
            firstDay: 1
          """),format.raw/*320.11*/("""}"""),format.raw/*320.12*/("""
        """),format.raw/*321.9*/("""}"""),format.raw/*321.10*/(""";
        $('#reportrange span').html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));
        $('#reportrange').daterangepicker(optionSet1, cb);
        $('#reportrange').on('show.daterangepicker', function() """),format.raw/*324.65*/("""{"""),format.raw/*324.66*/("""
          """),format.raw/*325.11*/("""console.log("show event fired");
        """),format.raw/*326.9*/("""}"""),format.raw/*326.10*/(""");
        $('#reportrange').on('hide.daterangepicker', function() """),format.raw/*327.65*/("""{"""),format.raw/*327.66*/("""
          """),format.raw/*328.11*/("""console.log("hide event fired");
        """),format.raw/*329.9*/("""}"""),format.raw/*329.10*/(""");
        $('#reportrange').on('apply.daterangepicker', function(ev, picker) """),format.raw/*330.76*/("""{"""),format.raw/*330.77*/("""
          """),format.raw/*331.11*/("""console.log("apply event fired, start/end dates are " + picker.startDate.format('MMMM D, YYYY') + " to " + picker.endDate.format('MMMM D, YYYY'));
        """),format.raw/*332.9*/("""}"""),format.raw/*332.10*/(""");
        $('#reportrange').on('cancel.daterangepicker', function(ev, picker) """),format.raw/*333.77*/("""{"""),format.raw/*333.78*/("""
          """),format.raw/*334.11*/("""console.log("cancel event fired");
        """),format.raw/*335.9*/("""}"""),format.raw/*335.10*/(""");
        $('#options1').click(function() """),format.raw/*336.41*/("""{"""),format.raw/*336.42*/("""
          """),format.raw/*337.11*/("""$('#reportrange').data('daterangepicker').setOptions(optionSet1, cb);
        """),format.raw/*338.9*/("""}"""),format.raw/*338.10*/(""");
        $('#options2').click(function() """),format.raw/*339.41*/("""{"""),format.raw/*339.42*/("""
          """),format.raw/*340.11*/("""$('#reportrange').data('daterangepicker').setOptions(optionSet2, cb);
        """),format.raw/*341.9*/("""}"""),format.raw/*341.10*/(""");
        $('#destroy').click(function() """),format.raw/*342.40*/("""{"""),format.raw/*342.41*/("""
          """),format.raw/*343.11*/("""$('#reportrange').data('daterangepicker').remove();
        """),format.raw/*344.9*/("""}"""),format.raw/*344.10*/(""");
      """),format.raw/*345.7*/("""}"""),format.raw/*345.8*/(""");
    </script>
    <!-- /bootstrap-daterangepicker -->

    <!-- gauge.js -->
    <script>
      var opts = """),format.raw/*351.18*/("""{"""),format.raw/*351.19*/("""
          """),format.raw/*352.11*/("""lines: 12,
          angle: 0,
          lineWidth: 0.4,
          pointer: """),format.raw/*355.20*/("""{"""),format.raw/*355.21*/("""
              """),format.raw/*356.15*/("""length: 0.75,
              strokeWidth: 0.042,
              color: '#1D212A'
          """),format.raw/*359.11*/("""}"""),format.raw/*359.12*/(""",
          limitMax: 'false',
          colorStart: '#1ABC9C',
          colorStop: '#1ABC9C',
          strokeColor: '#F0F3F3',
          generateGradient: true
      """),format.raw/*365.7*/("""}"""),format.raw/*365.8*/(""";
      var target = document.getElementById('foo'),
          gauge = new Gauge(target).setOptions(opts);

      gauge.maxValue = 6000;
      gauge.animationSpeed = 32;
      gauge.set(3200);
      gauge.setTextField(document.getElementById("gauge-text"));
    </script>
    <!-- /gauge.js -->

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jul 15 07:11:23 ICT 2017
                  SOURCE: C:/xampp/htdocs/play/app/views/main.scala.html
                  HASH: fdd2e0a8817d2ecef232f06edd8419cfa8c987ff
                  MATRIX: 651->266|973->284|1098->314|1129->318|1515->729|1552->739|1587->747|1613->752|1703->815|1718->821|1805->886|1889->943|1904->949|1992->1015|2076->1072|2091->1078|2165->1130|2249->1187|2264->1193|2342->1249|2426->1306|2441->1312|2553->1402|2637->1459|2652->1465|2729->1520|2813->1577|2828->1583|2924->1657|3008->1714|3023->1720|3092->1767|3186->1834|3201->1840|3264->1881|3353->1943|3368->1949|3429->1988|4066->2598|4081->2604|4137->2639|4508->2983|4538->2992|4580->3006|4689->3088|4725->3103|4767->3117|4903->3226|4932->3234|4969->3244|5113->3361|5141->3368|5178->3378|5308->3481|5337->3489|5374->3499|5504->3602|5519->3608|5594->3662|5679->3720|5694->3726|5778->3789|5863->3847|5878->3853|5954->3908|6039->3966|6054->3972|6126->4023|6211->4081|6226->4087|6302->4142|6387->4200|6402->4206|6478->4261|6563->4319|6578->4325|6679->4404|6764->4462|6779->4468|6849->4517|6934->4575|6949->4581|7017->4628|7102->4686|7117->4692|7186->4740|7271->4798|7286->4804|7359->4856|7444->4914|7459->4920|7533->4973|7619->5031|7635->5037|7711->5091|7797->5149|7813->5155|7890->5210|7976->5268|7992->5274|8086->5345|8172->5403|8188->5409|8279->5478|8365->5536|8381->5542|8463->5602|8549->5660|8565->5666|8636->5715|8722->5773|8738->5779|8815->5834|8901->5892|8917->5898|9005->5964|9091->6022|9107->6028|9203->6101|9289->6159|9305->6165|9380->6218|9466->6276|9482->6282|9557->6335|9643->6393|9659->6399|9755->6472|9851->6540|9867->6546|9935->6592|10021->6650|10037->6656|10099->6696|10247->6815|10277->6816|10315->6826|10964->7446|10994->7447|11035->7459|11072->7467|11102->7468|11145->7482|11181->7489|11211->7490|11256->7506|11337->7558|11367->7559|11420->7583|11450->7584|11495->7600|11632->7708|11662->7709|11714->7732|11744->7733|11789->7749|11868->7799|11898->7800|11967->7840|11997->7841|12045->7860|12075->7861|12118->7875|12330->8058|12360->8059|12484->8154|12514->8155|12557->8169|12926->8509|12956->8510|13005->8530|13035->8531|13078->8545|13178->8616|13208->8617|13273->8654|13303->8655|13376->8699|13406->8700|13447->8712|13533->8770|13563->8771|13599->8779|13628->8780|13767->8890|13797->8891|13835->8901|13894->8931|13924->8932|13967->8946|14351->9302|14381->9303|14419->9313|14448->9314|14591->9428|14621->9429|14659->9439|14712->9463|14742->9464|14785->9478|14844->9508|14874->9509|15224->9831|15253->9832|15403->9953|15433->9954|15471->9964|15514->9978|15544->9979|15585->9991|15666->10044|15696->10045|15784->10104|15814->10105|15855->10117|15974->10207|16004->10208|16047->10222|16252->10398|16282->10399|16327->10415|16783->10842|16813->10843|16855->10856|16885->10857|16952->10896|16982->10897|17020->10907|17049->10908|17222->11052|17252->11053|17292->11065|17358->11102|17388->11103|17429->11115|17633->11291|17663->11292|17722->11322|17752->11323|17793->11335|17984->11497|18014->11498|18057->11512|18106->11532|18136->11533|18352->11720|18382->11721|18425->11735|18929->12210|18959->12211|19230->12453|19260->12454|19303->12468|19744->12880|19774->12881|19812->12891|19842->12892|20132->13153|20162->13154|20203->13166|20273->13208|20303->13209|20400->13277|20430->13278|20471->13290|20541->13332|20571->13333|20679->13412|20709->13413|20750->13425|20934->13581|20964->13582|21073->13662|21103->13663|21144->13675|21216->13719|21246->13720|21319->13764|21349->13765|21390->13777|21497->13856|21527->13857|21600->13901|21630->13902|21671->13914|21778->13993|21808->13994|21880->14037|21910->14038|21951->14050|22040->14111|22070->14112|22108->14122|22137->14123|22282->14239|22312->14240|22353->14252|22461->14331|22491->14332|22536->14348|22657->14440|22687->14441|22890->14616|22919->14617
                  LINES: 24->7|29->9|34->9|36->11|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|56->31|56->31|56->31|57->32|57->32|57->32|74->49|74->49|74->49|86->61|86->61|87->62|90->65|90->65|91->66|96->71|96->71|97->72|101->76|101->76|102->77|107->82|107->82|108->83|113->88|113->88|113->88|114->89|114->89|114->89|115->90|115->90|115->90|116->91|116->91|116->91|117->92|117->92|117->92|118->93|118->93|118->93|119->94|119->94|119->94|120->95|120->95|120->95|121->96|121->96|121->96|122->97|122->97|122->97|123->98|123->98|123->98|124->99|124->99|124->99|125->100|125->100|125->100|126->101|126->101|126->101|127->102|127->102|127->102|128->103|128->103|128->103|129->104|129->104|129->104|130->105|130->105|130->105|131->106|131->106|131->106|132->107|132->107|132->107|133->108|133->108|133->108|134->109|134->109|134->109|135->110|135->110|135->110|136->111|136->111|136->111|138->113|138->113|138->113|139->114|139->114|139->114|143->118|143->118|144->119|165->140|165->140|166->141|166->141|166->141|167->142|167->142|167->142|168->143|170->145|170->145|171->146|171->146|172->147|176->151|176->151|177->152|177->152|178->153|180->155|180->155|182->157|182->157|183->158|183->158|184->159|190->165|190->165|192->167|192->167|193->168|202->177|202->177|203->178|203->178|204->179|206->181|206->181|208->183|208->183|210->185|210->185|211->186|212->187|212->187|213->188|213->188|219->194|219->194|220->195|220->195|220->195|221->196|231->206|231->206|232->207|232->207|238->213|238->213|239->214|239->214|239->214|240->215|241->216|241->216|253->228|253->228|259->234|259->234|260->235|260->235|260->235|261->236|263->238|263->238|265->240|265->240|266->241|268->243|268->243|269->244|276->251|276->251|277->252|292->267|292->267|293->268|293->268|295->270|295->270|296->271|296->271|302->277|302->277|304->279|304->279|304->279|305->280|307->282|307->282|309->284|309->284|310->285|314->289|314->289|315->290|316->291|316->291|322->297|322->297|323->298|329->304|329->304|336->311|336->311|337->312|345->320|345->320|346->321|346->321|349->324|349->324|350->325|351->326|351->326|352->327|352->327|353->328|354->329|354->329|355->330|355->330|356->331|357->332|357->332|358->333|358->333|359->334|360->335|360->335|361->336|361->336|362->337|363->338|363->338|364->339|364->339|365->340|366->341|366->341|367->342|367->342|368->343|369->344|369->344|370->345|370->345|376->351|376->351|377->352|380->355|380->355|381->356|384->359|384->359|390->365|390->365
                  -- GENERATED --
              */
          