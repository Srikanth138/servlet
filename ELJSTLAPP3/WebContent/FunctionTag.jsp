<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <c:set var="s1" value="${param.str }"/>
    <c:choose>
     <c:when test="${fn:contains(s1, 'java') }" >
     <p>String Founded<p>
     </c:when>
     <c:otherwise><p>String not Founded<p></c:otherwise>
    </c:choose>
    
    <c:if test="${fn:containsIgnoreCase(s1,'JAVA') }">
    <p>String Founded</p>
    </c:if>