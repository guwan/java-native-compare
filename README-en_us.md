# java-native-compare

[简体中文](./README.md) | English

Comparison of using GraalVM to package Java projects and generate various native applications.


|                | Packaging time (s) | Start time (ms) | Native app size MB   | Traditional jar package size MB |
|----------------|--------------------|-----------------|------------|---------------------------------|
| Hello World    | 29                 | 124             | 12         | no jar, size :1k                |
| Spring Boot    | 74                 | 54              | 37         | 9                               |
| Spring Web     | 107                | 176             | 68         | 19                              |
| Spring Web&JPA | 231                | 246             | 133        | 43                              |

