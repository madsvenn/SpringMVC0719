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
<script type="text/javascript">
    $(function (){

        $.getJSON("/code/getCode.do",{code:'io'},function (a){

            for(var i =0;i<a.length;i++){
                if(a[i].name==='${codename}'){

                    var option1 = $("<option selected>");
                    option1.append(a[i].name);
                    option1.val(a[i].name);
                    $("#codename").append(option1);


                }else {
                    var option1 = $("<option>");
                    option1.append(a[i].name);
                    option1.val(a[i].name);
                    $("#codename").append(option1);
                }
            }

            if($("#codename").val() != ""){
                $.getJSON("/code/getCodeByName.do",{codename:'${codename}'},function (a){
                    // alert(a[0].code)
                    $("#typename").empty()
                    var id = 0;
                    for(var i=0;i<a.length;i++){

                        if(a[i].name==='${typename}'){
                            var option1 = $("<option selected>");
                            option1.append(a[i].name);
                            option1.val(a[i].name)
                            $("#typename").append(option1);
                        }else {
                            var option1 = $("<option>");
                            option1.append(a[i].name);
                            option1.val(a[i].name)
                            $("#typename").append(option1);
                        }
                    }
                    if('${typename}'===''){

                        var option1 = $("<option selected>");
                        option1.append("请选择");
                        option1.val("");
                        $("#typename").append(option1);
                    }
                })
            }

        })


        $("#codename").change(function (){
            if($("#codename").val() != ""){
                $.getJSON("/code/getCodeByName.do",{codename:$(this).val()},function (a){
                    // alert(a[0].code)
                    $("#typename").empty();
                    var id = 0;
                    for(var i=0;i<a.length;i++){

                        var option1 = $("<option>");
                        option1.append(a[i].name);
                        option1.val(a[i].name)
                        $("#typename").append(option1);

                    }
                    var option1 = $("<option selected>");
                    option1.append("请选择");
                    option1.val("");
                    $("#typename").append(option1);
                })
            }else{
                $("#typename").empty();
                var option1 = $("<option>");
                option1.append("请选择");
                option1.val("");
                $("#typename").append(option1);
            }
        })
    })
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
	<div class="commonTitle">
	  <h2>&gt;&gt; 配件库存流水账查询</h2>
	</div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="/bill/billList.do" method="post">
            <input type="hidden" name="pageNum" id="pageNum" value="1">
        <tr>
            <th align="right">配件名称：</th>
            <td><input name="partsname" type="text" class="inputTextNormal" id="partsname" value="${partsname}"/></td>
            <th align="right">出/入库：</th>
            <td>
            	<select name="codename" id="codename" style="width:150px;">
                      <option value="">请选择</option>
				</select>
			</td>
            <th align="right">出入库类型：</th>
            <td>
            	<select name="typename" id="typename" style="width:150px;">
                    <option value="" selected>请选择</option>
				</select>
            </td>
            <th align="right">出入库日期：</th>
            <td>
            	<input name="billtime" type="text" class="inputTextNormal" id="billtime" value="${billtime}"/>
            </td>
            <th align="right">
				<input type="submit" class="btnShort" value="检索" />
			</th>
        </tr>
       	</form>
    </table>
	<br>

    <!--//commonTableSearch-->

    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>出/入库</th>
            <th>出入库类别</th>
            <th>配件名称</th>
            <th>数量</th>
            <th>时间</th>
            <th>操作人</th>
        </tr>
        <c:forEach var="b" items="${pageInfo.list}" varStatus="status">
            <tr>
                <td align="center">${status.count+(pageInfo.pageNum-1)*pageInfo.pageSize}</td>
                <td align="center">${b.codename}</td>
                <td align="center">${b.typename}</td>
                <td align="center">${b.partsname}</td>
                <td align="center">${b.billcount}</td>
                <td align="center"><fmt:formatDate value="${b.billtime}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td align="center">${b.loginname}</td>
            </tr>
        </c:forEach>

        
  </table>
    <!--//commonTable-->
    <%@ include file="/WEB-INF/cmp/page.jsp"%>
</div>
<!--//content pages wrap-->
</body>
</html>