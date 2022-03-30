<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<center>
		<title>PPS System</title>
	</center>
</head>
<body>
	<center>
		<h1>Sign Up Today!</h1>
	<h2>
		<a href = "index.jsp">Home</a>
		&nbsp;&nbsp;&nbsp;
	</h2>
	</center>
	<div align="center">
	
		
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                	<c:if test = "${user != null }">
            		<form action="" method="post">
        </c:if>
        <c:if test = "${user == null}">
        	<form action = "insert" method = "post">
        </c:if>                 
                </h2>
            </caption>

             <tr>
            	<th>User Name</th>
            	<td>
            		<input type = "text" name = "userid" size="30"
            			value = "<c:out value='${user.email}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Create Password</th>
            	<td>
            		<input type = "text" name = "password" size="30"
            			value = "<c:out value='${user.password}' />" 
            		/>
            	
            <tr>
            	<th>First Name</th>
            	<td>
            		<input type = "text" name = "fname" size="30"
            			value = "<c:out value='${user.fname}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Last Name</th>
            	<td>
            		<input type = "text" name = "lname" size="30"
            			value = "<c:out value='${user.lname}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Date of Birth</th>
            	<td>
            		<input type = "text" name = "birthday" size="30"
            			value = "<c:out value='${user.birthday}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Address</th>
            	<td>
            		<input type = "text" name = "streetnum" size="30"
            			value = "<c:out value='${user.streetnum}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Street</th>
            	<td>
            		<input type = "text" name = "street" size="30"
            			value = "<c:out value='${user.street}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>City</th>
            	<td>
            		<input type = "text" name = "city" size="30"
            			value = "<c:out value='${user.city}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>State</th>
            	<td>
            		<input type = "text" name = "state" size="30"
            			value = "<c:out value='${user.state}' />" 
            		/>
            	</td>
            </tr>
             <tr>
            	<th>Zip</th>
            	<td>
            		<input type = "text" name = "zip" size="30"
            			value = "<c:out value='${user.zip}' />" 
            		/>
            	</td>
            </tr>
           <tr>
           	<td colspan="2" align="center">
           		<input type="submit" value = "Sign Up" />
           	</td>
           </tr>
		</table>
		</form>
	</div>
</body>
</html>