<html>
<head>
	<meta charset="UTF-8">
	<title>고객 목록</title>
</head>
<body>
	<table class="table table-striped table-bordered table-condensed">
		<#list customers as customers> 
		<tr>
			<td>${customers.id}</td>
			<td>${customers.lastName}</td>
			<td>${customers.firstName}</td>
			<td>
				<form action="/customers/edit" method="get">
					<input type="submit" name="form" value="편집"/>
					<input type="hidden" name="id" value="${customers.id}"/>
				</form>
			</td>
			<td>
				<form action="/customers/delete" method="post">
					<input type="submit" value="삭제"/>
					<input type="hidden" name="id" value="${customers.id}"/>
				</form>
			</td>
		</tr>
		</#list>
	</table>

</body>
</html>