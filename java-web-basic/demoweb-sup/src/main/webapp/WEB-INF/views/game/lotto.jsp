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
		        
		        <form action="lotto.action" method="post">
		       
		        <table>
		            <tr>
		                <td colspan="6">
		                    <input type="submit" value="번호 뽑기" style="height:30px;width:100%">
		                </td>
		            </tr>
		            <tr>
		            	<%int[] numbers = (int[])request.getAttribute("numbers"); %>
		            	<% if (numbers == null) { %>
		            		<% for (int i = 0; i < 6; i++){ %>
		                	<th>&nbsp;</th>
		                	<% } %>
		                <% }  else { %>
		                	<% for (int number : numbers) { %>
		                	<th><%= number %></th>
		                	<% } %>
		                <% } %>
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