<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.room-resources"/>
<html>
<head>
<title>View <fmt:message key="room.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="room.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRoom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.roomid.title"/>:
						</td>
						<td>
							${room.roomId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.roomcategory.title"/>:
						</td>
						<td>
							${room.roomCategory}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.issmoking.title"/>:
						</td>
						<td>
							${room.isSmoking}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.iscomposite.title"/>:
						</td>
						<td>
							${room.isComposite}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.floornumber.title"/>:
						</td>
						<td>
							${room.floorNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							${room.roomtype.roomTypeId}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roomtype.title"/></h1>
					
						<c:if test='${room.roomtype != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							${room.roomtype.roomTypeId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomtypefield.title"/>:
						</td>
						<td>
							${room.roomtype.roomTypeField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomtypecode.title"/>:
						</td>
						<td>
							${room.roomtype.roomTypeCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomtypedescription.title"/>:
						</td>
						<td>
							${room.roomtype.roomTypeDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomlocation.title"/>:
						</td>
						<td>
							${room.roomtype.roomLocation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.roomdescription.title"/>:
						</td>
						<td>
							${room.roomtype.roomDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="roomtype.isreserved.title"/>:
						</td>
						<td>
							${room.roomtype.isReserved}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRoomRoomtype?room_roomId=${room.roomId}&roomtype_roomTypeId=${room.roomtype.roomTypeId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRoomRoomtype?room_roomId=${room.roomId}&related_roomtype_roomTypeId=${room.roomtype.roomTypeId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${room.roomtype == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomRoomtype?room_roomId=${room.roomId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roomtype.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="reservation.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomReservations?room_roomId=${room.roomId}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="reservation.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="reservation.reservationid.title"/></th>
						<th class="thead"><fmt:message key="reservation.arrivaldate.title"/></th>
						<th class="thead"><fmt:message key="reservation.numberofdays.title"/></th>
						<th class="thead"><fmt:message key="reservation.departuredate.title"/></th>
						<th class="thead"><fmt:message key="reservation.cardtype.title"/></th>
						<th class="thead"><fmt:message key="reservation.cardnumber.title"/></th>
						<th class="thead"><fmt:message key="reservation.cvvnumber.title"/></th>
						<th class="thead"><fmt:message key="reservation.folionumber.title"/></th>
						<th class="thead"><fmt:message key="reservation.currencycode.title"/></th>
						<th class="thead"><fmt:message key="reservation.cardexpirydate.title"/></th>
						<th class="thead"><fmt:message key="reservation.numberofchildren.title"/></th>
						<th class="thead"><fmt:message key="reservation.numberofadults.title"/></th>
						<th class="thead"><fmt:message key="reservation.ischeckedout.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${room.reservations}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoomReservations?room_roomId=${room.roomId}&reservations_reservationId=${current.reservationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoomReservations?room_roomId=${room.roomId}&reservations_reservationId=${current.reservationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoomReservations?room_roomId=${room.roomId}&related_reservations_reservationId=${current.reservationId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.reservationId}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.arrivalDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.numberOfDays}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.departureDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.cardType}
						&nbsp;
						</td>
						<td>
							${current.cardNumber}
						&nbsp;
						</td>
						<td>
							${current.cvvNumber}
						&nbsp;
						</td>
						<td>
							${current.folioNumber}
						&nbsp;
						</td>
						<td>
							${current.currencyCode}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.cardExpiryDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.numberOfChildren}
						&nbsp;
						</td>
						<td>
							${current.numberOfAdults}
						&nbsp;
						</td>
						<td>
							${current.isCheckedOut}
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