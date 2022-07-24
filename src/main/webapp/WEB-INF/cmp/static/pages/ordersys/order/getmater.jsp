<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="gbk" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>物资采购与产品整合管理系统</title>
<link href="/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="/js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>
<script type="text/javascript">

var obj = window.dialogArguments;

function loadForm()
{
	document.forms[1].CZType.value = obj[0];
}


function checkAll(){
	var form = document.forms[1];
	var checkObj = form.ids;
	var ids = form.id;
	for(var i=0;i<ids.length;i++){
		ids[i].checked = checkObj.checked;
	}
}

function catchValues(){
	var form = document.forms[1];
	var ids = form.id;
	var flag = false;
	var ary = [];
	for(var i=0;i<ids.length;i++){
		if(ids[i].checked){
			flag = true;
			ary.push(ids[i].value);
		}
	}

	if(!flag){
		alert("请选择原料！");
		return ;
	}
	window.returnValue = ary;
	window.close();
}

</script>
<body class="content-pages-body">
<div class="content-pages-wrap">
	<div class="commonTitle">
	  <h2>&gt;&gt; 订单管理&nbsp;&gt;&gt;&nbsp;配件选择列表</h2>
	</div>
	<form id="form-search" name="form-search" action="" method="post">
	    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
	        <tr>
	            <th align="right">配件名称：</th>
	            <td ><input name="textfield" type="text" class="inputTextNormal" id="textfield" /></td>
				<td width="150" align="" >
					<button>检索</button>
				</td>
				<td></td>
	        </tr>
    	</table>
    </form>
    <!--//commonTableSearch-->
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="javascript:catchValues();" title="确定" class="btnLong">确定</a></li>
        	<li><a href="javascript:window.close();" title="关闭" class="btnLong">关闭</a></li>
        </ul>
    </div>
    <form action="" name="listForm" method="post">
	    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
	        <tr>
	            <th>
	            	<input type="checkbox" name="ids" onclick="checkAll();">
	            </th>
	            <th>配件名称</th>
	            <th>配件库存</th>
	        </tr>

		        <tr>
		            <td align="center" style="width:5%">
		            	<input type="checkbox" checked disabled="disabled" name="id" value="1,滤清器,50">
		            </td>
		            <td align="center">滤清器</td>
		            <td align="center">50</td>
		        </tr>
		        <tr>
		            <td align="center" style="width:5%">
						<input type="checkbox" checked disabled="disabled" name="id" value="2,连杆总成,100">
		            </td>
		            <td align="center">连杆总成</td>
		            <td align="center">100</td>
		        </tr>
		        <tr>
		            <td align="center" style="width:5%">
						<input type="checkbox" checked disabled="disabled" name="id" value="3,轴瓦及连杆瓦,25">
		            </td>
		            <td align="center">轴瓦及连杆瓦</td>
		            <td align="center">25</td>
		        </tr>
		        <tr>
		            <td align="center" style="width:5%">
		            	<input type="checkbox" name="id" value="4,气门及部件,40">
		            </td>
		            <td align="center">气门及部件</td>
		            <td align="center">40</td>
		        </tr>
		        <tr>
		            <td align="center" style="width:5%">
						<input type="checkbox" name="id" value="5,三元催化器,30">
		            </td>
		            <td align="center">三元催化器</td>
		            <td align="center">30</td>
		        </tr>
		        <tr>
		            <td align="center" style="width:5%">
		            	<input type="checkbox" name="id" value="6,燃油喷射装置,24">
		            </td>
		            <td align="center">燃油喷射装置</td>
		            <td align="center">24</td>
		        </tr>
	  </table>
  </form>
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
