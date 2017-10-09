<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <base target="_blank" />
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Java Web应用程序示例</title>
   <link rel="stylesheet" type="text/css" href="CSS/Main.css" />
   <style type="text/css">
       * {
           margin: 0px;
           padding: 0px;
       }
       
       div,
       ul,
       li {
           list-style-type: none;
       }
       
       a {
           text-decoration: none;
           color: #00F;
       }
       
       a:hover {
           text-decoration: underline;
           color: #FF0000;
       }
       /* 列表显示数据 */
       
       .TableList {
           width: 100%;
           margin: 5px;
           border-collapse: collapse;
       }
       
       .TableList .Title td {
           height: 40px;
           background: #f0f0f0;
           font-size: 14px;
           font-weight: bolder;
           text-align: center;
           vertical-align: middle;
       }
       
       .TableList td {
           border: #ccc 1px solid;
           height: 30px;
           vertical-align: middle;
           padding-left: 5px;
           background: #FFF;
           font-size: 12px;
       }
       
       .TableList td {
           text-align: center;
       }
       
       .TableList td:last-child:hover {
           background-color: #EEE;
           text-decoration: none;
       }
   </style>
</head>
</head>

<body>
    <div style="width:1000px; margin:auto;">
       <div style="height:40px; text-align:center; padding-top:15px;">
           <h2>Java Web应用程序示例</h2>
       </div>
       <table class="TableList">
           <tr class="Title">
               <td style="width:100px;">模块</td>
               <td>说明</td>
               <td style="width:270px;">标题</td>
            </tr>
            <tr>
                <td rowspan="6">Java基础语法</td>
                <td rowspan="6">掌握JSP使用</td>
                <td><a href="Basic/First.jsp">第一个JSP程序</a></td>
            </tr>
            <tr>
                <td><a href="Basic/Grammar.jsp">JSP基础语法</a></td>
            </tr>
            <tr>
                <td><a href="Basic/OutputArray.jsp">数组</a></td>
            </tr>
            <tr>
                <td><a href="Basic/Date.jsp">获取日期(引用系统资源包)</a></td>
            </tr>
            <tr>
                <td><a href="Basic/JspEvent.jsp">事件与JS的执行顺序</a></td>
            </tr>
            <tr>
                <td><a href="Basic/GetData.jsp">获取数据</a></td>
            </tr>
        </table>
    </div>
</body>

</html>