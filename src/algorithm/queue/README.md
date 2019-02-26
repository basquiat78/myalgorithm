# Queue

대학교, 그러니까 벌써 20년전에 자료구조, 물론 정공과는 상관없는 과목이었지만 학점을 잘준다기에 잠시 들었던 강의가 자료구조 수업이었다.    
    
아마도 공대생, 자료구조를 배웠다면 Stack, Queue에 대한 이론을 배웠을 것이라 생각한다.    
    
기본적으로 큐는 빨대를 생각해 보자. 호스같은거?    
    
먼저 들어간 녀석이 먼저 나온다!    

FIFO (First In Firt Out)    
    
    
Redis, Kafka를 쓰면서 application이 지원하는 stack, queue를 사욯해봤지만 네이티브 자바로 구현해 볼 일이 없었고     
    
일단은 기본적인 개념이니....    
    
    
Java 스펙에 Queue가 구현되어 있기 때문에 스펙을 이용한 방식으로 구현.     
배열로 Queue구현은 포기....     
        
       
[What is Queue](https://ko.wikipedia.org/wiki/%ED%81%90_(%EC%9E%90%EB%A3%8C_%EA%B5%AC%EC%A1%B0))    
    
# At A Glance
if문 대신 swith문을 쓸걸...