<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roomtype-resources"/>
<html>
<head>
<title>View <fmt:message key="roomtype.title"/> <fmt:message key="bed.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="bed.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectRoomtype?roomTypeIdKey=${roomtype_roomTypeId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bed.bedid.title"/>:
						</td>
						<td>
							${bed.bedId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bed.bedtypecode.title"/>:
						</td>
						<td>
							${bed.bedTypeCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bed.bedtypedescription.title"/>:
						</td>
						<td>
							${bed.bedTypeDescription}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteRoomtypeBed?roomtype_roomTypeId=${roomtype_roomTypeId}&related_bed_bedId=${bed.bedId}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
