# 올인원 자바 

#### fast campus

### 프로그램밍 이란?

- 프로그래밍: 컴퓨터에게 일을 시키기 위해 프로그래밍 언어로 만든 명령어 집합인 프로그램을 만드는 일
- 컴파일: 프로그래밍 언어를 기계어로 바꾸어 주는 일
- 컴파일러: 기계어로 바꾸어 주는 프로그램 자바를 설치하면 자바 컴파일러도 설치 됨

### 다른 언어와의 차이점(C)

- 플랫폼에 독립적인 프로그래밍을 할 수 있음.

![image](https://user-images.githubusercontent.com/47058441/68953174-b226cc80-0804-11ea-90fe-851d1f7fe0f4.png)


### 자바 프로그램의 특징

- 객체지향 프로그램으로 유지 보수와 확장성이 좋다.
- 안정적이다.
- 풍부한 라이브러리가 제공되고 오픈소스와 연동된다.

### 왜 객체지향 프로그램을 해야하나?

- 재사용성/ 코드관리/ 유지보수/ 신뢰성 높은 프로그램

### 자바로 만들 수 있는 프로그램들

- 웹 서버, 모바일 앱, 게임





## 객체지향 프로그래밍과 클래스

### 객체(Object)

- 의사나 행위가 미치는 대상(사전적 의미)
- 구체적, 추상적 데이터의 단위

### 객체 지향 프로그래밍(Object Oriented Programming:OOP)

- 객체를 기반으로 하는 프로그래밍
- 객체를 정의하고, 객체의 기능을 구현하며, 객체간의 협력을 구현
  - cf)절차 지향 프로그래밍(Procedural Programming)
    - 시간이나 사건의 흐름에 따른 구현, C언어

### 클래스(class)

- 객체를 코드로 구현한것
- 객체 지향 프로그래밍의 가장 기본 요소, 객체의 청사진(blueprint)

### 함수(function)

- 하나의 기능을 수행하는 일련의 코드
- 함수는 호출하여 사용하고 기능이 수행된 후 값을 반환 할 수 있음
- 함수로 구현된 기능은 여러 곳에서 호출되어 사용될 수 있음

### 메서드(method)

- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
- 메서드를 구현함으로써 객체의 기능이 구현 됨
- 메서드의 이름은 사용하는 쪽(클라이언트) 에 맞게 명명하는 것이 좋음

### 인스턴스

- 클래스로부터 생성된 객체
- 힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성

- 클래스를 기반으로 new 키워드를 이용하여 여러 개의 인스턴스를 생성



| 용어      | 설명                                        |
| --------- | ------------------------------------------- |
| 객체      | 객체 지향 프로그램의 대상, 생성된 인스턴스  |
| 클래스    | 객체를 프로그래밍하기 위해 코드로 만든 상태 |
| 인스턴스  | 클래스가 메모리에 생성된 상태               |
| 멤버 변수 | 클래스의 속성, 특성                         |
| 메서드    | 멤버 변수를 이용하여 클래스의 기능을 구현   |
| 참조 변수 | 메모리에 생성된 인스턴스를 가리키는 변수    |
| 참조 값   | 생성된 인스턴스의 메모리 주소 값            |

### 생성자

- 객체를 생성할 때 new 키워드와 함께 호출( 객체 생성 외에는 호출할 수 없음)
- 인스턴스를 초기화 하는 코드가 구현 됨(주로 멤버 변수 초기화)
- 반환 값이 없음, 상속되지 않음
- 생성자는 클래스 이름과 동일

#### 기본 생성자(default constructor)

- 하나의 클래스에는 반드시 하나 이상의 생성자가 존재해야 함
- 프로그래머가 생성자를 구현하지 않으면 컴파일러가 생성자 코드를 넣어줌=>기본 생성자
- 기본 생성자는 매개 변수가 없고, 구현부가 없음
- 만약 클래스에 다른 생성자가 있는 경우 디폴트 생성자는 제공되지 않음### 생

#### 생성자 오버로딩(constructor overloading)

- 생성자를 두 개 이상 구현하는 경우
- 사용하는 코드에서 여러 생성자 중 선택하여 사용할 수 있음
- private 변수도 생성자를 이용하여 초기화를 할 수 있음



### 참조 자료형

- 클래스형으로 변수를 선언함

   `String name;`

  기본 자료형은 사용하는 메모리가 정해져 있지만, 참조 자료형은 클래스에 따라 다름



### 접근 제어자(access modifier)

- 변수, 메서드 생성자에 대한 접근 권한 지정
- public, private, protected, 아무것도 안 쓰는 경우(기본 접근 제어자)
- private을 사용하면 클래스 외부에서는 접근 할 수 없음

#### 정보은닉(information hiding)

- 외부에서 클래스 내부의 정보에 접극하지 못하도록함, private키워드를 활용
- private 변수를 외부에서 접근하게 하려면 public 메서드 제공함, 클래스 내부 데이터를 잘못 사용하는 오류를 방지할 수 있음

### this에 대하여

#### this 의 역할

- 자신의 메모리를 가리킴
- 생성자에서 다른 생성자를 호출 함
- 인스턴스 자신의 주소를 반환  

#### 생성자에서 다른 생성자를 호출

```
public Person(){
	this("이름없음",1);
}
public Person(String name, int age){
	this.name=name;
	this.age=age;
}
```

### 객체 간 협력

- 객체 지향 프로그램은 객체를 정의하고 객체간의 협력을 구현한 프로그램



### static 변수

- 여러 인스턴스가 하나의 값을 공유할 필요가 있음

![1573900632294](C:\Users\j.h Shin\AppData\Roaming\Typora\typora-user-images\1573900632294.png)

- static 변수는 처음 프로그램이 로드 될 때 데이터 영역에 생성 됨
- 인스턴스의 생성과 상관 없이 사용할 수 있으므로 클래스 이름으로 참조

```ㄴ
Student.serialNum = 100;
```

- 클래스 변수, 정적 변수라고도 함.



#### static 메서드

- static 변수를 위한 기능을 제공하는 static 메서드
- static 메서드에서는 인스턴스 변수를 사용할 수 없음
- 클래스 이름으로 참조하여 사용하는 메서드

```
Student.getSerialNum();
```

- 클래스 메서드, 정적 메서드라고도 함

### 프로그램에서 변수의 유형

| 변수 유형                | 선언 위치                                   | 사용 범위                                                    | 메모리      | 생성과 소멸                                                  |
| ------------------------ | ------------------------------------------- | ------------------------------------------------------------ | ----------- | ------------------------------------------------------------ |
| 지역변수(로컬변수)       | 함수 내부에 선언                            | 함수 내부에서만 사용                                         | 스택        | 함수가 호출될 때 생성되고 함수가 끝나면 소멸함               |
| 멤버 변수(인스턴스 변수) | 클래스 멤버 변수로 선언                     | 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능 | 힙          | 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨 |
| static 변수(클래스 변수) | static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨 |




