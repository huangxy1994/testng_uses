# 预期异常测试
有时候可能预期结果是一个异常，这个时候就可以用到testng的预期异常测试

## 使用方法
在testng中，使用注解@Test的expectedExceptions属性来表示预期异常
- @Test(expectedExceptions = Exception.class)

### 预期运行时异常
- Test1
### 预期自定义异常
- Test2


# 超时测试
如果单元测试时间超过指定的毫秒数，testng则会将其标记为失败。

## 使用方法
在testng中，使用注解@Test的timeout属性来进行超时设置，timeout单位为毫秒
- @Test(timeout = 2000)

### 实例
- Test3


# 忽略测试
如果代码还没有编写完成，或者已知该测试方法有bug，开发人员正在修复。还不能执行，但是有不能直接删除，因为可能后期还会用到。这个时候可以选择禁用该测试方法。

## 使用方法
在testng中，使用注解@Test的enabled属性来控制测试方法是否执行，true为执行，false为不执行。默认为true。
- @Test(enabled = true)

### 实例
- Test4