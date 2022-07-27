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
	  <h2>&gt;&gt; 订单管理</h2>
	</div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">订单编码：</th>
            <td><input name="textfield" type="text" class="inputTextNormal" id="textfield1" /></td>
            <th align="right">订单保存时间：</th>
            <td><input name="textfield2" type="text" class="inputTextNormal" id="textfield2" /></td>
            <td align="right">订单状态：</td>
            <td><input name="datepiker2" type="text" class="inputTextNormal" id="datepiker3" /></td>

            <th align="right">
				<input type="button" class="btnShort" value="检索" />
			</th>
        </tr>
        <tr>

          </tr>
       	</form>
    </table>


    <!--//commonTableSearch-->
    
	<input type="button" class="btnNormal" value="创建订单" onclick="location.href='${pageContext.request.contextPath }/page/ordersys/order/orderadd.jsp'"/>	

	<br>

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>订单编码</th>
            <th>订单保存时间</th>
            <th>订单状态</th>
            <th class="editColDefault">操作</th>
        </tr>
        <tr>
            <td align="center">1</td>
            <td align="center">DD2011103001</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="RED">已通过</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">2</td>
            <td align="center">DD2011103002</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="RED">已通过</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">3</td>
            <td align="center">DD2011103003</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="BLUE">待审核</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">4</td>
            <td align="center">DD2011103004</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="BLUE">待审核</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>

        <tr>
            <td align="center">5</td>
            <td align="center">DD2011103005</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="BLUE">待审核</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">6</td>
            <td align="center">DD2011103006</td>
            <td align="center">2011-10-30</td>
			<td align="center"><font color="BLUE">待审核</font></td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">7</td>
            <td align="center">DD2011103007</td>
            <td align="center">2011-10-30</td>
			<td align="center">新订单</td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">8</td>
            <td align="center">DD2011103008</td>
            <td align="center">2011-10-30</td>
			<td align="center">新订单</td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">9</td>
            <td align="center">DD2011103009</td>
            <td align="center">2011-10-30</td>
			<td align="center">新订单</td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
        </tr>
        <tr>
            <td align="center">10</td>
            <td align="center">DD2011103010</td>
            <td align="center">2011-10-30</td>
			<td align="center">新订单</td>
            <td align="center">
            	<a href="system-order-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="system-order-create-edit.html" class="btnIconEdit" title="更新"></a>
                <a href="#" class="btnIconDel" title="删除"></a>
            </td>
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
