<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<body>

<p>Project</p>
<ul>
    <li><c:out value="${project.self}"/></li>
    <li><c:out value="${project.key}"/></li>
    <li><c:out value="${project.description}"/></li>
</ul>

<p>Lead</p>
<ul>
    <li><c:out value="${project.lead.self}"/></li>
    <li><c:out value="${project.lead.name}"/></li>
    <li><c:out value="${project.lead.displayName}"/></li>
    <li><c:out value="${project.lead.active}"/></li>
</ul>
</body>
</html>