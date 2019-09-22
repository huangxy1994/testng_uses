# 预期异常测试
有时候可能预期结果是一个异常，这个时候就可以用到testng的预期异常测试

## 使用方法
在testing中，使用expectedExceptions来表示预期异常
- @Test(expectedExceptions = Exception.class)

### 预期运行时异常
- Test1
### 预期自定义异常
- Test2