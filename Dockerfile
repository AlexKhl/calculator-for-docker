FROM openjdk:11-jdk
EXPOSE 8099
ARG JAR_FILE=target/dependency
COPY ${JAR_FILE}/BOOT-INF/lib /app/lib/
COPY ${JAR_FILE}/META-INF /app/META-INF
COPY ${JAR_FILE}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-jar","/calculator.jar"]
ENTRYPOINT ["java","-cp","app:app/lib/*","calc.calculator.CalculatorApplication"]