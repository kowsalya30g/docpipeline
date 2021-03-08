FROM openjdk

COPY src -f/sortingstrings/sortingstrings
WORKDIR sortingstrings
RUN mkdir -p bin
RUN "javac -d bin ./(default package)/SortString.java"
WORKDIR bin
CMD ["java","(default package)/SortString"]
