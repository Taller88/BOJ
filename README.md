# BOJ

### 현재 진행상황(20200811 /132문제)

 20200805 /130문제
 
 20200804 /125문제

 20200802 /123문제
 
 20200729 /119문제

 20200727/115문제
 
 20200725/108문제
 
 20200723/107문제

 
 + 백준 문제풀이 Repository입니다. DP, Greedy, 탐색(완전탐색, DFS,BFS) 50문제씩 푸는게 목표입니다.
 * * *
 
 #### DP(Dynamic Programming)
  * 타일 01 
 
     점화식 : dp[n]=dp[n-1]+dp[n-2]; 
    
     애먹었던 점: 첫 DP 문제였는데 dp 배열의 갯수를 num+1만큼 생성하라고 했는데 1이나 2의 경우 Runtime Error가 걸렸다. 
  
  * 정사각형 개수
    
     점화식: dp[n]=dp[n-2]+dp[n-3];
    
     애먹었던 점: 이 문제 역시 입력값이 1과 2일때를 고려하지 못했다.
  
  * 피보나치 수열 
     
     기존에 재귀로 풀었던 방식을 한 번 계산한 값을 다시 계산하지 않도록 배열과 조건문을 통해 해결
     

#### Greedy(탐욕법)(1/4)
 - 순간마다 가장 최적의 방법을 찾아 진행하는 알고리즘
 - 때로는 순간의 최선이 최종의 최선일 수도..
  * 동전 0 
  
  * 회의실 배정
  
    - 접근 방식 : 세 가지를 고민했습니다. 첫 번째로 회의 시작 시간이 빠른 순으로 시작하는 경우 , 두 번째로 회의 시간이 짧은 경우 , 마지막으로 종료시간이 짧은 경우
                  결과적으로 '종료시간'을 기준으로 정렬하고 해당 TIME이라는 변수에는 종료하는 시간을 매번 저장해두고 비교하는 식으로 해결할 수 있었습니다. 
    
    - 애 먹었던 점: Class를 제네릭으로 가지고 있는 ArrayList를 정렬할 때 Comparator 인터페이스를 사용하여 정렬했지만 '종료 시간'이 같은 경우를 고려하지 않아서 오답을 두번 제출했습                    니다. 
  * ATM
  
    - 접근 방식 : 다소 쉽게 풀 수 있었던 문제로 대기 시간이 가장 짧은 사람 순으로 정렬시키고 time이라는 변수에 정렬시킨 값을 하나씩 더해주고 해당 time값을 배열의 값에 넣어줘서 최종적으로 다 더하는 식으로 풀었습니다.
 
 #### Dikjstra(Breadth First Search- 9/N)
   * 최단 경로 
       - 잘못푼 방식: 기존 DFS로 경로 찾듯이 풀었는데 노드의 개수가 최대 20,000/ 간선은 300,000으로 메모리 초과가 났다.
         찾아보니 Dikjstar 알고리즘을 활용해야한다고 한다. 
       - dijkstra 풀이 방식
         1. dist라는 값을 node갯수 만큼 만들어주고 초기값은 나올수 없는 값으로 초기화-> dist의 의미는 시작점에서 dist 인덱스까지의 최단경로
         2. List\<Node\>[] 다소 낯선 Node클래스배열을 만들어주고 인덱스에서 갈수 있는 node의 값을 배열에 추가한다.
         3. dijkstra알고리즘에서는 값 비교하는 과정을 통해서 최단값을 도출하고 여기서 사용되는 건 Heap(PriorityQueue)
         4. 최종적으로 dist에 있는 값을 출력한다.
         
   * 최소 비용 구하기 
      - 위의 방식과 거의 
 #### DFS(Depth Firsr Search-6/N)
  * DFS
     기본 DFS 구현 문제 방문 Node 출력
     
  * 단지번호붙이기
     배열에서 제공하는 각각 연결노드의 개수를 출력하는 문제
     
  * 유기농 배추
     주어진 간선을 통해 노드의 개수 구하는 문제 
     
  * 연결 요소의 개수
     간선을 주어주고 연결 노드의 개수 구하는 문제
     
  * 연구소
     > 벽을 쌓아서 바이러스를 막는 문제
     - 벽쌓기(DFS로 구현) 
     - 벽을 쌓아둔 것에서 바이러스를 퍼트림(BFS로 구현) 
     - 전역변수에 Max값 올려두고 가장 큰 값 전달
     
  * 로또
    주어준 숫자에서 6개 뽑는 문제-> 쉽지 않았음
    
    
  
 #### BFS(Breadth First Search- 9/N)
  * BFS
  * 미로 탐색 
  * 단지 번호 붙이기
  * 토마토
  * 유기농 배추
  * 연결 요소의 개수
  * 연구소
  * 로또
  * 영역구하기 
    - 접근 방법 
      1. 조금 까다로웠던 건 사각형 입력받은 값을 배열에 전달하는 것이었는데 x1,y1,x2,y2로 접근하여 풀었습니다. 
      2. 사각형이 차지하는 영역의 값을 1로 바꿨습니다. 
      3. 그 다음은 BFS로 영역의 넓이를 구하고 BFS가 실행되는 횟수를 영역의 개수라 생각하여 풀었습니다.
  * 적록색약 
    - 접근 방법 
      1. 입력받을 때 배열을 두개 만든다. 
      2. 적록색약을 가진 사람의 배열은 'G'를 만났을 때 'R'로 바꿔준다. 
      3. bfs를 두 번 실행하여 각각의 영역을 찾는다.
  * 안전 영역
     - 접근 방법
       1. 먼저 입력을 받을 때 섬의 높이의 최대값을 찾는다. (비는 0부터 해당 최대값까지 내린다.)
       2. 물의 양보다 낮은 높이를 가진 섬의 값을 0으로 바꿔준다. 
       3. 바꿔준 배열을 통해 bfs를 실행하여 영역을 찾는다.
  * 나이트의 이동 
     - 체스의 나이트를 가지고 시작점과 도착점을 주어주고 최단으로 도착했을때 이동횟수를 출력하는 문제 
     - 접근방법
       1. 먼저 나이트의 이동방식을 알아야한다. 점프라고 생각하지말고 x축에 +(2,-2)를 하고 y+(1,-1) 하는 식으로 접근하는게 편하다
       2. x, y를 바꿔서 해줘야 하므로 8방향을 돌려야한다. 
       3. 나머지는 bfs 공식그대로
  
