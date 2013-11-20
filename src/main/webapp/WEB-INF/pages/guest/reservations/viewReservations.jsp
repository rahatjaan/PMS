<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guest-resources"/>
<html>
<head>
<title>View <fmt:message key="guest.title"/> <fmt:message key="reservation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="reservation.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGuest?guestIdKey=${guest_guestId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
