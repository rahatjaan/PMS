<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.reservation-resources"/>
<html>
<head>
<title>View <fmt:message key="reservation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="reservation.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexReservation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.reservationid.title"/>:
						</td>
						<td>
							${reservation.reservationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="room.roomid.title"/>:
						</td>
						<td>
							${reservation.room.roomId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.guestid.title"/>:
						</td>
						<td>
							${reservation.guest.guestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.arrivaldate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${reservation.arrivalDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofdays.title"/>:
						</td>
						<td>
							${reservation.numberOfDays}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.departuredate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${reservation.departureDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardtype.title"/>:
						</td>
						<td>
							${reservation.cardType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardnumber.title"/>:
						</td>
						<td>
							${reservation.cardNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cvvnumber.title"/>:
						</td>
						<td>
							${reservation.cvvNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.folionumber.title"/>:
						</td>
						<td>
							${reservation.folioNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.currencycode.title"/>:
						</td>
						<td>
							${reservation.currencyCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardexpirydate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${reservation.cardExpiryDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofchildren.title"/>:
						</td>
						<td>
							${reservation.numberOfChildren}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofadults.title"/>:
						</td>
						<td>
							${reservation.numberOfAdults}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.ischeckedout.title"/>:
						</td>
						<td>
							${reservation.isCheckedOut}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="guest.title"/></h1>
					
						<c:if test='${reservation.guest != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="guest.guestid.title"/>:
						</td>
						<td>
							${reservation.guest.guestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.nameprefix.title"/>:
						</td>
						<td>
							${reservation.guest.namePrefix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.firstname.title"/>:
						</td>
						<td>
							${reservation.guest.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.lastname.title"/>:
						</td>
						<td>
							${reservation.guest.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.address1.title"/>:
						</td>
						<td>
							${reservation.guest.address1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.address2.title"/>:
						</td>
						<td>
							${reservation.guest.address2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.email.title"/>:
						</td>
						<td>
							${reservation.guest.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.country.title"/>:
						</td>
						<td>
							${reservation.guest.country}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guest.mobilenumber.title"/>:
						</td>
						<td>
							${reservation.guest.mobileNumber}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			
						</c:if>
						<c:if test='${reservation.guest == null}'>
			
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="room.title"/></h1>
					
						<c:if test='${reservation.room != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="room.roomid.title"/>:
						</td>
						<td>
							${reservation.room.roomId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="room.roomcategory.title"/>:
						</td>
						<td>
							${reservation.room.roomCategory}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="room.issmoking.title"/>:
						</td>
						<td>
							${reservation.room.isSmoking}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="room.iscomposite.title"/>:
						</td>
						<td>
							${reservation.room.isComposite}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="room.floornumber.title"/>:
						</td>
						<td>
							${reservation.room.floorNumber}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			
						</c:if>
						<c:if test='${reservation.room == null}'>
			
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="transactions.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newReservationTransactionses?reservation_reservationId=${reservation.reservationId}" ><span><img src="images/icons/back.gif">New Transaction</span></a></div>		
			
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="transactions.transactionid.title"/></th>
						<th class="thead"><fmt:message key="transactions.transactiondate.title"/></th>
						<th class="thead"><fmt:message key="transactions.referencenumber.title"/></th>
						<th class="thead"><fmt:message key="transactions.charges.title"/></th>
						<th class="thead"><fmt:message key="transactions.description.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${reservation.transactionses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectReservationTransactionses?reservation_reservationId=${reservation.reservationId}&transactionses_transactionId=${current.transactionId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editReservationTransactionses?reservation_reservationId=${reservation.reservationId}&transactionses_transactionId=${current.transactionId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteReservationTransactionses?reservation_reservationId=${reservation.reservationId}&related_transactionses_transactionId=${current.transactionId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.transactionId}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.transactionDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.referenceNumber}
						&nbsp;
						</td>
						<td>
							${current.charges}
						&nbsp;
						</td>
						<td>
							${current.description}
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