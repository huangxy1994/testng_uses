# 测试依赖
有时，我们可能需要以特定顺序调用测试用例中的方法，或者可能希望在方法之间共享一些数据和状态。 TestNG支持这种依赖关系。如果被依赖的测试方法失败，则将跳过所有后续的测试方法。

## 使用方法
### dependsOnMethods
- 在@Test注释中使用属性dependsOnMethods
- 依赖单个方法：dependsOnMethods = "method"
- 依赖多个方法：dependsOnMethods = {"method1", "method2"}
### dependsOnGroups
- 在@Test注释中使用属性dependsOnGroups
- 依赖单个分组：dependsOnGroups = "group"
- 依赖多个分组：dependsOnGroups = {"group1", "group2"}
