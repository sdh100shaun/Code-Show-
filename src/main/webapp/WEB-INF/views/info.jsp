<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html id="linearBg2">
<head>
<title>Codeshows</title>
<script type="text/javascript">
	WebFontConfig = {
		google : {
			families : [ 'Luckiest Guy', 'Reenie Beanie' ]
		}
	};
	(function() {
		var wf = document.createElement('script');
		wf.src = ('https:' == document.location.protocol ? 'https' : 'http')
				+ '://ajax.googleapis.com/ajax/libs/webfont/1/webfont.js';
		wf.type = 'text/javascript';
		wf.async = 'true';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(wf, s);
	})();
</script>
<style type="text/css">
.wf-inactive h1 {
	font-family: serif;
	font-size: 3.5em;
}

.wf-loading p {
	font-family: serif;
}

.wf-inactive p {
	font-family: serif;
}

.wf-active p {
	font-family: 'Reenie Beanie', cursive;
	font-size: 1.5em;
}

.wf-loading p {
	font-family: serif;
	font-size: 1.5em;
}

.wf-active h1 {
	font-family: 'Luckiest Guy', cursive;
	font-size: 4.0em;
	text-shadow: 2px 2px #333;
	line-height: 150%;
	padding: 0.1em;
	width: 100%;
	background: #F9F5B9;
	border-bottom: solid 1px #ECE8B0;
	-moz-transform: rotate(-7deg);
	-webkit-transform: rotate(-7deg);
	-o-transform: rotate(-7deg);
	-ms-transform: rotate(-7deg);
	transform: rotate(-7deg);
}

header {
	text-align: center;
	width: 60%;
	margin: 10% auto;
	background: #fefabc;
	-webkit-box-shadow: 0 8px 6px -6px black;
	-moz-box-shadow: 0 8px 6px -6px black;
	box-shadow: 0 8px 6px -6px black;
	padding: 0.9em;
	-moz-transform: rotate(7deg);
	-webkit-transform: rotate(7deg);
	-o-transform: rotate(7deg);
	-ms-transform: rotate(7deg);
	transform: rotate(7deg);
	height: 24em;
	width: 24em;
}

header:hover {
	-webkit-transform: scale(1.25);
	-moz-transform: scale(1.25);
	-o-transform: scale(1.25);
	position: relative;
	z-index: 5;
}

html {
	height: 100%;
}

body {
	height: 100%;
	margin: 0;
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: 'helvetica', 'arial';
}

#linearBg2 { /* fallback */
	background-color: #8F8E91;
	background-repeat: repeat-x;
	/* Safari 4-5, Chrome 1-9 */
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#F2EDED),
		to(#8F8E91) );
	/* Safari 5.1, Chrome 10+ */
	background: -webkit-linear-gradient(top, #F2EDED, #8F8E91);
	/* Firefox 3.6+ */
	background: -moz-linear-gradient(top, #F2EDED), #8F8E91 );
	/* IE 10 */
	background: -ms-linear-gradient(top, #F2EDED, #8F8E91);
	/* Opera 11.10+ */
	background: -o-linear-gradient(top, #F2EDED, #8F8E91);
}
</style>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-28934090-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</head>
<body>
<ul>
    <li>${info.version}</li>
    <li>${info.edition}</li>
    <li>${info.buildDate}</li>
    <li>${info.buildNumber}</li>
</ul>
</body>
</html>

