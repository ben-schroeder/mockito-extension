# mockito-extension
[![Build Status](https://travis-ci.com/ben-schroeder/mockito-extension.svg?branch=master)](https://travis-ci.com/ben-schroeder/mockito-extension)
[![License](https://img.shields.io/github/license/ben-schroeder/mockito-extension)](https://raw.githubusercontent.com/ben-schroeder/mockito-extension/master/LICENSE)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/mockito-extension/badge.svg)](https://maven-badges.herokuapp.com/maven-central/eu.benschroeder/mockito-extension)

Convenience Extension to use mockito without static imports. 

Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/ and https://github.com/szpak/mockito-java8

## Requirements
* Java >= 8
* [Mockito](https://github.com/mockito/mockito) >= 3.2.4

## Versioning

The version corresponds with the used version of mockito, so the same version can be used for both. The first release exists for mockito 3.2.4

```
<dependency>
  <groupId>eu.benschroeder</groupId>
  <artifactId>mockito-extension</artifactId>
  <version>${mockito.version}</version>
</dependency>
```
