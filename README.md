# 2024 Food-Order-System

## 프로젝트 설명
이 프로젝트는 음식 주문 시스템입니다. 위 시스템 구현하기 위한 데이터베이스 SQL과 JDBC 코드입니다.

## 프로젝트 구성원

임예은 : SQL문 작성,customer, restaurant 코드 작성

이선혜 : 데이터베이스 설계, SQL문 작성, menu, morder 코드 작성

## 사용 기술
JDBC API java.sql.*을 import해 데이터베이스와 연동하여 사용하였습니다.

## 프로젝트 목표
- SQL 문 작성 및 실행, 결과 처리.
- 데이터베이스 테이블 생성 및 관계 정의.
- CRUD 연산을 위한 쿼리 작성.

## 데이터베이스 설계
### 요구사항
- 고객은 음식 배달 서비스를 이용하며, 다수의 주문을 생성할 수 있습니다.
- 레스토랑은 여러 메뉴를 제공하며, 각각의 메뉴는 특정 레스토랑에 속합니다.
- 각 주문은 여러 메뉴를 포함할 수 있으며, 메뉴의 수량도 기록됩니다.
- 주문은 상태와 총 금액을 기록하며, 주문 시점의 날짜와 시간 정보가 포함됩니다.
<img width="708" alt="image" src="https://github.com/user-attachments/assets/5c05123d-0fad-4055-924a-b618c30d14e2" />

## JDBC 구현
### 파일 구조
프로젝트는 4개의 주요 패키지와 각 패키지당 3개의 Java 클래스로 구성됩니다.
	1.	customer
  - Customer: 고객 데이터를 표현하는 모델 클래스
  - CustomerMain: 고객 데이터에 대한 CRUD 연산 테스트
  - CustomerService: 고객 데이터를 처리하는 비즈니스 로직
	2.	restaurant
  - Restaurant: 음식점 데이터를 표현하는 모델 클래스
	- RestaurantMain: 음식점 데이터에 대한 CRUD 연산 테스트
  - RestaurantService: 음식점 데이터를 처리하는 비즈니스 로직
	3.	menu
	- Menu: 메뉴 데이터를 표현하는 모델 클래스
  - MenuMain: 메뉴 데이터에 대한 CRUD 연산 테스트
	- MenuService: 메뉴 데이터를 처리하는 비즈니스 로직
	4.	morder
  - Morder: 주문 데이터를 표현하는 모델 클래스
	- MorderMain: 주문 데이터에 대한 CRUD 연산 테스트
  - MorderService: 주문 데이터를 처리하는 비즈니스 로직
<img width="168" alt="image" src="https://github.com/user-attachments/assets/727f298d-d5e9-4af1-a6e1-78a2b10f8ada" />

### 기능 구현
- 전체 정보 검색
- 아이디로 검색
- 데이터 추가
- 데이터 수정
- 데이터 삭제

  
