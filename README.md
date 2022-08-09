#Tosan Docker Challenges

This program is built for docker lesson's challenges

***
<p><b>Run Application</b></p>
You've to use below command to run application
<p></p>
<p><i>mvnw package && java -jar target/TosanDockerChallenges.jar --port={YourPortNumber(Default is 8080)}</i></p>

***
<p><b>Run Application with docker</b></p>
Use below command to create docker image
<p><i>docker build -t {YourDockerImageNameWithoutUpperCaseChar} .</i></p>
<p></p>
Use below command to run docker image
<p><i>docker run -p {YourLocalPor}:8080 -t {YourDockerImageName}</i></p>

***
<p><b>Example of Run Application</b></p>
<p><i>mvnw package && java -jar target/TosanDockerChallenges.jar --port=9000</i></p>


***
<p><b>Example of Run Application with docker</b></p>
<p><i>docker build -t tosan-docker-challenges .</i></p>
<p><i>docker run -p 9000:8080 -t tosan-docker-challenge</i></p>