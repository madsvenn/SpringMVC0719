<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" media="all" />
	<script src="../js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script>
	$(function (){
		document.getElementById("date").value=<fmt:formatDate value="${p.partsprodate}" pattern="yyyy-MM-dd"/>
	})
</script>
</head>

<body class="content-pages-body">
<form id="coursesCreat" name="coursesCreat" action="/parts/partsUpdate.do" method="post">
	<input name="partsid" value="${parts.partsid}" type="hidden">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt; 修改配件</h2>
  </div>

		  <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
			  <tr>
				<td width="10%" align="right" class="title"><span class="required">*</span>配件名称：</td>
				<td width="15%" align="left"><input name="partsname" type="text" value="${parts.partsname}" style="height:20px"></td>
				<td width="10%" align="right" class="title"><span class="required">*</span>规格型号：</td>
				<td width="15%" align="left"><input name="partsmodel" type="text" value="${parts.partsmodel}" style="height:20px"></td>
			  </tr>
			  <tr>
				<td width="10%" align="right" class="title"><span class="required">*</span>生产厂家：</td>
				<td width="15%" align="left"><input name="partsloc" type="text" value="${parts.partsloc}" style="height:20px"></td>
				<td width="10%" align="right" class="title"><span class="required">*</span>生产日期：</td>
				<td width="15%" align="left"><input name="partsprodate" type="text" id="date" value="<fmt:formatDate value="${parts.partsprodate}" pattern="yyyy-MM-dd"/>" style="height:20px"></td>
			  </tr>			  
			  <tr>	
				<td width="10%" align="right" class="title"><span class="required">*</span>备注：</td>
				<td width="15%" align="left" colspan="3"><textarea  name="partsremark" style="width:720px;height:100px">${parts.partsremark}</textarea></td>
			  </tr>
		 </table>

	 </div>
    <div id="formPageButton">
    	<ul>
			<li><input value="保存" type="submit" class="btnShort"></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
</form>
</div>

</body>
</html>
