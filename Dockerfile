FROM openjdk:8-jdk-slim


# Устанавливаем git
RUN apt-get update && apt-get install -y git

# Клонируем репозиторий
RUN git clone https://github.com/steed777/GoogleTest.git /app

# (Опционально) Переходим в директорию клонированного репозитория
WORKDIR /app