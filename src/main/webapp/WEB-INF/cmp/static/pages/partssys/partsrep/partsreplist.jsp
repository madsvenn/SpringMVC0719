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
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">配件编码：</th>
            <td><input name="textfield2" type="text" class="inputTextNormal" id="textfield2" /></td>
             <th align="right">配件名称：</th>
            <td><input name="textfield2" type="text" class="inputTextNormal" id="textfield2" /></td>
            <th align="right">
				<input type="button" class="btnShort" value="检索" />
			</th>
        </tr>
       	</form>
    </table>


    <!--//commonTableSearch-->
    
	<input type="button" class="btnNormal" value="配件出入库" onclick="location.href='${pageContext.request.contextPath }/page/partssys/partsrep/partsrep.jsp'"/>	

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>配件编码</th>
            <th>配件名称</th>
            <th>库存数量</th>
        </tr>
        <tr>
            <td align="center">1</td>
            <td align="center">100</td>
            <td align="center">滤清器</td>
			<td align="center">30</td>
        </tr>
        <tr>
            <td align="center">2</td>
            <td align="center">101</td>
            <td align="center">滤清器</td>
			<td align="center">330</td>
        </tr>
        <tr>
            <td align="center">3</td>
            <td align="center">102</td>
            <td align="center">滤清器</td>
			<td align="center">67</td>
        </tr>
       	<tr>
            <td align="center">4</td>
            <td align="center">103</td>
            <td align="center">滤清器</td>
			<td align="center">70</td>
        </tr>
        <tr>
            <td align="center">5</td>
            <td align="center">104</td>
            <td align="center">滤清器</td>
			<td align="center">98</td>
        </tr>
        
        
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