<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>


    <form action="" name="listForm" method="post">
	    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
	<!--         <tr>
	            <th>
	            	<input type="checkbox" name="ids" onclick="checkAll();">
	            </th>
	            <th>配件名称</th>
	            <th>配件库存</th>
	        </tr> -->

	<!-- 	        <tr>
		            <td align="center" style="width:5%">
		            	<input type="checkbox" checked  name="id" class="selectiveParts" value="1,滤清器,50">
		            </td>
		            <td align="center">滤清器</td>
		            <td align="center">50</td>
		        </tr> -->
		        <c:forEach items="${pageInfo.list }" var="p">
		              <tr>
		            <td align="center" style="width:5%">
		            	<input type="checkbox"   name="id" class="selectiveParts" value="${p.PartsId},${p.partsName},${p.PartsReqCount}">
		            </td>
		            <td align="center">${p.partsName}</td>
		            <td align="center">${p.PartsReqCount}</td>
		        </tr>
		        </c:forEach>

	  </table>
  </form>
    <!--//commonTable-->
<div id="pagelist">


	<form action='<c:url value="${action}"></c:url>' method="post"
		id="subpage_Form">
		<input type="hidden" name="pageNum" value="1" id="hidden_sub_pageNum" />
		<c:forEach items="${params }" var="p">
			<input type="hidden" name="${p.key }" value="${p.value}" />
		</c:forEach>
	</form>

	<script type="text/javascript">
		$(function() {
			$(".subPageButton").click(function() {
				if($(this).attr("value")<1){
					alert("已经是第一页了");
					return;
				}else if($(this).attr("value")>"${pageInfo.pages}"){
					alert("已经是最后一页了");
					return;
				}
				$("#hidden_sub_pageNum").val($(this).attr("value"));
				$("#nestedDiv").load("selectParts.do",{pageNum:$(this).attr("value"),partsName:'${params.partsName}'});
			});
			
			$("#link_gotoSomePage").click(function(){
				var pageNum=$("#text_gotoSomePage").val();
				if(pageNum<1 || $("#text_gotoSomePage").val()>"${pageInfo.pages}"){
					alert("无效页号");
					return;
				}
				$("#hidden_sub_pageNum").val(pageNum);
				$("#subpage_Form").submit();
				
			});
		})
	</script>
	<ul class="clearfix">
		<li><a href="javascript:void(0)" class="subPageButton" value="1">首页</a></li>
		<li><a href="javascript:void(0)" class="subPageButton"
			value="${pageInfo.prePage}">上页</a></li>
		<li><a href="javascript:void(0)" class="subPageButton"
			value="${pageInfo.pageNum+1}">下页</a></li>
		<li><a href="javascript:void(0)" class="subPageButton"
			value="${pageInfo.pages}">尾页</a></li>
		<li class="current"><input type="text" id="text_gotoSomePage"
			value="${pageInfo.pageNum}" style="text-align: right" size="1"></li>
		<li><a href="#" id="link_gotoSomePage">跳转</a></li>
		<li class="pageinfo">第${pageInfo.pageNum}页</li>
		<li class="pageinfo">共${pageInfo.pages}页</li>
	</ul>

</div>
