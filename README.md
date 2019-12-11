# Integration-test
1. Clone

git clone git clone git@github.com:abhi1231/Integration-test.git

2. Execute the following command to execute 
 mvn clean install -Dgroups=sanity
 
3. If you are looking to execute suite file then uncomment the following code 

    <suiteXmlFiles>
		<suiteXmlFile>${suite}</suiteXmlFile>
	</suiteXmlFiles>

  comment the below line
  //<groups>${groups}</groups>
  
  Execute following command 
  
  mvn clean install -Dsuite=suite.xml
