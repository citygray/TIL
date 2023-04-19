# :pushpin: TIL
>Today I Learned


</br>

## Java 국비 수업
수업시간에 실습했던 코드 위주로

</br>

<details>
<summary>[1일차] JDK, Eclipse 설치 및 세팅</summary>

<!-- summary 아래 한칸 공백 두어야함 -->
## [1일차] JDK, Eclipse 설치 및 세팅

### JVM 실행순서
- 클래스 리더 : 실행에 필요한 모든 실행 파일(.class)을 찾아준다.
- 바이트 코드 검증
- 컴파일러
  - 인터프린터 컴파일 :명령어 단위로 기계어 반영
  - JIT(Just In Time): 파일 전체를 가지고 기계어 반영
  
### 자바 플랫폼
플랫폼이란?
- Java API: 자바를 사용하려 프로그램을 쉽게 구현하도록 해주는 클래스 라이브러리
- JVM

### 자바파일 컴파일, 실행
- javac.exe : 컴파일러
- java.exe : 실행도구

### JDK ,JDE
- JDK :Java Develpement Kit = JRE + 컴파일러 + 디버거
- JRE : Java Runtime Environment : 실행을 위한 환경만 설정
- java8 버전은 JDK,JRE 버전이 나눠져있지만, 그외 버전은 통합되어있어서 JDK만 설치하면 된다.

### JDK 내부 파일 용도
- bin : javac(컴파일러), java(실행도구)
- conf : 설정
- include : 외부파일
- jmods :
- legal
- lib

### JAVA 개발 환경 구축 
1. JAVA17설치
2. 이클립스 설치 
3. 이클립스에서 설치해둔 JRE로 변경

### 프로젝트 생성
1. 프로젝트 (생성시 모듈선택 해제)
2. 패키지 생성(클래스 식별) 
3. 클래스 생성
4. 소스코드 입력
  - main메서드 직접 코딩
5. 실행(ctrl+F11)

### 프로젝트 폴더
- bin : 컴파일된 실행파일이 있는 폴더(.class)
- src : 작성한 소스 코드가 있는 폴더(.java)
</details>

<br>

<details>
<summary>[2일차] 변수와 자료형</summary>

<!-- summary 아래 한칸 공백 두어야함 -->
## [2일차] 변수

### 데이터의 저장
- 프로그램 실행 동안만 저장 되는 데이터 : 변수 
- 프로그램 종료 후에도 저장 되는 데이터  

### 변수
- 하나의 값을 저장할 수 있는 기억공간
- 프로그램 작성시 사용할 값을 저장하기 위해 할당받은 메모리 공간
- 이름을 지정한다
- 데이터 타입을 지정한다

### 자료형 datatype 
- 기본형: 실제 값을 기록하는 변수
- 참조형: 객체(인스턴스)의 주소를 기록하는 변수

### 메모리의 크기
- 비트bit : 0과 1를 저장하는 최소공간
- 바이트byte : ASCII코드와 같은 문자 데이터를 저장하는 단위

### 변수의 명명 규칙
- 대소문자 구분
- 예약어 사용한면 안됨
- 숫자로 시작하면 안됨
- 특수문자 '_''$'만 사용가능
- 카멜표기법 firstName
- 이름 사이 공백 허용 안됨

### 다양한 표기법
|표기법|사용법|사용처|
|:---|:---|:---|
|calmelCase|firstName|변수명,메소드명|
|PascalCase|FirstName|클래스명|
|snake_case|first_name|MAX_NUMBER|
- 상수(static final 자료형 변수) 일 경우 스네이크 표기법 
  ex) PI,MAX_NUMBER
  
### 변수의 초기화
- 변수를 처음으로 값을 저장하는 것
- 기본형는 자동 초기화 되지 안는다.
- 지역변수는 사용되직 전에 반드시 초기화 해 주어야한다.

