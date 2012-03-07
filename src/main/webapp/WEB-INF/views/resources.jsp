<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
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

    </style>

    <script type="text/javascript">

        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-28934090-1']);
        _gaq.push(['_trackPageview']);

        (function() {
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        })();

    </script>
</head>
<body>
<p>Resources</p>
<ul>
    <li>resources expand=${resources.expand}</li>
    <li>resources link rel=${resources.link.rel}</li>
    <li>resources link href=${resources.link.href}</li>
    <li>resources resources size=${resources.resources.size}</li>
    <li>resources resources max-result=${resources.resources.maxResult}</li>
    <li>resources resources start-index=${resources.resources.startIndex}</li>
    <li>resources resources numberOfResourceObjects=<c:out value="${fn:length(resources.resources.resourceList)}"/></li>
</ul>
<p>Resource</p>
<table cellpadding="3" cellspacing="0" border="0" summary="Resource Objects">
    <tr>
        <th>Name</th>
        <th>Link Rel</th>
        <th>Link Href</th>
    </tr>
    <c:forEach var="resource" items="${resources.resources.resourceList}">
        <tr>
            <td>${resource.name}</td>
            <td>${resource.link.rel}</td>
            <td>${resource.link.href}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

