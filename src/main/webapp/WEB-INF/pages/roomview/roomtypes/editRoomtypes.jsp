<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roomview-resources"/>
<html>
<head>
<title>Edit <fmt:message key="roomview.title"/> <fmt:message key="roomtype.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="roomtype.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectRoomview?roomViewIdKey=${roomview_roomViewId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRoomviewRoomtypes" method="POST" modelAttribute="roomtype">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="roomtype_roomTypeId" path="roomTypeId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomTypeId",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomtypeid.help"/>", required : true}})); </script>
								</c:when>
								<c:otherwise>
							${roomtype.roomTypeId}
						&nbsp;
									<form:hidden id="roomtype_roomTypeId" path="roomTypeId"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypefield.title"/>:
						</td>
						<td>
							<form:input id="roomtype_roomTypeField" path="roomTypeField" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomTypeField",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomtypefield.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypecode.title"/>:
						</td>
						<td>
							<form:input id="roomtype_roomTypeCode" path="roomTypeCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomTypeCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomtypecode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypedescription.title"/>:
						</td>
						<td>
							<form:input id="roomtype_roomTypeDescription" path="roomTypeDescription" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomTypeDescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomtypedescription.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomlocation.title"/>:
						</td>
						<td>
							<form:input id="roomtype_roomLocation" path="roomLocation" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomLocation",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomlocation.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomdescription.title"/>:
						</td>
						<td>
							<form:input id="roomtype_roomDescription" path="roomDescription" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_roomDescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.roomdescription.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.isreserved.title"/>:
						</td>
						<td>
							<form:input id="roomtype_isReserved" path="isReserved" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roomtype_isReserved",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roomtype.isreserved.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="roomview_roomViewId" value="${roomview_roomViewId}" >
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
