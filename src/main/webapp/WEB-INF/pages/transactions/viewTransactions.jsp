<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.transactions-resources"/>
<html>
<head>
<title>View <fmt:message key="transactions.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="transactions.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexTransactions"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="reservation.title"/></h1>
					
						<c:if test='${transactions.reservation != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.reservationid.title"/>:
						</td>
						<td>
							${transactions.reservation.reservationId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.arrivaldate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${transactions.reservation.arrivalDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.numberofdays.title"/>:
						</td>
						<td>
							${transactions.reservation.numberOfDays}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.departuredate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${transactions.reservation.departureDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.cardtype.title"/>:
						</td>
						<td>
							${transactions.reservation.cardType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.cardnumber.title"/>:
						</td>
						<td>
							${transactions.reservation.cardNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.cvvnumber.title"/>:
						</td>
						<td>
							${transactions.reservation.cvvNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.folionumber.title"/>:
						</td>
						<td>
							${transactions.reservation.folioNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.currencycode.title"/>:
						</td>
						<td>
							${transactions.reservation.currencyCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.cardexpirydate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${transactions.reservation.cardExpiryDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.numberofchildren.title"/>:
						</td>
						<td>
							${transactions.reservation.numberOfChildren}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.numberofadults.title"/>:
						</td>
						<td>
							${transactions.reservation.numberOfAdults}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="reservation.ischeckedout.title"/>:
						</td>
						<td>
							${transactions.reservation.isCheckedOut}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editTransactionsReservation?transactions_transactionId=${transactions.transactionId}&reservation_reservationId=${transactions.reservation.reservationId}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteTransactionsReservation?transactions_transactionId=${transactions.transactionId}&related_reservation_reservationId=${transactions.reservation.reservationId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${transactions.reservation == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newTransactionsReservation?transactions_transactionId=${transactions.transactionId}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="reservation.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>