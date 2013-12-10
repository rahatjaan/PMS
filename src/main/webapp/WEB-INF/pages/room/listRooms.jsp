<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.room-resources"/>
<html>
<head>
<title>List <fmt:message key="room.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="room.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoom"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="room.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="room.roomid.title"/></th>
					<th class="thead"><fmt:message key="room.roomcategory.title"/></th>
					<th class="thead">Room Rate</th>
					<th class="thead"><fmt:message key="room.issmoking.title"/></th>
					<th class="thead"><fmt:message key="room.iscomposite.title"/></th>
					<th class="thead"><fmt:message key="room.floornumber.title"/></th>
					<th class="thead"><fmt:message key="roomtype.roomtypeid.title"/></th>
					<th class="thead">Image 1</th>
					<th class="thead">Image 2</th>
					<th class="thead">Image 3</th>
					<th class="thead">Image 4</th>
										
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rooms}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoom?roomIdKey=${current.roomId}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoom?roomIdKey=${current.roomId}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoom?roomIdKey=${current.roomId}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomCategory}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomRate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.isSmoking}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.isComposite}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.floorNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomtype.roomTypeId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.image1}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.image2}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.image3}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.image4}
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