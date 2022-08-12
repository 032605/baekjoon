# baekjoon

**나머지** (10430번)

간단한 출력으로 정답을 맞출 순 있지만, 나머지 증명과 java 입출력(특히 아직 익숙하지 않은 BufferedReader)에 대하여 알아볼 필요가 있다.

> InputStream은 Byte 단위로 데이터를 처리하여 InputStreamReader가 문자(character) 단위로 데이터를 처리하기 위해 중개 역할을 한다. BufferedReader는 스트림에 버퍼를 두어 일정 문자를 버퍼에 저장하여 한번에 문자열 처럼 보낸다. 

> Scanner는 정규식을 포함하기 때문에 BufferedReader이 성능(시간)에 있어 경쟁력 있다.

>BufferedReader는 예외처리가 필수적이다. (Scanner 나 System.out.print는 메소드 내 자체적으로 예외처리함)

ref.
- 나머지 증명  [here](https://st-lab.tistory.com/19)
- JAVA [자바] - 입력 뜯어보기 [Scanner, InputStream, BufferedReader] [here](https://st-lab.tistory.com/41)

<hr>

**빠른 A+B** (15552번)

``` java
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

```

write()을 사용하여 출력할 내용을 담고, flush()을 통해서 버퍼를 비워내는 동시에 콘솔에 출력
>  'write()', 'flush()', 'close()'

<hr>

**X보다 작은 수** (10871번)
|메모리|시간|코드 길이|
|------|---|---|
|16936KB|208ms|857 B|
|296400KB|456ms|855 B|
|295700KB|452ms|871 B|
|296536KB|452ms|913 B|

테이블 상단으로 올라갈 수록 코드 개선하여 제출한 성능이다. 메모리 차이가 크게 나는 이유 : **반복문 안에 배열** 선언,,(기본적으로 지키기 주의!)

<hr>

**숫자의 개수** (2577번)

> int val = 17037300;

``` java
while(val!=0){
  arr[val%10]++;  // 나머지 값으로 배열 index 값 1 증가
  val/=10;        // 값을 한 자리 수 씩 줄이기
}

```

<hr>

[PS 동빈나가 추천한 코딩테스트 가이드](https://merry1031.tistory.com/35)