#### 우선순위 큐(Heap 2/4)
  * 최대 힙(MaxHeap)
  * 최소 힙(MinHeap)
  
#### 큐/덱(5/7-미완) 
  * 큐2
  * 카드2
  * 요세푸스 문제0
  * 프린터 큐
  * 덱
  
#### 스택(4/5- 미완) 
  * 스택
  * 제로
  * 괄호
  * 균형잡힌 세상

  
#### 수학 3(5/11- 미완)
  * 배수와 약수
  * 약수
  * 소인수분해
  * 최대공약수와 최소공배수
  * ~~검문(실패)~~
  * 링
  * 이항계수(nCk)
    - 이항계수가 조합을 의미하는 지는 몰랐다. 시간초과는 안났지만 DP로 
  * 유클리드 호제법을 활용한 최대공약수 구하기 
     - gcd(a,b)-> gcd(b, a%b) 하면 
  
  
  
#### 백트래킹(4/8-미완)
  * N과 M(1)
  * N과 M(2)
  * N과 M(3)
  * N과 M(4)
  
#### 정렬(7/9-미완)
  * 수 정렬하기 
  * 수 정렬하기2
  * 소트 인사이드 
  * 좌표 정렬하기 
  * 좌표 정렬하기2
  * 단어 정렬
  * 나이순 정렬
  
#### 브루트 포스(3/5- 미완)
  * 블랙잭
  * 분해합
  * 덩치
  
#### 재귀(3/4 - 미완) 
  * 팩토리얼
  * 피보나치 
  * ~~별찍기 -10 (실패)~~
  * 하노이 탑 이동 순서
  
#### Math2 (5/10- 미완)
  * 소수 찾기 
  * 소수 
  * 소수 구하기 
  * 직사각형에서 탈출(20200725)
  * 직각삼각형
  
  
#### Math 1(1/10 - 미완)
  * 손익분기점

#### 문자열(10/10 - 완료)
  * 아스키 코드 
  * 알파벳 찾기 
  * 문자열 반복
  * 단어 공부
  * 단어의 개수
  * 상수
  * 다이얼
  * 크로아티아 알파벳
  * 그룹단어체커(미완)
     - 문제 풀이
       그냥 For 문 if 문 잘 써서 풀었다.
  
#### 함수(1/3-미완)
  * 정수 N개의 합 
  * ~~셀프 넘버(미완) ~~
  * ~~한수(미완)~~
  
#### 1차원 배열 (완료)
  * 최소, 최대 
  * 최댓값
  * 숫자의 개수
  * 나머지
  * 평균
  * OX 퀴즈 
  * 평균은 넘겠지..
  
#### Practice #1(완료)
  * 평균 점수 
  * 상근날드 
  * 세 수 
  * 별 찍기 13,9,21
  
#### WHILE(완료)
  * A+B-5
  * A+B-4
  * 더하기 사이클 
  
#### FOR(완료)
  * 구구단 
  * A+B-3
  * 합
  * 빠른 A+B
  * N찍기 
  * 기찍 N
  * A+B-7
  * A+B-8
  * 별 찍기 -1 
  * 별 찍기 -2
  * X보다 작은 수 
  
#### IF(완료)
  * 두 수 비교하기 
  * 시험 성적 
  * 윤년
  * 사분면 고르기 
  * 알람시계 
 
#### 기초문제 (완료)
  * BufferedReader 연습 문제 
  * String에 있는 숫자 합구하기 


#### Cube(삼성 기출) 문제 
    아직 해결 못함
#### Stack 
   * Stack 구현
      input 값으로 stack에서 쓰는 명령문에 따라 정확한 값이 나오는 지 확인하는 문제 
   * Bracket()문제 
      괄호가 '('와 ')'이 짝이 맞게 들어갔는지 확인하는 문제

#### Saffy ComputerThinking 
