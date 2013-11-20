<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roomtype-resources"/>
<html>
<head>
<title>View <fmt:message key="roomtype.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="roomtype.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRoomtype"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							${roomtype.roomTypeId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypefield.title"/>:
						</td>
						<td>
							${roomtype.roomTypeField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypecode.title"/>:
						</td>
						<td>
							${roomtype.roomTypeCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypedescription.title"/>:
						</td>
						<td>
							${roomtype.roomTypeDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomlocation.title"/>:
						</td>
						<td>
							${roomtype.roomLocation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomdescription.title"/>:
						</td>
						<td>
							${roomtype.roomDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.isreserved.title"/>:
						</td>
						<td>
							${roomtype.isReserved}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roomview.title"/></h1>
					
						<c:if test='${roomtype.roomview != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="roomview.roomviewid.title"/>:
						</td>
						<td>
							${roomtype.roomview.roomViewId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomview.roomviewcode.title"/>:
						</td>
						<td>
							${roomtype.roomview.roomViewCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomview.roomviewdescription.title"/>:
						</td>
						<td>
							${roomtype.roomview.roomViewDescription}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRoomtypeRoomview?roomtype_roomTypeId=${roomtype.roomTypeId}&roomview_roomViewId=${roomtype.roomview.roomViewId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRoomtypeRoomview?roomtype_roomTypeId=${roomtype.roomTypeId}&related_roomview_roomViewId=${roomtype.roomview.roomViewId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${roomtype.roomview == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomtypeRoomview?roomtype_roomTypeId=${roomtype.roomTypeId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roomview.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="bed.title"/></h1>
					
						<c:if test='${roomtype.bed != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="bed.bedid.title"/>:
						</td>
						<td>
							${roomtype.bed.bedId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="bed.bedtypecode.title"/>:
						</td>
						<td>
							${roomtype.bed.bedTypeCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="bed.bedtypedescription.title"/>:
						</td>
						<td>
							${roomtype.bed.bedTypeDescription}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRoomtypeBed?roomtype_roomTypeId=${roomtype.roomTypeId}&bed_bedId=${roomtype.bed.bedId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRoomtypeBed?roomtype_roomTypeId=${roomtype.roomTypeId}&related_bed_bedId=${roomtype.bed.bedId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${roomtype.bed == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomtypeBed?roomtype_roomTypeId=${roomtype.roomTypeId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="bed.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="room.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomtypeRooms?roomtype_roomTypeId=${roomtype.roomTypeId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="room.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="room.roomid.title"/></th>
						<th class="thead"><fmt:message key="room.roomcategory.title"/></th>
						<th class="thead"><fmt:message key="room.issmoking.title"/></th>
						<th class="thead"><fmt:message key="room.iscomposite.title"/></th>
						<th class="thead"><fmt:message key="room.floornumber.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${roomtype.rooms}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoomtypeRooms?roomtype_roomTypeId=${roomtype.roomTypeId}&rooms_roomId=${current.roomId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoomtypeRooms?roomtype_roomTypeId=${roomtype.roomTypeId}&rooms_roomId=${current.roomId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoomtypeRooms?roomtype_roomTypeId=${roomtype.roomTypeId}&related_rooms_roomId=${current.roomId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.roomId}
						&nbsp;
						</td>
						<td>
							${current.roomCategory}
						&nbsp;
						</td>
						<td>
							${current.isSmoking}
						&nbsp;
						</td>
						<td>
							${current.isComposite}
						&nbsp;
						</td>
						<td>
							${current.floorNumber}
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