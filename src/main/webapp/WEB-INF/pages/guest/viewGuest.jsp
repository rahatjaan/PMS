<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guest-resources"/>
<html>
<head>
<title>View <fmt:message key="guest.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="guest.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuest"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.guestid.title"/>:
						</td>
						<td>
							${guest.guestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.nameprefix.title"/>:
						</td>
						<td>
							${guest.namePrefix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.firstname.title"/>:
						</td>
						<td>
							${guest.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.lastname.title"/>:
						</td>
						<td>
							${guest.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.address1.title"/>:
						</td>
						<td>
							${guest.address1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.address2.title"/>:
						</td>
						<td>
							${guest.address2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.email.title"/>:
						</td>
						<td>
							${guest.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.country.title"/>:
						</td>
						<td>
							${guest.country}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.mobilenumber.title"/>:
						</td>
						<td>
							${guest.mobileNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="members.memberid.title"/>:
						</td>
						<td>
							${guest.members.memberId}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="members.title"/></h1>
					
						<c:if test='${guest.members != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="members.memberid.title"/>:
						</td>
						<td>
							${guest.members.memberId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="members.membershiptype.title"/>:
						</td>
						<td>
							${guest.members.membershipType}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			
						</c:if>
						<c:if test='${guest.members == null}'>
			
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="reservation.title"/></h1>
					
			
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
					<c:forEach items="${guest.reservations}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGuestReservations?guest_guestId=${guest.guestId}&reservations_reservationId=${current.reservationId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGuestReservations?guest_guestId=${guest.guestId}&reservations_reservationId=${current.reservationId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGuestReservations?guest_guestId=${guest.guestId}&related_reservations_reservationId=${current.reservationId}&"><img src="images/icons/delete.gif" /></a>
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