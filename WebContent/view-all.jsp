<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unsorted Movies | The Website</title>
<meta name="description" content="This is a JSP example that demonstrates how to output an Excel sheet of movies to a spreadsheet.">
<%@ include file="includes/styles.jsp"%>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Movie List</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<!-- This is where we will output the class list -->
		<c:choose>
			<c:when test="${empty movies}">
				<p>Sorry, the list of movies is empty.</p>
			</c:when>
			<c:otherwise>
				<c:forEach var="movie" items="${movies}">
					<div class="span4">
						<h2 class="movieTitle">${movie.title}</h2>
						<p class="movieDetails">Director: ${movie.director}</p>
						<p class="movieDetails">Length: ${movie.lengthInMinutes} minutes</p>
					</div>				
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>