// 자바 기본 입출력

// System 클래스에 대한 이해


클래스는 시스템과 관련된 커널 작업을 자동으로 수행해 줄 뿐만 아니라, 자바 프로그램의 실행과 관련해서 백그라운드 작업을 지원해 준다.
보안과 안정성을 고려하여 직접 객체를 생성하지 못하도록 설정

### System 클래스
* 필드 in, out, err
* 메서드 currenTimeMillis(), exit(int x), gc(), getProperties(), load(String f)...

### 기본 출력에 사용하는 클래스 - sysou
* System.out.print(출력대상)
* System.out.print(출력대상)
* System.out.printf("출력서식", 출력대상)

### 출력 서식
* %c 문자 출력
* %d 정수 출력
* %f 실수 출력
* %s 문자열 출력

### 입, 출력에 대한 예외 처리
* java.io 패키지를 가져온다(import)
* 입, 출력 코드가 있는 메서드 뒤에 IOException을 던진다(throws)

### 기본 입력에 사용하는 클래스
```
* 문자 입력 System.in.read()
* 문자열 입력
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 in.readLine();
* 기본 자료형으로 변환
 boolen bool = Boolean.valueOf(in.readLine()).booleanValue();
 자료형변수 = 해당자료형Wrapper클래스.parse자료형(in.readLine());
* 문자열과 기본 자료형을 모두 지원하는 유틸 클래스
 java.util.Scanner in = new java.util.Scanner(System.in);
 String str = in.nextLine();
 int x = in.nextInt();
```




