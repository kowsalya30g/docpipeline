FROM openjdk
COPY sortingstrings/src /opt/sortingstrings/
WORKDIR  /opt/sortingstrings/
RUN mkdir -p bin
RUN "javac -d bin ./(default package)/SortString.java"
WORKDIR bin
CMD ["java","(default package)/SortString"]
