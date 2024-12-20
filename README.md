# 💻 2024 DB_Project 💻
# 🍽️ Food-Order-System 🍽️ 


## 프로젝트 설명
<음식 주문 시스템> 

배달 앱에서 고객, 음식점, 메뉴, 주문 정보를 효율적으로 관리하기 위한 데이터베이스 시스템입니다.

고객, 음식점, 메뉴, 주문 데이터를 효율적으로 관리하고, 각 데이터를 CRUD 연산(Create, Read, Update, Delete)을 통해 처리할 수 있는 기능을 제공합니다.

프로젝트의 핵심 목표는 사용자 친화적이고 확장 가능한 데이터베이스 설계를 기반으로 음식 주문 시스템을 구현하는 것입니다.


## 프로젝트 구성원

👩🏼‍💻 임예은 
- 데이터베이스 설계
- SQL문 작성
- customer, restaurant 패키지 코드 작성

👩🏼‍💻 이선혜
- 데이터베이스 설계
- SQL문 작성
- menu, morder 패키지 코드 작성


## 사용 기술
- Java JDBC API
  
	• java.sql.*을 사용하여 데이터베이스와 연동.

	• SQL 문 작성 및 실행, 결과 처리.
  
- SQL

	• 데이터베이스 테이블 생성 및 관계 정의.

	• CRUD 연산을 위한 쿼리 작성.


## 프로젝트 목표
- SQL 문 작성 및 실행, 결과 처리.
- 데이터베이스 테이블 생성 및 관계 정의.
- CRUD 연산을 위한 쿼리 작성.


## 데이터베이스 설계

### 명세서 : 배달 앱 주문 관리 시스템 설계
<img width="538" alt="스크린샷 2024-12-20 22 52 40" src="https://github.com/user-attachments/assets/8401fa27-9d58-49ba-a4eb-3e7adae65985" />

<img width="511" alt="스크린샷 2024-12-20 22 52 58" src="https://github.com/user-attachments/assets/b9298b7c-5dce-45e8-b586-503418d8616d" />

<img width="441" alt="스크린샷 2024-12-20 22 53 06" src="https://github.com/user-attachments/assets/958335e3-2db4-4c94-8f83-ab1393e802ff" />

<img width="485" alt="스크린샷 2024-12-20 22 53 18" src="https://github.com/user-attachments/assets/b00c745d-0dd6-488b-95ee-3eb33e8792a8" />


### 요구사항
- 고객은 음식 배달 서비스를 이용하며, 다수의 주문을 생성할 수 있습니다.
- 레스토랑은 여러 메뉴를 제공하며, 각각의 메뉴는 특정 레스토랑에 속합니다.
- 각 주문은 여러 메뉴를 포함할 수 있으며, 메뉴의 수량도 기록됩니다.
- 주문은 상태와 총 금액을 기록하며, 주문 시점의 날짜와 시간 정보가 포함됩니다.
  

### 개념적 설계
<img width="572" alt="스크린샷 2024-12-20 21 51 47" src="https://github.com/user-attachments/assets/d4506f66-6a23-4902-b609-72f1f3894510" />

<img width="567" alt="스크린샷 2024-12-20 21 52 17" src="https://github.com/user-attachments/assets/45d949c5-87c2-4b29-bacb-21507d820ada" />


#### 개체-관계 다이어그램(ERD)
<img width="708" alt="image" src="https://github.com/user-attachments/assets/5c05123d-0fad-4055-924a-b618c30d14e2" />

1) Customer:
● 고객 정보 저장. 고객ID는 Primary Key로 설정.
● 이름, 연락처, 주소는 필수 입력값.
2) Restaurant:
● 음식점 정보 저장. 음식점ID는 Primary Key로 설정.
● 이름, 위치, 연락처는 필수 입력값.
3) Menu:
● 메뉴 정보 저장. 메뉴ID는 Primary Key로 설정.
● 메뉴는 반드시 음식점과 연관되어 있으며,
외래키(RestaurantID)로 연결.
4) Order:
● 주문 정보 저장. 주문ID는 Primary Key로 설정.
● 주문은 고객과 연관되며, 외래키(CustomerID)로 연결.
5) 관계 정의:
● 음식점과 메뉴: 1:N 관계.
● 고객과 주문: 1:N 관계.
● 주문과 메뉴: N:M 관계.


