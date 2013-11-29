<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.members-resources"/>
<html>
<head>
<title>View <fmt:message key="members.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="members.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexMembers"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="members.memberid.title"/>:
						</td>
						<td>
							${members.memberId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="members.membershiptype.title"/>:
						</td>
						<td>
							${members.membershipType}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="guest.title"/></h1>
					
			
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="guest.guestid.title"/></th>
						<th class="thead"><fmt:message key="guest.nameprefix.title"/></th>
						<th class="thead"><fmt:message key="guest.firstname.title"/></th>
						<th class="thead"><fmt:message key="guest.lastname.title"/></th>
						<th class="thead"><fmt:message key="guest.address1.title"/></th>
						<th class="thead"><fmt:message key="guest.address2.title"/></th>
						<th class="thead"><fmt:message key="guest.email.title"/></th>
						<th class="thead"><fmt:message key="guest.country.title"/></th>
						<th class="thead"><fmt:message key="guest.mobilenumber.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${members.guests}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectMembersGuests?members_memberId=${members.memberId}&guests_guestId=${current.guestId}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editMembersGuests?members_memberId=${members.memberId}&guests_guestId=${current.guestId}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteMembersGuests?members_memberId=${members.memberId}&related_guests_guestId=${current.guestId}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.guestId}
						&nbsp;
						</td>
						<td>
							${current.namePrefix}
						&nbsp;
						</td>
						<td>
							${current.firstName}
						&nbsp;
						</td>
						<td>
							${current.lastName}
						&nbsp;
						</td>
						<td>
							${current.address1}
						&nbsp;
						</td>
						<td>
							${current.address2}
						&nbsp;
						</td>
						<td>
							${current.email}
						&nbsp;
						</td>
						<td>
							${current.country}
						&nbsp;
						</td>
						<td>
							${current.mobileNumber}
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