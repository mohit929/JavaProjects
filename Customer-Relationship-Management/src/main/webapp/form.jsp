<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>

<body
	style="background-image: url('https://image.shutterstock.com/z/stock-vector-crm-customer-relationship-management-word-lettering-typography-design-illustration-with-line-413645800.jpg')">

	<div id="wrapper">
		<div id="header" class="text-primary">
			<h2 align="center" style="font-weight: bold">CRM - Customer
				Relationship Manager</h2>
		</div>
	</div>

	<div id="container" style="text-align: center; color: black;">
		<h3 style="font-weight: bold">Save Customer</h3>

		<div align="center">
			<form:form action="saveCustomer" method="POST"
				modelAttribute="customer">

				<!-- need to associate this data with customer id -->
				<form:hidden path="id" />

				<table style="border-collapse: separate; border-spacing: 0 15px">
					<tbody>
						<tr>
							<td><label style="font-weight: bold">First name:</label></td>
							<td><form:input path="firstName"
									placeholder="enter your firstname" style="font-weight: bold"
									id="firstName" /></td>
						</tr>

						<tr>
							<td><label style="font-weight: bold">Last name:</label></td>
							<td><form:input path="lastName"
									placeholder="enter your lastname" style="font-weight: bold"
									id="lastName" /></td>
						</tr>

						<tr>
							<td><label style="font-weight: bold">Email:</label></td>
							<td><form:input path="email" placeholder="enter your email"
									style="font-weight: bold" id="email" /></td>
						</tr>

						<tr align="center">
							<td><label></label></td>
							<td><input type="submit" value="Save"
								class="save btn btn-success" onclick=" validation(event);" /></td>
						</tr>


					</tbody>
				</table>


			</form:form>
		</div>



		<p>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="${pageContext.request.contextPath}/customer/list"
				style="font-weight: bold; font-size:large;">Back to List</a>
		</p>

	</div>
	<script>
		function validation(e) {

			if (document.getElementById("firstName").value.length == 0) {
				document.getElementById("firstName").focus();
				alert("first name cannot be blank");
				e.preventDefault();
				
			} else if (document.getElementById("lastName").value.length == 0) {
				document.getElementById("lastName").focus();
				alert("last name cannot be blank");
				e.preventDefault();
				
			}

			else if (document.getElementById("email").value.length == 0) {
				document.getElementById("email").focus();
				alert("email cannot be blank");
				e.preventDefault();
				

			}
		}
	</script>

</body>

</html>
