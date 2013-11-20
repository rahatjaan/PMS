<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.reservation-resources"/>
<html>
<head>
<title>List <fmt:message key="reservation.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="reservation.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newReservation"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="reservation.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${reservations}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectReservation?reservationIdKey=${current.reservationId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editReservation?reservationIdKey=${current.reservationId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteReservation?reservationIdKey=${current.reservationId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.reservationId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.arrivalDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfDays}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.departureDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cardType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cardNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cvvNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.folioNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.currencyCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.cardExpiryDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfChildren}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfAdults}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.isCheckedOut}
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