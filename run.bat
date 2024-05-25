
set projectLocation=‪C:\Users\admin\eclipse-workspace\frameworl 
cd %projectLocation% 
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java org.testng.TestNG %projectLocation%\testng.xml