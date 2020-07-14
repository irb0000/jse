<h1 align="center">Task-manager</h1>

Это учебный проект в рамках курса по программе JAVA SPRING НЛМК.

## Требования к software

При разработке использовались:
* Java Openjdk version "11"
* Apache maven 3.6.1
* Windows 7 ultimate

## Описание стека технологий

Java SE + сборщик проектов Apache maven

## Разработчик

**Сычиков Владимир** vladimirsychikov@nospam.ru

## Сборка приложения 

```bash
mvn clean install -f pom.xml
```
## Запуск приложения

```bash
java -jar target/task-manager-1.0.0.jar
```
*Сборка и запуск из каталога проекта, в противном случае указывайте полный путь.*
## Поддерживаемые терминальные команды

```
help -вывод списка терминальных команд
version -информация о версии приложения
about -информация о разработчике
exit -выход из приложения
```