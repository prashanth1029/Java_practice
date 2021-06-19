<html>

<head><title>Student Confirmation Title</title></head>

<body>

	
	<!--   <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %> -->
	
	The Student is Confirmed: ${param.firstName} ${param.lastName}
	
	<br/><br/>

	<!-- THIS IS NOT ALLOWED HERE AS WE ARE GETTING MULTIPLE VALUES FROM CHECKBOX -->
	<!-- The Student's Favorite Programming Language: ${param.favouriteLanguage}  -->
	
	<!-- DISPLAY LIST OF FAVORITE LANGUAGES -->
	Favorite Programming Languages: </br>
	<ul>
		<%
			String[] langs = request.getParameterValues("favouriteLanguage");
		
			for (String tempLang : langs){
				out.println("<li>" + tempLang + "</li>");
			}
		%>
	</ul>
	
</body>

</html>