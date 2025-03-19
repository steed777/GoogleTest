#FROM openjdk:8-jdk-slim


# Устанавливаем git
#RUN apt-get update && apt-get install -y git

# Клонируем репозиторий
#RUN git clone https://github.com/steed777/GoogleTest.git /app

# (Опционально) Переходим в директорию клонированного репозитория
WORKDIR /app

# Используем базовый образ с Java (например, OpenJDK)
FROM openjdk:17-jdk-slim

# Устанавливаем необходимые инструменты (Maven или Gradle, а также wget и другие)
RUN apt-get update && apt-get install -y wget unzip maven  && rm -rf /var/lib/apt/lists/*

# Создаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файлы зависимостей (pom.xml или build.gradle)
COPY pom.xml .
# Или, если используете Gradle:
# COPY build.gradle .
# COPY settings.gradle .

# Загружаем и устанавливаем зависимости (Maven или Gradle)
RUN mvn dependency:go-offline
# Или, если используете Gradle:
# RUN gradle dependencies

# Копируем исходный код проекта
COPY src ./src

# Копируем скрипты, ресурсы и т.д.
COPY resources ./resources
# Или: COPY src/main/resources ./src/main/resources

# Команда для запуска тестов Selenium
CMD mvn test
# Или, если используете Gradle:
# CMD gradle test