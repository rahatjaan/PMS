<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.bed-resources"/>
<html>
<head>
<title>View <fmt:message key="bed.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="bed.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexBed"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roomtype.title"/></h1>
					
			
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="roomtype.roomtypeid.title"/></th>
						<th class="thead"><fmt:message key="roomtype.roomtypefield.title"/></th>
						<th class="thead"><fmt:message key="roomtype.roomtypecode.title"/></th>
						<th class="thead"><fmt:message key="roomtype.roomtypedescription.title"/></th>
						<th class="thead"><fmt:message key="roomtype.roomlocation.title"/></th>
						<th class="thead"><fmt:message key="roomtype.roomdescription.title"/></th>
						<th class="thead"><fmt:message key="roomtype.isreserved.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bed.roomtypes}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectBedRoomtypes?bed_bedId=${bed.bedId}&roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editBedRoomtypes?bed_bedId=${bed.bedId}&roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteBedRoomtypes?bed_bedId=${bed.bedId}&related_roomtypes_roomTypeId=${current.roomTypeId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.roomTypeId}
						&nbsp;
						</td>
						<td>
							${current.roomTypeField}
						&nbsp;
						</td>
						<td>
							${current.roomTypeCode}
						&nbsp;
						</td>
						<td>
							${current.roomTypeDescription}
						&nbsp;
						</td>
						<td>
							${current.roomLocation}
						&nbsp;
						</td>
						<td>
							${current.roomDescription}
						&nbsp;
						</td>
						<td>
							${current.isReserved}
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