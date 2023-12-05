# todolist

## dependencies

- Spring Web
- Lombok
- Spring Data JPA
- H2 Database
- Thymeleaf

## H2 Database

- local.mv.db 파일, 홈디렉토리에 만들기
- <http://localhost:8080/h2-console> 콘솔 접속
- JPA

## Entity

### task

|속성명|설명|
|---|---|
|id|고유 번호|
|item|할일|
|status|완료여부|
|create_date|작성일시|

## mapping

- MainController
