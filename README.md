# java-native-compare
Comparison of using GraalVM to package Java projects and generate various native applications.


|                | 打包时间（秒）   | 启动时间（毫秒） | 原生应用大小MB   | 传统jar包大小MB |
|----------------|-----------|----------|------------|------------|
| Hello World    | 29        | 124      | 12         | 无jar包，大小1k |
| Spring Boot    | 74        | 54       | 37         | 9          |
| Spring Web     | 107       | 176      | 68         | 19         |
| Spring Web&JPA | 231       | 246      | 133        | 43         |

