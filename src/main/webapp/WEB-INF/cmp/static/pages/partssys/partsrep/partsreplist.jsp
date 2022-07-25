<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>物资采购与产品整合管理系统</title>
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath }/js/jquery-1.4.2.min.js" type="text/javascript"></script>

</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
	<div class="commonTitle">
	  <h2>&gt;&gt; 配件管理</h2>
	</div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="/parts/partsRepertory.do" method="post">
            <input name="pageNum" id="pageNum" value="1" type="hidden">
        <tr>
            <th align="right">配件编码：</th>
            <td><input name="textfield1" type="text" class="inputTextNormal" value="${textfield1}" id="textfield1" /></td>
             <th align="right">配件名称：</th>
            <td><input name="textfield2" type="text" class="inputTextNormal" value="${textfield2}" id="textfield2" /></td>
            <th align="right">
				<input type="submit" class="btnShort" value="检索" />
			</th>
        </tr>
       	</form>
    </table>


    <!--//commonTableSearch-->
    
	<input type="button" class="btnNormal" value="配件出入库" onclick="location.href='${pageContext.request.contextPath }/cmp/static/pages/partssys/partsrep/partsrep'"/>

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>配件编码</th>
            <th>配件名称</th>
            <th>库存数量</th>
        </tr>

        <c:forEach items="${pageInfo.list}" var="p" varStatus="status">
            <tr>
                <td align="center">${status.count+(pageInfo.pageNum-1)*pageInfo.pageSize}</td>
                <td align="center">${p.partsid}</td>
                <td align="center">${p.partsname}</td>
                <td align="center">${p.partsreqcount}</td>
            </tr>
        </c:forEach>

        
        
  </table>
    <!--//commonTable-->

    <%@ include file="/WEB-INF/cmp/page.jsp"%>
</div>
<!--//content pages wrap-->
</body>
</html>