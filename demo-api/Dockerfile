FROM clojure:openjdk-11-lein
COPY . /app
WORKDIR /app
EXPOSE 8080
RUN ["lein", "deps"]