@echo off   
title JDK������������   
echo ���ߣ�������̼��� http://www.kmdin.net
echo ��������ִ��ǰ�������������ã�
echo 1.��ȷ����ǰû��JAVA_HOME,CLASSPATH����������������
echo 2. �������JDKû�а�װ��C:\Program Files\Java\jdk1.8.0_65�����޸�Ŀ¼��������

wmic ENVIRONMENT create name="JAVA_HOME",username="<system>",VariableValue="C:\Program Files\Java\jdk1.8.0_65"  
wmic ENVIRONMENT create name="CLASSPATH",username="<system>",VariableValue=".;%%JAVA_HOME%%\lib;"   
wmic ENVIRONMENT where "name='PATH' and username='<system>'" set VariableValue="%path%;%%JAVA_HOME%%\bin;%%JAVA_HOME%%\jre\bin;"
echo ���ý���

pause