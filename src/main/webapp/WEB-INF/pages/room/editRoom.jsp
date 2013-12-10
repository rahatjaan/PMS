<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.room-resources"/>
<html>
<head>
<title>Edit <fmt:message key="room.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="room.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRoom"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRoom" method="POST" modelAttribute="room" enctype="multipart/form-data">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td>
							<form:hidden id="room_id" path="roomId" value=""/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.roomcategory.title"/>:
						</td>
						<td>
							<form:input id="room_roomCategory" path="roomCategory" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "room_roomCategory",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="room.roomcategory.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.issmoking.title"/>:
						</td>
						<td>
							<form:input id="room_isSmoking" path="isSmoking" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "room_isSmoking",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="room.issmoking.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Room Rate:
						</td>
						<td>
							<form:input id="room_roomRate" path="roomRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "room_roomRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="room.roomrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.iscomposite.title"/>:
						</td>
						<td>
							<form:input id="room_isComposite" path="isComposite" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "room_isComposite",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="room.iscomposite.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="room.floornumber.title"/>:
						</td>
						<td>
							<form:input id="room_floorNumber" path="floorNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "room_floorNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="room.floornumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Image1:
						</td>
						<td>
							<input id="room_image1" name="file1" type="file" cssStyle="width:300px;"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Image2:
						</td>
						<td>
							<input id="room_image1" name="file2" type="file" cssStyle="width:300px;"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Image3:
						</td>
						<td>
							<input id="room_image1" name="file3" type="file" cssStyle="width:300px;"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Image4:
						</td>
						<td>
							<input id="room_image1" name="file4" type="file" cssStyle="width:300px;"/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							<form:select path="roomtype.roomTypeId" items="${roomTypeList}" cssStyle="width:300px;" />
						</td>
						<td style="border:0;">
							<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoomtype"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roomtype.title"/></span></a></div>
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