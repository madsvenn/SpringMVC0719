<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>物资采购与产品整合管理系统</title>
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src='<c:url value="/js/jquery-1.4.2.min.js"></c:url>'></script>
<script src="/js/json.js"></script>
<script type="text/javascript" language="javascript">

	$(function(){
		$("#btn_openParts").click(function(){
			//加载选择配件
			$("#nestedDiv").load("/order/selectParts.do");
			$("#selectedPartsDiv").fadeIn();
		});
		
		//关闭窗口
		$("#close_selectedParts").click(function(){
			$("#apply_selectedParts").click();
			$("#selectedPartsDiv").fadeOut();
		});
		
		$("#btn_search").click(function(){
			$("#nestedDiv").load("/order/selectParts.do",{partsName:$("#partsName").val()});
		});
		
		
		$("#btn_save").click(function(){
			// $("#coursesCreat").submit();
			var json = formatArray($("#coursesCreat").serializeArray(),'object')
			// alert(JSON.stringify(json)) //这种方法只能转成json格式的string字符串
			$.post("/order/save.do", json, function(a){
				if(a.code==200){
					window.open("/order/searcher.do","_self")
				}else if(a.code==500){
					alert(a.message);
				}
			},"json")
		})

		$("#btn_submit").click(function(){
			$("#orderflag").val("2");
			$("#btn_save").click();
		})
		
		$("#apply_selectedParts").click(function(){
			var parts=$(".selectiveParts:checked");
			
			parts.each(function(){			
				var data=$(this).val().split(",");
				
				var p=$(".txt_partsid[value='"+data[0]+"']");
				if(p.size()==0){
					var tr=$("<tr>");
					tr.append($("<input type='hidden' name='partsid' class='txt_partsid'/>").val(data[0]));
					tr.append($("<td>").text(data[1]));
					tr.append($("<td>").append("<input type='text' name='orderpartscount' class='orderParts'/>"));
					tr.append($("<td>").text(data[2]));
					var btn_delete=$("<input type='button' value='删除'/>");
					btn_delete.click(function(){
						alert($(this).parent().parent().remove());
					});
					tr.append($("<td>").append(btn_delete));
					$("#attachmentList").append(tr);
				}				

			});
			$("#selectedPartsDiv").fadeOut();
		});
		
	});

</script>
</head>
<% Date date = new Date();

%>
<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt; 订单信息修改</h2>
  </div>
        <form id="coursesCreat" name="coursesCreat" action="makeOrder.do" method="post">
		  <table border="0" cellspacing="1" cellpadding="0" class="commonTable" >
			  <tr>
				<td width="10%" align="right" class="title"><span class="required">*</span>订单编码：</td>
				<td width="15%" align="left"><input type="text" name="ordercode" style="width:150px"></td>
				<td width="10%" align="right" class="title"><span class="required">*</span>订单保存日期：</td>
				<td width="15%" align="left"><fmt:formatDate value="<%=date%>" pattern="yyyy-MM-dd"/></td>
				<td width="10%" align="right" class="title"><span class="required">*</span>订单状态：</td>
				<td width="15%" align="left">
					<select id="orderflag" name="orderflag">
						<option value="1" selected>未提交</option>
						<option value="2">待审核</option>
					</select>
				</td>
			  </tr>

		 </table>
	    <div align="left" style="margin-top:15px;margin-bottom:5px">
	    	<a href="javascript:void(0);" id="btn_openParts" title="选择原料" class="btnShort">选择配件</a>
	    </div>
		<table width="90%" border="0" cellpadding="0" cellspacing="1" id="attachmentList" class="commonTable marginTopM">
		  <tr>
	          <th>配件名称</th>
	          <th>进货数量</th>
			  <th>库存数量</th>
	          <th class="editColXS">操作</th>
	      </tr>
		</table>
		</form>
	 </div>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
			<li><a href="javascript:void(0)" title="保存" class="btnShort" id="btn_save">保存</a></li>
			<li><a href="javascript:void(0)" title="提交" class="btnShort" id="btn_submit">提交</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
    
<!-- 内置开始 -->
<div id="selectedPartsDiv" style="display:none;width:800px;height: 400px;background-color: silver;position: absolute;top: 100px;left: 100px">
	

<div class="content-pages-wrap">
	<div class="commonTitle">
	  <h2>&gt;&gt; 订单管理&nbsp;&gt;&gt;&nbsp;配件选择列表</h2>
	</div>
	<!-- <form id="form-search" name="form-search"  method="post"> -->
	    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
	        <tr>
	            <th align="right">配件名称：</th>
	            <td ><input name="partsName" type="text" class="inputTextNormal" id="partsName" value="${params.partsName }"/></td>
				<td width="150" align="left" >
					<button id="btn_search">检索</button>
				</td>
				<td align="right">
					
				</td>
	        </tr>
    	</table>
    <!-- </form> -->
    <!--//commonTableSearch-->
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="javascript:void(0);" title="确定" class="btnLong" id="apply_selectedParts">确定</a></li>
        	<li><a href="javascript:void(0);" title="关闭" id="close_selectedParts" class="btnLong">关闭</a></li>
        </ul>
    </div>
    <div id="nestedDiv">

    </div>

</div>

</div>
<!--//content pages wrap-->
</body>
</html>
