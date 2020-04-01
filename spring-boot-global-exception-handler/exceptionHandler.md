## 全局异常统一处理
> 使用@ExceptionHandler + @ControllerAdvice +枚举实现全局异常统一处理

**具体步骤：**
1. [建项目，引入相关依赖](./pom.xml)
2. [定义数据统一的返回格式](./src/main/java/pers/liangshan/globalexceptionhandler/dto/ApiResponse.java)和[枚举类](./src/main/java/pers/liangshan/globalexceptionhandler/constant/Status.java)
3. [统一异常处理类](./src/main/java/pers/liangshan/globalexceptionhandler/exception/GlobalExceptionHandler.java)
4. [自定义异常类](./src/main/java/pers/liangshan/globalexceptionhandler/exception/BizException.java)
5. [编写Controller](./src/main/java/pers/liangshan/globalexceptionhandler/controller/CustomerController.java)和[Dto](./src/main/java/pers/liangshan/globalexceptionhandler/dto/Customer.java)测试
6. 使用工具类调用接口测试
注：[示例代码请下载demo查看](https://github.com/Coder-LiangShan/spring-boot-demos.git)