服务访问地址：
http://localhost:8201/admin/hosp/hospitalSet/findAll

swagger访问地址：
http://localhost:8201/swagger-ui.html


# 问题记录

## 跨域
### 什么是跨域？
当下面3个地方，有一处不相同时就会出现跨域问题

- 访问协议不一致，http、https
- 访问地址，ip不一致，192.189.31.233、168.32.12.23
- 访问端口，8080、8088

### 如何解决
解决方式有多种
目前可使用简单方式解决，在 Controller类中添加注解 @CrossOrigin，允许跨域访问