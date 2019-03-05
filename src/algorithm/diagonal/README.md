# Diagonal Difference

[Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen)

# At A Glance

어려워 보였지만 특정 패턴에 대한 배열을 다룰 수 있는지 물어보는 문제라서 쉽게 풀긴 했지만 note에 적힌 Absolute Value를 보질 못해서 계속 오류라는 문구를 한시간동안 봐야했다!!!!    

예를 들면 -10과 5의 뺄셈 즉, (-10-5)를 연산하면 -15지만 절대값으로 표현하면 어째든 15이다.    

hackerrank를 풀다가 분명 나는 로직이 맞았다고 생각했는데 막상 돌려보니 틀렸다는 것이다.    

단순하게 

```
return a-b; 
```

같이 하면 오류가 발생.

찾아보니 자바에서는 Math.abs라는 함수를 제공한다. 저 함수에 담아서 리턴해야한다.    
문제는 끝까지 전부다 보고 풀어야 나같이 시간을 허비하지 않는다.