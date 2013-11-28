<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.bed-resources"/>
<html>
<head>
<title>View <fmt:message key="bed.title"/> <fmt:message key="roomtype.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="roomtype.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectBed?bedIdKey=${bed_bedId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypeid.title"/>:
						</td>
						<td>
							${roomtype.roomTypeId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypefield.title"/>:
						</td>
						<td>
							${roomtype.roomTypeField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypecode.title"/>:
						</td>
						<td>
							${roomtype.roomTypeCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomtypedescription.title"/>:
						</td>
						<td>
							${roomtype.roomTypeDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomlocation.title"/>:
						</td>
						<td>
							${roomtype.roomLocation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.roomdescription.title"/>:
						</td>
						<td>
							${roomtype.roomDescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomview.roomviewid.title"/>:
						</td>
						<td>
							${roomtype.roomview.roomViewId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bed.bedid.title"/>:
						</td>
						<td>
							${roomtype.bed.bedId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roomtype.isreserved.title"/>:
						</td>
						<td>
							${roomtype.isReserved}
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
