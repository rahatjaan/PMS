<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.application-resources"/>
<div id="header">
<h1><fmt:message key="application.title"/></h1>
</div>
<div id="login"><jsp:include page="/WEB-INF/sitemesh-common/login.jsp" /></div>
<div class="headerMenu">
<ul>
<li><a href="">Menu1</a></li>
<li><a href="">Menu1</a></li>
<li><a href="">Menu1</a></li>
<li><a href="">Menu1</a></li>

</ul>
</div>