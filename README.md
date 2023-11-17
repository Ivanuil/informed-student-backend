## informed-student-back-end

### How to run

#### Server

Для запуска сервера необходимо указать реквизиты для доступа к Postgres и MinIO:
```
spring.datasource.username={Postgres username}
spring.datasource.password={Postgres password}

minio.datasource.username={MinIO username}
minio.datasource.password={MinIO password}
```

#### Запуск MinIO в Docker

Команда локально запустит контейнер MinIO из репозитория Docker:
```
docker run -p 9000:9000 -p 9001:9001 quay.io/minio/minio server /data --console-address ":9001"
```
Реквизиты по умолчанию:
```
minioadmin:minioadmin
```

#### Tests

Тестирование происходит с использованием тестовых контейнеров, требуется только запущенный Docker
