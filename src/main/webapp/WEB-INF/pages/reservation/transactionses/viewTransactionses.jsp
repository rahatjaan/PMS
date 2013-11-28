<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.reservation-resources"/>
<html>
<head>
<title>View <fmt:message key="reservation.title"/> <fmt:message key="transactions.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="transactions.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectReservation?reservationIdKey=${reservation_reservationId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="transactions.transactionid.title"/>:
						</td>
						<td>
							${transactions.transactionId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="transactions.transactiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${transactions.transactionDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="transactions.referencenumber.title"/>:
						</td>
						<td>
							${transactions.referenceNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="transactions.charges.title"/>:
						</td>
						<td>
							${transactions.charges}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="transactions.description.title"/>:
						</td>
						<td>
							${transactions.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.reservationid.title"/>:
						</td>
						<td>
							${transactions.reservation.reservationId}
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
