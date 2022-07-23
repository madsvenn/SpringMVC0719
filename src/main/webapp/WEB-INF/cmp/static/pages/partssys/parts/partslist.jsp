<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
       	<form id="form-search" name="form-search" action="/parts/partsSearch.do" method="post">
        <tr>
            <th align="right">配件名称：</th>
            <td><input name="textfield2" type="text" class="inputTextNormal" id="textfield2" value="${textfield2}"/></td>

            <th align="right">
				<input type="submit" class="btnShort" value="检索" />
			</th>
        </tr>
       	</form>
    </table>


    <!--//commonTableSearch-->
    
	<input type="button" class="btnNormal" value="新增配件" onclick="location.href='/cmp/static/pages/partssys/parts/partsadd'"/>

	<br>

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>配件编码</th>
            <th>配件名称</th>
            <th>生产厂家</th>
            <th>生产日期</th>
            <th>备注</th>
            <th class="editColDefault">操作</th>
        </tr>
        <c:forEach var="p" items="${list}" varStatus="status">
        <tr>
            <td align="center">${status.count}</td>
            <td align="center">${p.partsid}</td>
            <td align="center">${p.partsname}</td>
            <td align="center">${p.partsloc}</td>
            <td align="center"><fmt:formatDate value="${p.partsprodate}" pattern="yyyy-MM-dd"/></td>
			<td align="center">${p.partsremark}</td>
            <td align="center">
            	
            	<a href="/parts/partsEdit.do?partsid=${p.partsid}" class="btnIconEdit" title="更新"></a>
                <a href="/parts/partsDelete.do?partsid=${p.partsid}" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        </c:forEach>

        
  </table>
    <!--//commonTable-->
    <div id="pagelist">
    	<ul class="clearfix">
        	<li><a href="#">首页</a></li>
            <li ><a href="#">上页</a></li>
            <li><a href="#">下页</a></li>
            <li class="current"><input type="text" value="1" style="text-align:right" size="1"></li>
            <li><a href="#">跳转</a></li>
            <li><a href="#">尾页</a></li>
            <li class="pageinfo">第1页</li>
            <li class="pageinfo">共8页</li>
        </ul>
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>