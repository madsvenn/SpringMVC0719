<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="gbk" />
    <meta http-equiv="X-UA-Compatible" content="IE=7" />
    <title>物资采购与产品整合管理系统</title>
    <link href="/css/main.css" rel="stylesheet" type="text/css" media="all" />
    <script src="/js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt; 订单管理</h2>
    </div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
        <form id="form-search" name="form-search" action="/order/searcher.do" method="post">
            <input name="pageNum" value="1" id="pageNum" type="hidden">
            <tr>
                <th align="right">订单编码：</th>
                <td><input name="textfield" type="text" value="${textfield}" class="inputTextNormal" id="textfield1" /></td>
                <th align="right">订单保存时间：</th>
                <td><input name="textfield2" type="text" value="<fmt:formatDate value="${textfield2}" pattern="yyyy-MM-dd"/>" class="inputTextNormal" id="textfield2" /></td>
                <td align="right">订单状态：</td>
                <td><input name="datepiker2" type="text" value="${datepiker2}" class="inputTextNormal" id="datepiker3" /></td>

                <th align="right">
                    <input type="submit" class="btnShort" value="检索" />
                </th>
            </tr>
            <tr>

            </tr>
        </form>
    </table>


    <!--//commonTableSearch-->

    <input type="button" class="btnNormal" value="创建订单" onclick="location.href='/cmp/static/pages/ordersys/order/orderadd'"/>

    <br>

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>订单编码</th>
            <th>订单保存时间</th>
            <th>订单状态</th>
            <th class="editColDefault">操作</th>
        </tr>
        <c:forEach var="o" items="${pageInfo.list}" varStatus="status">
            <tr>
                <td align="center">${o.orderid}</td>
                <td align="center">${o.ordercode}</td>
                <td align="center"><fmt:formatDate value="${o.orderdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td align="center"><font color="RED">${o.orderflag}</font></td>
                <td align="center">
                    <a href="order-view.html" class="btnIconView" title="查看详情"></a>
                    <a href="/order/edit.do?orderid=${o.orderid}" class="btnIconEdit" title="更新"></a>
                    <a href="/order/delete.do?orderid=${o.orderid}&pageNum=${pageInfo.pageNum}" class="btnIconDel" title="删除"></a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <!--//commonTable-->
    <%@include file="/WEB-INF/cmp/page.jsp"%>
</div>
<!--//content pages wrap-->
</body>
</html>
