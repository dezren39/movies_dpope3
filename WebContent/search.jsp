<!doctype html>
<html>
<head>
<title>Search | The Website</title>
<meta name="description" content="This is a servlet example for a simple web page.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Search</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<form action="Search">
			<label for="title"><strong>Search by title:</strong></label>
			<input name="title"><br>
			<label for="director"><strong>Search by director:</strong></label>
			<input name="director"><br>
			<p>(Case Insensitive, Leave Field Blank for "Any")</p>
			<input id="search" type="submit" value="Search!">
		</form>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>