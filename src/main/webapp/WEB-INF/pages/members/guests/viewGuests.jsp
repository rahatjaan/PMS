<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.members-resources"/>
<html>
<head>
<title>View <fmt:message key="members.title"/> <fmt:message key="guest.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="guest.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectMembers?memberIdKey=${members_memberId}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.guestid.title"/>:
						</td>
						<td>
							${guest.guestId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.nameprefix.title"/>:
						</td>
						<td>
							${guest.namePrefix}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.firstname.title"/>:
						</td>
						<td>
							${guest.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.lastname.title"/>:
						</td>
						<td>
							${guest.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.address1.title"/>:
						</td>
						<td>
							${guest.address1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.address2.title"/>:
						</td>
						<td>
							${guest.address2}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.email.title"/>:
						</td>
						<td>
							${guest.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.country.title"/>:
						</td>
						<td>
							${guest.country}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guest.mobilenumber.title"/>:
						</td>
						<td>
							${guest.mobileNumber}
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
