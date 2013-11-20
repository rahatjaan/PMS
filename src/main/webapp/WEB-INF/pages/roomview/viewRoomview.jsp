<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roomview-resources"/>
<html>
<head>
<title>View <fmt:message key="roomview.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="roomview.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRoomview"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomview.roomviewid.title"/>:
						</td>
						<td>
							${roomview.roomViewId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomview.roomviewcode.title"/>:
						</td>
						<td>
							${roomview.roomViewCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomview.roomviewdescription.title"/>:
						</td>
						<td>
							${roomview.roomViewDescription}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roomtype.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomviewRoomtypes?roomview_roomViewId=${roomview.roomViewId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roomtype.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
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
					<c:forEach items="${roomview.roomtypes}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoomviewRoomtypes?roomview_roomViewId=${roomview.roomViewId}&roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoomviewRoomtypes?roomview_roomViewId=${roomview.roomViewId}&roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoomviewRoomtypes?roomview_roomViewId=${roomview.roomViewId}&related_roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.roomTypeId}
						&nbsp;
						</td>
						<td>
							${current.roomTypeField}
						&nbsp;
						</td>
						<td>
							${current.roomTypeCode}
						&nbsp;
						</td>
						<td>
							${current.roomTypeDescription}
						&nbsp;
						</td>
						<td>
							${current.roomLocation}
						&nbsp;
						</td>
						<td>
							${current.roomDescription}
						&nbsp;
						</td>
						<td>
							${current.isReserved}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>