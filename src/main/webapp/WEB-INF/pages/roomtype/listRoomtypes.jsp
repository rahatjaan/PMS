<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roomtype-resources"/>
<html>
<head>
<title>List <fmt:message key="roomtype.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="roomtype.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomtype"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roomtype.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="roomtype.roomtypeid.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomtypefield.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomtypecode.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomtypedescription.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomlocation.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomdescription.title"/></th>
					<th class="thead"><fmt:message key="roomtype.isreserved.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomtypes}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoomtype?roomTypeIdKey=${current.roomTypeId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoomtype?roomTypeIdKey=${current.roomTypeId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoomtype?roomTypeIdKey=${current.roomTypeId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomTypeId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomTypeField}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomTypeCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomTypeDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomLocation}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomDescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.isReserved}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>