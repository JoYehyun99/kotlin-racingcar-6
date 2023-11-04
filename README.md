# 미션 - 자동차 경주
### 🧐 피드백을 토대로 재구성해보기!
- 부족한 예외 처리
- 상수 처리
- 코틀린스러운 코드 작성!
- 테스트 코드 보완
- 변수 이름에 자료형 넣지 않기!

---

## 🚨 예외 처리 

사용자의 입력값이 다음과 같을 경우,`IllegalArgumentException` 발생 후 종료한다.

1. 자동차 이름 입력값
   - 자동차의 이름이 5글자를 넘는 경우
   - 빈 문자열일 경우
   - _맨 앞에 구분자가 올 경우 - ",pobi,hyun"_ 
   - _구분자로 끝나는 경우 - "pobi,hyun,"_
   - _이름 글자에 공백이 있는 경우_
   - _만약 자동차를 한 대만 입력했을 경우?_ : 입력값 오류 처리
   - _중복 이름이 존재할 경우_


2. 시도 횟수 입력값
   - 숫자가 아닌 값일 경우
   - _음수를 입력했을 경우_
   - _만약 0을 입력했다면?_ : 입력값 오류 처리


<br>

---

## 💻 테스트 코드

### 네이밍 컨벤션
*When_StateUnderTest_Expect_ExpectedBehavior*

### 클래스별 테스트 생성
`“테스트 대상 클래스명” + Test`

<br>

---

## 📚 클래스 분리


1. **Model (모델)**:
- `Car` : 자동차의 상태와 로직을 담당
- `Race` : 경주 로직을 담당


2. **View (뷰)**:
- `UserInputReader` : 사용자 입력 담당
- `GameConsole` : 게임 진행 중 필요한 정보 및 결과 출력 담당


3. **Controller (컨트롤러)**:
- `GameManager` : 게임의 전체 흐름을 제어 및 사용자와 게임 사이의 상호작용 조율


<br>