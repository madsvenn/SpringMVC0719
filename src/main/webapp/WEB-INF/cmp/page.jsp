<%--
  Created by IntelliJ IDEA.
  User: Hibiki
  Date: 2022-07-25
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="pagelist">
    <ul class="clearfix">
        <li><a href="javascript:void(0)" onclick="getNum(${pageInfo.firstPage})">首页</a></li>
        <li ><c:choose>
            <c:when test="${pageInfo.prePage<=0}"><a href="javascript:void(0)")>上页</a></c:when>
            <c:otherwise><a href="javascript:void(0)" onclick="getNum(${pageInfo.prePage})">上页</a></c:otherwise>
        </c:choose></li>
        <li><c:choose>
            <c:when test="${pageInfo.isLastPage}"><a href="javascript:void(0)">下页</a></c:when>
            <c:otherwise><a href="javascript:void(0)" onclick="getNum(${pageInfo.nextPage})">下页</a></c:otherwise>
        </c:choose></li>
        <li class="current"><input type="pageNum" id="pageNum_foot" value="${pageInfo.pageNum}" style="text-align:right" size="1"></li>
        <li><a href="javascript:void(0)" onclick="pageByNum()">跳转</a></li>
        <li><a href="javascript:void(0)" onclick="getNum(${pageInfo.lastPage})">尾页</a></li>
        <li class="" >第${pageInfo.pageNum}页</li>
        <li class="" >共${pageInfo.pages}页</li>
    </ul>
    <script type="text/javascript">
        function getNum(num){
            $("#pageNum").val(num);
            $("#form-search").submit();
        }
        function pageByNum(){
            if($("#pageNum_foot").val()>0 && $("#pageNum_foot").val()<=${pageInfo.lastPage}) {
                $("#pageNum").val($("#pageNum_foot").val())
                $("#form-search").submit();
            }
            else {
                alert("超过范围了")
            }
        }
    </script>
</div>
</body>
</html>