### 논리적 설계
<img width="505" alt="스크린샷 2024-12-20 22 15 27" src="https://github.com/user-attachments/assets/6fba5690-85fd-45ac-97e3-aeb3200b7122" />
<img width="498" alt="스크린샷 2024-12-20 22 15 44" src="https://github.com/user-attachments/assets/a03880c4-4b95-4b64-8619-4fcd9cb50abe" />


#### 테이블 명세서
<img width="623" alt="스크린샷 2024-12-20 21 56 37" src="https://github.com/user-attachments/assets/46d668a6-5e04-4cc2-af25-cc90881f6734" />

<img width="629" alt="스크린샷 2024-12-20 21 56 43" src="https://github.com/user-attachments/assets/49de2871-5b9a-42ac-8a8d-81a4fdc8499f" />

<img width="628" alt="스크린샷 2024-12-20 21 56 52" src="https://github.com/user-attachments/assets/13e7def6-82e4-489e-86a5-20eb49ad522c" />

<img width="631" alt="스크린샷 2024-12-20 21 56 58" src="https://github.com/user-attachments/assets/af44abe4-1912-4dee-8030-e44f7d3d80e6" />


## JDBC 구현

### 코드 구조
프로젝트는 4개의 주요 패키지와 각 패키지당 3개의 Java 클래스로 구성됩니다.
- customer
  - Customer: 고객 데이터를 표현하는 모델 클래스
  - CustomerMain: 고객 데이터에 대한 CRUD 연산 테스트
  - CustomerService: 고객 데이터를 처리하는 비즈니스 로직
    
- restaurant
  - Restaurant: 음식점 데이터를 표현하는 모델 클래스
  - RestaurantMain: 음식점 데이터에 대한 CRUD 연산 테스트
  - RestaurantService: 음식점 데이터를 처리하는 비즈니스 로직
    
- menu
  - Menu: 메뉴 데이터를 표현하는 모델 클래스
  - MenuMain: 메뉴 데이터에 대한 CRUD 연산 테스트
  - MenuService: 메뉴 데이터를 처리하는 비즈니스 로직
    
- morder
  - Morder: 주문 데이터를 표현하는 모델 클래스
  - MorderMain: 주문 데이터에 대한 CRUD 연산 테스트
  - MorderService: 주문 데이터를 처리하는 비즈니스 로직

<img width="202" alt="스크린샷 2024-12-20 21 58 41" src="https://github.com/user-attachments/assets/c054f044-5d43-4544-8a7e-90d1b6d86b86" />


### 기능 구현
- 전체 정보 검색
- 데이터 추가
- 데이터 수정
  
<img width="827" alt="스크린샷 2024-12-20 22 31 39" src="https://github.com/user-attachments/assets/3eb04f26-8522-41df-b4b2-4bc7d1306663" />

	           
- 아이디로 검색
  
<img width="840" alt="스크린샷 2024-12-20 22 33 50" src="https://github.com/user-attachments/assets/3e25e737-8be5-43bd-ae82-e8594d32a1c4" />
         

- 데이터 삭제
  
<img width="836" alt="스크린샷 2024-12-20 22 34 57" src="https://github.com/user-attachments/assets/3cdf51b6-1cd3-432a-82b3-e2c5dd355c15" />
<img width="829" alt="스크린샷 2024-12-20 22 35 40" src="https://github.com/user-attachments/assets/280e7b9a-1ed6-4cf2-a5c3-21366dd98274" />


### 기대 효과
1. 효율적인 데이터 관리

• 고객, 음식점, 메뉴, 주문 데이터를 체계적으로 관리하여 정보의 일관성과 정확성을 보장.

• CRUD 연산을 통해 데이터 처리 속도가 향상되고, 시스템의 안정성이 강화.

2. 사용자 편의성 증대

• 고객 및 관리자 모두 쉽게 사용할 수 있는 인터페이스와 시스템 구축.

• 고객의 주문 이력을 관리하고, 레스토랑에서 제공하는 메뉴를 효율적으로 검색 가능.

3. 확장 가능한 설계

• 유연한 데이터베이스 설계를 통해 향후 기능 추가 및 서비스 확장이 용이.

• 주문 상태, 결제 정보, 배송 추적 등 추가 기능 개발 시 데이터 구조의 변경 최소화.


### 추가 기능_계획
• 결제 정보(예: 카드, 계좌 이체 등)와 배송 추적(예: 배달원 정보, 예상 도착 시간)과 같은 추가 속성/테이블 설계.

• ex) Payment 테이블과 Delivery 테이블을 추가하여 주문-결제-배송의 연계 처리.
