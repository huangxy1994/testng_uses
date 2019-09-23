# 分组测试
TestNG可以执行复杂的测试方法分组。您不仅可以声明方法属于组，而且还可以指定包含其他组的组。然后可以在testng.xml配置一组特定的组，或同时排除另一组。

## 设置分组
在testng中分组分为方法的分组和类的分组，使用@Test的groups来指定分组，可以同时指定多个分组。
- 指定单个分组
@Test(groups = "group1")
- 指定多个分组
@Test(groups = {"group1", "group2"})

## 指定分组
在testng中可以通过<groups>标签在xml中指定分组，<groups>的位置在<test>或<suite>下面，如果是在<suite>下面指定，则使用与该<suite>下所有<test>。
- 通过<include>来指定运行哪些分组
- 通过<exclude>来指定不运行哪些分组

## 实例
- 在方法上设置分组
   - Test1
- 在类上设置分组
   - Test2、Test3、Test4、Test5
- 指定运行哪些分组和不运行哪些分组
   - testng.xml