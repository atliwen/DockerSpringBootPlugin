# DockerSpringBootPlugin
docker-maven-plugin  完全免Dockerfile 文件

  一个实例
  
  使用docker-maven-plugin 进行完全免 Dockerfile 文件 
  
  注意 EXPOSE 在spring boot 中不起作用
  
  Mvnen :
    mvn clean package docker:build
  
  
  <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <configuration>
                    <imageName>${docker.image.prefix}/${project.artifactId}</imageName>
                    <!--<dockerDirectory>src/main/docker</dockerDirectory>-->
                    <baseImage>java:8</baseImage>
                    <entryPoint>["java", "-jar", "/${project.build.finalName}.jar"]</entryPoint>
                    <resources>
                        <resource>
                            <targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.build.finalName}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
        </plugins>
    </build>
