<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>物资采购与产品整合管理系统</title>
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" media="all" />
	<script src="${pageContext.request.contextPath }/js/jquery-1.4.2.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function () {

			$.getJSON("/code/gainParts.do",{code:$(this).val()},function (a){
				var id = 0;
				for(var i =0;i<a.length;i++){
					var option1 = $("<option>");
					option1.append(a[i].partsname);
					option1.val(a[i].partsid);
					$("#partsid").append(option1);
					$("#billcount").val(a[i].partsreqcount);
				}
			})

			$("#partsid").change(function (){
				$.getJSON("/code/gainParts.do",{code:$(this).val()},function (a){
					var id = 0;
					for(var i =0;i<a.length;i++){
						if($("#partsid").val()==a[i].partsid){
							$("#billcount").val(a[i].partsreqcount);
							$("#countFlag").val(a[i].partsreqcount);
						}
					}
				})
			})

			$("#billflag").change(function (){
				$.getJSON("/code/getCode.do",{code:$(this).val()},function (a){
					// alert(a[0].code)
					$("#billtype").empty();
					var id = 0;
					for(var i=0;i<a.length;i++){
						var option1 = $("<option>");
						option1.append(a[i].name);
						option1.val(a[i].code)
						$("#billtype").append(option1);

					}
				})
			})

		})
	</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt; 配件出入库</h2>
  </div>
        <form id="coursesCreat" name="coursesCreat" action="/bill/insert.do" method="post">
<%--			作为判断条件--%>
			<input name="countFlag" id="countFlag" value="" type="hidden">
		  <table border="0" cellspacing="1" cellpadding="0" height="70" class="commonTable">
			  <tr>
				<td width="10%" align="right" class="title"><span class="required">*</span>类型：</td>
				<td width="15%" align="left">
					<select id="billflag" name="billflag" style="width:150px;">
						<option value="">请选择</option>
						<option value="out">出</option>
						<option value="in" >入</option>
					</select>
				</td>
				<td width="10%" align="right" class="title"><span class="required">*</span>出/入库类型：</td>
				<td width="15%" align="left">
					<select id="billtype" name="billtype" style="width:150px;">
						<option>请选择</option>
					</select>
				</td>
				<td width="10%" align="right" class="title"><span class="required">*</span>出/入库日期：</td>
				<td width="15%" align="left"><input name="billtime" id="billtime" value="2011-10-30"></td>
				<td width="10%" align="right" class="title"><span class="required">*</span>操作员：</td>
				<td width="15%" align="left"><input name="billuser" id="billuser" value="1"></td>
			  </tr>
			  <tr>
				<td width="10%" align="right" class="title"><span class="required">*</span>配件：</td>
				<td width="15%" align="left">
					<select id="partsid" name="partsid" style="width:150px;">
						<option value="">请选择</option>
					</select>
				</td>
				<td width="10%" align="right" class="title"><span class="required">*</span>出/入库数量：</td>
				<td width="15%" align="left">
					<input id="billcount" name="billcount" type="text" value="" style="width:150px;height:20px">
				</td>
				<td width="10%" align="right" class="title"><span class="required">*</span>说明：</td>
				<td width="15%" align="left" colspan="3"><input type="text" style="width:470px;height:20px"></td>
			  </tr>
		 </table>
		</form>
	 </div>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
			<li><a href="javascript:void(0)" onclick="submitBill()" title="保存" class="btnShort">保存</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
<script type="text/javascript">
	function submitBill(){
		if($("#billflag").val()=="out"){
			if(Number($("#billcount").val()) > Number($("#countFlag").val())){
				alert("出库失败，库存不足")
				alert($("#billcount").val()+'%'+$("#countFlag").val())
			}
			$("#coursesCreat").submit();
		}else{
			$("#coursesCreat").submit();
		}
	}
</script>
    <!--//commonToolBar-->
</div>
<!--//content pages wrap-->
</body>
</html>
