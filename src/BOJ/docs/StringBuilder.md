# StringBuilder 정리

## 1. String이란?
Java에서 `String`은 **불변 객체(immutable)** 이다.  
즉, 한 번 생성된 문자열은 변경할 수 없다.

---

## 2. StringBuilder란?
`StringBuilder`는 Java에서 제공하는 **가변(mutable) 문자열 클래스**이다.  
문자열을 수정하거나 이어 붙일 때 **새로운 객체를 만들지 않고**,  
하나의 객체 내부에서 문자열을 변경한다.

반복적인 문자열 결합이 필요한 상황에서  
`String`보다 **빠르고 메모리 효율적**이다.

---

## 3. 동작 방식
`StringBuilder`는 내부에 **문자 배열(buffer)** 을 가지고 있다.  
`append()`를 호출하면 새로운 문자열 객체를 생성하지 않고  
기존 버퍼에 문자를 추가한다.

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" World");
```

---

## 4. 주요 메서드

```java
append(String s)	// 문자열 뒤에 추가
length()	        // 현재 문자열 길이
setLength(int n)	// 문자열 길이 조절
toString()	        // String 타입으로 변환
```

