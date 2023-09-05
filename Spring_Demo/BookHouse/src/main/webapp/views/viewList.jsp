<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender">
<h1><center>Classic Book House</center></h1>
				
			<!--  Design the page as per the requirements-->
			
			<table>
				<thead>
					<th>ISBN</th>
					<th>Book Name</th>
					<th>Book category</th>
					<th>Quantity</th>
					<th>Price</th>
				</thead>
				<tbody>
					<c:forEach items="${bookList}" var="book">
						<tr>
							<td>${book.isbn}</td>
							<td>${book.bookName}</td>
							<td>${book.category}</td>
							<td>${book.quantity}</td>
							<td>${book.price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>




<a href="index">Back to Home</a>

</body>
</html>