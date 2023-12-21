# پوشش آزمون (Test Coverage)
## روال انجام آزمایش
پروژه simple-json در [این لینک](https://github.com/seyyedAlirezaGhazanfari/json-simple) قابل دسترسی است و روال انجام آزمایش را ‌می‌توانید در تصاویر زیر مشاهده کنید:

![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/d3424af1-e2c9-4aed-b2d3-2fbe73658898)
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/3b7882e1-9cc6-4fbc-85ad-9ae4eba6bf71)
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/665cb81d-dbf7-4a58-922a-667649c1ce22)
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/7eebe37d-2f1f-482d-bcdf-63fda6db7323)
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/3d90965c-ea61-400c-8864-d5268fa74fd4)

## تمرین
پروژه CodeCoverageProject در همین مخزن قابل دسترس است. در ادامه گزارش هر بخش تمرین قرار داده شده است.
## بخش ۱
قبل از ایجاد تست جدید میزان coverage در تصویر زیر آمده است:

![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/e7c27e23-1168-4526-96b9-703176b1c2e6)

## بخش ۲
پس از افزودن تست، افزایش coverage به صورت زیر بود:<br/>
بخش‌هایی که به کد تست اضافه کرده‌ایم:<br/>
می‌توانید در [این کامیت](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/commit/26ce0a926565d69200fe85eb68114a33bfce76a7) و [این کامیت](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/commit/5ac2a5596cce3c0376bf1941c0e592d6357e4ba9) بخش‌های اضافه شده را مشاهده کنید.<br/>
درج تصویر از کد:
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/56e7bb6a-d768-4eb0-a37b-3e8b0421b14c)
در اینجا تابع‌های testValidation و testUpdate افزوده شده اند و کلاس‌های Person, PersonValidator, PersonServiceImpl در آنها cover می‌شوند. کلاس ها در سناریو های مختلف افزودن افراد مختلف و بروزرسانی اطلاعاتشان تست می‌شوند.<br/>
![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/46256b1a-52a4-41dc-a52b-b62c27deaf5b)
در اینجا نیز کلاس PersonRepositoryTest قرار دارد که هدفش تست برای کلاس PersonRepository است. سناریو‌های مختلف افزودن، بروزرسانی، بازیابی و حذف یک Person در این تست ‌ها بررسی می‌شود. <br/>
 
میزان افزایشی که در اعداد پوشش آزمون به دنبال این تغییرات حاصل شده است:

![image](https://github.com/seyyedAlirezaGhazanfari/CodeCoverageProject/assets/56260232/6c2c34f2-e9bc-4433-8bae-f8c1c04f10f9)



## unittest.with.codecoverage
### _Demo of unit test with code coverage_

## Content
- Unit test exemples with jUnit5 and Mockito
- JaCoCo for code coverage report
- Dificult: Beginner

## Executions
- mvn clean install -DskipTests
- mvn jacoco:report
- mvn test

### JaCoCo report report can be found at _target/site/jacoco/index.html_

Slides with content of the topic (pt-BR):<br> https://docs.google.com/presentation/d/1Dkz-qUYigPFynfNk8KcAeyTIxhUmaVTZ4DM6d5UjcJE/edit?usp=sharing

