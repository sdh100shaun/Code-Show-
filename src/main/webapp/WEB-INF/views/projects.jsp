<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<body>
<p>Projects</p>
<table cellpadding="3" cellspacing="0" border="0" summary="Resource Objects">
    <tr>
        <th>Self</th>
        <th>Key</th>
        <th>Name</th>
    </tr>
    <c:forEach var="project" items="${projects}">
        <tr>
            <td>${project.self}</td>
            <td>${project.key}</td>
            <td>${project.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>