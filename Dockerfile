FROM maven AS build

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests

FROM openjdk

COPY --from=build /app/target/spring_demo_base-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "spring_demo_base-0.0.1-SNAPSHOT.jar" ]