|자료형|기본값|
|:---|:---|
|boolean|false|
|char|‘\u0000’|
|byte|0|
|short|0|
|int|0|
|long|0L|
|float|0.0f|
|double|0.0d 또는 0.0|
|참조형 변수|null|




### 변수의 사용범위(스코프,유효범위)
- 변수는 중괄호{} 내에서 선언되고 사용

## [2일차] 자료형

### 논리타입
- 1byte
- true 또는 false
```
boolean inNumber = ture;
```
### 문자타입
- 유니코드의 한 문자로 2byte
- '' 으로 표현
- A 유니코드 :65
- a 유니코드 :97
```
char gender = 'M';
char ch2 = "\ae00";
```

### 정수타입
```
int age = 20;
```

|자료형|메모리 크기|리터럴 표기|
|:---|:---|:---|
|byte|1byte||
|short|2byte||
|int|4byte|정수형 디폴트 자료형|
|long|8byte|L로 표기|

### 실수타입
```
double PI = 3.14;
```

|자료형|메모리 크기|표현범위|리터럴 표기|
|:---|:---|:---|:---|
|float|4byte|소수점 이하 6자리 정확도|F로 표기|
|double|8byte|소수점 이하 15자리 정확도|디폴트 자료형|


### 참조형
```
String name = "홍길동";
```

### 리터럴 
- 변수 저장 되어 있는 값 자체

### 이스케이프
- 특수문자 리터럴, 백슬러시(\)로 시작

|표기|뜻|
|:---|:---|
|'\n'|return|
|'\"'|이중 인용부호|
|'\''|단일 부호|
|'\\'|역슬래시|


## [2일차] scanner 클래스를 입출력
 1. 표준 출력장치를 참조하기 위하여 System.out 를 사용한다.
 2. 표준 입력장치를 참조하기 위하여 System.in를 사용한다. 한 바이트씩만 읽는다
 ```
 Scanner input = new Scanner(System.in);
 ```
 - Scanner : System.in에게 키를 읽게 하고 읽은 바이트를 문자, 정수, 실수 분린, 문자열등의 다양한 타입으로 변환하여 리턴
 - Scanner는 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
 
 ### Scanner 객체 메소드
 
|메서드|비고|
|:---|:---|
|nextByte()||
|nextShort()||
|nextInt()||
|nextLong()||
|nextFloat()||
|nextDouble()||
|next()|공백 이전에 종료되는 하나의 문자열을 읽는다.|
|nextLine()|'\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머니 문자열 리턴|
|close()||
 
 #### Scanner 클래스 사용방법  
 1. Scanner 클래스 import
 -   java.lang 패키지는 자동으로 import된다.
 2. Scanner 객체 생성
 ```
 Scanner input = new Scanner(System.in);
 ```
 3. 사용자로 부터 입력
 ```
 int x = input.nextInt();
 ```  

</details>

</br>

<details>
<summary>[3일차] 연산자</summary>

<!-- summary 아래 한칸 공백 두어야함 -->
## [3일차] 연산자

### 연산자
- 어떠한 기능을 수행하는 기호(+,-,*./ 등)

### 피연산자
- 연산자의 작업대상(변수,상수,리터럴,수식)

### 연산자의 종류
- 단항연산자 : 피연산자가 1개인 연산자
  - 부호 연산자
  - 증감 연산자
- 이항연산자
  - 산술
  - 비교
  - 논리
- 삼항연산자
- 대입연산자

### 비트 연산자

  
  

</details>

## 트러블 슈팅

</br>

## 온라인 강의
#### React
  - [생활코딩 react수업(2020ver)](https://github.com/citygray/opentutorial_v1).
  - [생활코딩 react수업(2022ver)](https://github.com/citygray/react-app).
  
  
#### Java
##### 자바플레이그라운드
  - [구구단](https://github.com/citygray/gugudan).
  - [캘린더](https://github.com/citygray/Calendar).
  


