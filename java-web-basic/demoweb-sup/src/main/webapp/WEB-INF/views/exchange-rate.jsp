<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8' />
	<title>Login</title>
	<link rel='Stylesheet' href='/demowebsup/styles/default.css' />
	<link rel='Stylesheet' href='/demowebsup/styles/input.css' />
</head>
<body>

	<div id='pageContainer'>
		
		<jsp:include page="/WEB-INF/views/modules/header.jsp" />	
		
		<div id="inputcontent">
			<br /><br />
		    <div id="inputmain">
		        <div class="inputsubtitle">로또 당첨 예상 번호 뽑기</div>
		        
		        <form action="exchange-rate.action" method="post">
		       
		        <table>
		        	<tr>
		                <td>
		                    <input type="radio" name="exchangeType" value="w2d" checked>원 -> 달러
		                	<input type="radio" name="exchangeType" value="d2w">달러 -> 원
		                </td>
		            </tr>
		            <tr>
		                <td>
		                    <input type="text" name="amout" style="height:30px;width:100%">
		                </td>
		            </tr>
		            <tr>
		                <td>
		                    <input type="submit" vlaue="환율 계산" style="height:30px;width:100%">
		                </td>
		            </tr>
		            <tr>
		            	<th>
		            		<% Double result = (Double)request.getAttribute("result"); %>
		            		<% if (result == null) { %>
		            		&nbsp;
		            		<%} else { %>
		            		<%= result %>
		            		<% } %>
		            	</th>
		            </tr>
		        </table>
		        
		        
		        </form>
		        
		    </div>
		</div>  	
	</div>
	
	<script>
		
	</script>

</body>
</html>