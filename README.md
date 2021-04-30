# ANTLR v4 Archetype

> Reply source from https://github.com/jpavlich/antlr4-tutorial

## ANTLR 
> groupId: com.hiskasoft.maven
> artifactId: antlr4-maven-archetype
> version: 0.1
> description: ANTLR v4 Maven Archetype

## Create Project

```bash

> mvn -DarchetypeGroupId=com.hiskasoft.maven \
       -DarchetypeArtifactId=antlr4-maven-archetype \
       -DarchetypeVersion=0.1 \
       -DgroupId=com.yracnet.enginer \
       -DartifactId=x6 \
       -Dversion=1.0.0 \
       -Dpackage=com.yracnet.enginer.x6 \
       -DfileExtension=lang \
       -DgrammarName=Language \
       archetype:generate

```
