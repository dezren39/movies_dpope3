<!doctype html>
<html>
<head>
<title>Success | The Website</title>
<meta name="description" content="This is a servlet example that demonstrates
	a Success response page for successful actions performed in our web application.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Success</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<p>${message}</p>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>