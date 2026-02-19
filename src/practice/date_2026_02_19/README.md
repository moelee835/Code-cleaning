의미 있는 이름 연습 - 패키지: practice.date_2026_02_19

목적
- 클린코드 "의미 있는 이름" 연습을 위해 의도적으로 나쁜 이름과 안티패턴을 포함한 예제 코드를 제공합니다.

파일
- BadExamples.java
  - 여러가지 나쁜 네이밍/설계 패턴 포함:
    1) 불명확한 메서드/변수 이름
    2) boolean 플래그 파라미터
    3) 매직 넘버 직접 사용
    4) 한 메소드에 여러 책임 혼재

연습 과제 (권장 순서)
1) 각 메소드와 변수의 의도를 주석으로 작성해보세요.
2) 불명확한 이름(d, t, m, b, c, p, run 등)을 의미 있는 이름으로 바꿔보세요.
   - 예: d -> multiplyAndAddOffset, m -> repeatActionIfEnabled, p -> applyTax 등
3) 매직 넘버(예: 5, 1.05)를 상수로 추출하고 명명하세요.
4) boolean 플래그 파라미터를 제거하거나 더 표현적인 타입/메서드로 분리하세요.
5) 긴 메소드(run)를 작은 메소드로 분리(파싱, 검증, 합산, 출력)하세요.
6) 리팩토링 후 간단한 단위 테스트나 main에서 동작을 확인하세요.

실행 방법 (Windows cmd)

1) 컴파일
```
cd C:\ssafy\project\CleanCode\src
javac practice\date_2026_02_19\BadExamples.java
```

2) 실행
```
java -cp . practice.date_2026_02_19.BadExamples
```

원하시면 제가 한 메소드씩 모범 리팩토링을 단계별로 적용해드리겠습니다. 어떤 메소드부터 시작할까요?
