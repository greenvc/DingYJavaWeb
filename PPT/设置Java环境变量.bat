@echo off   
title JDK环境变量设置   
echo 作者：丁丁编程技术 http://www.kmdin.net
echo 本批处理执行前，请做如下设置：
echo 1.请确保当前没有JAVA_HOME,CLASSPATH环境变量！！！！
echo 2. 如果您的JDK没有安装在C:\Program Files\Java\jdk1.8.0_65，请修改目录后再运行

wmic ENVIRONMENT create name="JAVA_HOME",username="<system>",VariableValue="C:\Program Files\Java\jdk1.8.0_65"  
wmic ENVIRONMENT create name="CLASSPATH",username="<system>",VariableValue=".;%%JAVA_HOME%%\lib;"   
wmic ENVIRONMENT where "name='PATH' and username='<system>'" set VariableValue="%path%;%%JAVA_HOME%%\bin;%%JAVA_HOME%%\jre\bin;"
echo 设置结束

pause