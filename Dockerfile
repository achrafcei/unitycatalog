
# FROM openjdk:11

# # Set environment variables
# # ENV SBT_VERSION 1.5.5

# # Install sbt
# # RUN apt-get update && \
# #     apt-get install -y curl && \
# #     curl -L -o sbt.deb https://github.com/sbt/sbt/releases/download/v$SBT_VERSION/sbt-$SBT_VERSION.deb && \
# #     dpkg -i sbt.deb && \
# #     rm sbt.deb && \
# #     apt-get clean && \
# #     sbt sbtVersion

# # Install sbt
# RUN apt-get update && \
#     apt-get install -y curl gnupg && \
#     echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | tee /etc/apt/sources.list.d/sbt.list && \
#     echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | tee /etc/apt/sources.list.d/sbt_old.list && \
#     curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add && \
#     apt-get update && \
#     apt-get install -y sbt
# # Set the working directory
# WORKDIR /app

# # Copy the script and necessary files to the container
# COPY build/ /app/build/

# COPY server/target/unitycatalog-server-0.1.0-SNAPSHOT.jar /app/server/
# COPY bin/uc-server-docker /app/server/

# # Make the script executable
# RUN chmod +x /app/server/uc-server-docker

# # Run the script
# ENTRYPOINT ["/app/server/uc-server-docker"]





# Use an appropriate base image with OpenJDK
FROM openjdk:11

# Install sbt
RUN apt-get update && \
    apt-get install -y curl gnupg && \
    echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | tee /etc/apt/sources.list.d/sbt.list && \
    echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | tee /etc/apt/sources.list.d/sbt_old.list && \
    curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add && \
    apt-get update && \
    apt-get install -y sbt

# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . /app

# Build the project using sbt
RUN sbt clean package

RUN chmod +x /app/bin/start-uc-server
# Define the entry point for the application
# ENTRYPOINT ["java", "-cp", "$(find server/target -name 'unitycatalog-server*.jar')", "io.unitycatalog.server.UnityCatalogServer"]
ENTRYPOINT [ "/app/bin/start-uc-server" ]