---
자료구조란?
---
---

- 프로그램에서 사용할 많은 데이터를 메모리 상에서 관리하는 여러 구현방법들을 말한다.
- 효과적인 자료구조가 성능 좋은 알고리즘의 기반이 된다.
- 자료의 효율적인 관리는 프로그램의 수행속도와 관련이 있다.
- 여러 자료 구조 중에서 구현하려는 프로그램에 맞는 최적의 자료구조를 활용해야 하므로 자료구조에 대한 이해가 중요하다.

---
자료구조에는 어떤 것들이 있나 ?
---
---
### 1. 선형자료구조

 - 데이터가 한줄로 이어져 있는 데이터 구조를 말한다.
 - 앞의 요소(element)와 뒤의 요소가 1대1의 관계로 구성된다.

#
#### 1-1  배열(Array)

> - 선형으로 자료를 관리 , 정해진 크기의 메모리를 먼저 할당받아 사용하고 , 자료의 물리적 위치와 논리적 위치가 같다.
> - 특정 위치의 요소를 구하는 연산을 할때 비용이 적다 -> O(1)
> - 반대로 추가 삭제하는 연산에서 비용이 크다 -> O(n) 

<img width="617" alt="Array" src="https://user-images.githubusercontent.com/51349774/179740093-cf97e8b4-3135-4b3d-9818-b32b246b920b.png">

#
#### 1-2  연결 리스트(LinkedList)
> - 선형으로 자료를 관리하며 자료가 추가될 때마다 메모리를 할당 받고 자료는 링크로 연결된다.
> - 자료의 물리적 위치와 논리적 위치가 다를 수 있다.
> - 각 요소는 다음 요소를 가리키는 링크를 가지고 있다.
> - 자바에서는 객체의 address를 가르키도록 구현한다.
> - 다음 요소의 주소와 이전 요소의 주소를 모두 갖게하는 DoubleLinkedList와 맨뒤의 요소가 다시 첫번째 요소를 가리키는 CircularLinkedList가 있다 .
> - 데이터가 추가 삭제되는 연산에서 일반 배열보다 비용이 적다 ->O(1)
> - 특정 데이터 검색하는 연산에서 일반 배열보다 비용이 크다 ->O(n)
 

<img width="642" alt="LinkedList" src="https://user-images.githubusercontent.com/51349774/179740897-1aa2515e-bbea-4ba7-b122-00ed270339fc.png">


#
#### 1-3  Stack
> - Last in first out의 구조를 갖고있다.
> - 마지막 위치(top)에서만 자료의 추가와 삭제가 이뤄진다.

<img width="596" alt="stack" src="https://user-images.githubusercontent.com/51349774/179740920-b5fea9d0-2a10-4dca-bb34-70b50f5e3ff3.png">


#
#### 1-4  Queue
> - Stack과 반대로 First in Fisrt out의 구조를 갖는다.
> - 자료의 맨 앞위치 (front) 맨 뒤를 위치(rear)라 부른다.
> - 자료가 꺼내지는 것을 (dequeue) 자료를 추가하는 것을(enqueue)라 부른다.
> 
<img width="698" alt="Queue" src="https://user-images.githubusercontent.com/51349774/179740909-bf7b3e61-c940-4615-a4c5-6ac1aeb828c1.png">

---


### 2.비선형 자료구조
