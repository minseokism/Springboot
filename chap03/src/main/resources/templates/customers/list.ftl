<html>
<head>
	<meta charset="UTF-8">
	<title>고객 목록</title>
	<link rel="stylesheet" type="text/css"
		href="../../static/css/style.css"
		/>
</head>
<body>
<div>
	<form action="/customers/create" method="post">
	<dl>
		<dt><label for="lastName">성</label></dt>
		<dd>
			<input type="text" id="lastName" name="lastName" value=""/>
		</dd>
		<dt><label for="firstName">이름</label></dt>
		<dd>
			<input type="text" id="firstName" name="firstName" value=""/>
		</dd>
	</dl>
	<input type="submit" value="작성"/>
	</form>
	</div>
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