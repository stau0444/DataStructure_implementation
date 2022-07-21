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

---

#### 2-1 Tree
> - 부모노드와 자식 노드간의 연결로 이루어진 자료구조
> - 대표적으로 힙(heap) , 이진트리(binary tree) ,이진 검색 트리(binary search tree)가 있다.

---

#### heap

>- Priority queue(우선 큐)를 구현한 자료구조이다.
>- 부모 노드가 자식 노드보다 항상 크거나 같은 값을 갖는 경우 Max Heap.
>- 부모 노드가 자식 노드보다 항상 작거나 같은 값을 갖는 경우 Min Heap.
>- Complete binary tree이기 때문에 항상 Left child 부터 채워진다.
>- heap tree 를 이용하여 heap sort가 구현된다.
>- heap tree에서 root가 가장 크거나(Maxheap) 작은(MinHeap) 수이기 때문에 root를 하나씩 꺼냄으로써 오름차순 혹은 내림차순으로 정렬이 된다.

---
#### Binary Search Tree

>- 자료(Key)의 중복을 허용하지 않는다 
>- 왼쪽 자식 노드는 부모 노드보다 작은값 , 오른쪽 자식 노드는 부모 노드보다 큰 값을 갖는다.
>- 루트를 기준으로 평균 log₂ⁿ 만큼의 검색시간이 걸린다 여기서 n은 트리의 depth를 말한다.
>- 편향트리(Skewed tree)가 만들어 질 수 있기 때문에 트리의 균형을 맞춰주는 Red Black Tree 혹은 AVL tree로 구현된다.
>- 트리나 그래프의 엘리먼트를 돌아보는 것을 순회(traversal)한다고 하며 자식노드를 먼저 본 후에 부모를 보는지 , 부모를 먼저보고 자식을 보는지에 따라  preorder , post order가 있으며
>- left - 부모 - right 순으로 살펴보는 inorder traversal 방식을 사용하면 자료가 정렬되어 출력된다(sorting 가능).
>- Java의 TreeMap TreeSet은 Binary Search Tree를 통해 구현되어 있다.

---

#### Graph
>- 정점과 간선들의 유한한 집합으로 이뤄진 자료구조이다 
>- 여러 특성을 가지는 객체 혹은 노드를 정점(vertex)이라 부르며 이 객체들의 연결관계를 나타내는 것을 링크 혹은 edge라 한다.
>- 간선은 방향성이 있는 걍우와 없는 경우가 있다 .
>- 그래프를 구현하는 방법에는 인접 행렬(adjacency matrix),인접 리스트 (adjacency list)가 있다.
>- 그래프를 탐색하는 방법은:BFS(bread first search) , DFS(depth first search)가 있다.

---

### Hashing

>- 검색을 위한 자료구조 
>- 키(key)에 대한 자료를 검색하기 위한 사전(dictionary) 개념의 자료 구조 
>- key는 유일하고 이에 대한 value를 쌍으로 저장
>- index = h(key):해시 함수가 key에 대한 인덱스를 반환해주고 , 해당 인덱스 위치에 자료를 저장하거나 검색하게 된다.
>- 해시 함수에 의해 인덱스 연산이 산술적으로 가능하다->O(1)
>- 저장되는 메모리 구조를 해시테이블이라 하며 자바에서는 HashMap , Properties 클래스로 구현되어 있다