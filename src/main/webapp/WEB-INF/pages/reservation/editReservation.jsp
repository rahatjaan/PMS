<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.reservation-resources"/>
<html>
<head>
<title>Edit <fmt:message key="reservation.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="reservation.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexReservation"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveReservation" method="POST" modelAttribute="reservation">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.roomid.title"/>:
						</td>
						<td>
							<form:select path="room.roomId" items="${roomList}" cssStyle="width:300px;" />
						</td>
						<td style="border:0;">
							<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoom"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="room.title"/></span></a></div>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.arrivaldate.title"/>:
						</td>
						<td>
							<input id="reservation_arrivalDate" name="arrivalDate" type="text" value="<fmt:formatDate value="${reservation.arrivalDate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofdays.title"/>:
						</td>
						<td>
							<form:input id="reservation_numberOfDays" path="numberOfDays" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_numberOfDays",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.numberofdays.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.departuredate.title"/>:
						</td>
						<td>
							<input id="reservation_departureDate" name="departureDate" type="text" value="<fmt:formatDate value="${reservation.departureDate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardtype.title"/>:
						</td>
						<td>
							<form:input id="reservation_cardType" path="cardType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_cardType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.cardtype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardnumber.title"/>:
						</td>
						<td>
							<form:input id="reservation_cardNumber" path="cardNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_cardNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.cardnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cvvnumber.title"/>:
						</td>
						<td>
							<form:input id="reservation_cvvNumber" path="cvvNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_cvvNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.cvvnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.folionumber.title"/>:
						</td>
						<td>
							<form:input id="reservation_folioNumber" path="folioNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_folioNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.folionumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.currencycode.title"/>:
						</td>
						<td>
							<form:input id="reservation_currencyCode" path="currencyCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_currencyCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.currencycode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.cardexpirydate.title"/>:
						</td>
						<td>
							<input id="reservation_cardExpiryDate" name="cardExpiryDate" type="text" value="<fmt:formatDate value="${reservation.cardExpiryDate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofchildren.title"/>:
						</td>
						<td>
							<form:input id="reservation_numberOfChildren" path="numberOfChildren" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_numberOfChildren",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.numberofchildren.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.numberofadults.title"/>:
						</td>
						<td>
							<form:input id="reservation_numberOfAdults" path="numberOfAdults" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_numberOfAdults",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.numberofadults.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.guestid.title"/>:
						</td>
						<td>
							<form:select path="guest.guestId" items="${guestList}" cssStyle="width:300px;" />
						</td>
						<td style="border:0;">
							<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuest"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="guest.title"/></span></a></div>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reservation.ischeckedout.title"/>:
						</td>
						<td>
							<form:input id="reservation_isCheckedOut" path="isCheckedOut" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reservation_isCheckedOut",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reservation.ischeckedout.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>