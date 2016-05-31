<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JAXB - JSP to Xml</title>

<!-- for datepicker -->

<script type="text/javascript" src="js/basic.js" ></script>

  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  </script>
   
   
<!-- For Income, Tds, TaxDeducted -->

<script>
$(function () {    
    $('.decimal').keypress(function (e) {
        var character = String.fromCharCode(e.keyCode)
        var newValue = this.value + character;
        if (isNaN(newValue) || hasDecimalPlace(newValue, 3)) {
            e.preventDefault();
            return false;
        }
    });
    
    function hasDecimalPlace(value, x) {
        var pointIndex = value.indexOf('.');
        return  pointIndex >= 0 && pointIndex < value.length - x;
    }
});
</script>

<!-- Validation for only alphabets in Name -->
<script>
function isAlfa(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode != 32 && (charCode < 65 || charCode > 90) && (charCode < 97 || charCode > 122)) {
        return false;
    }
    return true;
}
</script>


</head>
<body style="background-color:  #ddccff;" >
<form method="post" action="JavaToXmlServlet" >
	<div>
	<div align="center">
		<h2>POC</h2>
		
		<h4>JSP to XML</h4>
		
		
	</div>
	
	<div align="center">
		<table style="width: 35%;">
			<tr>
				<td class="block" style="width: 80%; ">Name</td>
				<td style="width: 100%; height=100%; "><input type="text" name="name" id="name" maxlength="20" style="width: 100%;" onkeypress="return isAlfa(event)" required="required"/></td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td>Address</td>
				<td><textarea name="address" style="width: 100%" required="required"></textarea></td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td>PAN</td>
				<!-- minLength and maxLength are bore set to 10 digits -->
				<td><input type="text" name="pan" style="width: 100% ;  text-transform:uppercase;" minlength="10" maxlength="10" required="required"></td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td>Date of Birth</td>
				<td><input type="text" name="dateOfBirth" id="datepicker" style="width: 100%;" required="required"></td>
			</tr>
			<tr><td></td></tr>			
			<tr>
				<td>Assessment Year</td>
				<td>
					<select name="assessmentYear" id="selectBoxId" style="width: 100%;" required="required">
					<option value="2012-13" style="width: 100%;">2012-13</option>
					<option value="2013-14" style="width: 100%;">2013-14</option>
					<option value="2014-15" style="width: 100%;">2014-15</option>
					<option value="2015-16" style="width: 100%;">2015-16</option>
					</select>
				</td>
			</tr>
			<tr><td></td></tr>			
			<tr>
				<td>Income</td>
				<td><input type='text' class="decimal" name="income" style="width: 100%" required="required" maxlength="8"/></td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td>TDS</td>
				<td><input type='text' class="decimal" name="tds" style="width: 100%" required="required" maxlength="8"/></td>
			</tr>
			<tr><td></td></tr>
			<tr>
				<td>Tax Deducted</td>
				<td><input type='text' name="taxDeducted" class="decimal" style="width: 100%" required="required" maxlength="8"/></td>
			</tr>
			<tr><td></td></tr>
			<tr><td></td></tr>
			<tr>
				<td><input type="submit" value="Submit" id="btnSubmit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</div>
	</div>
</form>
</body>
</html>