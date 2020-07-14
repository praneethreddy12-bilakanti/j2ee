<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
 <head>

  <title>index</title>
  <style>
  div{height:500px; 
  width:100%;
  background-color:blue;
float:left;
text-align=center;
  }
   div#first{height:500px; 
  width:33.3%;
  background-color:orange;text-align=center;
  
  }
  div#secound{height:500px; 
  width:33.3%;
  background-color:green;
  float:left;
text-align=center;

  }
   div#third{height:600px; 
  width:33.3%;
  background-color:pink;
  float:left;
text-align=center;

  }
  #footer
  {
  height:100px;
  width:100%;
  background-color:red;
  text-align:center;
  
  }
  table{
  align:center;
  
  }
  h1,h2{
  text-transform:uppercase;
   	}
   </style>
 </head>
 <body>
  <div  >
  <h1 align="center"> config software solutions</h1>
 <div id="first">
 
<form action="studentlogin.jsp" method="post">
<h2 align="center"> student registation form</h2>
<h3>
			<table style="width: 100%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" min="10" max="10" required="required"/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr>
				</td></table>
			<input type="submit" value="Submit"/>

			</form>


	</h3>
  </div>
   

		<div id="secound">
		<h2 align="center">student login form</h2>
<form action="validate.jsp" method="post">
<h3>
			<table style="width: 100%">
				<tr>
					<td>username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="text" name="password" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
		</div>
 <div id="third">
 <h2 align="center">admin login form</h2>
<form action="admin.jsp" method="post">
<h3>
			<table style="width: 100% height:100%">
				<tr>
					<td>username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="text" name="password" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
  </div>


  </div>
  <div id="footer" ><h1><font color="blue">desgned by praneeth kumar reddy</font></h1></div>
 </body>
</html>
