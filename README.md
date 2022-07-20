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
